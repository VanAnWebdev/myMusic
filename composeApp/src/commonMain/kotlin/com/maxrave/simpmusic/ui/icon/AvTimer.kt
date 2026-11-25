package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "timer" (ISC licence, lucide.dev).
val SimpIcons.AvTimer: ImageVector
  get() {
    if (_AvTimer != null) {
      return _AvTimer!!
    }
    _AvTimer =
      lucideIcon(
        "AvTimer",
        filled = false,
        "M10 2L14 2",
        "M12 14L15 11",
        "M4 14a8 8 0 1 0 16 0a8 8 0 1 0 -16 0",
      )
    return _AvTimer!!
  }

private var _AvTimer: ImageVector? = null
