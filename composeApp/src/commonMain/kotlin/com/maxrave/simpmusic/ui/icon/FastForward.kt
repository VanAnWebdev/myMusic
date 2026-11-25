package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "fast-forward" (ISC licence, lucide.dev) — filled.
val SimpIcons.FastForward: ImageVector
  get() {
    if (_FastForward != null) {
      return _FastForward!!
    }
    _FastForward =
      lucideIcon(
        "FastForward",
        filled = true,
        "M13 19 L22 12 L13 5 L13 19Z",
        "M2 19 L11 12 L2 5 L2 19Z",
      )
    return _FastForward!!
  }

private var _FastForward: ImageVector? = null
