package com.candy.control

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Airplay
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.SkipNext
import androidx.compose.material.icons.rounded.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.Backdrop

@Composable
fun Music_Player(
	backdrop: Backdrop
)
{
	LiquiGlass( //music player
		backdrop = backdrop,
		Rounded = 32f,
		blur = 8f,
		size_width = 160f.dp,
		size_height = 160f.dp,
		modifier = Modifier.padding(start = 8.dp)
	)
	{
		Column(
			verticalArrangement = Arrangement.SpaceEvenly,
			modifier = Modifier.fillMaxSize()
				.padding(horizontal = 16.dp, vertical = 12.dp)
		)
		{
			Row(
				verticalAlignment = Alignment.CenterVertically
			)
			{
				Image(
					painter = painterResource(R.drawable.azalea),
					contentDescription = "music pic",
					modifier = Modifier.size(36.dp)
						.clip(RoundedCornerShape(4.dp))
				)
				Column(
					modifier = Modifier.fillMaxWidth()
				)
				{
					Icon(
						imageVector = Icons.Rounded.Airplay,
						contentDescription = "airplay",
						tint = Color.White,
						modifier = Modifier.align(Alignment.End)
							.padding(end = 4.dp)
							.size(20.dp)
					)
				}
			}

			Row( //music name and aother

			)
			{
				Column(
					modifier = Modifier.padding(vertical = 8.dp)
				)
				{
					Text(
						text = "Azalea",
						color = Color.White,
						fontWeight = FontWeight.Bold,
						fontSize = 20.sp,
						modifier = Modifier.padding(bottom = 4.dp)
					)
					Text(
						text = "米津玄師",
						color = Color.White,
						fontWeight = FontWeight.SemiBold,
						fontSize = 12.sp
					)
				}
			}

			Row( //music control
				horizontalArrangement = Arrangement.SpaceEvenly,
				modifier = Modifier.fillMaxWidth()
			)
			{
				Icon(
					imageVector = Icons.Rounded.SkipPrevious,
					contentDescription = "previous",
					tint = Color.White,
					modifier = Modifier.size(30.dp)
				)
				Icon(
					imageVector = Icons.Rounded.Pause,
					contentDescription = "pause",
					tint = Color.White,
					modifier = Modifier.size(30.dp)
				)
				Icon(
					imageVector = Icons.Rounded.SkipNext,
					contentDescription = "next",
					tint = Color.White,
					modifier = Modifier.size(30.dp)
				)
			}
		}
	}
}