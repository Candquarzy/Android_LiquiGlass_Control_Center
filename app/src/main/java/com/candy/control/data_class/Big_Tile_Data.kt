package com.candy.control.data_class

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Big_Tile_Data(
	val icon: ImageVector,
	val text: String,
	val padding: Dp = 16.dp
)

val Btd_List = listOf(
	Big_Tile_Data(
		icon = Icons.Rounded.Wifi,
		text = "WIFI",
		padding = 16.dp
	),
	Big_Tile_Data(
		icon = Icons.Rounded.SwapVert,
		text = "蜂窝网络",
		padding = 8.dp
	),
	Big_Tile_Data(
		icon = Icons.Rounded.Bluetooth,
		text = "蓝牙",
		padding = 8.dp
	),
	Big_Tile_Data(
		icon = Icons.Rounded.FlashlightOn,
		text = "手电筒"
	),
	Big_Tile_Data(
		icon = Icons.Rounded.Pets,
		text = "Clash",
		padding = 8.dp
	),
	Big_Tile_Data(
		icon = Icons.Rounded.Settings,
		text = "设置"
	)
)