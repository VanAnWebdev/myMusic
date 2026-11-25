package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "audio-lines" (ISC licence, lucide.dev).
val SimpIcons.GraphicEq: ImageVector
  get() {
    if (_GraphicEq != null) {
      return _GraphicEq!!
    }
    _GraphicEq =
      lucideIcon(
        "GraphicEq",
        filled = false,
        "M2 10v3",
        "M6 6v11",
        "M10 3v18",
        "M14 8v7",
        "M18 5v13",
        "M22 10v3",
      )
    return _GraphicEq!!
  }

private var _GraphicEq: ImageVector? = null
