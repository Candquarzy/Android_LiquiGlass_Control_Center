package com.candy.control

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.candy.control.compose.Device_Tile
import com.candy.control.data_class.Dtd_List
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
			rounded = 48f,
			size_width = GetScreenWidthDp() - 56.dp,
			size_height = 140.dp,
			re_amount = 96f,
			re_height = 96f,
			onDrawSurface = {
				drawRect(Color.White.copy(alpha = 0.2f))
			},
			blur = 8f
		)
		{
			FlowRow(
				maxItemsInEachRow = 4,
				horizontalArrangement = Arrangement.SpaceEvenly,
				verticalArrangement = Arrangement.SpaceEvenly,
				modifier = Modifier.fillMaxSize()
			)
			{
				Dtd_List.forEachIndexed { index, data ->
					Device_Tile(
						backdrop = backdrop,
						Dtd_List[index]
					)
				}
			}
		}
	}
}

@Preview
@Composable
fun Device_Center_Preview()
{
	Device_Center(rememberLayerBackdrop())
}