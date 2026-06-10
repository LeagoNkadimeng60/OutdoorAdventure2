package com.example.outdooradventure2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.outdooradventure2.ui.theme.OutdoorAdventure2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val itemName=arrayOf("Tent","Marshmallows","Flashligh" )
            val catergory=arrayOf("Shelter","Food","Safety")
            var quantity=arrayOf(1,3,2)
            OutdoorAdventure2Theme {
                Column() {
                    Button(
                        onClick = {}
                    ) {
                        Text("Item Name")
                    }
                    Button(
                        onClick = {}
                        ) {
                        Text("Item Catergory")
                    }


                }
            }
        }
    }







