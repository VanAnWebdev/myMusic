package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "headphones" (ISC licence, lucide.dev).
val SimpIcons.Headphones: ImageVector
  get() {
    if (_Headphones != null) {
      return _Headphones!!
    }
    _Headphones =
      lucideIcon(
        "Headphones",
        filled = false,
        "M3 14h3a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-7a9 9 0 0 1 18 0v7a2 2 0 0 1-2 2h-1a2 2 0 0 1-2-2v-3a2 2 0 0 1 2-2h3",
      )
    return _Headphones!!
  }

private var _Headphones: ImageVector? = null
