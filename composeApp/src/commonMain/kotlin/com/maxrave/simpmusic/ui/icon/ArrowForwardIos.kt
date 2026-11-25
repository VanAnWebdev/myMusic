package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevron-right" (ISC licence, lucide.dev).
val SimpIcons.ArrowForwardIos: ImageVector
  get() {
    if (_ArrowForwardIos != null) {
      return _ArrowForwardIos!!
    }
    _ArrowForwardIos =
      lucideIcon(
        "ArrowForwardIos",
        filled = false,
        "m9 18 6-6-6-6",
      )
    return _ArrowForwardIos!!
  }

private var _ArrowForwardIos: ImageVector? = null
