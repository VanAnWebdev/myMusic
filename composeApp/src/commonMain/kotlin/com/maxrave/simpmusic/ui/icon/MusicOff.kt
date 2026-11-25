package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "volume-x" (ISC licence, lucide.dev).
val SimpIcons.MusicOff: ImageVector
  get() {
    if (_MusicOff != null) {
      return _MusicOff!!
    }
    _MusicOff =
      lucideIcon(
        "MusicOff",
        filled = false,
        "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z",
        "M22 9L16 15",
        "M16 9L22 15",
      )
    return _MusicOff!!
  }

private var _MusicOff: ImageVector? = null
