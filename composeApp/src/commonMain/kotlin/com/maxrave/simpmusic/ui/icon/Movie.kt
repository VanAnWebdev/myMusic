package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "clapperboard" (ISC licence, lucide.dev).
val SimpIcons.Movie: ImageVector
  get() {
    if (_Movie != null) {
      return _Movie!!
    }
    _Movie =
      lucideIcon(
        "Movie",
        filled = false,
        "M20.2 6 3 11l-.9-2.4c-.3-1.1.3-2.2 1.3-2.5l13.5-4c1.1-.3 2.2.3 2.5 1.3Z",
        "m6.2 5.3 3.1 3.9",
        "m12.4 3.4 3.1 4",
        "M3 11h18v8a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2Z",
      )
    return _Movie!!
  }

private var _Movie: ImageVector? = null
