package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "image" (ISC licence, lucide.dev).
val SimpIcons.Image: ImageVector
  get() {
    if (_Image != null) {
      return _Image!!
    }
    _Image =
      lucideIcon(
        "Image",
        filled = false,
        "M5 3h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-14a2 2 0 0 1 2 -2Z",
        "M7 9a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
        "m21 15-3.086-3.086a2 2 0 0 0-2.828 0L6 21",
      )
    return _Image!!
  }

private var _Image: ImageVector? = null
