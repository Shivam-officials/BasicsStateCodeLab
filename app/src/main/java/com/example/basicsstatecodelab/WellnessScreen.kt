package com.example.basicsstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//Composable for wellnessScreen
@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefullWaterCounter()
        WellnessTaskList()
    }
}

//Preview of WellnessScreen
@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    WellnessScreen()

}


