package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "arrow-up-right" (ISC licence, lucide.dev).
val SimpIcons.ArrowOutward: ImageVector
  get() {
    if (_ArrowOutward != null) {
      return _ArrowOutward!!
    }
    _ArrowOutward =
      lucideIcon(
        "ArrowOutward",
        filled = false,
        "M7 7h10v10",
        "M7 17 17 7",
      )
    return _ArrowOutward!!
  }

private var _ArrowOutward: ImageVector? = null
