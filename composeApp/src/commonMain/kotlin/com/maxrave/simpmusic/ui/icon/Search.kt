package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "search" (ISC licence, lucide.dev).
val SimpIcons.Search: ImageVector
  get() {
    if (_Search != null) {
      return _Search!!
    }
    _Search =
      lucideIcon(
        "Search",
        filled = false,
        "M3 11a8 8 0 1 0 16 0a8 8 0 1 0 -16 0",
        "m21 21-4.3-4.3",
      )
    return _Search!!
  }

private var _Search: ImageVector? = null
