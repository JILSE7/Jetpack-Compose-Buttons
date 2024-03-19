package com.example.botonesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.botonesapp.components.DarkModeButton
import com.example.botonesapp.components.FloatingAction
import com.example.botonesapp.components.IconButton
import com.example.botonesapp.components.NormalButton
import com.example.botonesapp.components.NormalButton2
import com.example.botonesapp.components.OutlineButton
import com.example.botonesapp.components.Space
import com.example.botonesapp.components.SwithButton
import com.example.botonesapp.components.TextButton
import com.example.botonesapp.ui.theme.BotonesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember {
                mutableStateOf(false)
            }
            BotonesAppTheme(darkTheme = darkMode.value) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>) {

    Column(
        modifier = Modifier
            .fillMaxWidth() /*OCUPAR TOD_O EL ANCHO*/
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalButton()
        Space()
        NormalButton2()
        Space()
        TextButton()
        Space()
        OutlineButton()
        Space()
        IconButton()
        Space()
        SwithButton()
        Space()
        DarkModeButton(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}

