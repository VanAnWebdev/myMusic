package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "history" (ISC licence, lucide.dev).
val SimpIcons.History: ImageVector
  get() {
    if (_History != null) {
      return _History!!
    }
    _History =
      lucideIcon(
        "History",
        filled = false,
        "M3 12a9 9 0 1 0 9-9 9.75 9.75 0 0 0-6.74 2.74L3 8",
        "M3 3v5h5",
        "M12 7v5l4 2",
      )
    return _History!!
  }

private var _History: ImageVector? = null
