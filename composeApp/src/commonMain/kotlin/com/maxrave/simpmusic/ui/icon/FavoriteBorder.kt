package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "heart" (ISC licence, lucide.dev).
val SimpIcons.FavoriteBorder: ImageVector
  get() {
    if (_FavoriteBorder != null) {
      return _FavoriteBorder!!
    }
    _FavoriteBorder =
      lucideIcon(
        "FavoriteBorder",
        filled = false,
        "M19 14c1.49-1.46 3-3.21 3-5.5A5.5 5.5 0 0 0 16.5 3c-1.76 0-3 .5-4.5 2-1.5-1.5-2.74-2-4.5-2A5.5 5.5 0 0 0 2 8.5c0 2.3 1.5 4.05 3 5.5l7 7Z",
      )
    return _FavoriteBorder!!
  }

private var _FavoriteBorder: ImageVector? = null
