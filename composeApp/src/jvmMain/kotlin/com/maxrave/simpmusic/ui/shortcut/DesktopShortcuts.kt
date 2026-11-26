package com.maxrave.simpmusic.ui.shortcut

import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.isAltPressed
import androidx.compose.ui.input.key.isCtrlPressed
import androidx.compose.ui.input.key.isMetaPressed
import androidx.compose.ui.input.key.isShiftPressed
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import com.maxrave.simpmusic.viewModel.SharedViewModel
import com.maxrave.simpmusic.viewModel.UIEvent
import multiplatform.network.cmptoast.ToastGravity
import multiplatform.network.cmptoast.showToast
import kotlin.math.roundToInt

/**
 * Personal fork: keyboard shortcuts for the main desktop window.
 *
 * Wired as the window's onKeyEvent (not onPreviewKeyEvent), so it only sees keys nothing focused
 * consumed: typing a space or an arrow in a text field never reaches it.
 *
 * Space play/pause · ←/→ seek 5 s · Ctrl+←/→ previous/next · ↑/↓ volume · M mute · L like ·
 * S shuffle · R repeat · Ctrl+F search · F11 fullscreen. Media keys go through the OS (SMTC).
 */
class DesktopShortcuts(
    private val sharedViewModel: SharedViewModel,
    private val windowState: WindowState,
) {
    private var volumeBeforeMute = 1f
    private var placementBeforeFullscreen = WindowPlacement.Floating

    fun handle(event: KeyEvent): Boolean {
        if (event.type != KeyEventType.KeyDown) return false
        val ctrl = event.isCtrlPressed || event.isMetaPressed
        if (event.isAltPressed) return false
        return if (ctrl) {
            when (event.key) {
                Key.DirectionLeft -> send(UIEvent.Previous)
                Key.DirectionRight -> send(UIEvent.Next)
                Key.F -> {
                    ShortcutSignals.requestSearch()
                    true
                }
                else -> false
            }
        } else {
            if (event.isShiftPressed) return false
            when (event.key) {
                Key.Spacebar -> send(UIEvent.PlayPause)
                Key.DirectionLeft -> send(UIEvent.Backward)
                Key.DirectionRight -> send(UIEvent.Forward)
                Key.DirectionUp -> changeVolume(+0.05f)
                Key.DirectionDown -> changeVolume(-0.05f)
                Key.M -> toggleMute()
                Key.L -> send(UIEvent.ToggleLike)
                Key.S -> send(UIEvent.Shuffle)
                Key.R -> send(UIEvent.Repeat)
                Key.F11 -> toggleFullscreen()
                else -> false
            }
        }
    }

    private fun send(event: UIEvent): Boolean {
        sharedViewModel.onUIEvent(event)
        return true
    }

    private fun currentVolume(): Float = sharedViewModel.controllerState.value.volume

    // Every volume change made from the keyboard says so: a stray M or ↓ must never silence the app
    // without the user seeing why (the level is remembered across restarts).
    private fun announce(volume: Float) {
        val percent = (volume * 100).roundToInt()
        showToast(if (percent == 0) "🔇 Đã tắt tiếng (bấm M để bật lại)" else "🔊 Âm lượng $percent%", ToastGravity.Bottom)
    }

    private fun changeVolume(delta: Float): Boolean {
        val next = (currentVolume() + delta).coerceIn(0f, 1f)
        announce(next)
        return send(UIEvent.UpdateVolume(next))
    }

    private fun toggleMute(): Boolean {
        val volume = currentVolume()
        val next = if (volume > 0f) {
            volumeBeforeMute = volume
            0f
        } else {
            volumeBeforeMute.takeIf { it > 0f } ?: 1f
        }
        announce(next)
        return send(UIEvent.UpdateVolume(next))
    }

    private fun toggleFullscreen(): Boolean {
        if (windowState.placement == WindowPlacement.Fullscreen) {
            windowState.placement = placementBeforeFullscreen
        } else {
            placementBeforeFullscreen = windowState.placement
            windowState.placement = WindowPlacement.Fullscreen
        }
        return true
    }
}
