package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "list" (ISC licence, lucide.dev).
val SimpIcons.FormatListBulleted: ImageVector
  get() {
    if (_FormatListBulleted != null) {
      return _FormatListBulleted!!
    }
    _FormatListBulleted =
      lucideIcon(
        "FormatListBulleted",
        filled = false,
        "M3 12h.01",
        "M3 18h.01",
        "M3 6h.01",
        "M8 12h13",
        "M8 18h13",
        "M8 6h13",
      )
    return _FormatListBulleted!!
  }

private var _FormatListBulleted: ImageVector? = null
