package com.candy.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bluetooth
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.FlashlightOn
import androidx.compose.material.icons.rounded.Pets
import androidx.compose.material.icons.rounded.Settings
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
import com.candy.control.R
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
								imageVector = Icons.Rounded.Wifi,
								contentDescription = "wifi",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "WIFI",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 16.dp)
							)
						}
					}

					LiquiGlass( //internet
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
								imageVector = Icons.Rounded.SwapVert,
								contentDescription = "internet",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "蜂窝网络",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 8.dp)
							)
						}
					}
				}

				Row( //two row bluetouch and light
					horizontalArrangement = Arrangement.SpaceAround,
					modifier = Modifier.fillMaxWidth()
						.padding(vertical = 16.dp)
				)
				{
					LiquiGlass( //bluetoch
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
								imageVector = Icons.Rounded.Bluetooth,
								contentDescription = "bluetooth",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "蓝牙",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 8.dp)
							)
						}
					}

					LiquiGlass( //light
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
								imageVector = Icons.Rounded.FlashlightOn,
								contentDescription = "flashlight",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "手电筒",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 16.dp)
							)
						}
					}
				}

				Row( //three row crash and settings
					horizontalArrangement = Arrangement.SpaceAround,
					modifier = Modifier.fillMaxWidth()
				)
				{
					LiquiGlass( //crash
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
								imageVector = Icons.Rounded.Pets,
								contentDescription = "crash",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "Clash",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 8.dp)
							)
						}
					}

					LiquiGlass( //settings
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
								imageVector = Icons.Rounded.Settings,
								contentDescription = "settings",
								tint = Color.White,
								modifier = Modifier.size(36.dp)
							)
							Text(
								text = "设置",
								color = Color.White,
								fontWeight = FontWeight.SemiBold,
								fontSize = 16.sp,
								modifier = Modifier.padding(start = 24.dp)
							)
						}
					}
				}

				Row( //music player and volume/light bar
					horizontalArrangement = Arrangement.SpaceBetween,
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.fillMaxWidth()
						.padding(top = 24.dp, bottom = 16.dp)
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

					}

					Column(
						modifier = Modifier.padding(horizontal = 16.dp)
							.size(160f.dp, 160f.dp)
					)
					{
						Row(
							horizontalArrangement = Arrangement.SpaceAround,
							modifier = Modifier.fillMaxWidth()
								.padding(start = 8.dp)
						)
						{
							LiquiGlass( //light bar
								backdrop = backdrop,
								Rounded = 32f,
								blur = 8f,
								size_width = 60f.dp,
								size_height = 160f.dp
							)
							{

							}
							LiquiGlass( //volume bar
								backdrop = backdrop,
								Rounded = 32f,
								blur = 8f,
								size_width = 60f.dp,
								size_height = 160f.dp
							)
							{

							}
						}
					}
				}
			}



//			Box(
//				 modifier = Modifier.align(Alignment.Center)
//					 .size(320f.dp, 180f.dp)
//					 .drawBackdrop(
//						 backdrop = backdrop,
//						 shape = {
//							 RoundedCornerShape(32f.dp)
//						 },
//						 effects = {
//							 vibrancy()
//							 blur(16f.dp.toPx())
//							 refraction(
//								 height = 24f.dp.toPx(),
//								 amount = 48f.dp.toPx(),
//								 hasDepthEffect = true
//							 )
//						 },
//						 onDrawSurface = {
//							 drawRect(Color.White.copy(alpha = 0.3f))
//						 }
//					 )
//			)
		}
	}
}

@Preview
@Composable
fun Main_Pre()
{
	Main_View()
}