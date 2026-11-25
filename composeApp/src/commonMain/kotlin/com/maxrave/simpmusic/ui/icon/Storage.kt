package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "hard-drive" (ISC licence, lucide.dev).
val SimpIcons.Storage: ImageVector
  get() {
    if (_Storage != null) {
      return _Storage!!
    }
    _Storage =
      lucideIcon(
        "Storage",
        filled = false,
        "M22 12L2 12",
        "M5.45 5.11 2 12v6a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2v-6l-3.45-6.89A2 2 0 0 0 16.76 4H7.24a2 2 0 0 0-1.79 1.11z",
        "M6 16L6.01 16",
        "M10 16L10.01 16",
      )
    return _Storage!!
  }

private var _Storage: ImageVector? = null
