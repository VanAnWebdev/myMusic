package com.maxrave.simpmusic.ui.component

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import com.maxrave.simpmusic.viewModel.SharedViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import com.maxrave.simpmusic.ui.motion.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import coil3.compose.AsyncImage
import com.maxrave.domain.manager.DataStoreManager
import com.maxrave.simpmusic.ui.icon.ArrowBackIosNew
import com.maxrave.simpmusic.ui.icon.Close
import com.maxrave.simpmusic.ui.icon.Home
import com.maxrave.simpmusic.ui.icon.Person
import com.maxrave.simpmusic.ui.icon.Search
import com.maxrave.simpmusic.ui.icon.Settings
import com.maxrave.simpmusic.ui.icon.SimpIcons
import com.maxrave.simpmusic.ui.navigation.destination.home.HomeDestination
import com.maxrave.simpmusic.ui.navigation.destination.home.SettingsDestination
import com.maxrave.simpmusic.ui.navigation.destination.search.SearchDestination
import com.maxrave.simpmusic.ui.shortcut.ShortcutSignals
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject
import simpmusic.composeapp.generated.resources.Res
import simpmusic.composeapp.generated.resources.home
import simpmusic.composeapp.generated.resources.settings
import simpmusic.composeapp.generated.resources.top_search_placeholder

/** Personal fork: glass tones shared by the desktop chrome (top bar, panels). */
object DesktopGlass {
    val fill = Color.White.copy(alpha = 0.08f)
    val fillHover = Color.White.copy(alpha = 0.14f)
    val fillActive = Color.White.copy(alpha = 0.18f)
    val border = Color.White.copy(alpha = 0.12f)
    val panel = Color(0xFF1C1E26).copy(alpha = 0.42f)
}

/**
 * Personal fork: the desktop window's top bar — back, home, a search field in the middle (type and
 * press Enter; Ctrl+F focuses it), settings and the signed-in account.
 */
@Composable
fun DesktopTopBar(
    navController: NavController,
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit = {},
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val canGoBack = backStackEntry != null && navController.previousBackStackEntry != null
    val dataStore: DataStoreManager = koinInject()
    val avatar by remember { dataStore.getString("AccountThumbUrl") }.collectAsState(null)
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    var query by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        ShortcutSignals.openSearch.collect { runCatching { focusRequester.requestFocus() } }
    }

    val goHome = {
        onNavigate()
        navController.navigate(HomeDestination) {
            popUpTo(navController.graph.startDestinationId) { saveState = true }
            launchSingleTop = true
            restoreState = true
        }
    }
    val submit = {
        val text = query.trim()
        if (text.isNotEmpty()) {
            onNavigate()
            ShortcutSignals.submitQuery(text)
            navController.navigate(SearchDestination) { launchSingleTop = true }
            focusManager.clearFocus()
        }
    }

    Box(modifier.fillMaxWidth().height(60.dp).padding(horizontal = 12.dp, vertical = 8.dp)) {
        Row(Modifier.align(Alignment.CenterStart), horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
            GlassCircleButton(SimpIcons.ArrowBackIosNew, "Back", enabled = canGoBack) {
                onNavigate()
                navController.navigateUp()
            }
        }
        Row(
            Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            GlassCircleButton(SimpIcons.Home, stringResource(Res.string.home), size = 44) { goHome() }
            SearchPill(
                query = query,
                onQueryChange = { query = it },
                onSubmit = submit,
                onClear = { query = "" },
                onEscape = { focusManager.clearFocus() },
                focusRequester = focusRequester,
            )
        }
        Row(Modifier.align(Alignment.CenterEnd), horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
            GlassCircleButton(SimpIcons.Settings, stringResource(Res.string.settings)) {
                onNavigate()
                navController.navigate(SettingsDestination) { launchSingleTop = true }
            }
            Box(
                Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(DesktopGlass.fill)
                    .border(1.dp, DesktopGlass.border, CircleShape)
                    .clickable {
                        onNavigate()
                        navController.navigate(SettingsDestination) { launchSingleTop = true }
                    },
                contentAlignment = Alignment.Center,
            ) {
                if (!avatar.isNullOrBlank()) {
                    AsyncImage(
                        model = avatar,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(36.dp).clip(CircleShape),
                    )
                } else {
                    Icon(SimpIcons.Person, null, tint = Color.White.copy(alpha = 0.85f), modifier = Modifier.size(20.dp))
                }
            }
        }
    }
}

@Composable
private fun SearchPill(
    query: String,
    onQueryChange: (String) -> Unit,
    onSubmit: () -> Unit,
    onClear: () -> Unit,
    onEscape: () -> Unit,
    focusRequester: FocusRequester,
) {
    val interaction = remember { MutableInteractionSource() }
    val focused by interaction.collectIsFocusedAsState()
    val hovered by interaction.collectIsHoveredAsState()
    val shape = RoundedCornerShape(50)
    Row(
        Modifier
            .widthIn(min = 320.dp, max = 520.dp)
            .height(44.dp)
            .clip(shape)
            .background(if (focused) DesktopGlass.fillActive else if (hovered) DesktopGlass.fillHover else DesktopGlass.fill)
            .border(1.dp, if (focused) Color.White.copy(alpha = 0.35f) else DesktopGlass.border, shape)
            .hoverable(interaction)
            .clickable(interactionSource = interaction, indication = null) { runCatching { focusRequester.requestFocus() } }
            .padding(horizontal = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(SimpIcons.Search, null, tint = Color.White.copy(alpha = 0.75f), modifier = Modifier.size(20.dp))
        Spacer(Modifier.size(10.dp))
        Box(Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
            if (query.isEmpty()) {
                Text(
                    stringResource(Res.string.top_search_placeholder),
                    color = Color.White.copy(alpha = 0.5f),
                    fontSize = 15.sp,
                    maxLines = 1,
                )
            }
            BasicTextField(
                value = query,
                onValueChange = onQueryChange,
                singleLine = true,
                textStyle = TextStyle(color = Color.White, fontSize = 15.sp),
                cursorBrush = SolidColor(Color.White),
                interactionSource = interaction,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(onSearch = { onSubmit() }),
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .focusRequester(focusRequester)
                        .onPreviewKeyEvent { event ->
                            if (event.type != KeyEventType.KeyDown) return@onPreviewKeyEvent false
                            when (event.key) {
                                Key.Enter, Key.NumPadEnter -> {
                                    onSubmit()
                                    true
                                }
                                Key.Escape -> {
                                    onEscape()
                                    true
                                }
                                else -> false
                            }
                        },
            )
        }
        if (query.isNotEmpty()) {
            Icon(
                SimpIcons.Close,
                null,
                tint = Color.White.copy(alpha = 0.7f),
                modifier = Modifier.size(18.dp).clip(CircleShape).clickable { onClear() },
            )
        }
    }
}

@Composable
private fun GlassCircleButton(
    icon: ImageVector,
    contentDescription: String,
    enabled: Boolean = true,
    size: Int = 36,
    onClick: () -> Unit,
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    Box(
        Modifier
            .size(size.dp)
            .clip(CircleShape)
            .background(if (hovered && enabled) DesktopGlass.fillHover else DesktopGlass.fill)
            .border(1.dp, DesktopGlass.border, CircleShape)
            .hoverable(interaction)
            .clickable(enabled = enabled, interactionSource = interaction, indication = null, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            icon,
            contentDescription,
            tint = Color.White.copy(alpha = if (enabled) 0.9f else 0.3f),
            modifier = Modifier.size((size * 0.5f).dp),
        )
    }
}

/**
 * Personal fork: the desktop window's background — the playing song's artwork, heavily blurred and
 * darkened, so the translucent panels above it read as glass (visionOS style). Plain dark gradient
 * when nothing plays.
 */
@Composable
fun DesktopArtworkBackdrop(viewModel: SharedViewModel) {
    val data by viewModel.nowPlayingScreenData.collectAsState()
    val url = data.thumbnailURL
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF07070A))
            // Ambient colour for when nothing plays: soft blobs, like light through frosted glass.
            .drawBehind {
                fun blob(
                    color: Color,
                    cx: Float,
                    cy: Float,
                    r: Float,
                ) = drawCircle(
                    Brush.radialGradient(listOf(color, Color.Transparent), center = Offset(size.width * cx, size.height * cy), radius = size.minDimension * r),
                    radius = size.minDimension * r,
                    center = Offset(size.width * cx, size.height * cy),
                )
                blob(Color(0xFF4A5FA0).copy(alpha = 0.70f), 0.18f, 0.22f, 0.75f)
                blob(Color(0xFF8A4A8C).copy(alpha = 0.60f), 0.82f, 0.30f, 0.70f)
                blob(Color(0xFF2F8A80).copy(alpha = 0.55f), 0.55f, 0.95f, 0.80f)
            },
    ) {
        Crossfade(targetState = url, animationSpec = tween(900), label = "desktopBackdrop") { model ->
            if (!model.isNullOrBlank()) {
                AsyncImage(
                    model = model,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier =
                        Modifier
                            .fillMaxSize()
                            .graphicsLayer {
                                scaleX = 1.25f
                                scaleY = 1.25f
                            }.blur(110.dp, BlurredEdgeTreatment.Rectangle),
                )
            }
        }
        if (!url.isNullOrBlank()) Box(
            Modifier.fillMaxSize().background(
                Brush.verticalGradient(
                    listOf(Color.Black.copy(alpha = 0.45f), Color.Black.copy(alpha = 0.62f), Color.Black.copy(alpha = 0.78f)),
                ),
            ),
        )
    }
}
