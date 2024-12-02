package com.lab6.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lab6.data.entity.WeatherMain
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color

@Composable
fun WeatherMainCustomView(weatherMain: WeatherMain, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF957EFF)),
        shape = RoundedCornerShape(4.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Температура: ${weatherMain.temp}°C",
                fontSize = 20.sp,
                color = Color.Green,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Відчувається як: ${weatherMain.feels_like}°C",
                fontSize = 16.sp,
                color = Color.Green,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Вологість: ${weatherMain.humidity}%",
                fontSize = 16.sp,
                color = Color.Green,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = "Тиск: ${weatherMain.pressure} мм",
                fontSize = 16.sp,
                color = Color.Green,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}
