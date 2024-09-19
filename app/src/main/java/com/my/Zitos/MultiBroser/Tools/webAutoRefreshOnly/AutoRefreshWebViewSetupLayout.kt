package com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.CustomSwitch
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeAdBlockerModeInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeAllValueInAllWebViewAutoRefreshInSharedPref
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeAllValueInAllWebViewAutoRefreshInViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeIncognitoModeInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changePcModeInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeSingleWebAutoRefreshViewModelValues
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeTimerTypeValueInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeTotalTimeInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.changeUrlValueInSharedPrefForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.onBackButtonClickedForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.onForwardButtonClickedForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.moreFunctions.onReloadButtonClickedForWebRefresh
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder.BrowserAutoRefreshViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoRefreshOnly.viewModelAndWebViewHolder.BrowserAutoRefreshViewModelFactory
import com.my.Zitos.MultiBroser.Tools.spinners.DropDownSpinnerForTimer
import kotlinx.coroutines.launch
import java.util.Locale


@Composable
fun AutoRefreshWebViewSetupLayout(
    url: String,
    webNum:Int,
    spTimerType: TimerType,
    spWebTotalTime : Int,
    initPcMode: Boolean,
    initIncognitoMode: Boolean,
    initAdBlockerMode: Boolean,
    onDismiss: () -> Unit,
    changeFullScreen: () -> Unit

) {



    val context = LocalContext.current
    val scope = rememberCoroutineScope()



    var urlTextValue by remember { mutableStateOf(url) }
    var timerType by remember { mutableStateOf(spTimerType)}
    var timeSelected by remember { mutableIntStateOf(spWebTotalTime)}
    var pressOffset by remember { mutableStateOf(DpOffset.Zero) }
    var showSpinnerDropDown by remember {  mutableStateOf(false)}
    var borderColor by remember { mutableStateOf(Color.Transparent)}


    var isPcModeEnabled by remember { mutableStateOf(initPcMode) }
    var isIncognitoModeEnabled by remember { mutableStateOf(initIncognitoMode)}
    var isAdBlockerEnabled by remember { mutableStateOf(initAdBlockerMode)}


    val browserAutoRefreshViewModel: BrowserAutoRefreshViewModel = viewModel(
        factory = BrowserAutoRefreshViewModelFactory(context)
    )






    val whiteColor by remember { mutableStateOf(Color.LightGray) }

    val lightGray = Color.LightGray

    val density = LocalDensity.current


    var layoutHeight by remember { mutableStateOf(0.dp) }
    var layoutWidth  by remember { mutableStateOf(0.dp) }


    var isSwitchForMinutesEnabled by remember {
        mutableStateOf(if (timerType == TimerType.MINUTES){
            true
        }else{
            false
        })
    }


    var isSwitchForSecondsEnabled by remember {
        mutableStateOf(if (timerType == TimerType.SECONDS){
            true
        }else{
            false
        })
    }

    var errorTimeBorderColor by remember {
        mutableStateOf(Color.Transparent)
    }

    val pinkColor by remember {
        mutableStateOf(Color(0xffDB7A9B))
    }


    var autoTextSize1 by remember {
        mutableStateOf(12.sp)
    }




    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(
                        red = lightGray.red,
                        green = lightGray.green,
                        blue = lightGray.blue,
                        alpha = 0.3f
                    )
                )
                .pointerInput(Unit) {
                    detectTapGestures {
                        onDismiss()
                    }
                },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)
                    )
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
                    .pointerInput(Unit) {
                        detectTapGestures {

                        }
                    }
                    .clip(RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {



                    Text(
                        text = "$webNum",
                        color = Color.Red,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(end = 20.dp, top = 6.dp)
                    )



                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.1f)
                            .height(5.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(whiteColor, shape = RoundedCornerShape(5.dp))
                    )

                }




                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {

                    val platinumColor = Color(
                        red = pinkColor.red,
                        green = pinkColor.green,
                        blue = pinkColor.blue,
                        alpha = 0.68f
                    )
                    val taupeGrayColor = Color(
                        red = Color.LightGray.red,
                        green = Color.LightGray.green,
                        blue = Color.LightGray.blue,
                        alpha = 0.6f
                    )

                    val colors = TextFieldDefaults.colors(
                        focusedContainerColor = platinumColor,
                        unfocusedContainerColor = platinumColor,
                        disabledContainerColor = platinumColor,

                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,


                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        disabledTextColor = Color.Black,

                        cursorColor = Color.White,

                        selectionColors = TextSelectionColors(
                            handleColor = taupeGrayColor,
                            backgroundColor = taupeGrayColor
                        )
                    )

                    TextField(
                        value = urlTextValue,
                        onValueChange = {
                            urlTextValue = it

                            if (it.isNotBlank() && borderColor == Color.Red) {
                                borderColor = Color.Transparent
                            }
                        },
                        singleLine = true,
                        maxLines = 1,
                        colors = colors,
                        placeholder = {
                            Text(
                                text = "https://",
                                fontWeight = FontWeight.Normal,
                                color = Color.White
                            )
                        },
                        shape = RoundedCornerShape(100),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .border(
                                width = 1.dp,
                                color = borderColor,
                                shape = RoundedCornerShape(100)
                            )

                    )


                }







                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    val toggleHeight by remember { mutableStateOf(21.dp) }
                    val iconHeight by remember { mutableStateOf(toggleHeight *2) }

                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight(),
                    ) {



                        Row(
                            modifier = Modifier
                                .wrapContentHeight()
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {

                            Text(text = "AdBlocker:",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(modifier = Modifier
                                .wrapContentWidth()
                                .height(iconHeight)
                                .align(Alignment.CenterVertically),
                                contentAlignment = Alignment.Center
                            ) {
                                CustomSwitch(
                                    modifier = Modifier,
                                    isActive = isAdBlockerEnabled,
                                    toggleHeight = toggleHeight,
                                    toggleColor = if (isAdBlockerEnabled){
                                        Color(0xffE48A8E)
                                    }else{
                                        Color.LightGray
                                    },
                                    painter = painterResource(id = R.drawable.icon_ads),
                                    colorFilter = if (isAdBlockerEnabled) {
                                        null
                                    } else {
                                        ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                                    },
                                    onClick = {
                                        isAdBlockerEnabled = if (isAdBlockerEnabled) {
                                            false
                                        } else {
                                            true
                                        }
                                    }
                                )
                            }
                        }




                        Row(
                            modifier = Modifier
                                .wrapContentHeight()
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {

                            Text(text = "Incognito:",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(modifier = Modifier
                                .wrapContentWidth()
                                .height(iconHeight)
                                .align(Alignment.CenterVertically),
                                contentAlignment = Alignment.Center
                            ) {
                                CustomSwitch(
                                    modifier = Modifier,
                                    isActive = isIncognitoModeEnabled,
                                    toggleHeight = toggleHeight,
                                    toggleColor = if (isIncognitoModeEnabled){
                                        Color(0xff939FE6)
                                    }else{
                                        Color.LightGray
                                    },
                                    painter = painterResource(id = R.drawable.icon_privacy),
                                    colorFilter = if (isIncognitoModeEnabled) {
                                        null
                                    } else {
                                        ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                                    },
                                    onClick = {
                                        isIncognitoModeEnabled = if (isIncognitoModeEnabled) {
                                            false
                                        } else {
                                            true
                                        }
                                    }
                                )
                            }
                        }



                        Row(
                            modifier = Modifier
                                .wrapContentHeight()
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {

                            Text(text = "Desktop:",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Box(modifier = Modifier
                                .wrapContentWidth()
                                .height(iconHeight)
                                .align(Alignment.CenterVertically),
                                contentAlignment = Alignment.Center
                            ) {
                                CustomSwitch(
                                    modifier = Modifier,
                                    isActive = isPcModeEnabled,
                                    toggleHeight = toggleHeight,
                                    toggleColor = if (isPcModeEnabled){
                                        Color(0xffc2F4FB)
                                    }else{
                                        Color.LightGray
                                    },
                                    painter = painterResource(id = R.drawable.icon_pc),
                                    colorFilter = if (isPcModeEnabled) {
                                        null
                                    } else {
                                        ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                                    },
                                    onClick = {
                                        isPcModeEnabled = if (isPcModeEnabled) {
                                            false
                                        } else {
                                            true
                                        }
                                    }
                                )
                            }
                        }



                    }




                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .shadow(elevation = 2.dp)
                            .padding(5.dp)
                            .align(Alignment.CenterVertically),
                    ) {


                        Text(text = "       Set Refresh Time       ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.Black
                        )


                        //Start for Minutes
                        Row(
                            modifier = Modifier
                                .wrapContentHeight()
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Switch(
                                checked = isSwitchForMinutesEnabled,
                                onCheckedChange = { isON ->
                                    if (isON) {
                                        timerType = TimerType.MINUTES
                                        isSwitchForMinutesEnabled = true
                                        isSwitchForSecondsEnabled = false
                                    }else{
                                        timerType = TimerType.SECONDS
                                        isSwitchForMinutesEnabled = false
                                        isSwitchForSecondsEnabled = true
                                    }
                                },
                                colors = SwitchDefaults.colors(pinkColor),
                                modifier = Modifier.scale(0.6f)
                            )



                            Row(modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .padding(start = 8.dp)
                                .border(
                                    width = 2.dp, color = if (isSwitchForMinutesEnabled) {
                                        errorTimeBorderColor
                                    } else {
                                        Color.Transparent
                                    }
                                )
                                .onGloballyPositioned {
                                    layoutHeight = with(density) { (it.size.height / 2).toDp() }
                                    layoutWidth = with(density) { (it.size.width / 2).toDp() }
                                }
                                .pointerInput(Unit) {
                                    detectTapGestures(
                                        onTap = {

                                            if (isSwitchForMinutesEnabled) {

                                                pressOffset =
                                                    DpOffset(it.x.toDp(), it.y.toDp())

                                                showSpinnerDropDown = true

                                            }

                                        }
                                    )

                                },
                                verticalAlignment = Alignment.CenterVertically
                            ) {


                                Text(
                                    text = if (timerType == TimerType.MINUTES) {
                                        "$timeSelected Minutes "
                                    } else {
                                        "Minutes "
                                    },
                                    color = if (timerType == TimerType.MINUTES){
                                        Color.DarkGray
                                    }else{
                                        Color.LightGray
                                    },
                                    modifier = Modifier.padding(start = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .wrapContentHeight()
                                        .align(Alignment.CenterVertically),
                                    contentAlignment = Alignment.CenterEnd
                                ) {

                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_drop_down),
                                        contentDescription = "drop down icon"
                                    )

                                }


                            }


                        }
                        //Stop for Minutes


                        if (showSpinnerDropDown) {

                            DropDownSpinnerForTimer(
                                offset = pressOffset,
                                timerType = timerType,
                                onDismissRequest = {
                                    showSpinnerDropDown = false

                                    changeFullScreen()

                                },
                                onItemSelected = { selectedTime ->

                                    timeSelected = selectedTime
                                    showSpinnerDropDown = false
                                    errorTimeBorderColor = Color.Transparent

                                    changeFullScreen()
                                }
                            )

                        }


                        //Start for Seconds
                        Row(
                            modifier = Modifier
                                .wrapContentHeight()
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Switch(
                                checked = isSwitchForSecondsEnabled,
                                onCheckedChange = { isOn ->
                                    if (isOn) {
                                        timerType = TimerType.SECONDS
                                        isSwitchForSecondsEnabled = true
                                        isSwitchForMinutesEnabled = false
                                    }else{

                                        timerType = TimerType.MINUTES
                                        isSwitchForSecondsEnabled = false
                                        isSwitchForMinutesEnabled = true
                                    }
                                },
                                colors = SwitchDefaults.colors(pinkColor),
                                modifier = Modifier.scale(0.6f)
                            )

                            Row(modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .border(
                                    width = 2.dp, color = if (isSwitchForSecondsEnabled) {
                                        errorTimeBorderColor
                                    } else {
                                        Color.Transparent
                                    }
                                )
                                .padding(start = 8.dp)
                                .onGloballyPositioned {
                                    layoutHeight = with(density) { (it.size.height / 2).toDp() }
                                    layoutWidth = with(density) { (it.size.width / 2).toDp() }
                                }
                                .pointerInput(Unit) {
                                    detectTapGestures(
                                        onTap = {

                                            if (isSwitchForSecondsEnabled) {

                                                pressOffset =
                                                    DpOffset(it.x.toDp(), it.y.toDp())

                                                showSpinnerDropDown = true

                                            }

                                        }
                                    )

                                },
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Text(
                                    text = if (timerType == TimerType.SECONDS) {
                                        "$timeSelected Seconds"

                                    } else {
                                        "Seconds"
                                    },
                                    color = if (timerType == TimerType.SECONDS){
                                        Color.DarkGray
                                    }else{
                                        Color.LightGray
                                    },
                                    modifier = Modifier.padding(start = 8.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .wrapContentHeight()
                                        .align(Alignment.CenterVertically),
                                    contentAlignment = Alignment.CenterEnd
                                ) {

                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_drop_down),
                                        contentDescription = "drop down icon"
                                    )

                                }
                            }


                        }
                        //Stop for Seconds


                    }

                }



                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {


                    //Start for Button for use for All web
                    TextButton(
                        onClick = {


                            if (urlTextValue.isBlank()) {
                                borderColor = Color.Red
                            } else {

                                if (timeSelected <= 0) {
                                    errorTimeBorderColor = Color.Red
                                    // Toast.makeText(context, "invalid time", Toast.LENGTH_SHORT).show()
                                } else {

                                    val textFieldValueInLowercase = urlTextValue.lowercase(
                                        Locale.ROOT
                                    )

                                    val reconfiguredUrl =
                                        if (textFieldValueInLowercase.startsWith("https://")) {
                                            urlTextValue

                                        } else {
                                            if (textFieldValueInLowercase.startsWith("http://")) {

                                                val theLetterAfterHttp =
                                                    urlTextValue.substring(7) // this remove the first 7 letters which is "http://"
                                                val newValue = "https://$theLetterAfterHttp"
                                                newValue

                                            } else {

                                                if (textFieldValueInLowercase.contains("://")) {
                                                    urlTextValue

                                                }else{
                                                    if (textFieldValueInLowercase.startsWith("www.")) {

                                                        val newValue = "https://$urlTextValue"
                                                        newValue

                                                    } else {
                                                        "https://www.google.com/search?q=${urlTextValue}"

                                                    }

                                                }


                                            }

                                        }

                                    scope.launch {

                                        changeAllValueInAllWebViewAutoRefreshInSharedPref(
                                            context = context,
                                            timerType = timerType,
                                            url = reconfiguredUrl,
                                            timeSelected = timeSelected,
                                            pcMode = isPcModeEnabled,
                                            incognitoMode = isIncognitoModeEnabled,
                                            adBlockerMode = isAdBlockerEnabled
                                        )

                                        changeAllValueInAllWebViewAutoRefreshInViewModel(
                                            browserAutoRefreshViewModel = browserAutoRefreshViewModel,
                                            timerType = timerType,
                                            url = reconfiguredUrl,
                                            timeSelected = timeSelected,
                                            pcMode = isPcModeEnabled,
                                            incognitoMode = isIncognitoModeEnabled,
                                            adBlockerMode = isAdBlockerEnabled
                                        )

                                        onDismiss()

                                    }


                                }

                            }


                        },
                        modifier = Modifier
                            .weight(1f)
                            .scale(0.75f)
                            .background(whiteColor, shape = RoundedCornerShape(20.dp))
                            .border(
                                width = 1.dp,
                                Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            )
                    ) {

                        Text(
                            text = "USE FOR ALL WEB",
                            fontSize = autoTextSize1,
                            softWrap = false,
                            maxLines = 1,
                            fontWeight = FontWeight.SemiBold
                        )

                    }
                    //Stop for Button for use for all web



                    //Start for Button for use for this web
                    TextButton(
                        onClick = {

                            if (urlTextValue.isBlank()) {
                                borderColor = Color.Red
                            } else
                            {

                                if (timeSelected <= 0) {
                                    errorTimeBorderColor = Color.Red
                                } else {

                                    val textFieldValueInLowercase = urlTextValue.lowercase(
                                        Locale.ROOT
                                    )

                                    val reconfiguredUrl =
                                        if (textFieldValueInLowercase.startsWith("https://")) {
                                            urlTextValue

                                        } else {
                                            if (textFieldValueInLowercase.startsWith("http://")) {

                                                val theLetterAfterHttp =
                                                    urlTextValue.substring(7) // this remove the first 7 letters which is "http://"
                                                val newValue = "https://$theLetterAfterHttp"
                                                newValue

                                            } else {

                                                if (textFieldValueInLowercase.contains("://")) {
                                                    urlTextValue

                                                }else{
                                                    if (textFieldValueInLowercase.startsWith("www.")) {

                                                        val newValue = "https://$urlTextValue"
                                                        newValue

                                                    } else {
                                                        "https://www.google.com/search?q=${urlTextValue}"

                                                    }

                                                }


                                            }

                                        }

                                    scope.launch {


                                        changeTimerTypeValueInSharedPrefForWebRefresh(
                                            context = context,
                                           webNum =  webNum,
                                            timerType = timerType
                                        )

                                        changeTotalTimeInSharedPrefForWebRefresh(
                                            context = context,
                                            webNum =  webNum,
                                            timeSelected = timeSelected
                                        )

                                        changeUrlValueInSharedPrefForWebRefresh(
                                            context = context,
                                            webNum =  webNum,
                                            url = reconfiguredUrl
                                        )

                                        changeSingleWebAutoRefreshViewModelValues(
                                            webNum = webNum,
                                            browserAutoRefreshViewModel = browserAutoRefreshViewModel,
                                            timerType = timerType,
                                            url = reconfiguredUrl,
                                            timeSelected = timeSelected,
                                            pcMode = isPcModeEnabled,
                                            incognitoMode = isIncognitoModeEnabled,
                                            adBlockerMode = isAdBlockerEnabled
                                        )

                                        changePcModeInSharedPrefForWebRefresh(
                                            context = context,
                                            webNum = webNum,
                                            pcMode = isPcModeEnabled
                                        )
                                        changeIncognitoModeInSharedPrefForWebRefresh(
                                            context = context,
                                            webNum = webNum,
                                            incognitoMode = isIncognitoModeEnabled
                                        )
                                        changeAdBlockerModeInSharedPrefForWebRefresh(
                                            context = context,
                                            webNum = webNum,
                                            adBlockerMode = isAdBlockerEnabled
                                        )



                                        onDismiss()


                                    }



                                }

                            }


                        },
                        modifier = Modifier
                            .weight(1f)
                            .scale(0.75f)
                            .background(whiteColor, shape = RoundedCornerShape(20.dp))
                            .border(
                                width = 1.dp,
                                Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            )
                    ) {

                        Text(
                            text = "USE FOR THIS WEB",
                            fontSize = autoTextSize1,
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
                    //Stop for Button for use for this web


                }



                val snowColor by remember { mutableStateOf(Color(0xffFFFBFE)) }

                // Start WebView Navigation controller
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 5.dp, end = 5.dp)
                        .background(snowColor, shape = RoundedCornerShape(20.dp))
                        .border(width = 1.dp, Color.LightGray, shape = RoundedCornerShape(20.dp))
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

                            onBackButtonClickedForWebRefresh(webNum,browserAutoRefreshViewModel)

                        }) {

                            Icon(
                                painter = painterResource(id = R.drawable.icon_back),
                                contentDescription = "web view back button"
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

                            onReloadButtonClickedForWebRefresh(webNum,browserAutoRefreshViewModel)

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

                            onForwardButtonClickedForWebRefresh(webNum,browserAutoRefreshViewModel)

                        }) {

                            Icon(
                                painter = painterResource(id = R.drawable.icon_forward),
                                contentDescription = "web view forward button"
                            )

                        }


                    }


                }

                // Stop WebView Navigation controller


            }


        }



}

