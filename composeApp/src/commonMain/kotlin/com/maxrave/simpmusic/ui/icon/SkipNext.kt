package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "skip-forward" (ISC licence, lucide.dev) — filled.
val SimpIcons.SkipNext: ImageVector
  get() {
    if (_SkipNext != null) {
      return _SkipNext!!
    }
    _SkipNext =
      lucideIcon(
        "SkipNext",
        filled = true,
        "M5 4 L15 12 L5 20 L5 4Z",
        "M19 5L19 19",
      )
    return _SkipNext!!
  }

private var _SkipNext: ImageVector? = null
