package com.maxrave.simpmusic.ui.motion

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsLayerScope
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.math.cos
import kotlin.math.sin

/*
 * Personal fork: every vector icon in the app moves. Files import this `Icon` in place of
 * material3's (same signatures), so each SimpIcons glyph gets
 *  - a small motion of its own when the pointer comes over it (desktop), picked by its name, and
 *  - an animated swap when the icon itself changes (play ⇄ pause turns over, a heart that fills
 *    pops and throws sparks), on every platform.
 * Painter and bitmap icons pass straight through.
 */

private enum class HoverMotion { Spin, Tilt, Bounce, NudgeRight, NudgeLeft, Flip, Turn, Drop, Shake, Pop, Close, Grow }

private fun motionFor(name: String): HoverMotion =
    when (name) {
        "Settings", "Tune" -> HoverMotion.Spin
        "Search" -> HoverMotion.Tilt
        "Home", "LibraryMusic", "Person", "PersonAdd", "Notifications" -> HoverMotion.Bounce
        "SkipNext", "ArrowForwardIos", "KeyboardDoubleArrowRight", "FastForward", "Forward5", "OpenInNew", "ArrowOutward", "Send" -> HoverMotion.NudgeRight
        "SkipPrevious", "ArrowBackIosNew", "KeyboardDoubleArrowLeft", "FastRewind", "Replay5" -> HoverMotion.NudgeLeft
        "Shuffle", "CompareArrows" -> HoverMotion.Flip
        "Repeat", "RepeatOne", "Refresh", "Sync", "CloudSync", "Replay", "RestartAlt", "Restore", "Update" -> HoverMotion.Turn
        "Download", "DownloadForOffline", "DownloadForOfflineOutlined", "Downloading", "KeyboardArrowDown", "KeyboardDoubleArrowDown", "Save" -> HoverMotion.Drop
        "VolumeUp", "VolumeDown", "VolumeOff", "Lyrics", "MicOff", "Speaker" -> HoverMotion.Shake
        "Favorite", "FavoriteBorder", "Star", "StarBorder", "ThumbUp", "ThumbUpOutline", "ThumbDown", "ThumbDownOutline", "Add", "AddCircleOutline", "PlaylistAdd" -> HoverMotion.Pop
        "Close" -> HoverMotion.Close
        else -> HoverMotion.Grow
    }

private val transportNames = setOf("PlayArrow", "Pause", "PlayCircle", "PauseCircle")
private val sparkNames = setOf("Favorite", "Star", "ThumbUp", "ThumbDown")

/** 0 → 1 → 0 over the motion. */
private fun bump(p: Float) = sin(PI.toFloat() * p)

private fun GraphicsLayerScope.applyHover(
    motion: HoverMotion,
    p: Float,
) {
    if (p <= 0f || p >= 1f) return
    val b = bump(p)
    when (motion) {
        HoverMotion.Spin -> rotationZ += 180f * FastOutSlowInEasing.transform(p)
        HoverMotion.Tilt -> {
            rotationZ += -16f * b
            scaleX *= 1f + 0.08f * b
            scaleY *= 1f + 0.08f * b
        }
        HoverMotion.Bounce -> translationY += -3.dp.toPx() * b
        HoverMotion.NudgeRight -> translationX += 3.dp.toPx() * b
        HoverMotion.NudgeLeft -> translationX += -3.dp.toPx() * b
        HoverMotion.Flip -> scaleY *= cos(2f * PI.toFloat() * p)
        HoverMotion.Turn -> rotationZ += 360f * FastOutSlowInEasing.transform(p)
        HoverMotion.Drop -> translationY += 3.dp.toPx() * b
        HoverMotion.Shake -> rotationZ += 12f * sin(4f * PI.toFloat() * p) * (1f - p)
        HoverMotion.Pop -> {
            scaleX *= 1f + 0.22f * b
            scaleY *= 1f + 0.22f * b
        }
        HoverMotion.Close -> rotationZ += 90f * b
        HoverMotion.Grow -> {
            scaleX *= 1f + 0.12f * b
            scaleY *= 1f + 0.12f * b
        }
    }
}

@Composable
fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    val name = imageVector.name
    val motion = remember(name) { motionFor(name) }
    val hoverSource = remember { MutableInteractionSource() }
    val hovered by hoverSource.collectIsHoveredAsState()
    val hover = remember { Animatable(0f) }
    LaunchedEffect(hovered) {
        if (hovered && !hover.isRunning) {
            hover.snapTo(0f)
            hover.animateTo(1f, tween(if (motion == HoverMotion.Spin || motion == HoverMotion.Turn) 700 else 480))
            hover.snapTo(0f)
        }
    }

    // The swap: runs when this icon is replaced by another (play ⇄ pause, heart ⇄ filled heart).
    val swap = remember { Animatable(1f) }
    val spark = remember { Animatable(0f) }
    val previous = remember { arrayOf(name) }
    LaunchedEffect(name) {
        val from = previous[0]
        previous[0] = name
        if (from == name) return@LaunchedEffect
        if (name in sparkNames) {
            swap.snapTo(0.55f)
            spark.snapTo(0f)
            coroutineScope {
                launch { spark.animateTo(1f, tween(520)) }
                swap.animateTo(1f, spring(dampingRatio = 0.35f, stiffness = Spring.StiffnessMediumLow))
            }
            spark.snapTo(0f)
        } else {
            swap.snapTo(0f)
            swap.animateTo(1f, spring(dampingRatio = 0.6f, stiffness = Spring.StiffnessMedium))
        }
    }
    val transport = name in transportNames

    androidx.compose.material3.Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint,
        modifier =
            modifier
                .hoverable(hoverSource)
                .drawWithContent {
                    drawContent()
                    val s = spark.value
                    if (s > 0f && s < 1f) {
                        val c = Offset(size.width / 2f, size.height / 2f)
                        val reach = size.minDimension * (0.45f + 0.55f * s)
                        val color = if (tint == Color.Unspecified) Color(0xFFFF6B8B) else tint
                        for (i in 0 until 8) {
                            val a = (i / 8f) * 2f * PI.toFloat() + 0.3f
                            drawCircle(
                                color = color.copy(alpha = (1f - s) * 0.9f),
                                radius = size.minDimension * 0.07f * (1f - s * 0.6f),
                                center = Offset(c.x + cos(a) * reach, c.y + sin(a) * reach),
                            )
                        }
                    }
                }.graphicsLayer {
                    val w = swap.value
                    if (w < 1f || w > 1f) {
                        if (transport) {
                            rotationZ = -90f * (1f - w)
                            scaleX = 0.5f + 0.5f * w
                            scaleY = 0.5f + 0.5f * w
                            alpha = w.coerceIn(0f, 1f)
                        } else if (name in sparkNames) {
                            scaleX = w
                            scaleY = w
                        } else {
                            scaleX = 0.8f + 0.2f * w
                            scaleY = 0.8f + 0.2f * w
                            alpha = (0.4f + 0.6f * w).coerceIn(0f, 1f)
                        }
                    }
                    applyHover(motion, hover.value)
                },
    )
}

@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) = androidx.compose.material3.Icon(painter, contentDescription, modifier, tint)

@Composable
fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) = androidx.compose.material3.Icon(bitmap, contentDescription, modifier, tint)
