package com.my.Zitos.MultiBroser.Tools.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.my.Zitos.MultiBroser.Tools.R


@Composable
fun DialogWebVisibility(
    box1:Boolean, box2:Boolean, box3:Boolean, box4:Boolean, box5:Boolean,
    box6:Boolean, box7:Boolean, box8:Boolean, box9:Boolean, box10:Boolean,
    box11:Boolean, box12:Boolean, box13:Boolean, box14:Boolean, box15:Boolean,
    onDismiss : () -> Unit,
    onButtonClicked : (box1:Boolean, box2:Boolean, box3:Boolean, box4:Boolean, box5:Boolean,
                       box6:Boolean, box7:Boolean, box8:Boolean, box9:Boolean, box10:Boolean,
                       box11:Boolean, box12:Boolean, box13:Boolean, box14:Boolean, box15:Boolean,
    ) -> Unit

){


    var autoTextSize by remember { mutableStateOf(10.sp) }

    val fontWeight by remember { mutableStateOf(FontWeight.SemiBold) }
    val textColor by remember { mutableStateOf(Color.DarkGray) }



    var checkBox1 by remember { mutableStateOf(box1) }
    var checkBox2 by remember { mutableStateOf(box2) }
    var checkBox3 by remember { mutableStateOf(box3) }
    var checkBox4 by remember { mutableStateOf(box4) }
    var checkBox5 by remember { mutableStateOf(box5) }
    var checkBox6 by remember { mutableStateOf(box6) }
    var checkBox7 by remember { mutableStateOf(box7) }
    var checkBox8 by remember { mutableStateOf(box8) }
    var checkBox9 by remember { mutableStateOf(box9) }
    var checkBox10 by remember { mutableStateOf(box10) }
    var checkBox11 by remember { mutableStateOf(box11) }
    var checkBox12 by remember { mutableStateOf(box12) }
    var checkBox13 by remember { mutableStateOf(box13) }
    var checkBox14 by remember { mutableStateOf(box14) }
    var checkBox15 by remember { mutableStateOf(box15) }


    val color1 by remember {
        mutableStateOf(Color(0xff6A1B9A))
    }
    val color2 by remember {
        mutableStateOf(Color(0xff660526))
    }





    Dialog(onDismissRequest = { onDismiss()}) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
                .clip(RoundedCornerShape(10.dp)),

            ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(5.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.padding(top = 7.dp))



                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        CustomCheckBox(
                            checkBoxValue = checkBox1,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox1 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web1",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox2,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox2 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web2",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox3,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox3 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web3",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox4,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox4 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web4",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox5,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox5 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web5",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox6,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox6 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web6",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox7,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox7 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web7",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox8,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox8 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web8",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox9,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox9 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web9",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox10,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox10 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web10",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }


                }



                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox11,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox11 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web11",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox12,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox12 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web12",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox13,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox13 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web13",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox14,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox14 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web14",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CustomCheckBox(
                            checkBoxValue = checkBox15,
                            onCheckBoxClicked = { checkBoxValue ->
                                checkBox15 = checkBoxValue
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "web15",
                            color = textColor,
                            fontWeight = fontWeight,
                            fontSize = autoTextSize,
                            softWrap = false,
                            onTextLayout = { textLayoutResult ->
                                if (textLayoutResult.didOverflowWidth) {
                                    autoTextSize *= 0.9
                                }
                            }
                        )
                        Spacer(modifier = Modifier.padding(start = 2.dp))

                    }

                }


                //  Spacer(modifier = Modifier.padding(3.dp))


                Box(modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(color1, color2)
                        ), shape = RoundedCornerShape(10.dp)
                    )
                    .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(shape = RoundedCornerShape(3.dp))
                    .clickable  {
                        onButtonClicked(
                            checkBox1,
                            checkBox2,
                            checkBox3,
                            checkBox4,
                            checkBox5,
                            checkBox6,
                            checkBox7,
                            checkBox8,
                            checkBox9,
                            checkBox10,
                            checkBox11,
                            checkBox12,
                            checkBox13,
                            checkBox14,
                            checkBox15
                        )
                    },
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "Done",
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold
                    )

                }

            }


        }

    }

}

@Composable
private fun CustomCheckBox(
    checkBoxValue: Boolean,
    onCheckBoxClicked: (isBoxChecked: Boolean) -> Unit
){


    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xff660526),
                Color(0xff660526),
                Color(0xff6A1B9A),
                Color(0xff6A1B9A),
                Color(0xff6A1B9A),
                Color(0xff660526),
                Color(0xff660526),
                Color(0xff6A1B9A)
            )
        )
    }

    Box(modifier = Modifier
        .height(21.dp)
        .width(21.dp)
        .background(Color.Transparent, shape = CircleShape)
        .border(
            width = 1.3.dp,
            brush =  rainbowColorsBrush,
            shape = CircleShape
        )
        .clip(CircleShape)
        .padding(1.dp)
        .clickable {

            if (checkBoxValue) {
                onCheckBoxClicked(false)
            } else {
                onCheckBoxClicked(true)
            }

        }
    ){


        if (checkBoxValue){
            Icon(painter = painterResource(
                id = R.drawable.icon_check
            ),
                contentDescription = null,
                tint = Color(0xff38A10E)
            )
        }



    }



}