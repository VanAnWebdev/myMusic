package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-check" (ISC licence, lucide.dev).
val SimpIcons.CheckCircle: ImageVector
  get() {
    if (_CheckCircle != null) {
      return _CheckCircle!!
    }
    _CheckCircle =
      lucideIcon(
        "CheckCircle",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "m9 12 2 2 4-4",
      )
    return _CheckCircle!!
  }

private var _CheckCircle: ImageVector? = null
