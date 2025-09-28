package com.candy.control.unit

import android.graphics.drawable.shapes.Shape
import android.view.RoundedCorner
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.drawBackdrop
import com.kyant.backdrop.effects.blur
import com.kyant.backdrop.effects.refraction
import com.kyant.backdrop.effects.vibrancy

@Composable
fun LiquiGlass(
	backdrop: Backdrop,
	Rounded:Float = 32f,
	modifier: Modifier = Modifier,
	blur: Float = 0f,
	re_height: Float = 24f,
	re_amount: Float = 48f,
	size_width: Dp,
	size_height:Dp,
	hasDepthEffect:  Boolean = true,
	onDrawSurface: (DrawScope.() -> Unit)? = { drawRect(Color.White.copy(alpha = 0.3f)) },
	content: (@Composable () -> Unit)? = null
)
{
	Box(
		modifier = modifier.size(size_width,size_height)
			.drawBackdrop(
				backdrop = backdrop,
				shape = {
					RoundedCornerShape(Rounded)
				},
				effects = {
					vibrancy()
					blur(blur)
					refraction(
						re_height,
						re_amount,
						hasDepthEffect
					)
				},
				onDrawSurface = onDrawSurface,
			)
	)
	{
		content?.let { it() }
	}
}