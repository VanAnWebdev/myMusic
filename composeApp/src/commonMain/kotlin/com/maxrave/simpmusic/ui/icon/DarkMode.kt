package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "moon" (ISC licence, lucide.dev).
val SimpIcons.DarkMode: ImageVector
  get() {
    if (_DarkMode != null) {
      return _DarkMode!!
    }
    _DarkMode =
      lucideIcon(
        "DarkMode",
        filled = false,
        "M12 3a6 6 0 0 0 9 9 9 9 0 1 1-9-9Z",
      )
    return _DarkMode!!
  }

private var _DarkMode: ImageVector? = null
