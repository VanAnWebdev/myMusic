package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "radio-tower" (ISC licence, lucide.dev).
val SimpIcons.SurroundSound: ImageVector
  get() {
    if (_SurroundSound != null) {
      return _SurroundSound!!
    }
    _SurroundSound =
      lucideIcon(
        "SurroundSound",
        filled = false,
        "M4.9 16.1C1 12.2 1 5.8 4.9 1.9",
        "M7.8 4.7a6.14 6.14 0 0 0-.8 7.5",
        "M10 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
        "M16.2 4.8c2 2 2.26 5.11.8 7.47",
        "M19.1 1.9a9.96 9.96 0 0 1 0 14.1",
        "M9.5 18h5",
        "m8 22 4-11 4 11",
      )
    return _SurroundSound!!
  }

private var _SurroundSound: ImageVector? = null
