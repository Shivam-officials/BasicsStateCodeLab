package com.example.basicsstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

//Composable for wellnessScreen
@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
    ) {
    Column(modifier = modifier) {
        StatefullWaterCounter()

        WellnessTaskList(List = wellnessViewModel.tasks, onCloseTask = {task -> wellnessViewModel.remove(task)} )
    }
}

//Preview of WellnessScreen
@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    WellnessScreen()

}

