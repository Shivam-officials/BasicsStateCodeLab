package com.example.basicsstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//lazy column of task item
@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    List:List<WellnessTask>,
    onCloseTask:(WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask,Boolean) -> Unit,
) {
    LazyColumn(modifier = modifier){
        items(
            items = List,
            key = {task -> task.id}
            ){
            task -> WellnessTaskItem(taskName = task.label, checked = task.checked, onClose ={ onCloseTask(task)}, onCheckedChange = {checked -> onCheckedTask(task,checked)} )
        }
    }
}