package com.example.basicsstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel: ViewModel() {
    private val  _tasks =  getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
       get() = _tasks

    fun remove(item: WellnessTask){
        _tasks.remove(item)
    }

}


//list of all the task item
private fun getWellnessTasks() = List(30){i -> WellnessTask(id = i, label = "task # $i ")}