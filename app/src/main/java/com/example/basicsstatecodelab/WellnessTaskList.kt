package com.example.basicsstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier



//list of all the task item
private fun getWellnessTasks() = List(30){i -> WellnessTask(id = i, label = "task # $i ")}

//lazy column of task item
@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    taskList:List<WellnessTask> = remember{ getWellnessTasks() },
) {
    LazyColumn(modifier = modifier){
        items(taskList){
            task -> WellnessTaskItem(taskName = task.label)
        }
    }
}