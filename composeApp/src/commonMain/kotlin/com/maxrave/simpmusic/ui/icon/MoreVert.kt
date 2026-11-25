package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "ellipsis-vertical" (ISC licence, lucide.dev).
val SimpIcons.MoreVert: ImageVector
  get() {
    if (_MoreVert != null) {
      return _MoreVert!!
    }
    _MoreVert =
      lucideIcon(
        "MoreVert",
        filled = false,
        "M11 12a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M11 5a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M11 19a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
      )
    return _MoreVert!!
  }

private var _MoreVert: ImageVector? = null
