package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "arrow-down-wide-narrow" (ISC licence, lucide.dev).
val SimpIcons.Sort: ImageVector
  get() {
    if (_Sort != null) {
      return _Sort!!
    }
    _Sort =
      lucideIcon(
        "Sort",
        filled = false,
        "m3 16 4 4 4-4",
        "M7 20V4",
        "M11 4h10",
        "M11 8h7",
        "M11 12h4",
      )
    return _Sort!!
  }

private var _Sort: ImageVector? = null
