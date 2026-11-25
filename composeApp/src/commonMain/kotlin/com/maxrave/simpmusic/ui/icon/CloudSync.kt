package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "refresh-cw" (ISC licence, lucide.dev).
val SimpIcons.CloudSync: ImageVector
  get() {
    if (_CloudSync != null) {
      return _CloudSync!!
    }
    _CloudSync =
      lucideIcon(
        "CloudSync",
        filled = false,
        "M3 12a9 9 0 0 1 9-9 9.75 9.75 0 0 1 6.74 2.74L21 8",
        "M21 3v5h-5",
        "M21 12a9 9 0 0 1-9 9 9.75 9.75 0 0 1-6.74-2.74L3 16",
        "M8 16H3v5",
      )
    return _CloudSync!!
  }

private var _CloudSync: ImageVector? = null
