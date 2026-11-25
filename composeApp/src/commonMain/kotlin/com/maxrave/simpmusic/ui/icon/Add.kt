package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "plus" (ISC licence, lucide.dev).
val SimpIcons.Add: ImageVector
  get() {
    if (_Add != null) {
      return _Add!!
    }
    _Add =
      lucideIcon(
        "Add",
        filled = false,
        "M5 12h14",
        "M12 5v14",
      )
    return _Add!!
  }

private var _Add: ImageVector? = null
