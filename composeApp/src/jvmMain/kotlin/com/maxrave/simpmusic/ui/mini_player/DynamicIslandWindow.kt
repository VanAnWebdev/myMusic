package com.maxrave.simpmusic.ui.mini_player

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberWindowState
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil3.compose.AsyncImage
import com.maxrave.simpmusic.ui.component.DesktopGlass
import com.maxrave.simpmusic.ui.icon.Close
import com.maxrave.simpmusic.ui.icon.Favorite
import com.maxrave.simpmusic.ui.icon.FavoriteBorder
import com.maxrave.simpmusic.ui.icon.OpenInFull
import com.maxrave.simpmusic.ui.icon.Pause
import com.maxrave.simpmusic.ui.icon.PlayArrow
import com.maxrave.simpmusic.ui.icon.SimpIcons
import com.maxrave.simpmusic.ui.icon.SkipNext
import com.maxrave.simpmusic.ui.icon.SkipPrevious
import com.maxrave.simpmusic.ui.motion.Icon
import com.maxrave.simpmusic.viewModel.SharedViewModel
import com.maxrave.simpmusic.viewModel.UIEvent
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import simpmusic.composeapp.generated.resources.Res
import simpmusic.composeapp.generated.resources.circle_app_icon
import java.awt.GraphicsEnvironment

/*
 * Personal fork: the mini player as a Dynamic Island — a black pill at the top centre of the screen,
 * always on top. Small, it shows the cover, the title and a little equalizer; with the pointer over
 * it, it grows into a card with the cover, title, artist, a seek bar and the controls, and shrinks
 * back a moment after the pointer leaves. Idea from Apple's Dynamic Island and, on Windows,
 * Atoll (github.com/Fuwni/dynamic-island-windows, MIT) — the code here is our own, in Compose.
 *
 * The window itself is resized with the island (grown before it opens, shrunk after it closes), so
 * the transparent margin around the pill never sits over other apps' clicks.
 */

private val CompactSize = DpSize(250.dp, 38.dp)
private val ExpandedSize = DpSize(400.dp, 168.dp)

/** Transparent room around the pill, so its shadow-free rounded edges are not clipped by the window. */
private val WindowMargin = 6.dp
private const val TOP_GAP_DP = 8

@Composable
fun DynamicIslandWindow(
    sharedViewModel: SharedViewModel,
    onOpenApp: () -> Unit,
    onCloseRequest: () -> Unit,
) {
    val screen = remember { GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds }
    var expanded by remember { mutableStateOf(false) }
    // The window's size follows the island: bigger at once when opening, smaller only once closed.
    var windowContent by remember { mutableStateOf(CompactSize) }

    fun windowFor(content: DpSize) = DpSize(content.width + WindowMargin * 2, content.height + WindowMargin * 2)

    val windowState =
        rememberWindowState(
            placement = WindowPlacement.Floating,
            size = windowFor(CompactSize),
            position =
                WindowPosition(
                    (screen.x + (screen.width - windowFor(CompactSize).width.value) / 2f).dp,
                    (screen.y + TOP_GAP_DP).dp,
                ),
        )
    LaunchedEffect(windowContent) {
        val size = windowFor(windowContent)
        windowState.size = size
        windowState.position = WindowPosition((screen.x + (screen.width - size.width.value) / 2f).dp, (screen.y + TOP_GAP_DP).dp)
    }

    val islandWidth by animateDpAsState(
        if (expanded) ExpandedSize.width else CompactSize.width,
        spring(dampingRatio = 0.72f, stiffness = Spring.StiffnessMediumLow),
        label = "islandWidth",
    ) { if (!expanded) windowContent = CompactSize }
    val islandHeight by animateDpAsState(
        if (expanded) ExpandedSize.height else CompactSize.height,
        spring(dampingRatio = 0.72f, stiffness = Spring.StiffnessMediumLow),
        label = "islandHeight",
    )
    val corner by animateDpAsState(if (expanded) 34.dp else 19.dp, tween(260), label = "islandCorner")

    Window(
        onCloseRequest = onCloseRequest,
        title = "Nhạc Nhẽo - Island",
        icon = painterResource(Res.drawable.circle_app_icon),
        alwaysOnTop = true,
        undecorated = true,
        transparent = true,
        resizable = false,
        focusable = false,
        state = windowState,
    ) {
        val nowPlaying by sharedViewModel.nowPlayingScreenData.collectAsStateWithLifecycle()
        val controller by sharedViewModel.controllerState.collectAsStateWithLifecycle()
        val timeline by sharedViewModel.timeline.collectAsStateWithLifecycle()

        val hover = remember { MutableInteractionSource() }
        val hovered by hover.collectIsHoveredAsState()
        LaunchedEffect(hovered) {
            if (hovered) {
                windowContent = ExpandedSize
                expanded = true
            } else {
                // A short grace period, so brushing past the edge does not snap it shut.
                delay(650)
                expanded = false
            }
        }

        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
            Box(
                Modifier
                    .padding(top = WindowMargin)
                    .size(islandWidth, islandHeight)
                    .clip(RoundedCornerShape(corner))
                    .background(Color(0xFF07070A))
                    .hoverable(hover),
            ) {
                // Glass, as in the app: the playing cover blurred behind a dark tint, a sheen on top
                // and a lit rim (DesktopGlass), so the island reads as the same material.
                if (!nowPlaying.thumbnailURL.isNullOrBlank()) {
                    AsyncImage(
                        model = nowPlaying.thumbnailURL,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier =
                            Modifier
                                .matchParentSize()
                                .graphicsLayer {
                                    scaleX = 1.4f
                                    scaleY = 1.4f
                                }.blur(28.dp, BlurredEdgeTreatment.Rectangle),
                    )
                }
                Box(Modifier.matchParentSize().background(Color.Black.copy(alpha = 0.52f)))
                Box(
                    Modifier
                        .matchParentSize()
                        .background(DesktopGlass.sheen)
                        .border(1.dp, DesktopGlass.rim, RoundedCornerShape(corner)),
                )
                // Compact row
                AnimatedVisibility(!expanded, enter = fadeIn(tween(220, delayMillis = 120)), exit = fadeOut(tween(90))) {
                    Row(
                        Modifier.fillMaxSize().padding(horizontal = 7.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Cover(nowPlaying.thumbnailURL, 26, CircleShape)
                        Spacer(Modifier.width(10.dp))
                        Text(
                            nowPlaying.nowPlayingTitle.ifBlank { "Nhạc Nhẽo" },
                            color = Color.White,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            modifier = Modifier.weight(1f).basicMarquee(iterations = Int.MAX_VALUE),
                        )
                        Spacer(Modifier.width(10.dp))
                        EqualizerBars(playing = controller.isPlaying)
                        Spacer(Modifier.width(6.dp))
                    }
                }
                // Expanded card
                AnimatedVisibility(expanded, enter = fadeIn(tween(240, delayMillis = 140)), exit = fadeOut(tween(100))) {
                    Column(Modifier.fillMaxSize().padding(horizontal = 18.dp, vertical = 14.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(Modifier.clickable { onOpenApp() }) {
                                Cover(nowPlaying.thumbnailURL, 56, RoundedCornerShape(14.dp))
                            }
                            Spacer(Modifier.width(14.dp))
                            Column(Modifier.weight(1f)) {
                                Text(
                                    nowPlaying.nowPlayingTitle.ifBlank { "Nhạc Nhẽo" },
                                    color = Color.White,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    modifier = Modifier.basicMarquee(iterations = Int.MAX_VALUE),
                                )
                                Text(
                                    nowPlaying.artistName,
                                    color = Color.White.copy(alpha = 0.6f),
                                    fontSize = 13.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            EqualizerBars(playing = controller.isPlaying, tall = true)
                        }
                        Spacer(Modifier.height(12.dp))
                        SeekBar(
                            current = timeline.current,
                            total = timeline.total,
                            onSeek = { sharedViewModel.onUIEvent(UIEvent.UpdateProgress(it)) },
                        )
                        Spacer(Modifier.height(6.dp))
                        Row(
                            Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            IslandButton(if (controller.isLiked) SimpIcons.Favorite else SimpIcons.FavoriteBorder, 20, if (controller.isLiked) Color(0xFFFF4D6D) else Color.White) {
                                sharedViewModel.onUIEvent(UIEvent.ToggleLike)
                            }
                            Row(horizontalArrangement = Arrangement.spacedBy(18.dp), verticalAlignment = Alignment.CenterVertically) {
                                IslandButton(SimpIcons.SkipPrevious, 22) { sharedViewModel.onUIEvent(UIEvent.Previous) }
                                IslandButton(if (controller.isPlaying) SimpIcons.Pause else SimpIcons.PlayArrow, 30) {
                                    sharedViewModel.onUIEvent(UIEvent.PlayPause)
                                }
                                IslandButton(SimpIcons.SkipNext, 22) { sharedViewModel.onUIEvent(UIEvent.Next) }
                            }
                            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                IslandButton(SimpIcons.OpenInFull, 17, Color.White.copy(alpha = 0.7f)) { onOpenApp() }
                                IslandButton(SimpIcons.Close, 17, Color.White.copy(alpha = 0.7f)) { onCloseRequest() }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Cover(
    url: String?,
    size: Int,
    shape: androidx.compose.ui.graphics.Shape,
) {
    Box(Modifier.size(size.dp).clip(shape).background(Color.White.copy(alpha = 0.12f))) {
        if (!url.isNullOrBlank()) {
            AsyncImage(model = url, contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
        }
    }
}

/** Four bars that dance while music plays and settle low when it stops, like the island's waveform. */
@Composable
private fun EqualizerBars(
    playing: Boolean,
    tall: Boolean = false,
) {
    val transition = rememberInfiniteTransition(label = "islandEq")
    val height = if (tall) 22.dp else 16.dp
    Row(Modifier.height(height), horizontalArrangement = Arrangement.spacedBy(2.5.dp), verticalAlignment = Alignment.CenterVertically) {
        listOf(520, 380, 610, 450).forEachIndexed { i, period ->
            val level by transition.animateFloat(
                initialValue = 0.25f,
                targetValue = 1f,
                animationSpec = infiniteRepeatable(tween(period, delayMillis = i * 70, easing = FastOutSlowInEasing), RepeatMode.Reverse),
                label = "bar$i",
            )
            Box(
                Modifier
                    .width(3.dp)
                    .fillMaxHeight(if (playing) level else 0.2f)
                    .clip(RoundedCornerShape(2.dp))
                    .background(Brush.verticalGradient(listOf(Color(0xFF9EE7FF), Color(0xFFB98CFF)))),
            )
        }
    }
}

@Composable
private fun SeekBar(
    current: Long,
    total: Long,
    onSeek: (Float) -> Unit,
) {
    val progress = if (total > 0) (current.toFloat() / total).coerceIn(0f, 1f) else 0f
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(formatTime(current), color = Color.White.copy(alpha = 0.55f), fontSize = 11.sp)
        Spacer(Modifier.width(8.dp))
        val hoverSource = remember { MutableInteractionSource() }
        val barHovered by hoverSource.collectIsHoveredAsState()
        // While dragging, the thumb follows the pointer and the seek is sent on release.
        var dragFraction by remember { mutableStateOf<Float?>(null) }
        val shown = dragFraction ?: progress
        val thumb by animateDpAsState(if (barHovered || dragFraction != null) 14.dp else 10.dp, tween(150), label = "islandThumb")
        BoxWithConstraints(
            Modifier
                .weight(1f)
                .height(20.dp)
                .hoverable(hoverSource)
                .pointerInput(total) {
                    detectTapGestures { offset -> if (total > 0) onSeek((offset.x / size.width).coerceIn(0f, 1f) * 100f) }
                }.pointerInput(total) {
                    detectHorizontalDragGestures(
                        onDragStart = { offset -> if (total > 0) dragFraction = (offset.x / size.width).coerceIn(0f, 1f) },
                        onHorizontalDrag = { change, _ ->
                            if (total > 0) dragFraction = (change.position.x / size.width).coerceIn(0f, 1f)
                        },
                        onDragEnd = {
                            dragFraction?.let { onSeek(it * 100f) }
                            dragFraction = null
                        },
                        onDragCancel = { dragFraction = null },
                    )
                },
            contentAlignment = Alignment.CenterStart,
        ) {
            val barWidth = maxWidth
            Box(Modifier.fillMaxWidth().height(4.dp).clip(CircleShape).background(Color.White.copy(alpha = 0.18f)))
            Box(
                Modifier
                    .fillMaxWidth(shown)
                    .height(4.dp)
                    .clip(CircleShape)
                    .background(Brush.horizontalGradient(listOf(Color(0xFF9EE7FF), Color(0xFFB98CFF)))),
            )
            // The dot: a white bead with a soft halo, riding the end of the played part.
            Box(
                Modifier
                    .offset(x = (barWidth * shown) - thumb / 2)
                    .size(thumb + 8.dp)
                    .padding(4.dp)
                    .drawBehind {
                        drawCircle(Color.White.copy(alpha = 0.22f), radius = size.minDimension / 2f + 4.dp.toPx())
                    }.clip(CircleShape)
                    .background(Color.White),
            )
        }
        Spacer(Modifier.width(8.dp))
        Text(formatTime(total), color = Color.White.copy(alpha = 0.55f), fontSize = 11.sp)
    }
}

private fun formatTime(ms: Long): String {
    if (ms <= 0) return "0:00"
    val s = ms / 1000
    return "${s / 60}:${(s % 60).toString().padStart(2, '0')}"
}

@Composable
private fun IslandButton(
    icon: ImageVector,
    size: Int,
    tint: Color = Color.White,
    onClick: () -> Unit,
) {
    Box(
        Modifier
            .size((size + 14).dp)
            .clip(CircleShape)
            .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(icon, null, tint = tint, modifier = Modifier.size(size.dp))
    }
}
