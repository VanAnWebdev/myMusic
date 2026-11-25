package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "badge-alert" (ISC licence, lucide.dev).
val SimpIcons.Explicit: ImageVector
  get() {
    if (_Explicit != null) {
      return _Explicit!!
    }
    _Explicit =
      lucideIcon(
        "Explicit",
        filled = false,
        "M3.85 8.62a4 4 0 0 1 4.78-4.77 4 4 0 0 1 6.74 0 4 4 0 0 1 4.78 4.78 4 4 0 0 1 0 6.74 4 4 0 0 1-4.77 4.78 4 4 0 0 1-6.75 0 4 4 0 0 1-4.78-4.77 4 4 0 0 1 0-6.76Z",
        "M12 8L12 12",
        "M12 16L12.01 16",
      )
    return _Explicit!!
  }

private var _Explicit: ImageVector? = null
