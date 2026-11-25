package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "ban" (ISC licence, lucide.dev).
val SimpIcons.Block: ImageVector
  get() {
    if (_Block != null) {
      return _Block!!
    }
    _Block =
      lucideIcon(
        "Block",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "m4.9 4.9 14.2 14.2",
      )
    return _Block!!
  }

private var _Block: ImageVector? = null
