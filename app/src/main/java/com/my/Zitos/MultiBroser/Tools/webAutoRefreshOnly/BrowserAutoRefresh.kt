package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
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
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.WebControllerType
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeUrlValueInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder.BrowserAutoRefreshViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder.BrowserAutoRefreshViewModelFactory
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.URISyntaxException


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun BrowserAutoRefresh(
    modifier: Modifier = Modifier,
    webNum:Int,
    initUrl: String,
    initTotalTime: Int,
    initTimerType: TimerType,
    isPcModeActiveInit: Boolean,
    isAdBlockerActiveInit: Boolean,
    isIncognitoActiveInit: Boolean,
    showSettings: (url:String, webNum: Int, timerType: TimerType, webTotalTime: Int,
                   pcMode: Boolean, adMode: Boolean, incognitoMode: Boolean
            ) -> Unit

) {



    val snowColor by remember { mutableStateOf(Color(0xffFFFBFE)) }

    val context = LocalContext.current

    val scope = rememberCoroutineScope()



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



    val browserAutoRefreshViewModel: BrowserAutoRefreshViewModel = viewModel(
        factory = BrowserAutoRefreshViewModelFactory(context)
    )

    val flowWebViewHolder by if (webNum == 1) {
        browserAutoRefreshViewModel.webViewHolder1.collectAsStateWithLifecycle()
    } else {
        if (webNum == 2) {
            browserAutoRefreshViewModel.webViewHolder2.collectAsStateWithLifecycle()
        } else {
            if (webNum == 3) {
                browserAutoRefreshViewModel.webViewHolder3.collectAsStateWithLifecycle()
            } else {
                if (webNum == 4) {
                    browserAutoRefreshViewModel.webViewHolder4.collectAsStateWithLifecycle()
                } else {
                    if (webNum == 5) {
                        browserAutoRefreshViewModel.webViewHolder5.collectAsStateWithLifecycle()
                    } else {
                        if (webNum == 6) {
                            browserAutoRefreshViewModel.webViewHolder6.collectAsStateWithLifecycle()
                        } else {
                            if (webNum == 7) {
                                browserAutoRefreshViewModel.webViewHolder7.collectAsStateWithLifecycle()
                            } else {
                                if (webNum == 8) {
                                    browserAutoRefreshViewModel.webViewHolder8.collectAsStateWithLifecycle()
                                } else {
                                    if (webNum == 9) {
                                        browserAutoRefreshViewModel.webViewHolder9.collectAsStateWithLifecycle()
                                    } else {
                                        if (webNum == 10) {
                                            browserAutoRefreshViewModel.webViewHolder10.collectAsStateWithLifecycle()
                                        } else {
                                            if (webNum == 11) {
                                                browserAutoRefreshViewModel.webViewHolder11.collectAsStateWithLifecycle()
                                            } else {
                                                if (webNum == 12) {
                                                    browserAutoRefreshViewModel.webViewHolder12.collectAsStateWithLifecycle()
                                                } else {
                                                    if (webNum == 13) {
                                                        browserAutoRefreshViewModel.webViewHolder13.collectAsStateWithLifecycle()
                                                    } else {
                                                        if (webNum == 14) {
                                                            browserAutoRefreshViewModel.webViewHolder14.collectAsStateWithLifecycle()
                                                        } else {
                                                            browserAutoRefreshViewModel.webViewHolder15.collectAsStateWithLifecycle()
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }






    LaunchedEffect(initTimerType, initTotalTime) {

        delay(200)
        flowWebViewHolder.timerType = initTimerType
        flowWebViewHolder.totalTime = initTotalTime

        if (initTotalTime != 0) {
            if (initTimerType == TimerType.MINUTES) {
                flowWebViewHolder.timerClass.changeTimerDurationInMinutes(initTotalTime)
            } else {
                flowWebViewHolder.timerClass.changeTimerDurationInSeconds(initTotalTime)
            }

            flowWebViewHolder.timerClass.initializingTime(initTimerType, initTotalTime)

        }

    }

    LaunchedEffect(isPcModeActiveInit) {
        //if (flowWebViewHolder.isPcModeActive == null){
            flowWebViewHolder.isPcModeActive = isPcModeActiveInit
       // }
    }
    LaunchedEffect(isAdBlockerActiveInit) {
       // if (flowWebViewHolder.isAdBlockerActive == null){
            flowWebViewHolder.isAdBlockerActive = isAdBlockerActiveInit
        //}
    }
    LaunchedEffect(isIncognitoActiveInit) {
       // if (flowWebViewHolder.isIncognitoActive == null){
            flowWebViewHolder.isIncognitoActive = isIncognitoActiveInit
        //}
    }

    LaunchedEffect(initUrl) {
        delay(200)
        flowWebViewHolder.webViewUrl = initUrl

        if (flowWebViewHolder.webView.url.isNullOrBlank()) {
            if (initUrl.isNotBlank()) {
                flowWebViewHolder.webController = WebControllerType.LOAD_URL
            }
        }
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





    val drawColor by remember {
        mutableStateOf(Color(0xffB04F70))
    }



    Column(modifier = modifier
        .fillMaxSize()
    ) {


        Box(modifier = Modifier
            .fillMaxSize()
            .weight(1f),
            contentAlignment = Alignment.Center
        ) {


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
                    builtInZoomControls = true

                    // Enable smooth scrolling
                    isVerticalScrollBarEnabled = true
                    isHorizontalScrollBarEnabled = true
                   isScrollbarFadingEnabled = true

                    mediaPlaybackRequiresUserGesture = false // Allow auto-play of media
                    loadsImagesAutomatically = true
                    javaScriptCanOpenWindowsAutomatically = true

                   domStorageEnabled = true  // Enable DOM storage
                   databaseEnabled = true  // Enable database


                }



                // Enable private browsing mode
                if (flowWebViewHolder.isPcModeActive == true) {

                    this.settings.userAgentString  = "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0"
                    this.settings.useWideViewPort = true
                     this.settings.loadWithOverviewMode = true



                }else{

                    this.settings.userAgentString = WebSettings.getDefaultUserAgent(context)
                    this.settings.useWideViewPort = false
                    this.settings.loadWithOverviewMode = false

                }


                if (flowWebViewHolder.isIncognitoActive == true) {

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                       // this.settings.safeBrowsingEnabled = true
                    }

                    this.settings.cacheMode = WebSettings.LOAD_NO_CACHE

                    val cookieManager = CookieManager.getInstance()
                    cookieManager.setAcceptCookie(false)


                }else{

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                       // this.settings.safeBrowsingEnabled = false
                    }
                    this.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

                    val cookieManager = CookieManager.getInstance()
                    cookieManager.setAcceptCookie(true)

                }






                val activity = context as? Activity
                webChromeClient = object : WebChromeClient(){

                    var customView: View? = null


                    override fun onHideCustomView() {

                        customView?.let {
                            (activity)?.window?.decorView?.let { decorView ->
                                (decorView as FrameLayout).removeView(it)
                                customView = null
                            }
                        }

                    }

                    override fun onShowCustomView(paramView: View, paramCustomViewCallback: CustomViewCallback) {

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

                        if (flowWebViewHolder.isPcModeActive == true){

                            view?.loadUrl("javascript:(function(){var meta=document.createElement('meta');meta.name='viewport';meta.content='width=device-width, initial-scale=1.0';document.getElementsByTagName('head')[0].appendChild(meta);})()")
                            view?.evaluateJavascript("document.querySelector('meta[name=\"viewport\"]').setAttribute('content', 'width=1024px, initial-scale=' + (document.documentElement.clientWidth / 1024));", null)

                        }


                    }

                }



                webViewClient = object : WebViewClient() {


                    override fun shouldInterceptRequest(view: WebView, request: WebResourceRequest): WebResourceResponse? {

                        scope.launch {
                            if (flowWebViewHolder.webViewUrl != view.url.toString()) {
                                changeUrlValueInSharedPrefForWebRefresh(
                                    context,
                                    webNum,
                                    view.url.toString()
                                )

                                flowWebViewHolder.webViewUrl = view.url.toString()
                            }
                        }


                        if (flowWebViewHolder.isAdBlockerActive == true) {
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

                        if (request!!.url.toString().startsWith("intent://")) {
                            try {

                                val intent = Intent.parseUri(request.url.toString(), Intent.URI_INTENT_SCHEME)

                                if (intent != null) {
                                    view!!.stopLoading()

                                    /*
                                    val packageManager: PackageManager = context.packageManager
                                    val info = packageManager.resolveActivity(
                                        intent,
                                        PackageManager.MATCH_DEFAULT_ONLY
                                    )
                                    if (info != null) {
                                        context.startActivity(intent)
                                    } else {
                                        val fallbackUrl = intent.getStringExtra("browser_fallback_url")
                                        view.loadUrl(fallbackUrl!!)

                                        // or call external broswer
                                        //val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(fallbackUrl))
                                        //context.startActivity(browserIntent)
                                    }

                                     */

                                    return true
                                }
                            } catch (e: URISyntaxException) {
                                //if (GeneralData.DEBUG) {
                                //    Log.e(TAG, "Can't resolve intent://", e)
                                // }
                            }
                        }

                        return false

                    }





                    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                        super.onPageStarted(view, url, favicon)
                        scope.launch {
                            if(view != null) {
                                if (flowWebViewHolder.webViewUrl != view.url.toString()) {
                                    changeUrlValueInSharedPrefForWebRefresh(
                                        context,
                                        webNum,
                                        view.url.toString()
                                    )

                                    flowWebViewHolder.webViewUrl = view.url.toString()
                                }
                            }
                        }

                    }




                    override fun onPageFinished(view: WebView?, url: String?) {

                        super.onPageFinished(view, url)

                        scope.launch {

                            delay(3000)

                            flowWebViewHolder.timerClass.reStartTimer()

                        }

                    }

                }


            }

        }, update = { webView ->



            // Enable private browsing mode
            if (flowWebViewHolder.isPcModeActive == true) {

                webView.settings.userAgentString =   "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0"
                webView.settings.useWideViewPort = true
                webView.settings.loadWithOverviewMode = true

            }else{

                webView.settings.userAgentString = WebSettings.getDefaultUserAgent(context)
                webView.settings.useWideViewPort = false
                webView.settings.loadWithOverviewMode = false

            }


            if (flowWebViewHolder.isIncognitoActive == true) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                   // webView.settings.safeBrowsingEnabled = true
                }

                webView.settings.cacheMode = WebSettings.LOAD_NO_CACHE

                val cookieManager = CookieManager.getInstance()
                cookieManager.setAcceptCookie(false)


            }else{

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                   // webView.settings.safeBrowsingEnabled = false
                }
                webView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

                val cookieManager = CookieManager.getInstance()
                cookieManager.setAcceptCookie(true)



            }






            when(flowWebViewHolder.webController)
            {
                WebControllerType.LOAD_URL -> {
                    if (!flowWebViewHolder.webViewUrl.isNullOrBlank()) {
                      //  webView.clearFocus()
                       // webView.clearCache(false)
                        webView.loadUrl(flowWebViewHolder.webViewUrl!!)
                    }
                    flowWebViewHolder.webController= WebControllerType.DO_NOTING
                }
                WebControllerType.RELOAD_URL -> {
                    if (!webView.url.isNullOrBlank()) {
                        //webView.reload()
                        webView.loadUrl(webView.url.toString())
                    }
                    flowWebViewHolder.webController= WebControllerType.DO_NOTING
                }
                WebControllerType.GO_BACK -> {
                    if (webView.canGoBack()){
                        webView.goBack()
                    }
                    flowWebViewHolder.webController= WebControllerType.DO_NOTING
                }
                WebControllerType.GO_FORWARD -> {
                    if (webView.canGoForward()){
                        webView.goForward()
                    }
                    flowWebViewHolder.webController= WebControllerType.DO_NOTING
                }
                WebControllerType.CLEAR_DATA_AND_RELOAD -> {

                    scope.launch {

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

                        delay(3000)

                        if (!flowWebViewHolder.webViewUrl.isNullOrBlank()) {
                            webView.loadUrl(flowWebViewHolder.webViewUrl!!)
                        }

                        flowWebViewHolder.webController = WebControllerType.DO_NOTING

                    }

                }
                WebControllerType.DO_NOTING -> {


                }

            }


            when(lifecycle){
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
        )


            if (flowWebViewHolder.webViewUrl.isNullOrBlank()){

                Image(painter = painterResource(id = R.drawable.icon_app_name),
                    contentDescription = null
                )

            }


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
            progress = { (flowWebViewHolder.webProgressValue / 100.0).toFloat() },
        )




        Row(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(snowColor)
            .drawBehind {
                val strokeWidth = 3.dp.toPx()
                val x = size.width
                // Draw top border
                drawLine(
                    color = drawColor,
                    start = Offset(0f, 0f),
                    end = Offset(x, 0f),
                    strokeWidth = strokeWidth
                )
                // Draw bottom border
                drawLine(
                    color = drawColor,
                    start = Offset(0f, size.height),
                    end = Offset(x, size.height),
                    strokeWidth = strokeWidth
                )
            }
            // .border(width = 0.5.dp, Color.Cyan)
        ) {

            Box(modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .weight(1f),
                contentAlignment = Alignment.Center
            ){

                IconButton(onClick = {

                    showSettings(
                        if ( flowWebViewHolder.webViewUrl.isNullOrBlank()){
                            ""
                        }else{
                            flowWebViewHolder.webViewUrl!!
                        },

                        webNum,

                       if (flowWebViewHolder.timerType == null){
                           TimerType.MINUTES
                       }else{
                           flowWebViewHolder.timerType!!
                       },

                        if ( flowWebViewHolder.totalTime == null){
                            0
                        }else{
                            flowWebViewHolder.totalTime!!
                        },

                        if ( flowWebViewHolder.isPcModeActive == null){
                            false
                        }else{
                            flowWebViewHolder.isPcModeActive!!
                        },

                        if ( flowWebViewHolder.isAdBlockerActive == null){
                            false
                        }else{
                            flowWebViewHolder.isAdBlockerActive!!
                        },


                        if ( flowWebViewHolder.isIncognitoActive == null){
                            false
                        }else{
                            flowWebViewHolder.isIncognitoActive!!
                        }


                    )



                }) {
                    Icon(painter = painterResource(id = R.drawable.icon_settings),
                        contentDescription = "settings"
                    )
                }

            }





            Column(modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ){

                var autoTextSize1 by remember {
                    mutableStateOf(6.sp)
                }
                Text(
                    text = "web$webNum",
                    fontSize = autoTextSize1,
                    softWrap = false,
                    fontWeight = FontWeight.SemiBold,
                    onTextLayout = { textLayoutResult ->
                        if (textLayoutResult.didOverflowWidth){
                            autoTextSize1 *= 0.9
                        }
                    }
                )

                var autoTextSize2 by remember {
                    mutableStateOf(12.sp)
                }

                Text(
                    text = flowWebViewHolder.timerClass.timeCountDownLeft.value,
                    softWrap = false,
                    fontSize = autoTextSize2,
                    fontWeight = FontWeight.SemiBold,
                    onTextLayout = { textLayoutResult ->
                        if (textLayoutResult.didOverflowWidth){
                            autoTextSize2 *= 0.9
                        }
                    }
                )
            }

            Box(modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .weight(1f),
                contentAlignment = Alignment.Center
            ){

                IconButton(onClick = {

                    if (!flowWebViewHolder.webViewUrl.isNullOrBlank()) {

                        if (flowWebViewHolder.timerClass.isTimerRunning) {
                            flowWebViewHolder.timerClass.pauseTimer()
                            flowWebViewHolder.timerClass.changeIsPlayButtonClicked(false)
                            flowWebViewHolder.timerClass.userPausedTheTimerBeforeTheActivityIsPaused()
                        } else {
                            flowWebViewHolder.timerClass.startTimer()
                            flowWebViewHolder.timerClass.changeIsPlayButtonClicked(true)
                        }
                    }


                }) {

                    if (!flowWebViewHolder.timerClass.isTimerRunning) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_play),
                            contentDescription = "settings"
                        )
                    }else{

                        Icon(
                            painter = painterResource(id = R.drawable.icon_pause),
                            contentDescription = "settings"
                        )
                    }
                }

            }



        }


    }





}

