package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "code" (ISC licence, lucide.dev).
val SimpIcons.Code: ImageVector
  get() {
    if (_Code != null) {
      return _Code!!
    }
    _Code =
      lucideIcon(
        "Code",
        filled = false,
        "M16 18 L22 12 L16 6",
        "M8 6 L2 12 L8 18",
      )
    return _Code!!
  }

private var _Code: ImageVector? = null
