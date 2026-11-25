package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "play" (ISC licence, lucide.dev) — filled.
val SimpIcons.PlayArrow: ImageVector
  get() {
    if (_PlayArrow != null) {
      return _PlayArrow!!
    }
    _PlayArrow =
      lucideIcon(
        "PlayArrow",
        filled = true,
        "M6 3 L20 12 L6 21 L6 3Z",
      )
    return _PlayArrow!!
  }

private var _PlayArrow: ImageVector? = null
