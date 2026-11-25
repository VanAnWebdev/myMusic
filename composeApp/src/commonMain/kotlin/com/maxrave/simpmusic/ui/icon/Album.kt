package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "disc-3" (ISC licence, lucide.dev).
val SimpIcons.Album: ImageVector
  get() {
    if (_Album != null) {
      return _Album!!
    }
    _Album =
      lucideIcon(
        "Album",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M6 12c0-1.7.7-3.2 1.8-4.2",
        "M10 12a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
        "M18 12c0 1.7-.7 3.2-1.8 4.2",
      )
    return _Album!!
  }

private var _Album: ImageVector? = null
