package com.my.Zitos.MultiBroser.Tools

import android.Manifest
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.core.app.ActivityCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.datastore.dataStore
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.applovin.mediation.MaxAd
import com.applovin.mediation.MaxAdViewAdListener
import com.applovin.mediation.MaxError
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.my.Zitos.MultiBroser.Tools.dialog.AppUpdateDialog
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.AppUpdateAllPref
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.AppUpdateSerializer
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.setAppDownloadUrlPref
import com.my.Zitos.MultiBroser.Tools.sharedPrefForAppUpdate.setIsUpdateAvailablePref
import kotlinx.coroutines.launch
import kotlin.math.roundToInt


val Context.dataStoreForAppUpdate by dataStore("app-update-sp.json", AppUpdateSerializer)

class MainActivity : ComponentActivity(), MaxAdViewAdListener {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {


            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            WindowCompat.FEATURE_ACTION_MODE_OVERLAY
            // Set the system UI visibility flags to hide the system bars
            WindowInsetsControllerCompat(
                window,
                window.decorView
            ).let { controller ->
                controller.show(WindowInsetsCompat.Type.statusBars())
                controller.show(WindowInsetsCompat.Type.systemBars())
            }


            val systemUiController = rememberSystemUiController()

            systemUiController.setNavigationBarColor(Color(0xff66093E))
            systemUiController.setStatusBarColor(Color(0xff66093E))

            val color1 by remember {
                mutableStateOf(Color(0xff6A1B9A))
            }
            val color2 by remember {
                mutableStateOf(Color(0xff660526))
            }

            val context = LocalContext.current
            val scope = rememberCoroutineScope()
            val density = LocalDensity.current

            val navigationDrawerState = rememberDrawerState(initialValue = DrawerValue.Closed)


            var showSubscriptionBottomSheet by remember { mutableStateOf(false) }
            var subscriptionType by remember { mutableStateOf(SubscriptionType.PREMIUM) }


            val subscriptionClass by remember {
                mutableStateOf(SubscriptionClass(context))
            }

            val coffeeClass by remember {
                mutableStateOf(CoffeeClass(context))
            }

            //val coinClass by remember { mutableStateOf(BuyCoinClass(context)) }


            val snackbarHostState = remember { SnackbarHostState() }



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



            LaunchedEffect (Unit){

                ActivityCompat.requestPermissions(
                    context as Activity, arrayOf(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    ), 419
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

                          subscriptionClass.onActivityResume()

                        }

                        Lifecycle.Event.ON_PAUSE -> {}
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






            val requestConsentFormAndAdmobAdsClass by remember { mutableStateOf(
                RequestConsentFormAndShowAdmobAds(
                    context = context,
                    adsType = AdsType.VIDEO_ADS
                ))
            }




            var showAdsRequestDialog by remember {
                mutableStateOf(false)
            }

            if(showAdsRequestDialog) {

                val blueColor by remember {
                    mutableStateOf(Color(
                        red = Color.Blue.red,
                        green = Color.Blue.green,
                        blue = Color.Blue.blue,
                        alpha = 0.7f
                    ))
                }

                var autoTextSize1 by remember {
                    mutableStateOf(12.sp)
                }

                Dialog(properties = DialogProperties(usePlatformDefaultWidth = false),
                    onDismissRequest = { showAdsRequestDialog = false }) {




                    Column(
                        modifier = Modifier
                            .wrapContentHeight()
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .padding(15.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(Color.White, shape = RoundedCornerShape(15.dp))
                                .clip(shape = RoundedCornerShape(15.dp))
                                .padding(8.dp, top = 10.dp, bottom = 10.dp)
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.icon_diamond),
                                contentDescription = null,
                                modifier = Modifier.height(50.dp)
                            )

                            Text(
                                text = "To unlock the screen you need to Subscribe to  ${
                                    if (subscriptionType == SubscriptionType.PREMIUM)
                                        "Premium plan" else "Basic plan or Premium plan"
                                }" +
                                        " else you have to watch ${
                                            if (subscriptionType == SubscriptionType.PREMIUM)
                                                "5" else "3"
                                        } video Ads"
                            )


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                Box(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .weight(1f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Button(onClick = {
                                        subscriptionType = SubscriptionType.PREMIUM
                                        showSubscriptionBottomSheet = true
                                        showAdsRequestDialog = false
                                    }, colors = ButtonDefaults.buttonColors(blueColor)) {

                                        Text(
                                            text = "Premium",
                                            fontSize = autoTextSize1,
                                            color = Color.White,
                                            softWrap = false,
                                            maxLines = 1,
                                            fontWeight = FontWeight.SemiBold
                                        )
                                    }
                                }


                                if (subscriptionType == SubscriptionType.BASIC_PLAN) {

                                    Box(modifier = Modifier
                                        .wrapContentHeight()
                                        .fillMaxWidth()
                                        .weight(1f),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Button(onClick = {
                                            subscriptionType = SubscriptionType.BASIC_PLAN
                                            showSubscriptionBottomSheet = true
                                            showAdsRequestDialog = false
                                        }, colors = ButtonDefaults.buttonColors(blueColor)) {

                                            Text(
                                                text = "Basic",
                                                fontSize = autoTextSize1,
                                                color = Color.White,
                                                softWrap = false,
                                                maxLines = 1,
                                                fontWeight = FontWeight.SemiBold
                                            )
                                        }
                                    }
                                }


                                Box(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .weight(1f),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Button(onClick = {

                                        if (subscriptionType == SubscriptionType.PREMIUM){

                                            if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 5){

                                                requestConsentFormAndAdmobAdsClass.coinClaimed = 0
                                                showAdsRequestDialog = false


                                                context.startActivity(
                                                    Intent(
                                                        context,
                                                        AutoScrollActivity::class.java
                                                    )
                                                )

                                            }else{

                                                //show ads
                                                if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 3){
                                                    // Check if the ad is ready, and if so, show the ad
                                                    requestConsentFormAndAdmobAdsClass.applovinVideoAd?.let {
                                                        if (it.isReady) {
                                                            it.showAd(context as Activity)
                                                        } else {
                                                           // Toast.makeText(context, "Ad is not ready yet", Toast.LENGTH_SHORT).show()
                                                        }
                                                    }
                                                }else {
                                                    requestConsentFormAndAdmobAdsClass.showAdmobVideoAds(
                                                        context = context,
                                                        onRewardAdded = {
                                                            requestConsentFormAndAdmobAdsClass.coinClaimed += 1
                                                        }
                                                    )
                                                }


                                            }

                                        }else{
                                            if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 3){

                                                requestConsentFormAndAdmobAdsClass.coinClaimed = 0
                                                showAdsRequestDialog = false

                                                context.startActivity(
                                                    Intent(
                                                        context,
                                                        AutoRefreshActivity::class.java
                                                    )
                                                )

                                            }else{

                                                //show ads
                                                if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 2){
                                                    // Check if the ad is ready, and if so, show the ad
                                                    requestConsentFormAndAdmobAdsClass.applovinVideoAd?.let {
                                                        if (it.isReady) {
                                                            it.showAd(context as Activity)
                                                        } else {
                                                           // Toast.makeText(context, "Ad is not ready yet", Toast.LENGTH_SHORT).show()
                                                        }
                                                    }
                                                }else {
                                                    requestConsentFormAndAdmobAdsClass.showAdmobVideoAds(
                                                        context = context,
                                                        onRewardAdded = {
                                                            requestConsentFormAndAdmobAdsClass.coinClaimed += 1
                                                        }
                                                    )
                                                }
                                            }

                                        }

                                    }, colors = ButtonDefaults.buttonColors(blueColor)) {

                                        val amountNeeded = if (subscriptionType == SubscriptionType.PREMIUM){
                                            5
                                        }else{
                                            3
                                        }


                                        Text(
                                            text = if (subscriptionType == SubscriptionType.PREMIUM){
                                                if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 5){
                                                    "Continue"
                                                }else{
                                                    if (requestConsentFormAndAdmobAdsClass.coinClaimed == 0){
                                                        "Watch Ads"
                                                    }else{
                                                        "Video ${requestConsentFormAndAdmobAdsClass.coinClaimed}/$amountNeeded"
                                                    }
                                                }
                                            }else{
                                                if (requestConsentFormAndAdmobAdsClass.coinClaimed >= 3){
                                                    "Continue"
                                                }else{
                                                    if (requestConsentFormAndAdmobAdsClass.coinClaimed == 0){
                                                        "Watch Ads"
                                                    }else{
                                                        "Video ${requestConsentFormAndAdmobAdsClass.coinClaimed}/$amountNeeded"
                                                    }
                                                }
                                            },
                                            fontSize = autoTextSize1,
                                            color = Color.White,
                                            softWrap = false,
                                            maxLines = 1,
                                            fontWeight = FontWeight.SemiBold,
                                            onTextLayout = { textLayoutResult ->
                                                if (textLayoutResult.didOverflowWidth) {
                                                    autoTextSize1 *= 0.9
                                                }
                                            }
                                        )
                                    }
                                }

                            }


                        }


                    }

                }

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




            val internetConnection by remember {
                mutableStateOf(InternetConnectionLiveData(application))
            }
            var isInternetConnected by remember { mutableStateOf(false) }

            internetConnection.observe(this) { isConnected ->

                if (isConnected) {
                    isInternetConnected = true

                }else{
                    isInternetConnected = false

                }

            }



            if (isInternetConnected && subscriptionClass.isPlayBillingConnected) {

                ModalNavigationDrawer(
                    drawerState = navigationDrawerState,
                    drawerContent = {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(0.7f)
                                .fillMaxHeight()
                                .pointerInput(Unit) {
                                    detectTapGestures {

                                    }
                                }
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(color2, color1)
                                    ),
                                    shape = RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp)
                                )
                                .clip(shape = RoundedCornerShape(topEnd = 20.dp, bottomEnd = 20.dp))

                        ) {

                            val alphaWhite = Color(
                                Color.White.red,
                                Color.White.green,
                                Color.White.blue,
                                alpha = 0.4f
                            )
                            val alphaWhite2 = Color(
                                Color.White.red,
                                Color.White.green,
                                Color.White.blue,
                                alpha = 0.2f
                            )

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .background(alphaWhite)
                                    .align(Alignment.CenterHorizontally),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.app_icon),
                                    contentDescription = null
                                )

                            }

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .background(alphaWhite2),
                                verticalArrangement = Arrangement.spacedBy(3.dp)
                            ) {

                                Row (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        .padding(3.dp)
                                        .background(alphaWhite2)
                                        .clickable {

                                            val i = Intent(Intent.ACTION_SEND)
                                            i.type = "text/plain"
                                            i.putExtra(Intent.EXTRA_SUBJECT, "share_app_link")
                                            i.putExtra(
                                                Intent.EXTRA_TEXT,
                                                ObjectsIds.DEFAULT_DOWNLOAD_LINK
                                            )
                                            startActivity(Intent.createChooser(i, "share app link"))

                                        },
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ){
                                    Icon(painter = painterResource(id = R.drawable.icon_share),
                                        contentDescription = null,
                                        tint = Color.Black
                                    )

                                    Text(text = "Share")
                                }

                                Row (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        .padding(3.dp)
                                        .background(alphaWhite2)
                                        .clickable {

                                            val telegramLink = "https://t.me/+G5T3j61lUnc3MzI0"
                                            val i = Intent(Intent.ACTION_VIEW)
                                            i.data = Uri.parse(telegramLink)
                                            startActivity(i)

                                        },
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ){
                                    Icon(painter = painterResource(id = R.drawable.icon_feed_back),
                                        contentDescription = null,
                                        tint = Color.Black
                                    )

                                    Text(text = "Share")
                                }

                                Row (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        .padding(3.dp)
                                        .background(alphaWhite2)
                                        .clickable {

                                            val appLink = ObjectsIds.DEFAULT_DOWNLOAD_LINK
                                            val i = Intent(Intent.ACTION_VIEW)
                                            i.data = Uri.parse(appLink)
                                            startActivity(i)

                                        },
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ){
                                    Icon(painter = painterResource(id = R.drawable.icon_star),
                                        contentDescription = null,
                                        tint = Color.Black
                                    )

                                    Text(text = "Share")
                                }





                            }


                        }

                    },
                ) {
                    Scaffold(
                        topBar = {


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .background(
                                        brush = Brush.horizontalGradient(
                                            colors = listOf(color1, color2)
                                        )
                                    ),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                IconButton(onClick = {

                                    scope.launch {
                                        navigationDrawerState.apply {
                                            if (isClosed) open() else close()
                                        }
                                    }

                                }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_dehaze),
                                        contentDescription = "navigationIcon",
                                        tint = Color.White
                                    )
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Text(
                                    text = "Multi Browser Tool",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold
                                )

                            }

                        },
                        snackbarHost = {

                            SnackbarHost(hostState = snackbarHostState)

                        },
                        modifier = Modifier.background(Color(0xff66093E))

                    ) { contentPadding ->


                        Column(
                            modifier = Modifier
                                .padding(contentPadding)
                                .fillMaxSize()
                                .background(Color(0xff66093E))
                        ) {


                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.White)
                                    .shadow(elevation = 2.dp)
                                    .padding(8.dp)
                                    .weight(1f)
                                    .verticalScroll(state = rememberScrollState(), true)

                            ) {


                                Row(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth(),
                                        horizontalArrangement = Arrangement.spacedBy(50.dp),
                                ) {


                                    Box(modifier = Modifier
                                        .wrapContentHeight()
                                        .fillMaxWidth()
                                        .background(
                                            brush = Brush.horizontalGradient(
                                                colors = listOf(color1, color2)
                                            ), shape = RoundedCornerShape(20.dp)
                                        )
                                        .clip(shape = RoundedCornerShape(20.dp))
                                        .weight(1f)
                                        .clickable {

                                            subscriptionClass.checkSubscription(
                                                context = context,
                                                onPremiumPlanFound = {

                                                    context.startActivity(
                                                        Intent(
                                                            context,
                                                            AutoRefreshActivity::class.java
                                                        )
                                                    )

                                                },
                                                onBasicPlanFound = {

                                                    context.startActivity(
                                                        Intent(
                                                            context,
                                                            AutoRefreshActivity::class.java
                                                        )
                                                    )

                                                },
                                                onSubscriptionNotFound = {
                                                    subscriptionType =
                                                        SubscriptionType.BASIC_PLAN
                                                    showAdsRequestDialog = true

                                                }
                                            )


                                        }
                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .wrapContentHeight()
                                                .padding(8.dp)
                                        ) {

                                            Box(modifier = Modifier
                                                .fillMaxWidth()
                                                .wrapContentHeight()
                                                .drawBehind {
                                                    val strokeWidth = 1.dp.toPx()
                                                    val x = size.width

                                                    // Draw bottom border
                                                    drawLine(
                                                        color = Color.White,
                                                        start = Offset(0f, size.height),
                                                        end = Offset(x, size.height),
                                                        strokeWidth = strokeWidth
                                                    )
                                                }
                                            ) {
                                                Icon(
                                                    painter = painterResource(id = R.drawable.icon_internet),
                                                    contentDescription = null,
                                                    tint = Color.LightGray
                                                )

                                            }
                                            Text(
                                                text = "15 Views with web Auto Refresh timer.",
                                                color = Color.Gray
                                            )


                                        }

                                    }








                                    Box(modifier = Modifier
                                        .wrapContentHeight()
                                        .fillMaxWidth()
                                        .background(
                                            brush = Brush.horizontalGradient(
                                                colors = listOf(color1, color2)
                                            ), shape = RoundedCornerShape(20.dp)
                                        )
                                        .clip(shape = RoundedCornerShape(20.dp))
                                        .weight(1f)
                                        .clickable {


                                            subscriptionClass.checkSubscription(
                                                context = context,
                                                onPremiumPlanFound = {

                                                    context.startActivity(
                                                        Intent(
                                                            context,
                                                            AutoScrollActivity::class.java
                                                        )
                                                    )

                                                },
                                                onBasicPlanFound = {
                                                    subscriptionType =
                                                        SubscriptionType.PREMIUM
                                                    showAdsRequestDialog = true
                                                },
                                                onSubscriptionNotFound = {
                                                    subscriptionType =
                                                        SubscriptionType.PREMIUM
                                                    showAdsRequestDialog = true
                                                }
                                            )


                                        }
                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .wrapContentHeight()
                                                .padding(8.dp)
                                        ) {

                                            Box(modifier = Modifier
                                                .fillMaxWidth()
                                                .wrapContentHeight()
                                                .drawBehind {
                                                    val strokeWidth = 1.dp.toPx()
                                                    val x = size.width

                                                    // Draw bottom border
                                                    drawLine(
                                                        color = Color.White,
                                                        start = Offset(0f, size.height),
                                                        end = Offset(x, size.height),
                                                        strokeWidth = strokeWidth
                                                    )
                                                }
                                            ) {
                                                Icon(
                                                    painter = painterResource(id = R.drawable.icon_internet),
                                                    contentDescription = null,
                                                    tint = Color.LightGray
                                                )

                                            }
                                            Text(
                                                text = "15 Views  with web Auto Refresh timer and Automatic scrolling in web page.",
                                                color = Color.Gray
                                            )


                                        }

                                    }




                                }




                                Row(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(50.dp),
                                ) {


                                    Box(modifier = Modifier
                                        .wrapContentHeight()
                                        .fillMaxWidth()
                                        .background(
                                            brush = Brush.horizontalGradient(
                                                colors = listOf(color1, color2)
                                            ), shape = RoundedCornerShape(20.dp)
                                        )
                                        .clip(shape = RoundedCornerShape(20.dp))
                                        .weight(1f)
                                        .clickable {

                                            context.startActivity(
                                                Intent(
                                                    context,
                                                    NormalActivity::class.java
                                                )
                                            )

                                        }
                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .wrapContentHeight()
                                                .padding(8.dp)
                                        ) {

                                            Box(modifier = Modifier
                                                .fillMaxWidth()
                                                .wrapContentHeight()
                                                .drawBehind {
                                                    val strokeWidth = 1.dp.toPx()
                                                    val x = size.width

                                                    // Draw bottom border
                                                    drawLine(
                                                        color = Color.White,
                                                        start = Offset(0f, size.height),
                                                        end = Offset(x, size.height),
                                                        strokeWidth = strokeWidth
                                                    )
                                                }
                                            ) {
                                                Icon(
                                                    painter = painterResource(id = R.drawable.icon_internet),
                                                    contentDescription = null,
                                                    tint = Color.LightGray
                                                )

                                            }
                                            Text(
                                                text = "15 Views for Normal browsing only.",
                                                color = Color.Gray
                                            )


                                        }

                                    }





                                    Box(modifier = Modifier
                                        .height(50.dp)
                                        .clip(shape = RoundedCornerShape(20.dp))
                                        .fillMaxWidth()
                                        .weight(1f)
                                    ) {


                                    }




                                }


                                Spacer(modifier = Modifier.height(30.dp))


                                val adsHeight = 320.dp
                                val adsHeightInt =  adsHeight.value.roundToInt()

                                val configuration = LocalConfiguration.current
                                val screenWidth = remember(key1 = configuration) {
                                    mutableIntStateOf(configuration.screenWidthDp)
                                }

                                AndroidView(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    factory = { context ->


                                        AdView(context).apply {
                                            setAdSize(


                                                AdSize.getInlineAdaptiveBannerAdSize(screenWidth.intValue, adsHeightInt)

                                            )
                                            adUnitId = ObjectsIds.ADMOB_BANNER_AD_ID
                                            loadAd(AdRequest.Builder().build())
                                        }
                                    },
                                )

                                Spacer(modifier = Modifier.height(40.dp))


                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight(),
                                    horizontalArrangement = Arrangement.spacedBy(   15.dp),
                                ) {

                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .wrapContentHeight()
                                            .weight(1f)
                                            .border(
                                                width = 2.dp,
                                                color = Color.Blue,
                                                shape = RoundedCornerShape(10.dp)
                                            )
                                            .background(
                                                Color.LightGray,
                                                shape = RoundedCornerShape(10.dp)
                                            )
                                            .clip(RoundedCornerShape(10.dp))
                                            .padding(8.dp)
                                            .clickable {

                                                val i = Intent(Intent.ACTION_VIEW)
                                                i.data =
                                                    Uri.parse(ObjectsIds.YOUTUBE_VIDEO_TUTORIAL_SCROLL)
                                                startActivity(i)

                                            }
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.icon_tutorial),
                                            contentDescription = null
                                        )
                                        
                                        Text(text = "How to use Web scrolling", fontSize = 12.sp)

                                    }

                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .wrapContentHeight()
                                            .weight(1f)
                                            .border(
                                                width = 2.dp,
                                                color = Color.Blue,
                                                shape = RoundedCornerShape(10.dp)
                                            )
                                            .background(
                                                Color.LightGray,
                                                shape = RoundedCornerShape(10.dp)
                                            )
                                            .clip(RoundedCornerShape(10.dp))
                                            .padding(8.dp)
                                            .clickable {

                                                val i = Intent(Intent.ACTION_VIEW)
                                                i.data =
                                                    Uri.parse(ObjectsIds.YOUTUBE_VIDEO_TUTORIAL_REFRESH)
                                                startActivity(i)
                                            }
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.icon_tutorial),
                                            contentDescription = null
                                        )

                                        Text(text = "How to use Web Refresh",fontSize = 12.sp)
                                        
                                    }


                                }

                                Spacer(modifier = Modifier.height(50.dp))


                            }






                            if (requestConsentFormAndAdmobAdsClass.applovinBannerAdView != null) {

                                AndroidView(
                                    factory = {

                                        requestConsentFormAndAdmobAdsClass.applovinBannerAdView?.apply {
                                            setListener(this@MainActivity)

                                            // Set layout parameters for the banner ad
                                            val width = ViewGroup.LayoutParams.MATCH_PARENT
                                            val heightPx =
                                                with(density) { 50.dp.toPx() }  // Assuming 50dp banner height

                                            layoutParams =
                                                FrameLayout.LayoutParams(width, heightPx.toInt())
                                            setBackgroundColor(android.graphics.Color.WHITE) // Set background color

                                            loadAd()  // Load the banner ad
                                            startAutoRefresh()
                                        }
                                        requestConsentFormAndAdmobAdsClass.applovinBannerAdView!!

                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(50.dp)  // Fixed height for the banner ad
                                )

                            }










                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .background(Color(0xff66093E))
                            ) {


                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically)
                                        .clickable {

                                            subscriptionType = SubscriptionType.BASIC_PLAN
                                            showSubscriptionBottomSheet = true

                                        },
                                    contentAlignment = Alignment.Center
                                ) {

                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_remove_ads),
                                        contentDescription = null,
                                        tint = Color.LightGray
                                    )


                                }


                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        // .padding(5.dp)
                                        .align(Alignment.CenterVertically)
                                        .clickable {

                                            subscriptionType = SubscriptionType.BUY_ME_COFFEE
                                            showSubscriptionBottomSheet = true

                                        },
                                    contentAlignment = Alignment.Center
                                ) {

                                    Image(
                                        painter = painterResource(id = R.drawable.icon_coffee),
                                        contentDescription = null,

                                        )

                                }



                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxWidth()
                                        .height(50.dp)
                                        .padding(5.dp)
                                        .align(Alignment.CenterVertically)
                                        .clickable {

                                            subscriptionType = SubscriptionType.PREMIUM
                                            showSubscriptionBottomSheet = true

                                        },
                                    contentAlignment = Alignment.Center
                                ) {

                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_diamond),
                                        contentDescription = null,
                                        tint = Color.White
                                    )

                                }


                            }


                        }


                    }







                    if (showSubscriptionBottomSheet) {

                        val position = when (subscriptionType) {
                            SubscriptionType.PREMIUM -> {
                                // PREMIUM Plan is at position 1 in the list
                                //which is named "premium1"
                                1
                            }

                            SubscriptionType.BASIC_PLAN -> {
                                // Remove Ads Plan is at position 0 in the list
                                //which is named "subscription1"
                                0
                            }

                            SubscriptionType.BUY_ME_COFFEE -> {
                                // we used 0 because it is in a different class and has only 1 coffee
                                0
                            }
                        }

                        ModalBottomSheet(
                            onDismissRequest = { showSubscriptionBottomSheet = false },
                            sheetState = rememberModalBottomSheetState(),
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        ) {


                            if (subscriptionClass.productDetailsList.isNotEmpty()) {


                                Column(modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .padding(20.dp)
                                    .clickable {

                                        if (subscriptionType == SubscriptionType.BUY_ME_COFFEE) {

                                            coffeeClass.onItemClick(
                                                pos = position,
                                                context = context
                                            )

                                        }

                                        if (subscriptionType == SubscriptionType.PREMIUM ||
                                            subscriptionType == SubscriptionType.BASIC_PLAN
                                        ) {

                                            subscriptionClass.onItemClick(
                                                pos = position,
                                                context = context
                                            )

                                        }

                                    }
                                ) {


                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .wrapContentHeight()
                                            .background(
                                                brush = Brush.horizontalGradient(
                                                    colors = listOf(color1, color2)
                                                ), shape = RoundedCornerShape(20.dp)
                                            )
                                            .clip(RoundedCornerShape(20.dp))
                                            .padding(8.dp)
                                    ) {


                                        val subscriptionTitle =
                                            if (subscriptionType == SubscriptionType.BUY_ME_COFFEE) {
                                                coffeeClass.productDetailsList[position].name
                                            } else {
                                                if (subscriptionType == SubscriptionType.PREMIUM) {
                                                    subscriptionClass.productDetailsList[position].name
                                                } else {
                                                    subscriptionClass.productDetailsList[position].name
                                                }
                                            }

                                        Text(
                                            text = subscriptionTitle,
                                            color = Color.White
                                        )



                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .wrapContentHeight(),
                                            horizontalAlignment = Alignment.End,
                                            verticalArrangement = Arrangement.spacedBy(15.dp)
                                        ) {


                                            if (subscriptionType == SubscriptionType.BUY_ME_COFFEE) {


                                                Text(
                                                    text = coffeeClass.productDetailsList[position]
                                                        .oneTimePurchaseOfferDetails!!
                                                        .formattedPrice,
                                                    color = Color.White,
                                                    fontSize = 18.sp,
                                                    fontWeight = FontWeight.SemiBold
                                                )




                                                Image(
                                                    painter = painterResource(id = R.drawable.icon_coffee),
                                                    contentDescription = null,
                                                    modifier = Modifier.size(40.dp)
                                                )


                                            }



                                            if (subscriptionType == SubscriptionType.PREMIUM ||
                                                subscriptionType == SubscriptionType.BASIC_PLAN
                                            ) {

                                                Text(
                                                    text = subscriptionClass.productDetailsList[position]
                                                        .subscriptionOfferDetails!![0]
                                                        .pricingPhases.pricingPhaseList[0]
                                                        .formattedPrice,

                                                    color = Color.White,
                                                    fontSize = 18.sp,
                                                    fontWeight = FontWeight.SemiBold

                                                )


                                                val subscriptionDuration = formatBillingPeriod(
                                                    subscriptionClass.productDetailsList[position]
                                                        .subscriptionOfferDetails!![0].pricingPhases.pricingPhaseList[0]
                                                        .billingPeriod
                                                )

                                                Text(
                                                    text = subscriptionDuration,
                                                    color = Color.White
                                                )


                                            }


                                        }


                                    }


                                }

                                Spacer(modifier = Modifier.height(15.dp))


                                if (subscriptionType == SubscriptionType.PREMIUM ||
                                    subscriptionType == SubscriptionType.BASIC_PLAN
                                ) {


                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .wrapContentHeight()
                                    ) {


                                        var autoTextSize1 by remember {
                                            mutableStateOf(15.sp)
                                        }


                                        TextButton(onClick = {

                                            val url =
                                                "https://play.google.com/store/account/subscriptions"
                                            val i = Intent(Intent.ACTION_VIEW)
                                            i.data = Uri.parse(url)
                                            startActivity(i)

                                        }) {


                                            Text(
                                                text = "Manage Subscription",
                                                fontSize = autoTextSize1,
                                                softWrap = false,
                                                fontWeight = FontWeight.SemiBold,

                                                )
                                        }

                                        Spacer(modifier = Modifier.weight(1f))

                                        TextButton(onClick = {
                                            subscriptionClass.restorePurchases(
                                                context = context,
                                                onPurchasesFound = {

                                                    scope.launch {

                                                        showSubscriptionBottomSheet = false

                                                        snackbarHostState
                                                            .showSnackbar(
                                                                message = "Successfully restored",
                                                                actionLabel = "",
                                                                duration = SnackbarDuration.Short
                                                            )
                                                    }

                                                },
                                                onPurchasesNotFound = {
                                                    scope.launch {

                                                        showSubscriptionBottomSheet = false

                                                        snackbarHostState
                                                            .showSnackbar(
                                                                message = "Oops, No purchase found",
                                                                actionLabel = "",
                                                                duration = SnackbarDuration.Short
                                                            )


                                                    }

                                                }
                                            )
                                        }) {


                                            Text(
                                                text = "Restore Subscription",
                                                fontSize = autoTextSize1,
                                                softWrap = false,
                                                fontWeight = FontWeight.SemiBold,
                                                onTextLayout = { textLayoutResult ->
                                                    if (textLayoutResult.didOverflowWidth) {
                                                        autoTextSize1 *= 0.9
                                                    }
                                                }
                                            )

                                        }


                                    }


                                }



                                Text(
                                    text = if (subscriptionType == SubscriptionType.BUY_ME_COFFEE) {
                                        coffeeClass.productDetailsList[position].description
                                    } else {
                                        subscriptionClass.productDetailsList[position].description
                                    },
                                    color = Color.Black,
                                    modifier = Modifier.padding(8.dp)
                                )



                                Spacer(modifier = Modifier.height(50.dp))

                            } else {

                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight(0.3f)
                                        .align(Alignment.CenterHorizontally),
                                    contentAlignment = Alignment.Center
                                ) {

                                    CircularProgressIndicator()


                                }

                            }


                        }

                    }


                }



            }else{


                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff66093E)),
                    contentAlignment = Alignment.Center
                ){

                    Image(
                        painter = painterResource(id = R.drawable.app_icon),
                        contentDescription = "loading icon")

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Transparent),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom
                    ){

                        Image(
                            painter = painterResource(id = R.drawable.icon_app_name),
                            contentDescription = "app name")

                        Spacer(modifier = Modifier.height(8.dp))

                        CircularProgressIndicator(modifier = Modifier.size(20.dp))


                    }


                }

            }



        }


    }

    override fun onAdLoaded(p0: MaxAd) {
       // ("Not yet implemented")
    }

    override fun onAdDisplayed(p0: MaxAd) {
       // ("Not yet implemented")
    }

    override fun onAdHidden(p0: MaxAd) {
        //("Not yet implemented")
    }

    override fun onAdClicked(p0: MaxAd) {
        //("Not yet implemented")
    }

    override fun onAdLoadFailed(p0: String, p1: MaxError) {
        //("Not yet implemented")
    }

    override fun onAdDisplayFailed(p0: MaxAd, p1: MaxError) {
        //("Not yet implemented")
    }

    override fun onAdExpanded(p0: MaxAd) {
        //("Not yet implemented")
    }

    override fun onAdCollapsed(p0: MaxAd) {
        //("Not yet implemented")
    }


}





private fun formatBillingPeriod(billingPeriod: String ):String{

    val formatBillingPeriodValue = if (billingPeriod.contains("D")){
        val numberOfDys = billingPeriod.replace("P", "").replace("D", "").toInt()
        "$numberOfDys Day${if (numberOfDys > 1) "s" else ""}"
    }else {
        if (billingPeriod.contains("W")) {
            val numberOfWeeks = billingPeriod.replace("P", "").replace("W", "").toInt()
            "$numberOfWeeks Week${if (numberOfWeeks > 1) "s" else ""}"
        } else {
            if (billingPeriod.contains("M")) {
                val numberOfMonths = billingPeriod.replace("P", "").replace("M", "").toInt()
                "$numberOfMonths Month${if (numberOfMonths > 1) "s" else ""}"
            } else {
                if (billingPeriod.contains("Y")) {
                    val numberOfYears = billingPeriod.replace("P", "").replace("Y", "").toInt()
                    "$numberOfYears Year${if (numberOfYears > 1) "s" else ""}"
                } else {
                    billingPeriod
                }

            }
        }

    }

   return formatBillingPeriodValue
}










