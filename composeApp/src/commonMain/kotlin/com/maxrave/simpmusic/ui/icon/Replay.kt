package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "rotate-ccw" (ISC licence, lucide.dev).
val SimpIcons.Replay: ImageVector
  get() {
    if (_Replay != null) {
      return _Replay!!
    }
    _Replay =
      lucideIcon(
        "Replay",
        filled = false,
        "M3 12a9 9 0 1 0 9-9 9.75 9.75 0 0 0-6.74 2.74L3 8",
        "M3 3v5h5",
      )
    return _Replay!!
  }

private var _Replay: ImageVector? = null
