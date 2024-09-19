package com.my.Zitos.MultiBroser.Tools.webNormalOnly

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeUrlValueInSharedPrefForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.moreFunctions.changeUrlValueInViewmodelForWebNormal
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder.BrowserNormalViewModel
import com.my.Zitos.MultiBroser.Tools.webNormalOnly.viewModelAndWebViewHolder.BrowserNormalViewModelFactory
import kotlinx.coroutines.launch
import java.util.Locale


@Composable
fun SearchLayout(
    context: Context,
    webNum: Int,
    url: String,
    enableFullScreen: (Boolean) -> Unit,
    onDismiss: () -> Unit
) {

    val scope = rememberCoroutineScope()

    var editTextValue by remember { mutableStateOf(url) }

    var borderColor by remember { mutableStateOf(Color.Transparent)}



    val keyboardController = LocalSoftwareKeyboardController.current


    val browserNormalViewModel: BrowserNormalViewModel = viewModel(
        factory = BrowserNormalViewModelFactory(context)
    )


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

        Column (modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.White)
            .padding(start = 5.dp, bottom = 5.dp, top = 5.dp)
            .pointerInput(Unit){
                detectTapGestures {

                }
            },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Blue)
            )


            Text(
                text = "web$webNum",
                fontSize = 10.sp,
                softWrap = false,
                fontWeight = FontWeight.SemiBold,
                color = Color.Blue

            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {


                val platinumColor = Color(0xffCFC7D4)
                val taupeGrayColor = Color(0xffADA5B2)


                val colors = TextFieldDefaults.colors(
                    focusedContainerColor = platinumColor,
                    unfocusedContainerColor = platinumColor,
                    disabledContainerColor = platinumColor,

                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,


                    focusedTextColor = Color.DarkGray,
                    unfocusedTextColor = Color.DarkGray,
                    disabledTextColor = Color.DarkGray,

                    cursorColor = Color.Black,

                    selectionColors = TextSelectionColors(
                        handleColor = taupeGrayColor,
                        backgroundColor = taupeGrayColor
                    )
                )

                TextField(
                    value = editTextValue,
                    onValueChange = {
                        editTextValue = it
                    },
                    singleLine = true,
                    maxLines = 1,
                    colors = colors,
                    placeholder = {
                        Text(
                            text = "https://",
                            fontWeight = FontWeight.Normal,
                            color = Color.White,

                            )


                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(
                        onSearch = {

                            keyboardController?.hide()


                            if (editTextValue.isBlank()) {
                                borderColor = Color.Red
                            } else {

                                val textFieldValueInLowercase = editTextValue.lowercase(
                                    Locale.ROOT
                                )

                                val reconfiguredUrl =
                                    if (textFieldValueInLowercase.startsWith("https://")) {
                                        editTextValue

                                    } else {
                                        if (textFieldValueInLowercase.startsWith("http://")) {

                                            val theLetterAfterHttp =
                                                editTextValue.substring(7) // this remove the first 7 letters which is "http://"
                                            val newValue = "https://$theLetterAfterHttp"
                                            newValue

                                        } else {

                                            if (textFieldValueInLowercase.contains("://")) {
                                                editTextValue

                                            } else {

                                                if (textFieldValueInLowercase.startsWith("www.")) {

                                                    val newValue = "https://$editTextValue"
                                                    newValue

                                                } else {
                                                    "https://www.google.com/search?q=${editTextValue}"

                                                }

                                            }


                                        }

                                    }

                                scope.launch {
                                    changeUrlValueInSharedPrefForWebNormal(
                                        context = context,
                                        webNum = webNum,
                                        url = reconfiguredUrl
                                    )

                                    changeUrlValueInViewmodelForWebNormal(
                                        browserNormalViewModel = browserNormalViewModel,
                                        webNum = webNum,
                                        url = reconfiguredUrl
                                    )


                                    enableFullScreen(true)

                                    onDismiss()

                                }



                            }


                        }),
                    shape = RoundedCornerShape(100),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(3.dp)
                        .weight(1f)
                        .border(
                            width = 1.dp,
                            color = Color.Blue,
                            shape = RoundedCornerShape(100)
                        )
                        .onFocusChanged {
                            if (it.isFocused) {
                                enableFullScreen(true)
                            } else {
                                enableFullScreen(false)
                            }
                        }

                )


                IconButton(onClick = {

                    onDismiss()

                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_cancel),
                        contentDescription = "web view forward button",
                        tint = Color.Blue
                    )
                }


            }


        }



    }


}