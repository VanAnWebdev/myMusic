package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-help" (ISC licence, lucide.dev).
val SimpIcons.Help: ImageVector
  get() {
    if (_Help != null) {
      return _Help!!
    }
    _Help =
      lucideIcon(
        "Help",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M9.09 9a3 3 0 0 1 5.83 1c0 2-3 3-3 3",
        "M12 17h.01",
      )
    return _Help!!
  }

private var _Help: ImageVector? = null
