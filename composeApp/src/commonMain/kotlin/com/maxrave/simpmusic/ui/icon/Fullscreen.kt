package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "maximize" (ISC licence, lucide.dev).
val SimpIcons.Fullscreen: ImageVector
  get() {
    if (_Fullscreen != null) {
      return _Fullscreen!!
    }
    _Fullscreen =
      lucideIcon(
        "Fullscreen",
        filled = false,
        "M8 3H5a2 2 0 0 0-2 2v3",
        "M21 8V5a2 2 0 0 0-2-2h-3",
        "M3 16v3a2 2 0 0 0 2 2h3",
        "M16 21h3a2 2 0 0 0 2-2v-3",
      )
    return _Fullscreen!!
  }

private var _Fullscreen: ImageVector? = null
