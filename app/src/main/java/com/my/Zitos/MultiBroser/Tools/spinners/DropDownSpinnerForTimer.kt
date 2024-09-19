package com.my.Zitos.MultiBroser.Tools.spinners

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.my.Zitos.MultiBroser.Tools.TimerType


@Composable
fun DropDownSpinnerForTimer(
    offset : DpOffset,
    timerType: TimerType,
    onDismissRequest : () -> Unit,
    onItemSelected : (timeSelected:Int) -> Unit
){


    val listOfTime = listOf("Minutes or Seconds","Customize","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45",
        "46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"
    )


    var isCustomizeButtonClicked by remember {
        mutableStateOf(false)
    }

    var customTextValue by remember {
        mutableStateOf("")
    }



    var borderColor by remember {
        mutableStateOf(Color.LightGray)
    }




    DropdownMenu(
        expanded = true,
        onDismissRequest = {
            onDismissRequest()

        },
        offset = offset,
        modifier = Modifier
            .background(Color.White)
            .height(250.dp)
            .wrapContentWidth()
            .padding(8.dp),

        ){



        listOfTime.forEachIndexed{ index, timeText ->

            Spacer(modifier = Modifier.padding(8.dp))
            if (index == 0 || index == 1) {

                if (index == 0){

                    Text(
                        text = if (timerType == TimerType.MINUTES){
                            "Minutes"
                        }else{
                            "Seconds"
                        },
                        fontSize = 14.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )

                }else {

                    if (isCustomizeButtonClicked){

                        Row (modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically
                        ){

                            Row (modifier = Modifier
                                .wrapContentSize()
                                .border(width = 1.dp, color = borderColor)
                                .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                BasicTextField(
                                    value = customTextValue,
                                    onValueChange = {
                                        if (it.all { char -> char.isDigit() }) {

                                            val numberRange = if (timerType == TimerType.MINUTES){
                                                3
                                            }else{
                                                5
                                            }

                                            if (it.length <= numberRange){
                                                customTextValue = it

                                            }

                                            if (it.isNotBlank() && borderColor == Color.Red) {
                                                borderColor = Color.LightGray
                                            }
                                        }
                                    },
                                    singleLine = true,
                                    maxLines = 1,
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                    modifier = Modifier
                                        .width(60.dp)

                                )

                                Text(text = if (timerType == TimerType.MINUTES) {
                                    "min"
                                } else {
                                    "sec"
                                },
                                    color = Color.LightGray,
                                    fontSize = 12.sp
                                )

                            }





                            TextButton(onClick = {

                                if (customTextValue.isBlank()) {
                                    borderColor = Color.Red
                                }else {

                                    onItemSelected(customTextValue.toInt())
                                }


                            },
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .weight(1f)
                                    .scale(scaleX = 0.65f, scaleY = 0.56f)
                                    .background(Color.Gray, shape = RoundedCornerShape(10.dp))
                                    .border(
                                        width = 1.dp,
                                        Color.LightGray,
                                        shape = RoundedCornerShape(10.dp)
                                    )
                            ) {
                                Text(text = "Done", color = Color.White)
                            }


                        }

                    }else {
                        Text(
                            text = timeText,
                            fontSize = 14.sp,
                            color = Color.Blue,
                            modifier = Modifier
                                .clickable {
                                    isCustomizeButtonClicked = true
                                }
                        )
                    }

                }

            }else {
                Text(
                    text =  if (timerType == TimerType.MINUTES){
                        "$timeText Min"
                    }else{
                        "$timeText Sec"
                    },
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .clickable {
                            onItemSelected(timeText.toInt())
                        }
                )
            }

        }









    }





}
