package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "info" (ISC licence, lucide.dev).
val SimpIcons.Info: ImageVector
  get() {
    if (_Info != null) {
      return _Info!!
    }
    _Info =
      lucideIcon(
        "Info",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M12 16v-4",
        "M12 8h.01",
      )
    return _Info!!
  }

private var _Info: ImageVector? = null
