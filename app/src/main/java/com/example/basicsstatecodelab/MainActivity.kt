package com.example.basicsstatecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicsstatecodelab.ui.theme.BasicsStateCodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsStateCodeLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    WellnessScreen()
                }
            }
        }
    }
}





// composable for water-counter
@Composable
fun WaterCounter(modifier: Modifier = Modifier){

    Column(modifier = modifier.padding(16.dp))
    {
        var count = 0
        //text for showing number of waterCounter
        Text(
            text = "you've  had $count glasses.",
        )
        Button(
            onClick = { count++ },
            modifier = modifier.padding(top = 8.dp)
        ) {
            Text(text = "Add one")
        }
    }
}
// preview for waterCounter
//@Preview(showBackground = true)
@Composable
fun WaterCounterPreview(){
    WaterCounter( )
}

//Composable for wellnessScreen
@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    WaterCounter(modifier)
}

//Preview of WellnessScreen
@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(){
    WellnessScreen()
}