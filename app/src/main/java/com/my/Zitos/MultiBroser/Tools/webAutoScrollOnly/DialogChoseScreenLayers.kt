package com.my.Zitos.MultiBroser.Tools.webAutoScrollOnly

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.zIndex
import com.my.Zitos.MultiBroser.Tools.R
import com.my.Zitos.MultiBroser.Tools.ScreenLayerType


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogChoseScreenLayers(
    onDismiss: () -> Unit,
    onLayerSelected: (layer: ScreenLayerType) -> Unit
) {


    var layerSelected by remember { mutableStateOf(ScreenLayerType.THREE_LAYER) }




    BasicAlertDialog(properties = DialogProperties(usePlatformDefaultWidth = false),
        onDismissRequest = { onDismiss()}
    ) {




        Column (modifier = Modifier
            .fillMaxWidth()
           // .fillMaxHeight(0.4f)
            .wrapContentHeight()
            .padding(10.dp)
            .background(Color.White)
            .animateContentSize(animationSpec = tween(durationMillis = 400)),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Row(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
               // .weight(1f)
                .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){


                Box(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(
                        if (layerSelected == ScreenLayerType.TWO_LAYER) {
                            8.dp
                        } else {
                            12.dp
                        }
                    )
                    .weight(1f)
                    .animateContentSize(animationSpec = tween(durationMillis = 400)),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.icon_layre2),
                        contentDescription ="1 layer",
                        modifier = Modifier
                            .shadow(elevation = 8.dp)
                            .clickable {
                                layerSelected = ScreenLayerType.TWO_LAYER
                            }
                    )

                    Box(modifier = Modifier

                        .height(15.dp)
                        .width(15.dp)
                        .background(
                            if (layerSelected == ScreenLayerType.TWO_LAYER) {
                                Color.Blue
                            } else {
                                Color.LightGray
                            },
                            shape = CircleShape
                        )
                        .clip(shape = CircleShape)
                        .align(Alignment.TopEnd)
                        .zIndex(1f)

                    )
                }




                Box(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(
                        if (layerSelected == ScreenLayerType.ONE_LAYER) {
                            8.dp
                        } else {
                            12.dp
                        }
                    )
                    .weight(1f)
                    .animateContentSize(animationSpec = tween(durationMillis = 400)),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.icon_layre1),
                        contentDescription ="1 layer",
                        modifier = Modifier
                            .shadow(elevation = 5.dp)
                            .clickable {
                                layerSelected = ScreenLayerType.ONE_LAYER
                            }
                    )

                    Box(modifier = Modifier
                        .height(15.dp)
                        .width(15.dp)
                        .background(
                            if (layerSelected == ScreenLayerType.ONE_LAYER) {
                                Color.Blue
                            } else {
                                Color.LightGray
                            },
                            shape = CircleShape
                        )
                        .clip(shape = CircleShape)
                        .align(Alignment.TopEnd)
                        .zIndex(1f)

                    )
                }




                Box(modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(
                        if (layerSelected == ScreenLayerType.THREE_LAYER) {
                            8.dp
                        } else {
                            12.dp
                        }
                    )
                    .weight(1f)
                    .animateContentSize(animationSpec = tween(durationMillis = 400)),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.icon_layre3),
                        contentDescription ="1 layer",
                        modifier = Modifier
                            .shadow(elevation = 5.dp)
                            .clickable {
                                layerSelected = ScreenLayerType.THREE_LAYER
                            }
                    )

                    Box(modifier = Modifier
                        .height(15.dp)
                        .width(15.dp)
                        .background(
                            if (layerSelected == ScreenLayerType.THREE_LAYER) {
                                Color.Blue
                            } else {
                                Color.LightGray
                            },
                            shape = CircleShape
                        )
                        .clip(shape = CircleShape)
                        .align(Alignment.TopEnd)
                        .zIndex(1f)

                    )
                }


            }


            Button(onClick = {

                onLayerSelected(layerSelected)

            }, colors = ButtonDefaults.buttonColors(Color(
                red = Color.Blue.red,
                green = Color.Blue.green,
                blue = Color.Blue.blue,
                alpha = 0.7f)
            ),
                shape = RoundedCornerShape(5.dp)
            ) {

                Text(text = "Done", color = Color.White)

            }



        }



    }

}

