package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "maximize-2" (ISC licence, lucide.dev).
val SimpIcons.OpenInFull: ImageVector
  get() {
    if (_OpenInFull != null) {
      return _OpenInFull!!
    }
    _OpenInFull =
      lucideIcon(
        "OpenInFull",
        filled = false,
        "M15 3 L21 3 L21 9",
        "M9 21 L3 21 L3 15",
        "M21 3L14 10",
        "M3 21L10 14",
      )
    return _OpenInFull!!
  }

private var _OpenInFull: ImageVector? = null
