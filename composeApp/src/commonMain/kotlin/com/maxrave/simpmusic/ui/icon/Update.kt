package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "clock-arrow-up" (ISC licence, lucide.dev).
val SimpIcons.Update: ImageVector
  get() {
    if (_Update != null) {
      return _Update!!
    }
    _Update =
      lucideIcon(
        "Update",
        filled = false,
        "M13.228 21.925A10 10 0 1 1 21.994 12.338",
        "M12 6v6l1.562.781",
        "m14 18 4-4 4 4",
        "M18 22v-8",
      )
    return _Update!!
  }

private var _Update: ImageVector? = null
