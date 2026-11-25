package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "server" (ISC licence, lucide.dev).
val SimpIcons.Dns: ImageVector
  get() {
    if (_Dns != null) {
      return _Dns!!
    }
    _Dns =
      lucideIcon(
        "Dns",
        filled = false,
        "M4 2h16a2 2 0 0 1 2 2v4a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2v-4a2 2 0 0 1 2 -2Z",
        "M4 14h16a2 2 0 0 1 2 2v4a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2v-4a2 2 0 0 1 2 -2Z",
        "M6 6L6.01 6",
        "M6 18L6.01 18",
      )
    return _Dns!!
  }

private var _Dns: ImageVector? = null
