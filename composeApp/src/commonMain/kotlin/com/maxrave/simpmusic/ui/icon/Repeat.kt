package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "repeat" (ISC licence, lucide.dev).
val SimpIcons.Repeat: ImageVector
  get() {
    if (_Repeat != null) {
      return _Repeat!!
    }
    _Repeat =
      lucideIcon(
        "Repeat",
        filled = false,
        "m17 2 4 4-4 4",
        "M3 11v-1a4 4 0 0 1 4-4h14",
        "m7 22-4-4 4-4",
        "M21 13v1a4 4 0 0 1-4 4H3",
      )
    return _Repeat!!
  }

private var _Repeat: ImageVector? = null
