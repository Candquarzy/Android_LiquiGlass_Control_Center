package com.candy.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.candy.control.Device_Center
import com.candy.control.R
import com.candy.control.compose.Bar
import com.candy.control.compose.Big_Tile
import com.candy.control.compose.Music_Player
import com.candy.control.compose.Small_Tile
import com.candy.control.data_class.Btd_List
import com.candy.control.data_class.Std_List
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.drawBackdrop

@Composable
fun Main_View()
{
	val backdrop = rememberLayerBackdrop()
	val scrollState = rememberScrollState()

	Box(
		modifier = Modifier.fillMaxSize()
	)
	{
		Image(
			painter = painterResource(id = R.drawable.background),
			contentDescription = "background img",
			contentScale = ContentScale.Crop,
			modifier = Modifier.fillMaxSize()
				.layerBackdrop(backdrop)
		)

		Box(
			modifier = Modifier.fillMaxSize()
				.drawBackdrop(
					backdrop = backdrop,
					shape = { RectangleShape }
				)
		)
		{
			Column( //the page
				modifier = Modifier.padding(top = 64.dp, start = 24.dp, end = 24.dp)
					.verticalScroll(scrollState)
			)
			{
				FlowRow(
					maxItemsInEachRow = 2,
					horizontalArrangement = Arrangement.SpaceAround,
					verticalArrangement = Arrangement.spacedBy(16.dp),
					modifier = Modifier.fillMaxWidth()
				)
				{
					Btd_List.forEachIndexed { index, data ->
						Big_Tile(
							backdrop = backdrop,
							Btd_List[index]
						)
					}
				}

				Row( //music player and volume/light bar
					horizontalArrangement = Arrangement.SpaceAround,
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.fillMaxWidth()
						.padding(top = 24.dp, bottom = 24.dp)
				)
				{
					Music_Player(backdrop)

					Column(
						modifier = Modifier.padding(start = 4.dp, end = 8.dp)
							.size(160f.dp, 160f.dp)
					)
					{
						Row( //bar
							horizontalArrangement = Arrangement.SpaceEvenly,
							modifier = Modifier.fillMaxWidth()
						)
						{
							Bar(backdrop)
							Bar(backdrop)
						}
					}
				}

				Device_Center(backdrop)

				FlowRow(
					maxItemsInEachRow = 4,
					horizontalArrangement = Arrangement.SpaceAround,
					verticalArrangement = Arrangement.spacedBy(16.dp),
					modifier = Modifier.fillMaxWidth()
				)
				{
					Std_List.forEachIndexed { index, data ->
						Small_Tile(
							backdrop = backdrop,
							Std_List[index]
						)
					}
				}

				Spacer(
					modifier = Modifier.size(48.dp)
				)
			}
		}
	}
}

@Preview
@Composable
fun Main_Pre()
{
	Main_View()
}