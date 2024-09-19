package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly

import android.widget.Toast
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.CustomSwitch
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.ScreenLayerType
import com.my.Zitos.MultiBroser.Tools.TimerType
import com.my.Zitos.MultiBroser.Tools.spinners.DropDownSpinnerForScrollSpeed
import com.my.Zitos.MultiBroser.Tools.spinners.DropDownSpinnerForTimer
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeAdBlockerModeInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeAllValueInAllWebViewAutoScrollInSharedPref
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeAllValueInAllWebViewAutoScrollInViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeIncognitoModeInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changePcModeInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeScrollSpeedInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeSingleWebAutoScrollViewModelValues
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeTimerTypeValueInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeTotalTimeInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeUrlValueInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.changeWebLengthInSharedPrefForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.onBackButtonClickedForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.onForwardButtonClickedForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.moreFunctions.onReloadButtonClickedForWebScroll
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModel
import com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly.viewModelAndWebViewHolder.BrowserAutoScrollViewModelFactory
import kotlinx.coroutines.launch
import java.util.Locale


@Composable
fun AutoScrollWebViewSetupLayout (
    url: String,
    webNum:Int,
    spTimerType: TimerType,
    spWebTotalTime : Int,
    spScrollSpeed: Int,
    spWebHeight:  Int,
    initPcMode: Boolean,
    initIncognitoMode: Boolean,
    initAdBlockerMode: Boolean,
    onDismiss: () -> Unit,
    changeFullScreen: () -> Unit

) {



    val context = LocalContext.current
    val scope = rememberCoroutineScope()



    var urlTextValue by remember { mutableStateOf(url) }
    var timerType by remember { mutableStateOf(spTimerType) }
    var timeSelected by remember { mutableIntStateOf(spWebTotalTime) }
    var speedSelected by remember { mutableIntStateOf(spScrollSpeed) }
    var webHeightSelected by remember { mutableIntStateOf(spWebHeight) }
    var editTextWebHeightSelected by remember { mutableStateOf(if (spWebHeight == 0){
        ""
    }else {
        "$spWebHeight"
    }) }
    var pressOffset by remember { mutableStateOf(DpOffset.Zero) }
    var showSpinnerDropDownForTime by remember {  mutableStateOf(false) }
    var showSpinnerDropDownForSpeed by remember {  mutableStateOf(false) }
    var borderColor by remember { mutableStateOf(Color.Transparent) }


    var isPcModeEnabled by remember { mutableStateOf(initPcMode) }
    var isIncognitoModeEnabled by remember { mutableStateOf(initIncognitoMode) }
    var isAdBlockerEnabled by remember { mutableStateOf(initAdBlockerMode) }

    var showDialogChoseScreenLayer  by remember {  mutableStateOf(false) }
    var showDialogWebPageLengthGetter  by remember {  mutableStateOf(false) }
    var screenLayerType by remember {  mutableStateOf(ScreenLayerType.THREE_LAYER) }


    val browserAutoScrollViewModel: BrowserAutoScrollViewModel = viewModel(
        factory = BrowserAutoScrollViewModelFactory(context)
    )


    var autoTextSize1 by remember {
        mutableStateOf(12.sp)
    }



    val snowColor by remember { mutableStateOf(Color(0xffFFFBFE)) }

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

    var errorSpeedBorderColor by remember {
        mutableStateOf(Color.Blue)
    }


    var errorWebLengthBorderColor by remember {
        mutableStateOf(Color.Blue)
    }

    val pinkColor by remember {
        mutableStateOf(Color(0xffDB7A9B))
    }



    Column(modifier = Modifier
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

                //val platinumColor = Color(0xffCFC7D4)
                //val taupeGrayColor = Color(0xffADA5B2)
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

                        Text(
                            text = "AdBlocker:",
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

                                            showSpinnerDropDownForTime = true

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



                    if (showSpinnerDropDownForTime) {

                        DropDownSpinnerForTimer(
                            offset = pressOffset,
                            timerType = timerType,
                            onDismissRequest = {
                                showSpinnerDropDownForTime = false

                                changeFullScreen()
                            },
                            onItemSelected = { selectedTime ->

                                timeSelected = selectedTime
                                showSpinnerDropDownForTime = false
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

                                            showSpinnerDropDownForTime = true

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





            Row (modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .shadow(elevation = 2.dp)
                .padding(5.dp)
            ){


                if (showSpinnerDropDownForSpeed) {

                    DropDownSpinnerForScrollSpeed(
                        offset = pressOffset,
                        onDismissRequest = {
                            showSpinnerDropDownForSpeed = false

                            changeFullScreen()
                        },
                        onItemSelected = { selectedSpeed ->

                            speedSelected = selectedSpeed
                            showSpinnerDropDownForSpeed = false
                            errorSpeedBorderColor = Color.Blue

                            changeFullScreen()
                        }
                    )
                }



                //Start Scroll Speed
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(5.dp)
                        .weight(1f)
                    //verticalAlignment = Alignment.CenterVertically
                ) {


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(
                            text = "Scroll Speed",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.Black
                        )

                    }


                    Spacer(modifier = Modifier.height(8.dp))


                    Row(modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .border(
                            width = 2.dp, color = errorSpeedBorderColor
                        )
                        .padding(start = 8.dp)
                        .onGloballyPositioned {
                            layoutHeight = with(density) { (it.size.height / 2).toDp() }
                            layoutWidth = with(density) { (it.size.width / 2).toDp() }
                        }
                        .pointerInput(Unit) {
                            detectTapGestures(
                                onTap = {

                                    pressOffset = DpOffset(it.x.toDp(), it.y.toDp())

                                    showSpinnerDropDownForSpeed = true

                                }
                            )

                        },
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "$speedSelected Speed",
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
                //stop scroll Speed



                //Start Web Height

                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(5.dp)
                        .drawBehind {
                            val strokeWidth = 1.dp.toPx()
                            val x = strokeWidth / 2  // Position the line at the left edge

                            // Draw the vertical line at the left edge
                            drawLine(
                                color = Color.Gray,
                                start = Offset(x, 0f),  // Start at the top
                                end = Offset(x, size.height),  // End at the bottom
                                strokeWidth = strokeWidth
                            )
                        }
                        .weight(1f)
                ) {


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ){

                        Text(text = "WebPage Height",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.Black
                        )

                    }

                    Spacer(modifier = Modifier.height(3.dp))

                    val platinumColor = Color(0xffCFC7D4)


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                    ) {

                        Spacer(modifier = Modifier.width(8.dp))

                        BasicTextField(
                            value = editTextWebHeightSelected,
                            onValueChange = {

                                if (it.all { char -> char.isDigit() }) {

                                    val numberRange = 7

                                    if (it.length <= numberRange) {

                                        if (it.isBlank() || it.isEmpty() || it == "0") {
                                            editTextWebHeightSelected = ""
                                            webHeightSelected = 0
                                        } else {
                                            editTextWebHeightSelected = it
                                            webHeightSelected = it.toInt()
                                        }
                                    }

                                    if (webHeightSelected >= 5) {
                                        errorWebLengthBorderColor = Color.Blue
                                    } else {
                                        errorWebLengthBorderColor = Color.Red
                                    }

                                }
                            },
                            textStyle = TextStyle(

                                fontSize = 15.sp,
                                color = Color.DarkGray
                            ),
                            maxLines = 1,
                            singleLine = true,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            decorationBox = { innerTextField ->

                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .weight(1f)
                                ) {

                                    if (editTextWebHeightSelected.isEmpty()) {

                                        Text(
                                            text = "0000000",
                                            fontWeight = FontWeight.Normal,
                                            color = Color.White
                                        )
                                    }

                                    innerTextField()

                                    // Spacer(modifier = Modifier.height(20.dp))

                                }

                            },
                            modifier = Modifier
                                .border(
                                    width = 2.dp, color = errorWebLengthBorderColor
                                )
                                // .padding(5.dp)
                                .background(platinumColor)
                                .weight(1f)
                        )




                        Button(onClick = {


                            if(urlTextValue.isBlank()) {
                                borderColor = Color.Red
                                Toast.makeText(
                                    context,
                                    "add url link",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }else {
                                if (speedSelected < 30) {
                                    errorSpeedBorderColor = Color.Red
                                    Toast.makeText(
                                        context,
                                        "speed is too small",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }else{
                                    if (showDialogChoseScreenLayer) {
                                        showDialogChoseScreenLayer = false
                                    } else {
                                        showDialogChoseScreenLayer = true
                                    }
                                }
                            }

                        },modifier = Modifier
                            .scale(0.7f)
                            .align(Alignment.Bottom),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(Color.Gray)
                        ) {
                            Text(text = "Get",
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold
                            )
                        }



                    }


                }

                //Stop Web Height




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
                                Toast.makeText(
                                    context,
                                    "add url link",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else {

                                if (speedSelected < 30) {
                                    errorSpeedBorderColor = Color.Red
                                    Toast.makeText(context, "speed is too small", Toast.LENGTH_SHORT).show()

                                }else{


                                    if (webHeightSelected < 5) {
                                        errorWebLengthBorderColor = Color.Red
                                        Toast.makeText(context, "webHeight is too small", Toast.LENGTH_SHORT).show()

                                    }else{


                                        val textFieldValueInLowercase = urlTextValue.lowercase(
                                            Locale.ROOT
                                        )


                                        val reconfiguredUrl =
                                            if (textFieldValueInLowercase.startsWith("https://")) {
                                                urlTextValue

                                            } else
                                            {
                                                if (textFieldValueInLowercase.startsWith("http://")) {

                                                    val theLetterAfterHttp =
                                                        urlTextValue.substring(7) // this remove the first 7 letters which is "http://"
                                                    val newValue = "https://$theLetterAfterHttp"
                                                    newValue

                                                } else {

                                                    if (textFieldValueInLowercase.contains("://")){
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

                                            changeAllValueInAllWebViewAutoScrollInSharedPref(
                                                context = context,
                                                timerType = timerType,
                                                url = reconfiguredUrl,
                                                timeSelected = timeSelected,
                                                speedSelected = speedSelected,
                                                webLengthSelected = webHeightSelected,
                                                pcMode = isPcModeEnabled,
                                                incognitoMode = isIncognitoModeEnabled,
                                                adBlockerMode = isAdBlockerEnabled
                                            )

                                            changeAllValueInAllWebViewAutoScrollInViewModel(
                                                browserAutoScrollViewModel = browserAutoScrollViewModel,
                                                timerType = timerType,
                                                url = reconfiguredUrl,
                                                timeSelected = timeSelected,
                                                speedSelected = speedSelected,
                                                webLengthSelected = webHeightSelected,
                                                pcMode = isPcModeEnabled,
                                                incognitoMode = isIncognitoModeEnabled,
                                                adBlockerMode = isAdBlockerEnabled
                                            )

                                            onDismiss()

                                        }



                                    }





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
                            Toast.makeText(
                                context,
                                "add url link",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else
                        {

                            if (timeSelected <= 0) {
                                errorTimeBorderColor = Color.Red
                            } else {

                                if (speedSelected < 30) {
                                    errorSpeedBorderColor = Color.Red
                                    Toast.makeText(context, "speed is too small", Toast.LENGTH_SHORT).show()

                                }else{

                                    if (webHeightSelected < 5) {
                                        errorWebLengthBorderColor = Color.Red
                                        Toast.makeText(context, "webHeight is too small", Toast.LENGTH_SHORT).show()

                                    }else{


                                        val textFieldValueInLowercase = urlTextValue.lowercase(
                                            Locale.ROOT
                                        )



                                        val reconfiguredUrl =
                                            if (textFieldValueInLowercase.startsWith("https://")) {
                                                urlTextValue

                                            } else
                                            {
                                                if (textFieldValueInLowercase.startsWith("http://")) {

                                                    val theLetterAfterHttp =
                                                        urlTextValue.substring(7) // this remove the first 7 letters which is "http://"
                                                    val newValue = "https://$theLetterAfterHttp"
                                                    newValue

                                                } else {

                                                    if (textFieldValueInLowercase.contains("://")){
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

                                            changeTimerTypeValueInSharedPrefForWebScroll(
                                                context = context,
                                                webNum =  webNum,
                                                timerType = timerType
                                            )

                                            changeTotalTimeInSharedPrefForWebScroll(
                                                context = context,
                                                webNum =  webNum,
                                                timeSelected = timeSelected
                                            )

                                            changeUrlValueInSharedPrefForWebScroll(
                                                context = context,
                                                webNum =  webNum,
                                                url = reconfiguredUrl
                                            )

                                            changeSingleWebAutoScrollViewModelValues(
                                                webNum = webNum,
                                                browserAutoScrollViewModel = browserAutoScrollViewModel,
                                                timerType = timerType,
                                                url = reconfiguredUrl,
                                                timeSelected = timeSelected,
                                                speedSelected = speedSelected,
                                                webLengthSelected = webHeightSelected,
                                                pcMode = isPcModeEnabled,
                                                incognitoMode = isIncognitoModeEnabled,
                                                adBlockerMode = isAdBlockerEnabled
                                            )

                                            changeScrollSpeedInSharedPrefForWebScroll(
                                                context = context,
                                                webNum = webNum,
                                                speedSelected = speedSelected
                                            )

                                            changeWebLengthInSharedPrefForWebScroll(
                                                context = context,
                                                webNum = webNum,
                                                webLengthSelected = webHeightSelected
                                            )

                                            changePcModeInSharedPrefForWebScroll(
                                                context = context,
                                                webNum = webNum,
                                                pcMode = isPcModeEnabled
                                            )
                                            changeIncognitoModeInSharedPrefForWebScroll(
                                                context = context,
                                                webNum = webNum,
                                                incognitoMode = isIncognitoModeEnabled
                                            )
                                            changeAdBlockerModeInSharedPrefForWebScroll(
                                                context = context,
                                                webNum = webNum,
                                                adBlockerMode = isAdBlockerEnabled
                                            )


                                            onDismiss()


                                        }


                                    }





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

                        onBackButtonClickedForWebScroll(webNum,browserAutoScrollViewModel)

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

                        onReloadButtonClickedForWebScroll(webNum,browserAutoScrollViewModel)

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

                        onForwardButtonClickedForWebScroll(webNum,browserAutoScrollViewModel)

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







    if (showDialogChoseScreenLayer){

        DialogChoseScreenLayers(
            onDismiss = {
                showDialogChoseScreenLayer = false
            },
            onLayerSelected = {  layerSelected->
                screenLayerType = layerSelected
                showDialogChoseScreenLayer = false
                showDialogWebPageLengthGetter = true
            }
        )


    }




    if (showDialogWebPageLengthGetter){

        val textFieldValueInLowercase = urlTextValue.lowercase(
            Locale.ROOT
        )

        val reconfiguredUrl = if (textFieldValueInLowercase.startsWith("https://")) {
            urlTextValue
        } else
        {
            if (textFieldValueInLowercase.startsWith("http://")) {
                val theLetterAfterHttp = urlTextValue.substring(7) // this remove the first 7 letters which is "http://"
                val newValue = "https://$theLetterAfterHttp"
                newValue
            } else {
                if (textFieldValueInLowercase.contains("://")){
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


        DialogWebPageLengthGetter(
            screenLayerSelected = screenLayerType,
           scrollSpeedPassed =  speedSelected,
            urlPassed = reconfiguredUrl,
           isPcModeActive =  isPcModeEnabled,
           isAdBlockerActive =  isAdBlockerEnabled,
           onDismiss =   {

               showDialogWebPageLengthGetter = false

           },
            onFinished = { urlValue, webLength ->

                urlTextValue = urlValue
                editTextWebHeightSelected = "$webLength"
                webHeightSelected = webLength

                showDialogWebPageLengthGetter = false

            }

        )

    }






}