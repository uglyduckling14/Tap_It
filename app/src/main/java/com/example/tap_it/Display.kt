package com.example.tap_it

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


//Page of game
//TODO: Make it so game stops and displays a loser page with a retry button
@Composable
fun Display(levels: Map<Int, Color>){
    //level of game
    var level by remember {
        mutableStateOf(1)
    }
    //what color in the list of pattern the user is on
    var current by remember {
        mutableStateOf(1)
    }
    var selectedColor by remember {
        mutableStateOf(Color.White)
    }
    var restart by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(0.25f),
            contentAlignment = Alignment.Center)
        {
            Text(text = "Level $level")
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
            CreatePrompt(levels, level)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
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
                                selectedColor = Color.Red

                                if (!Check(selectedColor, levels, current)) {
                                    restart = true
                                } else if (current == level && Check(
                                        selectedColor,
                                        levels,
                                        current
                                    )
                                ) {
                                    current = 1
                                    level++
                                } else if (Check(selectedColor, levels, current)) {
                                    current++
                                }
                                //when clicked, give the red color + the level number and add it to the selected dictionary and compare.
                            }
                    ) {

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Blue)
                            .weight(1f)
                            .clickable {
                                selectedColor = Color.Blue
                                if (!Check(selectedColor, levels, current)) {
                                    restart = true
                                } else if (current == level && Check(
                                        selectedColor,
                                        levels,
                                        current
                                    )
                                ) {
                                    current = 1
                                    level++
                                } else if (Check(selectedColor, levels, current)) {
                                    current++
                                }
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
                                selectedColor = Color.Yellow
                                if (!Check(selectedColor, levels, current)) {
                                    restart = true
                                } else if (current == level && Check(
                                        selectedColor,
                                        levels,
                                        current
                                    )
                                ) {
                                    current = 1
                                    level++
                                } else if (Check(selectedColor, levels, current)) {
                                    current++
                                }
                            }
                    ) {

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Green)
                            .weight(1f)
                            .clickable {
                                selectedColor = Color.Green
                                if (!Check(selectedColor, levels, current)) {
                                    restart= true
                                } else if (current == level && Check(
                                        selectedColor,
                                        levels,
                                        current
                                    )
                                ) {
                                    current = 1
                                    level++
                                } else if (Check(selectedColor, levels, current)) {
                                    current++
                                }
                            }
                    ) {

                    }
                }
            }
        }
        if(restart){
            Button(onClick = {
                current = 1
                level = 1
                selectedColor = Color.White

                restart = false
            }) {
                Text(text ="Restart?")
            }

        }
    }
}

@Composable
fun CreatePrompt(levels: Map<Int,Color>, level: Int){
    levels[level]?.let { Prompt(it) };
}

//Compares the colors the user has selected so far to the level colors
fun Check(selected: Color, levels: Map<Int,Color>, current: Int): Boolean {
    return selected == levels[current]
}
//What color to pick
@Composable
fun Prompt(color: Color){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color)
    ){

    }
}