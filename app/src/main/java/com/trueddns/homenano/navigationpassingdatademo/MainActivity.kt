package com.trueddns.homenano.navigationpassingdatademo

//https://youtu.be/OgYfQNbl0ts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trueddns.homenano.navigationpassingdatademo.ui.theme.NavigationPassingDataDemoTheme

class MainActivity : ComponentActivity() {

    private val users = listOf(
        User(1,"Kyle"),
        User(2,"Adriana"),
        User(3,"Andre"),
        User(4,"Xavier"),
        User(5,"Mya")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation(users = users)
        }
    }
}

