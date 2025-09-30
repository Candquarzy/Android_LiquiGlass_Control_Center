package com.candy.control

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.candy.control.data_class.Small_Tile_Data
import com.candy.control.unit.LiquiGlass
import com.candy.control.unit.animateTop
import com.kyant.backdrop.Backdrop

@Composable
fun Small_Tile(
	backdrop: Backdrop,
	std: Small_Tile_Data
)
{
	LiquiGlass(
		backdrop = backdrop,
		size_width = 60.dp,
		size_height = 60.dp,
		Rounded = 48f,
		modifier = Modifier.animateTop()
	)
	{
		Box(
			contentAlignment = Alignment.Center,
			modifier = Modifier.fillMaxSize()
		)
		{
			Icon(
				imageVector = std.icon,
				contentDescription = std.text,
				tint = std.color,
				modifier = Modifier.size(std.size)
			)
		}
	}
}

//@Preview(backgroundColor = 0xFFFD81AC, showBackground = true)
//@Composable
//fun Small_Tile_Preview()
//{
//	Small_Tile(rememberLayerBackdrop())
//}