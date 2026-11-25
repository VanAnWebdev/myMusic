package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "unfold-vertical" (ISC licence, lucide.dev).
val SimpIcons.UnfoldMore: ImageVector
  get() {
    if (_UnfoldMore != null) {
      return _UnfoldMore!!
    }
    _UnfoldMore =
      lucideIcon(
        "UnfoldMore",
        filled = false,
        "M12 22v-6",
        "M12 8V2",
        "M4 12H2",
        "M10 12H8",
        "M16 12h-2",
        "M22 12h-2",
        "m15 19-3 3-3-3",
        "m15 5-3-3-3 3",
      )
    return _UnfoldMore!!
  }

private var _UnfoldMore: ImageVector? = null
