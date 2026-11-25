package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "check" (ISC licence, lucide.dev).
val SimpIcons.Check: ImageVector
  get() {
    if (_Check != null) {
      return _Check!!
    }
    _Check =
      lucideIcon(
        "Check",
        filled = false,
        "M20 6 9 17l-5-5",
      )
    return _Check!!
  }

private var _Check: ImageVector? = null
