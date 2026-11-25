package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "log-out" (ISC licence, lucide.dev).
val SimpIcons.Logout: ImageVector
  get() {
    if (_Logout != null) {
      return _Logout!!
    }
    _Logout =
      lucideIcon(
        "Logout",
        filled = false,
        "M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4",
        "M16 17 L21 12 L16 7",
        "M21 12L9 12",
      )
    return _Logout!!
  }

private var _Logout: ImageVector? = null
