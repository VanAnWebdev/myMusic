package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "cookie" (ISC licence, lucide.dev).
val SimpIcons.Cookie: ImageVector
  get() {
    if (_Cookie != null) {
      return _Cookie!!
    }
    _Cookie =
      lucideIcon(
        "Cookie",
        filled = false,
        "M12 2a10 10 0 1 0 10 10 4 4 0 0 1-5-5 4 4 0 0 1-5-5",
        "M8.5 8.5v.01",
        "M16 15.5v.01",
        "M12 12v.01",
        "M11 17v.01",
        "M7 14v.01",
      )
    return _Cookie!!
  }

private var _Cookie: ImageVector? = null
