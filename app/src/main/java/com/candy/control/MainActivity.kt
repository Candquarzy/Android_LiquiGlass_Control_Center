package com.candy.control

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.candy.control.ui.theme.Control_CenterTheme
import com.candy.control.view.Main_View

class MainActivity : ComponentActivity()
{
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			Control_CenterTheme {
//				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//					Greeting(
//						name = "Android",
//						modifier = Modifier.padding(innerPadding)
//					)
//				}
				Main_View()
			}
		}
	}
}