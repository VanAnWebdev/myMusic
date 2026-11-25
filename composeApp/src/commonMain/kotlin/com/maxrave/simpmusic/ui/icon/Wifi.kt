package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "wifi" (ISC licence, lucide.dev).
val SimpIcons.Wifi: ImageVector
  get() {
    if (_Wifi != null) {
      return _Wifi!!
    }
    _Wifi =
      lucideIcon(
        "Wifi",
        filled = false,
        "M12 20h.01",
        "M2 8.82a15 15 0 0 1 20 0",
        "M5 12.859a10 10 0 0 1 14 0",
        "M8.5 16.429a5 5 0 0 1 7 0",
      )
    return _Wifi!!
  }

private var _Wifi: ImageVector? = null
