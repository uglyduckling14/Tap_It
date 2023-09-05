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
            Text(text = "Level 1")
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
            Prompt(Color.Red)
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
            println(Boxes()[0])
            println(67)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tap_ItTheme {
        MainScreen()
    }
}