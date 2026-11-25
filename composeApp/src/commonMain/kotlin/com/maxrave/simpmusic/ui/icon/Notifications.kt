package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "bell" (ISC licence, lucide.dev).
val SimpIcons.Notifications: ImageVector
  get() {
    if (_Notifications != null) {
      return _Notifications!!
    }
    _Notifications =
      lucideIcon(
        "Notifications",
        filled = false,
        "M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9",
        "M10.3 21a1.94 1.94 0 0 0 3.4 0",
      )
    return _Notifications!!
  }

private var _Notifications: ImageVector? = null
