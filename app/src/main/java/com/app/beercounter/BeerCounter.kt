package com.app.beercounter

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable

fun BeerCounter(modifier: Modifier = Modifier ){

    Column (modifier = Modifier.padding(16.dp)){



    var  count by remember { mutableStateOf(0) }

    Text(text = " I have had $count cans of beer")
        
        Button(onClick = { count++}, modifier = Modifier.padding(8.dp)) {
            
            Text(text = "Add one")
            
        }
    }

}