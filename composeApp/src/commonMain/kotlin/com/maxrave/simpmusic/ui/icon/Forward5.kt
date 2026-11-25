package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "redo-2" (ISC licence, lucide.dev).
val SimpIcons.Forward5: ImageVector
  get() {
    if (_Forward5 != null) {
      return _Forward5!!
    }
    _Forward5 =
      lucideIcon(
        "Forward5",
        filled = false,
        "m15 14 5-5-5-5",
        "M20 9H9.5A5.5 5.5 0 0 0 4 14.5A5.5 5.5 0 0 0 9.5 20H13",
      )
    return _Forward5!!
  }

private var _Forward5: ImageVector? = null
