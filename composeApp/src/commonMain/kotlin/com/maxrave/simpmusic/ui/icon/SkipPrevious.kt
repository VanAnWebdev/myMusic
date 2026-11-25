package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "skip-back" (ISC licence, lucide.dev) — filled.
val SimpIcons.SkipPrevious: ImageVector
  get() {
    if (_SkipPrevious != null) {
      return _SkipPrevious!!
    }
    _SkipPrevious =
      lucideIcon(
        "SkipPrevious",
        filled = true,
        "M19 20 L9 12 L19 4 L19 20Z",
        "M5 19L5 5",
      )
    return _SkipPrevious!!
  }

private var _SkipPrevious: ImageVector? = null
