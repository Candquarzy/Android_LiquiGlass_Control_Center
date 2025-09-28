package com.candy.control

import android.health.connect.datatypes.Device
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.candy.control.unit.GetScreenWidthDp
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop

@Composable
fun Device_Center(
	backdrop: Backdrop
)
{
	Row(
		horizontalArrangement = Arrangement.Center,
		modifier = Modifier.fillMaxWidth()
			.padding(bottom = 24.dp)
	)
	{
		LiquiGlass(
			backdrop = backdrop,
			Rounded = 48f,
			size_width = GetScreenWidthDp() - 56.dp,
			size_height = 140.dp,
			re_amount = 96f,
			re_height = 96f,
			onDrawSurface = {
				drawRect(Color.White.copy(alpha = 0.5f))
			},
			blur = 12f
		)
		{

		}
	}
}

@Preview
@Composable
fun Device_Center_Preview()
{
	Device_Center(rememberLayerBackdrop())
}