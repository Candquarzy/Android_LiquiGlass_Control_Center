package com.candy.control.data_class

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Device_Tile_Data(
	val icon: ImageVector,
	val text: String,
	val color: Color = Color.White
)

val Dtd_List = listOf(
	Device_Tile_Data(
		icon = Icons.Rounded.Watch,
		text= "手表"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.Tv,
		text= "电视"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.Light,
		text= "灯"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.DeviceThermostat,
		text= "温度计"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.Air,
		text= "空气状态"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.Router,
		text= "路由器"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.CreditCard,
		text= "钱包"
	),
	Device_Tile_Data(
		icon = Icons.Rounded.MoreHoriz,
		text= "更多"
	)
)