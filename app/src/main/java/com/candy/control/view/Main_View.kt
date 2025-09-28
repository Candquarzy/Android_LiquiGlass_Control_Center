package com.candy.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Airplay
import androidx.compose.material.icons.rounded.Bluetooth
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.FlashlightOn
import androidx.compose.material.icons.rounded.Newspaper
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.Pets
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.SkipNext
import androidx.compose.material.icons.rounded.SkipPrevious
import androidx.compose.material.icons.rounded.SwapVert
import androidx.compose.material.icons.rounded.Wifi
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.candy.control.Bar
import com.candy.control.Big_Tile
import com.candy.control.Device_Center
import com.candy.control.Music_Player
import com.candy.control.R
import com.candy.control.Small_Tile
import com.candy.control.data_class.Std_List
import com.candy.control.unit.LiquiGlass
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.drawBackdrop
import com.kyant.backdrop.effects.blur
import com.kyant.backdrop.effects.refraction
import com.kyant.backdrop.effects.vibrancy

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
				Row( //one row wifi and internet
					horizontalArrangement = Arrangement.SpaceAround,
					modifier = Modifier.fillMaxWidth()
				)
				{
					Big_Tile( //wifi
						backdrop = backdrop,
						icon = Icons.Rounded.Wifi,
						text = "WIFI",
						padding = 10.dp
					)
					Big_Tile( //internet
						backdrop = backdrop,
						icon = Icons.Rounded.SwapVert,
						text = "蜂窝网络",
						padding = 8.dp
					)
				}

				Row( //two row bluetouch and light
					horizontalArrangement = Arrangement.SpaceAround,
					modifier = Modifier.fillMaxWidth()
						.padding(vertical = 16.dp)
				)
				{
					Big_Tile( //bluetouch
						backdrop = backdrop,
						icon = Icons.Rounded.Bluetooth,
						text = "蓝牙",
						padding = 8.dp
					)
					Big_Tile( //light
						backdrop = backdrop,
						icon = Icons.Rounded.FlashlightOn,
						text = "手电筒",
						padding = 16.dp
					)
				}

				Row( //three row crash and settings
					horizontalArrangement = Arrangement.SpaceAround,
					modifier = Modifier.fillMaxWidth()
				)
				{
					Big_Tile( //crash
						backdrop = backdrop,
						icon = Icons.Rounded.Pets,
						text = "Clash",
						padding = 8.dp
					)
					Big_Tile( //settings
						backdrop = backdrop,
						icon = Icons.Rounded.Settings,
						text = "设置",
						padding = 16.dp
					)
				}

				Row( //music player and volume/light bar
					horizontalArrangement = Arrangement.SpaceBetween,
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
//						.padding(horizontal = 16.dp)
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