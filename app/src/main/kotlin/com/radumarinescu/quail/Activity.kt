package com.radumarinescu.quail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.radumarinescu.quail.ui.theme.QuailTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuailTheme {}
        }
    }
}