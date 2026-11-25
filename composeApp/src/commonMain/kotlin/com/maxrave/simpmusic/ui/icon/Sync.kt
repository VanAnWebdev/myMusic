package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "refresh-ccw" (ISC licence, lucide.dev).
val SimpIcons.Sync: ImageVector
  get() {
    if (_Sync != null) {
      return _Sync!!
    }
    _Sync =
      lucideIcon(
        "Sync",
        filled = false,
        "M21 12a9 9 0 0 0-9-9 9.75 9.75 0 0 0-6.74 2.74L3 8",
        "M3 3v5h5",
        "M3 12a9 9 0 0 0 9 9 9.75 9.75 0 0 0 6.74-2.74L21 16",
        "M16 16h5v5",
      )
    return _Sync!!
  }

private var _Sync: ImageVector? = null
