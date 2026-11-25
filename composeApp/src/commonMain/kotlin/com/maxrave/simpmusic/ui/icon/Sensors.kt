package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "radio" (ISC licence, lucide.dev).
val SimpIcons.Sensors: ImageVector
  get() {
    if (_Sensors != null) {
      return _Sensors!!
    }
    _Sensors =
      lucideIcon(
        "Sensors",
        filled = false,
        "M4.9 19.1C1 15.2 1 8.8 4.9 4.9",
        "M7.8 16.2c-2.3-2.3-2.3-6.1 0-8.5",
        "M10 12a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
        "M16.2 7.8c2.3 2.3 2.3 6.1 0 8.5",
        "M19.1 4.9C23 8.8 23 15.1 19.1 19",
      )
    return _Sensors!!
  }

private var _Sensors: ImageVector? = null
