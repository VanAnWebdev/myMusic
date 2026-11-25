package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "pause" (ISC licence, lucide.dev) — filled.
val SimpIcons.Pause: ImageVector
  get() {
    if (_Pause != null) {
      return _Pause!!
    }
    _Pause =
      lucideIcon(
        "Pause",
        filled = true,
        "M15 4h2a1 1 0 0 1 1 1v14a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1v-14a1 1 0 0 1 1 -1Z",
        "M7 4h2a1 1 0 0 1 1 1v14a1 1 0 0 1 -1 1h-2a1 1 0 0 1 -1 -1v-14a1 1 0 0 1 1 -1Z",
      )
    return _Pause!!
  }

private var _Pause: ImageVector? = null
