package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "house" (ISC licence, lucide.dev).
val SimpIcons.Home: ImageVector
  get() {
    if (_Home != null) {
      return _Home!!
    }
    _Home =
      lucideIcon(
        "Home",
        filled = false,
        "M15 21v-8a1 1 0 0 0-1-1h-4a1 1 0 0 0-1 1v8",
        "M3 10a2 2 0 0 1 .709-1.528l7-5.999a2 2 0 0 1 2.582 0l7 5.999A2 2 0 0 1 21 10v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z",
      )
    return _Home!!
  }

private var _Home: ImageVector? = null
