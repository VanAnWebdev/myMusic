package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "trash-2" (ISC licence, lucide.dev).
val SimpIcons.Delete: ImageVector
  get() {
    if (_Delete != null) {
      return _Delete!!
    }
    _Delete =
      lucideIcon(
        "Delete",
        filled = false,
        "M3 6h18",
        "M19 6v14c0 1-1 2-2 2H7c-1 0-2-1-2-2V6",
        "M8 6V4c0-1 1-2 2-2h4c1 0 2 1 2 2v2",
        "M10 11L10 17",
        "M14 11L14 17",
      )
    return _Delete!!
  }

private var _Delete: ImageVector? = null
