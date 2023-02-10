package com.example.basicsstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// composable for water-counter
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp))
    {
        var count by rememberSaveable { mutableStateOf(0) }

        if (count > 0) {

            //text for showing number of waterCounter
            Text(
                text = "you've  had $count glasses.",
            )
        }

        //button for increasing glass
        Button(
            onClick = { count++ },
            enabled = (count < 10),
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Add one")
        }
    }


}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    WaterCounter()
}
