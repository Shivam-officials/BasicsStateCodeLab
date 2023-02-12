package com.example.basicsstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//Composable for wellnessScreen
@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefullWaterCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTaskList(List = list, onCloseTask = { task -> list.remove(task)} )
    }
}

//Preview of WellnessScreen
@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    WellnessScreen()

}


//list of all the task item
private fun getWellnessTasks() = List(30){i -> WellnessTask(id = i, label = "task # $i ")}