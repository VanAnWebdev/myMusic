package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevrons-right" (ISC licence, lucide.dev).
val SimpIcons.KeyboardDoubleArrowRight: ImageVector
  get() {
    if (_KeyboardDoubleArrowRight != null) {
      return _KeyboardDoubleArrowRight!!
    }
    _KeyboardDoubleArrowRight =
      lucideIcon(
        "KeyboardDoubleArrowRight",
        filled = false,
        "m6 17 5-5-5-5",
        "m13 17 5-5-5-5",
      )
    return _KeyboardDoubleArrowRight!!
  }

private var _KeyboardDoubleArrowRight: ImageVector? = null
