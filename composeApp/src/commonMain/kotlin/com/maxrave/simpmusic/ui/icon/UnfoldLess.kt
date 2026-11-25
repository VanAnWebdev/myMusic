package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "fold-vertical" (ISC licence, lucide.dev).
val SimpIcons.UnfoldLess: ImageVector
  get() {
    if (_UnfoldLess != null) {
      return _UnfoldLess!!
    }
    _UnfoldLess =
      lucideIcon(
        "UnfoldLess",
        filled = false,
        "M12 22v-6",
        "M12 8V2",
        "M4 12H2",
        "M10 12H8",
        "M16 12h-2",
        "M22 12h-2",
        "m15 19-3-3-3 3",
        "m15 5-3 3-3-3",
      )
    return _UnfoldLess!!
  }

private var _UnfoldLess: ImageVector? = null
