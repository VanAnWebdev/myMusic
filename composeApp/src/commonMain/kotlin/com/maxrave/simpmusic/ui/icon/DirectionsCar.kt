package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "car" (ISC licence, lucide.dev).
val SimpIcons.DirectionsCar: ImageVector
  get() {
    if (_DirectionsCar != null) {
      return _DirectionsCar!!
    }
    _DirectionsCar =
      lucideIcon(
        "DirectionsCar",
        filled = false,
        "M19 17h2c.6 0 1-.4 1-1v-3c0-.9-.7-1.7-1.5-1.9C18.7 10.6 16 10 16 10s-1.3-1.4-2.2-2.3c-.5-.4-1.1-.7-1.8-.7H5c-.6 0-1.1.4-1.4.9l-1.4 2.9A3.7 3.7 0 0 0 2 12v4c0 .6.4 1 1 1h2",
        "M5 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
        "M9 17h6",
        "M15 17a2 2 0 1 0 4 0a2 2 0 1 0 -4 0",
      )
    return _DirectionsCar!!
  }

private var _DirectionsCar: ImageVector? = null
