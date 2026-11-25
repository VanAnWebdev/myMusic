package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "flag" (ISC licence, lucide.dev).
val SimpIcons.Flag: ImageVector
  get() {
    if (_Flag != null) {
      return _Flag!!
    }
    _Flag =
      lucideIcon(
        "Flag",
        filled = false,
        "M4 15s1-1 4-1 5 2 8 2 4-1 4-1V3s-1 1-4 1-5-2-8-2-4 1-4 1z",
        "M4 22L4 15",
      )
    return _Flag!!
  }

private var _Flag: ImageVector? = null
