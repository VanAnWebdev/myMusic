package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "cpu" (ISC licence, lucide.dev).
val SimpIcons.Memory: ImageVector
  get() {
    if (_Memory != null) {
      return _Memory!!
    }
    _Memory =
      lucideIcon(
        "Memory",
        filled = false,
        "M6 4h12a2 2 0 0 1 2 2v12a2 2 0 0 1 -2 2h-12a2 2 0 0 1 -2 -2v-12a2 2 0 0 1 2 -2Z",
        "M10 9h4a1 1 0 0 1 1 1v4a1 1 0 0 1 -1 1h-4a1 1 0 0 1 -1 -1v-4a1 1 0 0 1 1 -1Z",
        "M15 2v2",
        "M15 20v2",
        "M2 15h2",
        "M2 9h2",
        "M20 15h2",
        "M20 9h2",
        "M9 2v2",
        "M9 20v2",
      )
    return _Memory!!
  }

private var _Memory: ImageVector? = null
