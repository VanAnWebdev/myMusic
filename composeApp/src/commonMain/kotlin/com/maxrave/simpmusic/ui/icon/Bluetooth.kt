package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "bluetooth" (ISC licence, lucide.dev).
val SimpIcons.Bluetooth: ImageVector
  get() {
    if (_Bluetooth != null) {
      return _Bluetooth!!
    }
    _Bluetooth =
      lucideIcon(
        "Bluetooth",
        filled = false,
        "m7 7 10 10-5 5V2l5 5L7 17",
      )
    return _Bluetooth!!
  }

private var _Bluetooth: ImageVector? = null
