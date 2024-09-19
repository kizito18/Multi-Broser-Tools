package com.my.Zitos.MultiBroser.Tools

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.datastore.dataStore
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.my.Zitos.MultiBroser.Tools.dialog.AppUpdateDialog
import com.my.Zitos.MultiBroser.Tools.dialog.DialogWebVisibility
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.AppUpdateAllPref
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.setAppDownloadUrlPref
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.setIsUpdateAvailablePref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.AutoScrollWebViewSetupLayout
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.BrowserAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.WebAutoScrollSerializer
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.WebScrollAllPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb10CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb11CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb12CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb13CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb14CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb15CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb1CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb2CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb3CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb4CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb5CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb6CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb7CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb8CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.sharedPref.setWeb9CheckedForSpForWebAutoScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModelFactory
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class ValuesHolderForAutoScrollActivityMainScreen{

    var isSettingsLayoutOpen by mutableStateOf(false)
    var isFloatingButtonClicked by mutableStateOf(false)

    var urlPassed by mutableStateOf("")
    var timerTypePassed by mutableStateOf<TimerType?>(null)
    var webNumPassed by mutableIntStateOf(0)
    var timePassed by mutableIntStateOf(0)
    var scrollSpeedPassed by mutableIntStateOf(0)
    var webLengthPassed by mutableIntStateOf(0)
    var pcModePassed by mutableStateOf<Boolean?>(null)
    var adBlockerModePassed by mutableStateOf<Boolean?>(null)
    var incognitoModePassed by mutableStateOf<Boolean?>(null)



    var offsetX by mutableStateOf(0.dp)
    var offsetY by mutableStateOf(0.dp)




    var isWeb1Checked by  mutableStateOf(true)
    var isWeb2Checked by  mutableStateOf(true)
    var isWeb3Checked by  mutableStateOf(true)
    var isWeb4Checked by   mutableStateOf(true)
    var isWeb5Checked by  mutableStateOf(true)
    var isWeb6Checked by   mutableStateOf(false)
    var isWeb7Checked by  mutableStateOf(false)
    var isWeb8Checked by   mutableStateOf(true)
    var isWeb9Checked by   mutableStateOf(true)
    var isWeb10Checked by   mutableStateOf(true)
    var isWeb11Checked by  mutableStateOf(false)
    var isWeb12Checked by  mutableStateOf(false)
    var isWeb13Checked by   mutableStateOf(false)
    var isWeb14Checked by  mutableStateOf(true)
    var isWeb15Checked by   mutableStateOf(true)



}



val Context.dataStoreForWebAutoScroll by dataStore("app-sp3.json", WebAutoScrollSerializer)



class AutoScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)



            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            val context = LocalContext.current

            val scope = rememberCoroutineScope()

            val dataStoreValues = context.dataStoreForWebAutoScroll.data.collectAsStateWithLifecycle(
                initialValue = WebScrollAllPref()
            )

            val browserAutoScrollViewModel: BrowserAutoScrollViewModel = viewModel(
                factory = BrowserAutoScrollViewModelFactory(context)
            )

            val flowValueHolder by browserAutoScrollViewModel.passedValuesForInteraction.collectAsStateWithLifecycle()



            //Start for Full screen using immersive
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                // Configure cutout mode for full screen
                window.attributes = window.attributes.apply {
                    layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
                }
            }else{
                // For lower API levels, handle system UI visibility
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = (
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                                View.SYSTEM_UI_FLAG_FULLSCREEN or
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        )
            }


            // Enable edge-to-edge layout
            // if the settings layout is open then show remove full screen
            WindowCompat.setDecorFitsSystemWindows(window,
                if (flowValueHolder.isSettingsLayoutOpen || flowValueHolder.isFloatingButtonClicked){
                    true
                }else{
                    false
                }
            )

            /// Set the background color of the window



            WindowCompat.FEATURE_ACTION_MODE_OVERLAY
            // Set the system UI visibility flags to hide the system bars
            WindowInsetsControllerCompat(window, window.decorView).let { controller ->
                controller.hide(WindowInsetsCompat.Type.statusBars())
                controller.hide(WindowInsetsCompat.Type.systemBars())
                controller.systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }


            //Stop for full screen


            val systemUiController = rememberSystemUiController()

            //systemUiController.setNavigationBarColor(Color.Gray)
            //systemUiController.setStatusBarColor(Color.Gray)
            systemUiController.setNavigationBarColor(Color(0xff66093E))
            systemUiController.setStatusBarColor(Color(0xff66093E))





            val alphaGray by remember { mutableStateOf( Color(
                red = Color(0xff660526).red,
                green = Color(0xff660526).green,
                blue = Color(0xff660526).blue,
                alpha = 0.7f
            )
            ) }


            var boxConstraints by remember {
                mutableStateOf<Constraints?>(null)
            }

            val density = LocalDensity.current


            var backNum by remember { mutableIntStateOf(0) }


            BackHandler {

                backNum += 1

                if (backNum >= 2){

                    context.startActivity(Intent(context, MainActivity::class.java))
                    finishAffinity()
                }else{
                    Toast.makeText(context, "double click to exit", Toast.LENGTH_SHORT).show()
                }

                scope.launch {
                    delay(1000)
                    backNum = 0
                }

            }




            LaunchedEffect(key1 = dataStoreValues.value.checkBox1) {
                if (dataStoreValues.value.checkBox1 != null) {
                    flowValueHolder.isWeb1Checked = dataStoreValues.value.checkBox1!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox2) {
                if(dataStoreValues.value.checkBox2 != null) {
                    flowValueHolder.isWeb2Checked = dataStoreValues.value.checkBox2!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox3) {
                if(dataStoreValues.value.checkBox3 != null) {
                    flowValueHolder.isWeb3Checked = dataStoreValues.value.checkBox3!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox4) {
                if(dataStoreValues.value.checkBox4 != null) {
                    flowValueHolder.isWeb4Checked = dataStoreValues.value.checkBox4!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox5) {
                if(dataStoreValues.value.checkBox5 != null) {
                    flowValueHolder.isWeb5Checked = dataStoreValues.value.checkBox5!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox6) {
                if(dataStoreValues.value.checkBox6 != null) {
                    flowValueHolder.isWeb6Checked = dataStoreValues.value.checkBox6!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox7) {
                if(dataStoreValues.value.checkBox7 != null) {
                    flowValueHolder.isWeb7Checked = dataStoreValues.value.checkBox7!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox8) {
                if(dataStoreValues.value.checkBox8 != null) {
                    flowValueHolder.isWeb8Checked = dataStoreValues.value.checkBox8!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox9) {
                if(dataStoreValues.value.checkBox9 != null) {
                    flowValueHolder.isWeb9Checked = dataStoreValues.value.checkBox9!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox10) {
                if(dataStoreValues.value.checkBox10 != null) {
                    flowValueHolder.isWeb10Checked = dataStoreValues.value.checkBox10!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox11) {
                if(dataStoreValues.value.checkBox11 != null) {
                    flowValueHolder.isWeb11Checked = dataStoreValues.value.checkBox11!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox12) {
                if(dataStoreValues.value.checkBox12 != null) {
                    flowValueHolder.isWeb12Checked = dataStoreValues.value.checkBox12!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox13) {
                if(dataStoreValues.value.checkBox13 != null) {
                    flowValueHolder.isWeb13Checked = dataStoreValues.value.checkBox13!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox14) {
                if(dataStoreValues.value.checkBox14 != null) {
                    flowValueHolder.isWeb14Checked = dataStoreValues.value.checkBox14!!
                }
            }
            LaunchedEffect(key1 = dataStoreValues.value.checkBox15) {
                if(dataStoreValues.value.checkBox15 != null) {
                    flowValueHolder.isWeb15Checked = dataStoreValues.value.checkBox15!!
                }
            }



            val drawColor by remember {
                mutableStateOf(Color(0xffB04F70))
            }




            val dataStoreAppUpdate = context.dataStoreForAppUpdate.data.collectAsState(
                initial = AppUpdateAllPref()
            )



            LaunchedEffect(key1 = Unit) {

                val (appLink, isUpdateAvailable) = getDataFromFireStore()

                setAppDownloadUrlPref(
                    downloadUrl = appLink,
                    dataStore = context.dataStoreForAppUpdate
                )
                setIsUpdateAvailablePref(
                    isUpdateAvailable = isUpdateAvailable,
                    dataStore = context.dataStoreForAppUpdate
                )


            }





            if (dataStoreAppUpdate.value.isUpdateAvailable) {

                AppUpdateDialog(
                    onDismiss = {
                        // user can never dismiss
                    },
                    onConfirm = {
                        try {
                            val ii = Intent(Intent.ACTION_VIEW)
                            ii.data = Uri.parse(dataStoreAppUpdate.value.appDownloadUrl)
                            context.startActivity(ii)
                        } catch (e: ActivityNotFoundException) {

                            Toast.makeText(context, "an error occurred", Toast.LENGTH_SHORT).show()
                        }
                    }

                )

            }






            Scaffold(

                floatingActionButton = {

                    if (!flowValueHolder.isFloatingButtonClicked &&
                        !flowValueHolder.isSettingsLayoutOpen
                    ) {

                        FloatingActionButton(
                            onClick = {

                                flowValueHolder.isFloatingButtonClicked = true

                            },
                            modifier = Modifier
                                .offset(
                                    x = flowValueHolder.offsetX,
                                    y = flowValueHolder.offsetY
                                )
                                .pointerInput(Unit) {
                                    detectDragGestures { _, dragAmount ->


                                        val xx = flowValueHolder.offsetX + with(density) { dragAmount.x.toDp() }
                                        val yy = flowValueHolder.offsetY + with(density) { dragAmount.y.toDp() }

                                        flowValueHolder.offsetX = xx.coerceIn(
                                            with(density) { -boxConstraints!!.maxWidth.toDp() + 80.dp },
                                            1.dp
                                        )
                                        flowValueHolder.offsetY = yy.coerceIn(
                                            with(density) { -boxConstraints!!.maxHeight.toDp() + 80.dp },
                                            1.dp
                                        )

                                    }
                                },
                            shape = CircleShape,
                            containerColor = alphaGray,
                            contentColor = Color.White,
                            elevation = FloatingActionButtonDefaults.elevation(100.dp)
                        ) {



                            Icon(
                                painter = painterResource(id = R.drawable.icon_disabled_visible),
                                contentDescription = null,
                                tint = Color.White

                            )


                        }

                    }

                },
                modifier = Modifier.background(color = Color.Transparent)
            ) {

                val padding = it

                BoxWithConstraints(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    boxConstraints = constraints




                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {



                        // web1 till web5
                        if (flowValueHolder.isWeb1Checked ||
                            flowValueHolder.isWeb2Checked ||
                            flowValueHolder.isWeb3Checked ||
                            flowValueHolder.isWeb4Checked ||
                            flowValueHolder.isWeb5Checked
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {

                                // web1
                                if (flowValueHolder.isWeb1Checked) {

                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {


                                        BrowserAutoScroll(
                                            webNum = 1,
                                            initUrl = dataStoreValues.value.web1Url,
                                            initTotalTime = dataStoreValues.value.web1TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb1,
                                            initScrollSpeed = dataStoreValues.value.web1ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web1WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb1,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb1,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb1,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }

                                }


                                //web2
                                if (flowValueHolder.isWeb2Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 2,
                                            initUrl = dataStoreValues.value.web2Url,
                                            initTotalTime = dataStoreValues.value.web2TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb2,
                                            initScrollSpeed = dataStoreValues.value.web2ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web2WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb2,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb2,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb2,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web3
                                if (flowValueHolder.isWeb3Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 3,
                                            initUrl = dataStoreValues.value.web3Url,
                                            initTotalTime = dataStoreValues.value.web3TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb3,
                                            initScrollSpeed = dataStoreValues.value.web3ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web3WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb3,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb3,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb3,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web4
                                if (flowValueHolder.isWeb4Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 4,
                                            initUrl = dataStoreValues.value.web4Url,
                                            initTotalTime = dataStoreValues.value.web4TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb4,
                                            initScrollSpeed = dataStoreValues.value.web4ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web4WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb4,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb4,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb4,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web5
                                if (flowValueHolder.isWeb5Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 5,
                                            initUrl = dataStoreValues.value.web5Url,
                                            initTotalTime = dataStoreValues.value.web5TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb5,
                                            initScrollSpeed = dataStoreValues.value.web5ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web5WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb5,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb5,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb5,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }

                                }


                            }

                        }
                        // stop web1 till web 5


                        //web6 till web10
                        if (flowValueHolder.isWeb6Checked ||
                            flowValueHolder.isWeb7Checked ||
                            flowValueHolder.isWeb8Checked ||
                            flowValueHolder.isWeb9Checked ||
                            flowValueHolder.isWeb10Checked
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {

                                //web6
                                if (flowValueHolder.isWeb6Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {

                                        BrowserAutoScroll(
                                            webNum = 6,
                                            initUrl = dataStoreValues.value.web6Url,
                                            initTotalTime = dataStoreValues.value.web6TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb6,
                                            initScrollSpeed = dataStoreValues.value.web6ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web6WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb6,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb6,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb6,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )



                                    }
                                }


                                //web7
                                if (flowValueHolder.isWeb7Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 7,
                                            initUrl = dataStoreValues.value.web7Url,
                                            initTotalTime = dataStoreValues.value.web7TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb7,
                                            initScrollSpeed = dataStoreValues.value.web7ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web7WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb7,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb7,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb7,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }
                                }

                                // web8
                                if (flowValueHolder.isWeb8Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 8,
                                            initUrl = dataStoreValues.value.web8Url,
                                            initTotalTime = dataStoreValues.value.web8TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb8,
                                            initScrollSpeed = dataStoreValues.value.web8ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web8WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb8,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb8,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb8,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }
                                }

                                //web9
                                if (flowValueHolder.isWeb9Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 9,
                                            initUrl = dataStoreValues.value.web9Url,
                                            initTotalTime = dataStoreValues.value.web9TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb9,
                                            initScrollSpeed = dataStoreValues.value.web9ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web9WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb9,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb9,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb9,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web10
                                if (flowValueHolder.isWeb10Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 10,
                                            initUrl = dataStoreValues.value.web10Url,
                                            initTotalTime = dataStoreValues.value.web10TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb10,
                                            initScrollSpeed = dataStoreValues.value.web10ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web10WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb10,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb10,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb10,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }


                            }
                        }
                        // stop web6 till web 10


                        //web11 till web 15
                        if (flowValueHolder.isWeb11Checked ||
                            flowValueHolder.isWeb12Checked ||
                            flowValueHolder.isWeb13Checked ||
                            flowValueHolder.isWeb14Checked ||
                            flowValueHolder.isWeb15Checked
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {

                                //web11
                                if (flowValueHolder.isWeb11Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 11,
                                            initUrl = dataStoreValues.value.web11Url,
                                            initTotalTime = dataStoreValues.value.web11TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb11,
                                            initScrollSpeed = dataStoreValues.value.web11ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web11WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb11,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb11,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb11,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }
                                }

                                //web12
                                if (flowValueHolder.isWeb12Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 12,
                                            initUrl = dataStoreValues.value.web12Url,
                                            initTotalTime = dataStoreValues.value.web12TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb12,
                                            initScrollSpeed = dataStoreValues.value.web12ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web12WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb12,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb12,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb12,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web13
                                if (flowValueHolder.isWeb13Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = Color.Gray,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 13,
                                            initUrl = dataStoreValues.value.web13Url,
                                            initTotalTime = dataStoreValues.value.web13TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb13,
                                            initScrollSpeed = dataStoreValues.value.web13ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web13WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb13,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb13,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb13,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )


                                    }
                                }

                                //web14
                                if (flowValueHolder.isWeb14Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 14,
                                            initUrl = dataStoreValues.value.web14Url,
                                            initTotalTime = dataStoreValues.value.web14TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb14,
                                            initScrollSpeed = dataStoreValues.value.web14ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web14WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb14,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb14,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb14,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                             webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode

                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }

                                //web15
                                if (flowValueHolder.isWeb15Checked) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(1f)
                                            .drawBehind {
                                                val strokeWidth = 1.dp.toPx()
                                                val y = size.height
                                                // Draw left border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(0f, 0f),
                                                    end = Offset(0f, y),
                                                    strokeWidth = strokeWidth
                                                )
                                                // Draw right border
                                                drawLine(
                                                    color = drawColor,
                                                    start = Offset(size.width, 0f),
                                                    end = Offset(size.width, y),
                                                    strokeWidth = strokeWidth
                                                )
                                            }
                                    ) {
                                        BrowserAutoScroll(
                                            webNum = 15,
                                            initUrl = dataStoreValues.value.web15Url,
                                            initTotalTime = dataStoreValues.value.web15TotalTimer,
                                            initTimerType = dataStoreValues.value.timerTypeForWeb15,
                                            initScrollSpeed = dataStoreValues.value.web15ScrollSpeed,
                                            initWebLength = dataStoreValues.value.web15WebLength,
                                            isPcModeActiveInit = dataStoreValues.value.isPcModeActiveForWeb15,
                                            isAdBlockerActiveInit = dataStoreValues.value.isAdBlockerActiveForWeb15,
                                            isIncognitoActiveInit = dataStoreValues.value.isIncognitoActiveForWeb15,
                                            showSettings = { url, webNum, timerType, webTotalTime,
                                                webScrollSpeed,webLength,
                                                             pcMode,adMode, incognitoMode ->
                                                flowValueHolder.webNumPassed = webNum
                                                flowValueHolder.timerTypePassed = timerType
                                                flowValueHolder.timePassed = webTotalTime
                                                flowValueHolder.scrollSpeedPassed = webScrollSpeed
                                                flowValueHolder.webLengthPassed = webLength
                                                flowValueHolder.urlPassed = url
                                                flowValueHolder.isSettingsLayoutOpen = true
                                                flowValueHolder.pcModePassed = pcMode
                                                flowValueHolder.adBlockerModePassed = adMode
                                                flowValueHolder.incognitoModePassed = incognitoMode
                                            },
                                            modifier = Modifier

                                        )

                                    }
                                }


                            }
                        }








                    }




                    if(flowValueHolder.isSettingsLayoutOpen){
                        AutoScrollWebViewSetupLayout(
                            url = flowValueHolder.urlPassed,
                            webNum = flowValueHolder.webNumPassed,
                            spTimerType = flowValueHolder.timerTypePassed!!,
                            spWebTotalTime = flowValueHolder.timePassed,
                            spScrollSpeed = flowValueHolder.scrollSpeedPassed,
                            spWebHeight=  flowValueHolder.webLengthPassed,
                            initPcMode = flowValueHolder.pcModePassed!!,
                            initIncognitoMode = flowValueHolder.incognitoModePassed!!,
                            initAdBlockerMode = flowValueHolder.adBlockerModePassed!!,
                            onDismiss = {
                                flowValueHolder.urlPassed =""
                                flowValueHolder.timerTypePassed = null
                                flowValueHolder.webNumPassed = 0
                                flowValueHolder.timePassed = 0
                                flowValueHolder.scrollSpeedPassed = 0
                                flowValueHolder.webLengthPassed = 0
                                flowValueHolder.pcModePassed = null
                                flowValueHolder.adBlockerModePassed = null
                                flowValueHolder.incognitoModePassed = null

                                flowValueHolder.isSettingsLayoutOpen = false

                            },
                            changeFullScreen = {


                                WindowCompat.FEATURE_ACTION_MODE_OVERLAY
                                // Set the system UI visibility flags to hide the system bars
                                WindowInsetsControllerCompat(window, window.decorView).let { controller ->
                                    controller.hide(WindowInsetsCompat.Type.statusBars())
                                    controller.hide(WindowInsetsCompat.Type.systemBars())
                                    controller.systemBarsBehavior =
                                        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                                }

                            }
                        )

                    }






                    if (flowValueHolder.isFloatingButtonClicked) {

                        DialogWebVisibility(
                            flowValueHolder.isWeb1Checked,
                            flowValueHolder.isWeb2Checked,
                            flowValueHolder.isWeb3Checked,
                            flowValueHolder.isWeb4Checked,
                            flowValueHolder.isWeb5Checked,
                            flowValueHolder.isWeb6Checked,
                            flowValueHolder.isWeb7Checked,
                            flowValueHolder.isWeb8Checked,
                            flowValueHolder.isWeb9Checked,
                            flowValueHolder.isWeb10Checked,
                            flowValueHolder.isWeb11Checked,
                            flowValueHolder.isWeb12Checked,
                            flowValueHolder.isWeb13Checked,
                            flowValueHolder.isWeb14Checked,
                            flowValueHolder.isWeb15Checked,
                            onDismiss = { flowValueHolder.isFloatingButtonClicked = false },
                            onButtonClicked = { box1, box2, box3, box4, box5, box6, box7, box8,
                                                box9, box10, box11, box12, box13, box14, box15 ->
                                scope.launch {

                                    setWeb1CheckedForSpForWebAutoScroll(
                                        boxValue = box1,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb2CheckedForSpForWebAutoScroll(
                                        boxValue = box2,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb3CheckedForSpForWebAutoScroll(
                                        boxValue = box3,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb4CheckedForSpForWebAutoScroll(
                                        boxValue = box4,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb5CheckedForSpForWebAutoScroll(
                                        boxValue = box5,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )

                                    setWeb6CheckedForSpForWebAutoScroll(
                                        boxValue = box6,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb7CheckedForSpForWebAutoScroll(
                                        boxValue = box7,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb8CheckedForSpForWebAutoScroll(
                                        boxValue = box8,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb9CheckedForSpForWebAutoScroll(
                                        boxValue = box9,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb10CheckedForSpForWebAutoScroll(
                                        boxValue = box10,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb11CheckedForSpForWebAutoScroll(
                                        boxValue = box11,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb12CheckedForSpForWebAutoScroll(
                                        boxValue = box12,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb13CheckedForSpForWebAutoScroll(
                                        boxValue = box13,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb14CheckedForSpForWebAutoScroll(
                                        boxValue = box14,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )
                                    setWeb15CheckedForSpForWebAutoScroll(
                                        boxValue = box15,
                                        dataStore = context.dataStoreForWebAutoScroll
                                    )

                                }

                                scope.launch {

                                    flowValueHolder.isWeb1Checked = box1
                                    flowValueHolder.isWeb2Checked = box2
                                    flowValueHolder.isWeb3Checked = box3
                                    flowValueHolder.isWeb4Checked = box4
                                    flowValueHolder.isWeb5Checked = box5
                                    flowValueHolder.isWeb6Checked = box6
                                    flowValueHolder.isWeb7Checked = box7
                                    flowValueHolder.isWeb8Checked = box8
                                    flowValueHolder.isWeb9Checked = box9
                                    flowValueHolder.isWeb10Checked = box10
                                    flowValueHolder.isWeb11Checked = box11
                                    flowValueHolder.isWeb12Checked = box12
                                    flowValueHolder.isWeb13Checked = box13
                                    flowValueHolder.isWeb14Checked = box14
                                    flowValueHolder.isWeb15Checked = box15

                                }

                                flowValueHolder.isFloatingButtonClicked = false


                            }
                        )


                    }


                }


            }


        }
    }


    override fun onResume() {
        super.onResume()

        WindowCompat.FEATURE_ACTION_MODE_OVERLAY
        // Set the system UI visibility flags to hide the system bars
        WindowInsetsControllerCompat(
            window,
            window.decorView
        ).let { controller ->
            controller.hide(WindowInsetsCompat.Type.statusBars())
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        WindowCompat.FEATURE_ACTION_MODE_OVERLAY
        // Set the system UI visibility flags to hide the system bars
        WindowInsetsControllerCompat(
            window,
            window.decorView
        ).let { controller ->
            controller.hide(WindowInsetsCompat.Type.statusBars())
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }


    }




}

