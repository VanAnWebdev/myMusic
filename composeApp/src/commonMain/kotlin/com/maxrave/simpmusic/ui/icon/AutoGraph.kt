package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chart-spline" (ISC licence, lucide.dev).
val SimpIcons.AutoGraph: ImageVector
  get() {
    if (_AutoGraph != null) {
      return _AutoGraph!!
    }
    _AutoGraph =
      lucideIcon(
        "AutoGraph",
        filled = false,
        "M3 3v16a2 2 0 0 0 2 2h16",
        "M7 16c.5-2 1.5-7 4-7 2 0 2 3 4 3 2.5 0 4.5-5 5-7",
      )
    return _AutoGraph!!
  }

private var _AutoGraph: ImageVector? = null
