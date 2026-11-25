package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "globe" (ISC licence, lucide.dev).
val SimpIcons.Language: ImageVector
  get() {
    if (_Language != null) {
      return _Language!!
    }
    _Language =
      lucideIcon(
        "Language",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M12 2a14.5 14.5 0 0 0 0 20 14.5 14.5 0 0 0 0-20",
        "M2 12h20",
      )
    return _Language!!
  }

private var _Language: ImageVector? = null
