package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "gauge" (ISC licence, lucide.dev).
val SimpIcons.Speed: ImageVector
  get() {
    if (_Speed != null) {
      return _Speed!!
    }
    _Speed =
      lucideIcon(
        "Speed",
        filled = false,
        "m12 14 4-4",
        "M3.34 19a10 10 0 1 1 17.32 0",
      )
    return _Speed!!
  }

private var _Speed: ImageVector? = null
