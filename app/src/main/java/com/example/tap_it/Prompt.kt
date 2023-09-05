package com.example.tap_it

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Prompt(color: Color){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color)
    ){

    }
}