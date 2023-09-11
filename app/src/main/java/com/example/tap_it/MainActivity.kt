 package com.example.tap_it

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tap_it.ui.theme.Tap_ItTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tap_ItTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen(){
    //create list of all level colors
    //TODO: Make this randomized and infinite
    val levels = mapOf(
        1 to Color.Red,
        2 to Color.Green,
        3 to Color.Yellow,
        4 to Color.Blue,
        5 to Color.Yellow,
        6 to Color.Blue,
        7 to Color.Red,
        8 to Color.Yellow,
        9 to Color.Green,
        10 to Color.Green,
        11 to Color.Blue
        )

    Display(levels)
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tap_ItTheme {
        MainScreen()
    }
}