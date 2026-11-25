package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevrons-down" (ISC licence, lucide.dev).
val SimpIcons.KeyboardDoubleArrowDown: ImageVector
  get() {
    if (_KeyboardDoubleArrowDown != null) {
      return _KeyboardDoubleArrowDown!!
    }
    _KeyboardDoubleArrowDown =
      lucideIcon(
        "KeyboardDoubleArrowDown",
        filled = false,
        "m7 6 5 5 5-5",
        "m7 13 5 5 5-5",
      )
    return _KeyboardDoubleArrowDown!!
  }

private var _KeyboardDoubleArrowDown: ImageVector? = null
