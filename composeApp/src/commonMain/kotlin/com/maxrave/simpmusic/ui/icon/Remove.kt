package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "minus" (ISC licence, lucide.dev).
val SimpIcons.Remove: ImageVector
  get() {
    if (_Remove != null) {
      return _Remove!!
    }
    _Remove =
      lucideIcon(
        "Remove",
        filled = false,
        "M5 12h14",
      )
    return _Remove!!
  }

private var _Remove: ImageVector? = null
