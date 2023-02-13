package com.example.basicsstatecodelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

// data model of wellness task item
 class WellnessTask(
    val id: Int,
    val label: String,
    val initialCheck: Boolean = false
){
    var checked by mutableStateOf(initialCheck)
}
