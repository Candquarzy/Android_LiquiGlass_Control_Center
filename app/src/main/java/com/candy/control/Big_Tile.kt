package com.candy.control

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.control.data_class.Big_Tile_Data
import com.candy.control.unit.LiquiGlass
import com.candy.control.unit.animateTop
import com.kyant.backdrop.Backdrop

@Composable
fun Big_Tile(
	backdrop: Backdrop,
	btd: Big_Tile_Data
	)
{
	LiquiGlass(
		backdrop = backdrop,
		Rounded = 64f,
		blur = 64f,
		size_width = 160f.dp,
		size_height = 80f.dp,
		modifier = Modifier.animateTop()
	)
	{
		Row(
			verticalAlignment = Alignment.CenterVertically,
			horizontalArrangement = Arrangement.Center,
			modifier = Modifier.fillMaxSize()
		)
		{
			Icon(
				imageVector = btd.icon,
				contentDescription = btd.text,
				tint = btd.color,
				modifier = Modifier.size(36.dp)
			)
			Text(
				text = btd.text,
				color = btd.color,
				fontWeight = FontWeight.SemiBold,
				fontSize = 16.sp,
				modifier = Modifier.padding(start = btd.padding)
			)
		}
	}
}