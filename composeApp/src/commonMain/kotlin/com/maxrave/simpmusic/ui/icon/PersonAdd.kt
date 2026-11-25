package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "user-plus" (ISC licence, lucide.dev).
val SimpIcons.PersonAdd: ImageVector
  get() {
    if (_PersonAdd != null) {
      return _PersonAdd!!
    }
    _PersonAdd =
      lucideIcon(
        "PersonAdd",
        filled = false,
        "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2",
        "M5 7a4 4 0 1 0 8 0a4 4 0 1 0 -8 0",
        "M19 8L19 14",
        "M22 11L16 11",
      )
    return _PersonAdd!!
  }

private var _PersonAdd: ImageVector? = null
