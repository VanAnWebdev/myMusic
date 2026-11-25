package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "x" (ISC licence, lucide.dev).
val SimpIcons.Close: ImageVector
  get() {
    if (_Close != null) {
      return _Close!!
    }
    _Close =
      lucideIcon(
        "Close",
        filled = false,
        "M18 6 6 18",
        "m6 6 12 12",
      )
    return _Close!!
  }

private var _Close: ImageVector? = null
