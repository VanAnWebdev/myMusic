package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevrons-up" (ISC licence, lucide.dev).
val SimpIcons.KeyboardDoubleArrowUp: ImageVector
  get() {
    if (_KeyboardDoubleArrowUp != null) {
      return _KeyboardDoubleArrowUp!!
    }
    _KeyboardDoubleArrowUp =
      lucideIcon(
        "KeyboardDoubleArrowUp",
        filled = false,
        "m17 11-5-5-5 5",
        "m17 18-5-5-5 5",
      )
    return _KeyboardDoubleArrowUp!!
  }

private var _KeyboardDoubleArrowUp: ImageVector? = null
