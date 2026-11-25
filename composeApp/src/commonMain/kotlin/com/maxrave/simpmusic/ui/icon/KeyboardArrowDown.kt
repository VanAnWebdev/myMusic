package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevron-down" (ISC licence, lucide.dev).
val SimpIcons.KeyboardArrowDown: ImageVector
  get() {
    if (_KeyboardArrowDown != null) {
      return _KeyboardArrowDown!!
    }
    _KeyboardArrowDown =
      lucideIcon(
        "KeyboardArrowDown",
        filled = false,
        "m6 9 6 6 6-6",
      )
    return _KeyboardArrowDown!!
  }

private var _KeyboardArrowDown: ImageVector? = null
