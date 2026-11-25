package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-alert" (ISC licence, lucide.dev).
val SimpIcons.Error: ImageVector
  get() {
    if (_Error != null) {
      return _Error!!
    }
    _Error =
      lucideIcon(
        "Error",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M12 8L12 12",
        "M12 16L12.01 16",
      )
    return _Error!!
  }

private var _Error: ImageVector? = null
