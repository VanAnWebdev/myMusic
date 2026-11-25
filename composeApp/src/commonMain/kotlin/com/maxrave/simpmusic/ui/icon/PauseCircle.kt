package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-pause" (ISC licence, lucide.dev).
val SimpIcons.PauseCircle: ImageVector
  get() {
    if (_PauseCircle != null) {
      return _PauseCircle!!
    }
    _PauseCircle =
      lucideIcon(
        "PauseCircle",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M10 15L10 9",
        "M14 15L14 9",
      )
    return _PauseCircle!!
  }

private var _PauseCircle: ImageVector? = null
