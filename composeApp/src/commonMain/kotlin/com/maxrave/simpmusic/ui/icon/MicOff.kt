package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "mic-off" (ISC licence, lucide.dev).
val SimpIcons.MicOff: ImageVector
  get() {
    if (_MicOff != null) {
      return _MicOff!!
    }
    _MicOff =
      lucideIcon(
        "MicOff",
        filled = false,
        "M2 2L22 22",
        "M18.89 13.23A7.12 7.12 0 0 0 19 12v-2",
        "M5 10v2a7 7 0 0 0 12 5",
        "M15 9.34V5a3 3 0 0 0-5.68-1.33",
        "M9 9v3a3 3 0 0 0 5.12 2.12",
        "M12 19L12 22",
      )
    return _MicOff!!
  }

private var _MicOff: ImageVector? = null
