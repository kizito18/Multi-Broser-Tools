package com.my.Zitos.MultiBroser.Tools.webNormalOnly

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
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.CustomSwitch
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeAdBlockerModeInSharedPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeAllValueInAllWebViewAutoNormalInViewModel
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeAllValueInAllWebViewNormalInSharedPref
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeIncognitoModeInSharedPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changePcModeInSharedPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeSingleWebViewNormalValueInViewModel
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeUrlValueInSharedPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder.BrowserNormalViewModel
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder.BrowserNormalViewModelFactory
import kotlinx.coroutines.launch


@Composable
fun NormalWebViewSetupLayout(
    webNum:Int,
    url: String,
    initPcMode: Boolean,
    initIncognitoMode: Boolean,
    initAdBlockerMode: Boolean,
    onDismiss: () -> Unit

) {





    var isCheckBoxPcChecked by remember{mutableStateOf(initPcMode)}
    var isCheckBoxAdBlockerChecked by remember{mutableStateOf(initAdBlockerMode)}
    var isCheckBoxIncognitoChecked by remember{mutableStateOf(initIncognitoMode)}

    val toggleHeight by remember { mutableStateOf(21.dp) }
    val iconHeight by remember { mutableStateOf(toggleHeight * 2) }

    val scope = rememberCoroutineScope()
    val context = LocalContext.current


    val browserNormalViewModel: BrowserNormalViewModel = viewModel(
        factory = BrowserNormalViewModelFactory(context)
    )



    var autoTextSize1 by remember {
        mutableStateOf(12.sp)
    }


    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)
        .pointerInput(Unit){
            detectTapGestures {
                onDismiss()

            }
        },
        contentAlignment = Alignment.BottomStart
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color.LightGray)
                .padding(10.dp)
                .pointerInput(Unit){
                    detectTapGestures {

                    }
                }

        )
        {


            Box(modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {


                Text(
                    text = "web$webNum",
                    fontSize = 10.sp,
                    softWrap = false,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xffB04F70)
                )

            }


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

                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(iconHeight)
                        .align(Alignment.CenterVertically),
                    contentAlignment = Alignment.Center
                ) {
                    CustomSwitch(
                        modifier = Modifier,
                        isActive = isCheckBoxAdBlockerChecked,
                        toggleHeight = toggleHeight,
                        toggleColor = if (isCheckBoxAdBlockerChecked) {
                            Color(0xffE48A8E)
                        } else {
                            Color.LightGray
                        },
                        painter = painterResource(id = R.drawable.icon_ads),
                        colorFilter = if (isCheckBoxAdBlockerChecked) {
                            null
                        } else {
                            ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                        },
                        onClick = {

                            if (isCheckBoxAdBlockerChecked) {

                                isCheckBoxAdBlockerChecked = false
                            } else {
                                isCheckBoxAdBlockerChecked = true
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

                Text(
                    text = "Incognito:",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 10.sp,
                )

                Spacer(modifier = Modifier.width(10.dp))

                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(iconHeight)
                        .align(Alignment.CenterVertically),
                    contentAlignment = Alignment.Center
                ) {
                    CustomSwitch(
                        modifier = Modifier,
                        isActive = isCheckBoxIncognitoChecked,
                        toggleHeight = toggleHeight,
                        toggleColor = if (isCheckBoxIncognitoChecked) {
                            Color(0xff939FE6)
                        } else {
                            Color.LightGray
                        },
                        painter = painterResource(id = R.drawable.icon_privacy),
                        colorFilter = if (isCheckBoxIncognitoChecked) {
                            null
                        } else {
                            ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                        },
                        onClick = {
                            if (isCheckBoxIncognitoChecked) {

                                isCheckBoxIncognitoChecked = false
                            } else {
                                isCheckBoxIncognitoChecked = true
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

                Text(
                    text = "Desktop:",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 10.sp
                )

                Spacer(modifier = Modifier.width(10.dp))

                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(iconHeight)
                        .align(Alignment.CenterVertically),
                    contentAlignment = Alignment.Center
                ) {
                    CustomSwitch(
                        modifier = Modifier,
                        isActive = isCheckBoxPcChecked,
                        toggleHeight = toggleHeight,
                        toggleColor = if (isCheckBoxPcChecked) {
                            Color(0xffc2F4FB)
                        } else {
                            Color.LightGray
                        },
                        painter = painterResource(id = R.drawable.icon_pc),
                        colorFilter = if (isCheckBoxPcChecked) {
                            null
                        } else {
                            ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                        },
                        onClick = {
                            if (isCheckBoxPcChecked) {

                                isCheckBoxPcChecked = false
                            } else {
                                isCheckBoxPcChecked = true
                            }
                        }
                    )
                }
            }



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {


                TextButton(
                    onClick = {


                        if (url.isNotBlank()) {

                            scope.launch {
                                changeAllValueInAllWebViewNormalInSharedPref(
                                    context = context,
                                    url = url,
                                    pcMode = isCheckBoxPcChecked,
                                    incognitoMode = isCheckBoxIncognitoChecked,
                                    adBlockerMode = isCheckBoxAdBlockerChecked
                                )

                                changeAllValueInAllWebViewAutoNormalInViewModel(
                                    browserNormalViewModel = browserNormalViewModel,
                                    url = url,
                                    pcMode = isCheckBoxPcChecked,
                                    incognitoMode = isCheckBoxIncognitoChecked,
                                    adBlockerMode = isCheckBoxAdBlockerChecked
                                )

                                onDismiss()
                            }

                        }else{

                            Toast.makeText(context, "add a url link first", Toast.LENGTH_SHORT).show()

                        }

                    }, modifier = Modifier
                        .weight(1f)
                        .scale(0.75f)
                        .background(Color.White, shape = RoundedCornerShape(20.dp))
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




                TextButton(
                    onClick = {

                        if (url.isNotBlank()) {

                            changeSingleWebViewNormalValueInViewModel(
                                webNum = webNum,
                                browserNormalViewModel = browserNormalViewModel,
                                url = url,
                                pcMode = isCheckBoxPcChecked,
                                incognitoMode = isCheckBoxIncognitoChecked,
                                adBlockerMode = isCheckBoxAdBlockerChecked
                            )

                            scope.launch {

                                changeUrlValueInSharedPrefForWebNormal(
                                    context = context,
                                    webNum = webNum,
                                    url = url
                                )

                                changePcModeInSharedPrefForWebNormal(
                                    context = context,
                                    webNum = webNum,
                                    pcMode = isCheckBoxPcChecked
                                )
                                changeIncognitoModeInSharedPrefForWebNormal(
                                    context = context,
                                    webNum = webNum,
                                    incognitoMode = isCheckBoxIncognitoChecked
                                )
                                changeAdBlockerModeInSharedPrefForWebNormal(
                                    context = context,
                                    webNum = webNum,
                                    adBlockerMode = isCheckBoxAdBlockerChecked
                                )

                                onDismiss()

                            }



                        }else{

                            Toast.makeText(context, "add a url link first", Toast.LENGTH_SHORT).show()
                        }

                    }, modifier = Modifier
                        .weight(1f)
                        .scale(0.75f)
                        .background(Color.White, shape = RoundedCornerShape(20.dp))
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


            }


        }

    }


}