package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "check" (ISC licence, lucide.dev).
val SimpIcons.Done: ImageVector
  get() {
    if (_Done != null) {
      return _Done!!
    }
    _Done =
      lucideIcon(
        "Done",
        filled = false,
        "M20 6 9 17l-5-5",
      )
    return _Done!!
  }

private var _Done: ImageVector? = null
