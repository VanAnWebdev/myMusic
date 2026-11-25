package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "rewind" (ISC licence, lucide.dev) — filled.
val SimpIcons.FastRewind: ImageVector
  get() {
    if (_FastRewind != null) {
      return _FastRewind!!
    }
    _FastRewind =
      lucideIcon(
        "FastRewind",
        filled = true,
        "M11 19 L2 12 L11 5 L11 19Z",
        "M22 19 L13 12 L22 5 L22 19Z",
      )
    return _FastRewind!!
  }

private var _FastRewind: ImageVector? = null
