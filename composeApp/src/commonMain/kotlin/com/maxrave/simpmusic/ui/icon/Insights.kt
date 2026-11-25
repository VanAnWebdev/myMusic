package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chart-line" (ISC licence, lucide.dev).
val SimpIcons.Insights: ImageVector
  get() {
    if (_Insights != null) {
      return _Insights!!
    }
    _Insights =
      lucideIcon(
        "Insights",
        filled = false,
        "M3 3v16a2 2 0 0 0 2 2h16",
        "m19 9-5 5-4-4-3 3",
      )
    return _Insights!!
  }

private var _Insights: ImageVector? = null
