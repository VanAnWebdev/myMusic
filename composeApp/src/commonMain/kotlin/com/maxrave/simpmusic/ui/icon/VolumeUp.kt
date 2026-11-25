package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "volume-2" (ISC licence, lucide.dev).
val SimpIcons.VolumeUp: ImageVector
  get() {
    if (_VolumeUp != null) {
      return _VolumeUp!!
    }
    _VolumeUp =
      lucideIcon(
        "VolumeUp",
        filled = false,
        "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z",
        "M16 9a5 5 0 0 1 0 6",
        "M19.364 18.364a9 9 0 0 0 0-12.728",
      )
    return _VolumeUp!!
  }

private var _VolumeUp: ImageVector? = null
