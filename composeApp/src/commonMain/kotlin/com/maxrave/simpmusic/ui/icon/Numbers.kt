package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "hash" (ISC licence, lucide.dev).
val SimpIcons.Numbers: ImageVector
  get() {
    if (_Numbers != null) {
      return _Numbers!!
    }
    _Numbers =
      lucideIcon(
        "Numbers",
        filled = false,
        "M4 9L20 9",
        "M4 15L20 15",
        "M10 3L8 21",
        "M16 3L14 21",
      )
    return _Numbers!!
  }

private var _Numbers: ImageVector? = null
