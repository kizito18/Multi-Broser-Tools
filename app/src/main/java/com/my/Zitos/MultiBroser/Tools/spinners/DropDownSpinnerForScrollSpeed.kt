package com.my.Zitos.MultiBroser.Tools.spinners

import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DropDownSpinnerForScrollSpeed(
    offset : DpOffset,
    onDismissRequest : () -> Unit,
    onItemSelected : (speedSelected:Int) -> Unit
){


    val listOfScrollSpeed = listOf("Scroll Speed","Customize","30","40","50","60","70","80","90","100","110","120","130","140","150","160","170","180","190","200",
        "210","220","230","240","250","260","270","280","290","300","310","320","330","340","350","360","370","380","390","400","410","420","430","440","450",
        "460","470","480","490","500","510","520","530","540","550","560","570","580","590","600")


    var isCustomizeButtonClicked by remember {
        mutableStateOf(false)
    }

    var customTextValue by remember {
        mutableStateOf("")
    }



    var borderColor by remember {
        mutableStateOf(Color.LightGray)
    }


    val context = LocalContext.current


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



        listOfScrollSpeed.forEachIndexed{ index, speedText ->

            Spacer(modifier = Modifier.padding(8.dp))
            if (index == 0 || index == 1) {

                if (index == 0){

                    Text(
                        text = "Scroll Speed",
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

                                            val numberRange = 3


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

                                Text(text = "speed",
                                    color = Color.LightGray,
                                    fontSize = 12.sp
                                )

                            }





                            TextButton(onClick = {

                                if (customTextValue.isBlank()) {
                                    borderColor = Color.Red
                                }else {
                                    if (customTextValue.toInt() < 30){
                                        borderColor = Color.Red
                                        Toast.makeText(context, "the value is too small", Toast.LENGTH_SHORT).show()
                                    }else {
                                        onItemSelected(customTextValue.toInt())
                                    }
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
                            text = speedText,
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
                    text = "$speedText Speed",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .clickable {
                            onItemSelected(
                                speedText.toInt()
                            )
                        }
                )
            }

        }









    }





}
