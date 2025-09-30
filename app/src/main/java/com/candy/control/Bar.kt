package com.candy.control

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.candy.control.unit.LiquiGlass
import com.candy.control.unit.animateTop
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop

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
		size_height = 160f.dp,
		modifier = Modifier.animateTop()
	)
	{

	}
}

@Preview(backgroundColor = 0xFFFD81AC, showBackground = true)
@Composable
fun Bar_Preview()
{
	Bar(
		backdrop = rememberLayerBackdrop()
	)
}