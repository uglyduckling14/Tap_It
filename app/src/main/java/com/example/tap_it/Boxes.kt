package com.example.tap_it

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember


@Composable
fun Boxes(): MutableList<Boolean>{
    val selectedColors = remember { mutableStateListOf(false, false, false, false) }
    Row(
        modifier = Modifier
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .background(Color.White)
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .weight(1f)
                    .clickable {
                        selectedColors[0] = !selectedColors[0]
                    }
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Blue)
                    .weight(1f)
                    .clickable {
                        selectedColors[1] = !selectedColors[1]
                    }
            ) {
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .weight(1f)
        ){
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .weight(1f)
                    .clickable {
                        selectedColors[2] = !selectedColors[2]
                    }
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .weight(1f)
                    .clickable {
                        selectedColors[3] = !selectedColors[3]
                    }
            ) {

            }
        }
    }
    return selectedColors
}
