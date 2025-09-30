package com.candy.control.data_class

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Small_Tile_Data(
	val icon: ImageVector,
	val text: String,
	val size: Dp = 36.dp,
	val color: Color = Color.White
)


val Std_List = listOf(
	Small_Tile_Data(
		icon = Icons.Rounded._5g,
		text = "5G"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Videocam,
		text = "屏幕录制"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.GridView,
		text = "运行中的应用"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Screenshot,
		text = "截屏"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Lock,
		text = "锁屏"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.LocationOn,
		text = "定位"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Nfc,
		text = "NFC"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Contrast,
		text = "极暗"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.BrightnessAuto,
		text = "自动亮度"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Bed,
		text = "勿扰模式"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.AirplanemodeActive,
		text = "飞行模式"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.BatterySaver,
		text = "省电模式"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.WbSunny,
		text = "阳光模式"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Translate,
		text = "翻译"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.LockReset,
		text = "屏幕旋转"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.NotificationsOff,
		text = "静音"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.SurroundSound,
		text = "杜比全景声"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.Search,
		text = "搜索"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.AddLink,
		text = "热点"
	),
	Small_Tile_Data(
		icon = Icons.Rounded.QrCodeScanner,
		text = "扫一扫"
	)
)

