package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-play" (ISC licence, lucide.dev).
val SimpIcons.PlayCircle: ImageVector
  get() {
    if (_PlayCircle != null) {
      return _PlayCircle!!
    }
    _PlayCircle =
      lucideIcon(
        "PlayCircle",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M10 8 L16 12 L10 16 L10 8Z",
      )
    return _PlayCircle!!
  }

private var _PlayCircle: ImageVector? = null
