package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "monitor-smartphone" (ISC licence, lucide.dev).
val SimpIcons.Devices: ImageVector
  get() {
    if (_Devices != null) {
      return _Devices!!
    }
    _Devices =
      lucideIcon(
        "Devices",
        filled = false,
        "M18 8V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v7a2 2 0 0 0 2 2h8",
        "M10 19v-3.96 3.15",
        "M7 19h5",
        "M18 12h2a2 2 0 0 1 2 2v6a2 2 0 0 1 -2 2h-2a2 2 0 0 1 -2 -2v-6a2 2 0 0 1 2 -2Z",
      )
    return _Devices!!
  }

private var _Devices: ImageVector? = null
