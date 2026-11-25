package com.maxrave.simpmusic.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/** Personal fork: the progress gradient shared by the island, the capsule and the player (cyan → violet). */
val GlowTrackBrush = Brush.horizontalGradient(listOf(Color(0xFF9EE7FF), Color(0xFFB98CFF)))

/**
 * Personal fork: a progress track with a glowing bead at the playhead — the same look as the
 * Dynamic Island's seek bar. Drawn as a Slider `track`: the bar is clipped round at both ends, and
 * the bead (white, with a soft halo) is drawn over it at [fraction], free to spill past the bar's
 * height. [dotRadius] 0 hides the bead.
 */
@Composable
fun GlowTrack(
    fraction: Float,
    height: Dp,
    inactiveColor: Color,
    modifier: Modifier = Modifier,
    activeBrush: Brush = GlowTrackBrush,
    dotRadius: Dp = 5.dp,
) {
    val f = fraction.coerceIn(0f, 1f)
    Box(
        modifier
            .fillMaxWidth()
            .height(height)
            .drawWithContent {
                drawContent()
                val r = dotRadius.toPx()
                if (r > 0f) {
                    val center = Offset((size.width * f).coerceIn(r, size.width - r), size.height / 2f)
                    drawCircle(Color.White.copy(alpha = 0.22f), radius = r + 4.dp.toPx(), center = center)
                    drawCircle(Color.White, radius = r, center = center)
                }
            },
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(height)
                .clip(RoundedCornerShape(percent = 50))
                .background(inactiveColor),
        ) {
            Box(Modifier.fillMaxHeight().fillMaxWidth(f).background(activeBrush))
        }
    }
}
