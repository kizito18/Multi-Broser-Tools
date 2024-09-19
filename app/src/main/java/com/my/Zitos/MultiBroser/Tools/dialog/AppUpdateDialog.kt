package com.my.Zitos.MultiBroser.Tools.dialog

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.my.Zitos.MultiBroser.Tools.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppUpdateDialog(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {


    val iconSize = 150.dp
    val iconOffsetValue = iconSize/2f

    val color1 by remember {
        mutableStateOf(Color(0xff6A1B9A))
    }
    val color2 by remember {
        mutableStateOf(Color(0xff660526))
    }

    BasicAlertDialog(onDismissRequest = { onDismiss() }) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color.Transparent)

        ) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(top = iconOffsetValue)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(color2, color1)
                        ), shape = RoundedCornerShape(10.dp)),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {


                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.CenterHorizontally)
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.icon_celebration),
                        contentDescription = "icon_celebration"
                    )


                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {


                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .offset(y = (-iconOffsetValue))
                                .align(Alignment.CenterHorizontally),
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.app_icon),
                                contentDescription = "app icon",
                                modifier = Modifier
                                    .size(iconSize)
                                    .clip(CircleShape)

                            )


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .offset(y = (-iconOffsetValue)),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Top
                        ) {

                            Text(
                                text = "New Update!!",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                                fontFamily = FontFamily.Serif
                            )


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Bottom
                        ) {

                            Button(
                                onClick = {
                                    onConfirm()

                                },
                                colors = ButtonDefaults.buttonColors(Color.Black)
                            ) {

                                Text(text = "    Download    ", color = Color.White)

                            }

                        }


                    }


                }


            }


        }


    }


}