package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevron-up" (ISC licence, lucide.dev).
val SimpIcons.KeyboardArrowUp: ImageVector
  get() {
    if (_KeyboardArrowUp != null) {
      return _KeyboardArrowUp!!
    }
    _KeyboardArrowUp =
      lucideIcon(
        "KeyboardArrowUp",
        filled = false,
        "m18 15-6-6-6 6",
      )
    return _KeyboardArrowUp!!
  }

private var _KeyboardArrowUp: ImageVector? = null
