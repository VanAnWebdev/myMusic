package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "loader" (ISC licence, lucide.dev).
val SimpIcons.Downloading: ImageVector
  get() {
    if (_Downloading != null) {
      return _Downloading!!
    }
    _Downloading =
      lucideIcon(
        "Downloading",
        filled = false,
        "M12 2v4",
        "m16.2 7.8 2.9-2.9",
        "M18 12h4",
        "m16.2 16.2 2.9 2.9",
        "M12 18v4",
        "m4.9 19.1 2.9-2.9",
        "M2 12h4",
        "m4.9 4.9 2.9 2.9",
      )
    return _Downloading!!
  }

private var _Downloading: ImageVector? = null
