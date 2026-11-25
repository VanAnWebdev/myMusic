package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "share-2" (ISC licence, lucide.dev).
val SimpIcons.Share: ImageVector
  get() {
    if (_Share != null) {
      return _Share!!
    }
    _Share =
      lucideIcon(
        "Share",
        filled = false,
        "M15 5a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
        "M3 12a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
        "M15 19a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
        "M8.59 13.51L15.42 17.49",
        "M15.41 6.51L8.59 10.49",
      )
    return _Share!!
  }

private var _Share: ImageVector? = null
