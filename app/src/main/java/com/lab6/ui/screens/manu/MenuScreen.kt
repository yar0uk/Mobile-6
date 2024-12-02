package com.lab6.ui.screens.manu

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(onWeather: () -> Unit, onWeatherForecast: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Додаток показу погоди",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Button(
            onClick = onWeather,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFff8f76),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFFff8f76),
                disabledContentColor = Color(0xFFff8f76)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text(
                "Погода зараз",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Button(
            onClick = onWeatherForecast,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFff8f76),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFFff8f76),
                disabledContentColor = Color(0xFFff8f76)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text(
                "Погода на наступні 5 днів",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
