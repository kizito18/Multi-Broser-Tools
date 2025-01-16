package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebStorage
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.zIndex
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.ScreenLayerType
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModelFactory
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStreamReader


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun DialogWebPageLengthGetter(
    screenLayerSelected: ScreenLayerType,
    scrollSpeedPassed:Int,
    urlPassed:String,
    isPcModeActive: Boolean,
    isAdBlockerActive: Boolean,
    onDismiss: () -> Unit,
    onFinished: (url:String, webLength:Int) -> Unit
){




    val context = LocalContext.current

    val scope = rememberCoroutineScope()


    val snowColor by remember { mutableStateOf(Color(0xffFFFBFE)) }



    //  Remove or Stop Ad in web
    val adServers = StringBuilder()
    var line: String? = ""
    val inputStream = context.resources.openRawResource(R.raw.adblockerserverlist)
    val br = BufferedReader(InputStreamReader(inputStream))
    try {
        while (br.readLine().also { line = it } != null) {
            adServers.append(line)
            adServers.append("\n")
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }



    val browserAutoScrollViewModel: BrowserAutoScrollViewModel = viewModel(
        factory = BrowserAutoScrollViewModelFactory(context)
    )

    val flowWebViewHolder by browserAutoScrollViewModel.webHeightWebViewHolder.collectAsState()


    LaunchedEffect (scrollSpeedPassed){
        if (flowWebViewHolder.scrollSpeed == null) {
            flowWebViewHolder.scrollSpeed = scrollSpeedPassed
        }
    }
    LaunchedEffect (urlPassed){
        if (flowWebViewHolder.webViewUrl == null) {
            flowWebViewHolder.webViewUrl = urlPassed
        }
    }




    LaunchedEffect(Unit) {

        delay(200)

        flowWebViewHolder.timerClass.initializingTime( )

    }



    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }




    var lifecycle by remember {
        mutableStateOf(Lifecycle.Event.ON_CREATE)
    }
    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            lifecycle = event
            when (event) {
                Lifecycle.Event.ON_CREATE -> {}
                Lifecycle.Event.ON_START -> {}
                Lifecycle.Event.ON_RESUME -> {

                    if (flowWebViewHolder.timerClass.isTimerRunningBeforeActivityIsPaused) {
                        flowWebViewHolder.timerClass.startTimer()
                    }

                }

                Lifecycle.Event.ON_PAUSE -> {

                    if (flowWebViewHolder.timerClass.isTimerRunning) {
                        flowWebViewHolder.timerClass.pauseTimer()
                    }
                }
                Lifecycle.Event.ON_STOP -> {}
                Lifecycle.Event.ON_DESTROY -> {}
                Lifecycle.Event.ON_ANY -> {}
            }

        }
        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }





    BasicAlertDialog(properties = DialogProperties(usePlatformDefaultWidth = false),
        onDismissRequest = {  },
        modifier = Modifier.padding(start = 10.dp, end = 10.dp )
    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
        ) {


            if(screenLayerSelected == ScreenLayerType.TWO_LAYER ||
                screenLayerSelected == ScreenLayerType.THREE_LAYER
            ) {
                // this will determine the height of the screen
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .weight(1f),
                )

            }


            if(screenLayerSelected == ScreenLayerType.THREE_LAYER) {
                // this will determine the height of the screen
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .weight(1f),
                )

            }


            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f),
                contentAlignment = Alignment.TopEnd
            ) {


                IconButton(
                    onClick = {

                        flowWebViewHolder.timerClass.pauseTimer()
                        flowWebViewHolder.timerClass.resetTimer()
                        flowWebViewHolder.timerClass.changeIsPlayButtonClicked(false)
                        flowWebViewHolder.timerClass.userPausedTheTimerBeforeTheActivityIsPaused()
                        flowWebViewHolder.webHeight = 0
                        flowWebViewHolder.webViewUrl = null

                        onDismiss()


                    }, modifier = Modifier
                        .zIndex(1f)
                        .offset(8.dp, 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_cancel),
                        contentDescription = null,
                        tint = Color(0xff660526),
                        modifier = Modifier
                            .background(Color.White, shape = CircleShape)
                            .scale(1.5f)
                            .border(
                            width = 1.3.dp,
                            brush =  rainbowColorsBrush,
                            shape = CircleShape
                        )
                    )

                }





                AndroidView(factory = { webContext ->


                    flowWebViewHolder.webView.apply {


                        layoutParams = ViewGroup.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.MATCH_PARENT
                        )


                        setLayerType(View.LAYER_TYPE_HARDWARE, null)




                        settings.apply {

                            javaScriptEnabled = true

                            displayZoomControls = false
                            layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL

                            // Enable smooth scrolling
                            isVerticalScrollBarEnabled = true
                            isHorizontalScrollBarEnabled = true
                            isScrollbarFadingEnabled = true


                            mediaPlaybackRequiresUserGesture = false // Allow auto-play of media
                            loadsImagesAutomatically = true
                            javaScriptCanOpenWindowsAutomatically = true

                            domStorageEnabled = false  // Enable DOM storage
                            databaseEnabled = false  // Enable database


                        }


                        // Enable private browsing mode
                        if (isPcModeActive) {

                            this.settings.userAgentString =
                                "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0"
                            this.settings.builtInZoomControls = true
                            this.settings.useWideViewPort = true
                            this.settings.loadWithOverviewMode = true


                        } else {

                            this.settings.userAgentString = WebSettings.getDefaultUserAgent(context)
                            this.settings.builtInZoomControls = false
                            this.settings.useWideViewPort = false
                            this.settings.loadWithOverviewMode = false

                        }


                        val activity = context as? Activity
                        webChromeClient = object : WebChromeClient() {

                            var customView: View? = null


                            override fun onHideCustomView() {

                                customView?.let {
                                    (activity)?.window?.decorView?.let { decorView ->
                                        (decorView as FrameLayout).removeView(it)
                                        customView = null
                                    }
                                }

                            }

                            override fun onShowCustomView(
                                paramView: View,
                                paramCustomViewCallback: CustomViewCallback
                            ) {

                                if (customView != null) {
                                    onHideCustomView()
                                    return
                                }
                                customView = paramView
                                ((activity)?.window?.decorView as? FrameLayout)?.addView(
                                    customView,
                                    FrameLayout.LayoutParams(
                                        FrameLayout.LayoutParams.MATCH_PARENT,
                                        FrameLayout.LayoutParams.MATCH_PARENT
                                    )
                                )
                            }

                            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                                super.onProgressChanged(view, newProgress)

                                flowWebViewHolder.webProgressValue = newProgress

                                if (newProgress >= 100) {
                                    flowWebViewHolder.isWebPageLoading = false

                                    scope.launch {

                                        delay(3000)

                                        flowWebViewHolder.timerClass.reStartTimer()

                                    }


                                }

                                if (isPcModeActive) {

                                    view?.loadUrl("javascript:(function(){var meta=document.createElement('meta');meta.name='viewport';meta.content='width=device-width, initial-scale=1.0';document.getElementsByTagName('head')[0].appendChild(meta);})()")
                                    view?.evaluateJavascript(
                                        "document.querySelector('meta[name=\"viewport\"]').setAttribute('content', 'width=1024px, initial-scale=' + (document.documentElement.clientWidth / 1024));",
                                        null
                                    )

                                }

                            }

                        }



                        webViewClient = object : WebViewClient() {


                            override fun shouldInterceptRequest(
                                view: WebView,
                                request: WebResourceRequest
                            ): WebResourceResponse? {

                                if (isAdBlockerActive) {
                                    val empty = ByteArrayInputStream("".toByteArray())
                                    val kk5 = adServers.toString()
                                    //if (kk5.contains(":::::" + request.url.host))
                                    if (kk5.contains("" + request.url.host)) {

                                        return WebResourceResponse("text/plain", "utf-8", empty)
                                    }
                                }
                                return super.shouldInterceptRequest(view, request)
                            }


                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?
                            ): Boolean {

                                if (view != null) {
                                    if (url != null && url!!.toString().startsWith("intent://")) {
                                        val intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME)
                                        if (intent != null) {
                                            val fallbackUrl =
                                                intent.getStringExtra("browser_fallback_url")
                                            return if (fallbackUrl != null) {
                                                view.loadUrl(fallbackUrl)
                                                true
                                            } else {
                                                false
                                            }
                                        }
                                    } else if (url!!.toString().startsWith("tel:")) {
                                        val intent = Intent(Intent.ACTION_DIAL)
                                        intent.data = Uri.parse(url)
                                        // view?.context?.startActivity(intent)
                                        context.startActivity(intent)
                                        return true
                                    } else if (url!!.toString().startsWith("mailto:")) {
                                        val intent = Intent(Intent.ACTION_VIEW)
                                        val data = Uri.parse(
                                            url + Uri.encode("subject") + "&body=" + Uri.encode(
                                                "body"
                                            )
                                        )
                                        intent.data = data
                                        context.startActivity(intent)
                                        // view?.context?.startActivity(intent)
                                        return true
                                    }
                                    return false
                                } else {
                                    return super.shouldOverrideUrlLoading(view, request)
                                }

                            }


                            override fun onPageStarted(
                                view: WebView?,
                                url: String?,
                                favicon: Bitmap?
                            ) {
                                super.onPageStarted(view, url, favicon)
                                if (view != null) {
                                    flowWebViewHolder.isWebPageLoading = true
                                    flowWebViewHolder.webViewUrl = view.url.toString()
                                }
                            }


                        }


                    }

                }, update = { webView ->


                    // Enable private browsing mode
                    if (isPcModeActive) {


                        webView.settings.userAgentString =
                            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0"
                        webView.settings.builtInZoomControls = true
                        webView.settings.useWideViewPort = true
                        webView.settings.loadWithOverviewMode = true


                    } else {


                        webView.settings.userAgentString = WebSettings.getDefaultUserAgent(context)
                        webView.settings.builtInZoomControls = false
                        webView.settings.useWideViewPort = false
                        webView.settings.loadWithOverviewMode = false

                    }


                    when (flowWebViewHolder.webController) {
                        WebControllerType.LOAD_URL -> {
                            if (!flowWebViewHolder.webViewUrl.isNullOrBlank()) {

                                webView.loadUrl(flowWebViewHolder.webViewUrl!!)

                                flowWebViewHolder.webController = WebControllerType.DO_NOTING


                            }
                        }

                        WebControllerType.RELOAD_URL -> {
                            if (!webView.url.isNullOrBlank()) {
                                webView.reload()
                            }
                            flowWebViewHolder.webController = WebControllerType.DO_NOTING
                        }

                        WebControllerType.GO_BACK -> {
                            if (webView.canGoBack()) {
                                webView.goBack()
                            }
                            flowWebViewHolder.webController = WebControllerType.DO_NOTING
                        }

                        WebControllerType.GO_FORWARD -> {
                            if (webView.canGoForward()) {
                                webView.goForward()
                            }
                            flowWebViewHolder.webController = WebControllerType.DO_NOTING
                        }

                        WebControllerType.CLEAR_DATA_AND_RELOAD -> {}
                        WebControllerType.DO_NOTING -> {}

                    }



                    when (lifecycle) {
                        Lifecycle.Event.ON_CREATE -> {}
                        Lifecycle.Event.ON_START -> {}
                        Lifecycle.Event.ON_RESUME -> {}
                        Lifecycle.Event.ON_PAUSE -> {}
                        Lifecycle.Event.ON_STOP -> {}
                        Lifecycle.Event.ON_DESTROY -> {

                            webView.clearHistory()
                            webView.clearCache(true)
                            webView.clearSslPreferences()
                            webView.clearMatches()
                            webView.clearFormData()


                            CookieManager.getInstance().apply {
                                removeAllCookies(null)
                                //Makes sure no caching is done
                                flush()
                            }

                            WebStorage.getInstance().deleteAllData()

                        }

                        Lifecycle.Event.ON_ANY -> {}
                    }


                },
                    modifier = Modifier
                        .fillMaxSize()
                        //.weight(1f)
                        .onSizeChanged {
                            println("Height   ${it.height}")
                        }
                )

            }



            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 2.dp, end = 2.dp)
                    .height(3.dp),
                color = if (flowWebViewHolder.webProgressValue == 100){
                    Color.Transparent
                }else{
                    Color.Red
                },
                progress = { (flowWebViewHolder.webProgressValue / 100.0).toFloat() }

            )



            Row (modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
                horizontalArrangement = Arrangement.Center
            ){

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.CenterVertically)
                    .background(snowColor)
                    .weight(1f)
                ) {

                    Button(onClick = {


                        if (flowWebViewHolder.isWebPageLoading) {
                            Toast.makeText(
                                context,
                                "the web page is still loading",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        } else {
                            if (flowWebViewHolder.timerClass.isTimerRunning) {


                                flowWebViewHolder.timerClass.pauseTimer()
                                flowWebViewHolder.timerClass.resetTimer()
                                flowWebViewHolder.timerClass.changeIsPlayButtonClicked(false)
                                flowWebViewHolder.timerClass.userPausedTheTimerBeforeTheActivityIsPaused()
                                val webHeight = flowWebViewHolder.webHeight
                                val newUrl = flowWebViewHolder.webViewUrl
                                flowWebViewHolder.webHeight = 0
                                flowWebViewHolder.webViewUrl = null



                                onFinished(newUrl!!,webHeight)


                            } else {
                                flowWebViewHolder.timerClass.startTimer()
                                flowWebViewHolder.timerClass.changeIsPlayButtonClicked(true)
                            }
                        }
                    }, modifier = Modifier
                            .scale(0.8f),
                        colors = ButtonDefaults.buttonColors(
                            if (!flowWebViewHolder.timerClass.isTimerRunning) {
                                Color(0xff660526)
                            }else{
                                Color(0xFF073920)
                            }
                        )

                    ) {
                        if (!flowWebViewHolder.timerClass.isTimerRunning) {
                            Text(text = "Start")
                        } else {
                            Text(text = "Done")
                        }
                    }




                }


                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.LightGray)
                    .align(Alignment.CenterVertically),
                    contentAlignment = Alignment.Center
                ) {

                    Text(text = flowWebViewHolder.timerClass.timeCountUpValue.value)
                }

            }



            // Start WebView Navigation controller

            if (!flowWebViewHolder.timerClass.isTimerRunning) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 5.dp, end = 5.dp)
                        .background(
                            snowColor,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .border(
                            width = 1.dp,
                            Color.LightGray,
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f)
                            .align(Alignment.CenterVertically),
                        contentAlignment = Alignment.Center
                    ) {

                        IconButton(onClick = {

                            // onBackButtonClickedForWebNormal(webNum,browserNormalViewModel)
                            flowWebViewHolder.webController = WebControllerType.GO_BACK

                        }) {


                            Icon(
                                painter = painterResource(id = R.drawable.icon_back),
                                contentDescription = "web view forward button",
                                tint = if (flowWebViewHolder.webView.canGoBack()) {
                                    Color.Black
                                } else {
                                    Color.LightGray
                                }

                            )

                        }

                    }


                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f)
                            .align(Alignment.CenterVertically),
                        contentAlignment = Alignment.Center
                    ) {

                        IconButton(onClick = {

                            // onReloadButtonClickedForWebNormal(webNum, browserNormalViewModel)
                            flowWebViewHolder.webController = WebControllerType.RELOAD_URL


                        }) {

                            Icon(
                                painter = painterResource(id = R.drawable.icon_refresh),
                                contentDescription = "web view refresh button"
                            )

                        }

                    }



                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f)
                            .align(Alignment.CenterVertically),
                        contentAlignment = Alignment.Center
                    ) {

                        IconButton(onClick = {


                            flowWebViewHolder.webController = WebControllerType.GO_FORWARD


                        }) {

                            Icon(
                                painter = painterResource(id = R.drawable.icon_forward),
                                contentDescription = "web view forward button",
                                tint = if (flowWebViewHolder.webView.canGoForward()) {
                                    Color.Black
                                } else {
                                    Color.LightGray
                                }


                            )


                        }


                    }


                }


            }
            // Stop WebView Navigation controller





        }


    }



}
