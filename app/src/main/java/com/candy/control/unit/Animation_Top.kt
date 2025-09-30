package com.candy.control.unit

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.util.lerp
import kotlinx.coroutines.launch

fun Modifier.animateTop(
	//from Google Gemini
	onClick: () -> Unit = {},
	// contentModifier 参数保留，并继续使用默认值 { this }
	contentModifier: @Composable Modifier.() -> Modifier = { this }
): Modifier = composed{
	//from https://kyant.gitbook.io/backdrop/tutorials/interactive-glass
	val animationScope = rememberCoroutineScope()
	// 【关键】定义交互源，用于传入 clickable 和 pointerInput
	val interactionSource = remember { MutableInteractionSource() }
	val progressAnimation = remember { Animatable(0f) }

	return@composed this
		.graphicsLayer {
			val progress = progressAnimation.value
			val scale = lerp(1f, 1.1f, progress)
			scaleX = scale
			scaleY = scale
		}
		.clickable(
			interactionSource = interactionSource, // 传入 InteractionSource
			indication = null,                   // <--- 禁用默认的变暗和涟漪效果！
			onClick = onClick
		)
		.pointerInput(animationScope) {
			val animationSpec = spring(0.5f, 300f, 0.001f)
			awaitEachGesture {
				// press
				awaitFirstDown()
				animationScope.launch {
					progressAnimation.animateTo(1f, animationSpec)
				}

				// release
				waitForUpOrCancellation()
				animationScope.launch {
					progressAnimation.animateTo(0f, animationSpec)
				}
			}
		}
}