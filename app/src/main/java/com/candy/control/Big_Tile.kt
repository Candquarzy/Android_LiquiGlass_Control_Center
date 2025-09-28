package com.candy.control

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Wifi
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.Backdrop

@Composable
fun Big_Tile(
	backdrop: Backdrop,
	icon: ImageVector,
	text: String,
	padding: Dp,
	color:Color = Color.White
	)
{
	LiquiGlass( //wifi
		backdrop = backdrop,
		Rounded = 64f,
		blur = 64f,
		size_width = 160f.dp,
		size_height = 80f.dp
	)
	{
		Row(
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center,
			modifier = Modifier.fillMaxSize()
		)
		{
			Icon(
				imageVector = icon,
				contentDescription = text,
				tint = color,
				modifier = Modifier.size(36.dp)
			)
			Text(
				text = text,
				color = color,
				fontWeight = FontWeight.SemiBold,
				fontSize = 16.sp,
				modifier = Modifier.padding(start = padding)
			)
		}
	}
}