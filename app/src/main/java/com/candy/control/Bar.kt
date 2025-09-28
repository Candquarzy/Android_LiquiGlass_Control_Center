package com.candy.control

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.Backdrop

@Composable
fun Bar(
	backdrop: Backdrop
)
{
	LiquiGlass( //light bar
		backdrop = backdrop,
		Rounded = 32f,
		blur = 8f,
		size_width = 60f.dp,
		size_height = 160f.dp
	)
	{

	}
}