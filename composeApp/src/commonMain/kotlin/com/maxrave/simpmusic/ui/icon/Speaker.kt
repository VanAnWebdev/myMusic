package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "speaker" (ISC licence, lucide.dev).
val SimpIcons.Speaker: ImageVector
  get() {
    if (_Speaker != null) {
      return _Speaker!!
    }
    _Speaker =
      lucideIcon(
        "Speaker",
        filled = false,
        "M6 2h12a2 2 0 0 1 2 2v16a2 2 0 0 1 -2 2h-12a2 2 0 0 1 -2 -2v-16a2 2 0 0 1 2 -2Z",
        "M12 6h.01",
        "M8 14a4 4 0 1 0 8 0a4 4 0 1 0 -8 0",
        "M12 14h.01",
      )
    return _Speaker!!
  }

private var _Speaker: ImageVector? = null
