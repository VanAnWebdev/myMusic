package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevrons-left" (ISC licence, lucide.dev).
val SimpIcons.KeyboardDoubleArrowLeft: ImageVector
  get() {
    if (_KeyboardDoubleArrowLeft != null) {
      return _KeyboardDoubleArrowLeft!!
    }
    _KeyboardDoubleArrowLeft =
      lucideIcon(
        "KeyboardDoubleArrowLeft",
        filled = false,
        "m11 17-5-5 5-5",
        "m18 17-5-5 5-5",
      )
    return _KeyboardDoubleArrowLeft!!
  }

private var _KeyboardDoubleArrowLeft: ImageVector? = null
