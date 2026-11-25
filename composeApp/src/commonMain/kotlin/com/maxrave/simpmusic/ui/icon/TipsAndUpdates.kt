package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "lightbulb" (ISC licence, lucide.dev).
val SimpIcons.TipsAndUpdates: ImageVector
  get() {
    if (_TipsAndUpdates != null) {
      return _TipsAndUpdates!!
    }
    _TipsAndUpdates =
      lucideIcon(
        "TipsAndUpdates",
        filled = false,
        "M15 14c.2-1 .7-1.7 1.5-2.5 1-.9 1.5-2.2 1.5-3.5A6 6 0 0 0 6 8c0 1 .2 2.2 1.5 3.5.7.7 1.3 1.5 1.5 2.5",
        "M9 18h6",
        "M10 22h4",
      )
    return _TipsAndUpdates!!
  }

private var _TipsAndUpdates: ImageVector? = null
