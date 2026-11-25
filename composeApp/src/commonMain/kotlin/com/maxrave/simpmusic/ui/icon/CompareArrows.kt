package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "arrow-left-right" (ISC licence, lucide.dev).
val SimpIcons.CompareArrows: ImageVector
  get() {
    if (_CompareArrows != null) {
      return _CompareArrows!!
    }
    _CompareArrows =
      lucideIcon(
        "CompareArrows",
        filled = false,
        "M8 3 4 7l4 4",
        "M4 7h16",
        "m16 21 4-4-4-4",
        "M20 17H4",
      )
    return _CompareArrows!!
  }

private var _CompareArrows: ImageVector? = null
