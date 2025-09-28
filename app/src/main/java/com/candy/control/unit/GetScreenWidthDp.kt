package com.candy.control.unit

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GetScreenWidthDp(): Dp
{
	// 通过 LocalConfiguration 获取当前配置
	val configuration = LocalConfiguration.current

	// configuration.screenWidthDp 是一个 Int，表示屏幕的宽度（以 dp 为单位）
	// 通过 Dp(Int) 构造函数将其转换为 Jetpack Compose 的 Dp 类型
	val screenWidthDp = configuration.screenWidthDp.dp

	return screenWidthDp
}