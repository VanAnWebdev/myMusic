package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "repeat-1" (ISC licence, lucide.dev).
val SimpIcons.RepeatOne: ImageVector
  get() {
    if (_RepeatOne != null) {
      return _RepeatOne!!
    }
    _RepeatOne =
      lucideIcon(
        "RepeatOne",
        filled = false,
        "m17 2 4 4-4 4",
        "M3 11v-1a4 4 0 0 1 4-4h14",
        "m7 22-4-4 4-4",
        "M21 13v1a4 4 0 0 1-4 4H3",
        "M11 10h1v4",
      )
    return _RepeatOne!!
  }

private var _RepeatOne: ImageVector? = null
