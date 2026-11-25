package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "droplet" (ISC licence, lucide.dev).
val SimpIcons.WaterDrop: ImageVector
  get() {
    if (_WaterDrop != null) {
      return _WaterDrop!!
    }
    _WaterDrop =
      lucideIcon(
        "WaterDrop",
        filled = false,
        "M12 22a7 7 0 0 0 7-7c0-2-1-3.9-3-5.5s-3.5-4-4-6.5c-.5 2.5-2 4.9-4 6.5C6 11.1 5 13 5 15a7 7 0 0 0 7 7z",
      )
    return _WaterDrop!!
  }

private var _WaterDrop: ImageVector? = null
