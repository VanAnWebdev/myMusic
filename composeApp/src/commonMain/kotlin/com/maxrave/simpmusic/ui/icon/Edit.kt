package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "pencil" (ISC licence, lucide.dev).
val SimpIcons.Edit: ImageVector
  get() {
    if (_Edit != null) {
      return _Edit!!
    }
    _Edit =
      lucideIcon(
        "Edit",
        filled = false,
        "M21.174 6.812a1 1 0 0 0-3.986-3.987L3.842 16.174a2 2 0 0 0-.5.83l-1.321 4.352a.5.5 0 0 0 .623.622l4.353-1.32a2 2 0 0 0 .83-.497z",
        "m15 5 4 4",
      )
    return _Edit!!
  }

private var _Edit: ImageVector? = null
