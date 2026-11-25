package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-plus" (ISC licence, lucide.dev).
val SimpIcons.AddCircleOutline: ImageVector
  get() {
    if (_AddCircleOutline != null) {
      return _AddCircleOutline!!
    }
    _AddCircleOutline =
      lucideIcon(
        "AddCircleOutline",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M8 12h8",
        "M12 8v8",
      )
    return _AddCircleOutline!!
  }

private var _AddCircleOutline: ImageVector? = null
