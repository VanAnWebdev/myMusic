package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "grip-horizontal" (ISC licence, lucide.dev).
val SimpIcons.DragHandle: ImageVector
  get() {
    if (_DragHandle != null) {
      return _DragHandle!!
    }
    _DragHandle =
      lucideIcon(
        "DragHandle",
        filled = false,
        "M11 9a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M18 9a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M4 9a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M11 15a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M18 15a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
        "M4 15a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
      )
    return _DragHandle!!
  }

private var _DragHandle: ImageVector? = null
