package com.candy.control.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.candy.control.data_class.Device_Tile_Data
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.Backdrop

@Composable
fun Device_Tile(
	backdrop: Backdrop,
	Dtd_List: Device_Tile_Data
)
{
	LiquiGlass(
		backdrop = backdrop,
		rounded = 108f,
		size_width = 54.dp,
		size_height = 54.dp,
		onDrawSurface = {
			drawRect(Color.White.copy(alpha = 0.5f))
		},
		blur = 16f
	)
	{
		Column(
			verticalArrangement = Arrangement.Center,
			horizontalAlignment = Alignment.CenterHorizontally,
			modifier = Modifier.fillMaxSize()
		)
		{
			Icon(
				imageVector = Dtd_List.icon,
				contentDescription = Dtd_List.text,
				tint = Dtd_List.color,
				modifier = Modifier.size(24.dp)
			)
		}
	}
}

//@Preview(backgroundColor = 0xFFFD81AC, showBackground = true)
//@Composable
//fun Device_Tile_Preview()
//{
//	Device_Tile(
//		backdrop = rememberLayerBackdrop()
//	)
//}