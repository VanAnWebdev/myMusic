package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "send" (ISC licence, lucide.dev).
val SimpIcons.Send: ImageVector
  get() {
    if (_Send != null) {
      return _Send!!
    }
    _Send =
      lucideIcon(
        "Send",
        filled = false,
        "M14.536 21.686a.5.5 0 0 0 .937-.024l6.5-19a.496.496 0 0 0-.635-.635l-19 6.5a.5.5 0 0 0-.024.937l7.93 3.18a2 2 0 0 1 1.112 1.11z",
        "m21.854 2.147-10.94 10.939",
      )
    return _Send!!
  }

private var _Send: ImageVector? = null
