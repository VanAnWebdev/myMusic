package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "file-input" (ISC licence, lucide.dev).
val SimpIcons.FileOpen: ImageVector
  get() {
    if (_FileOpen != null) {
      return _FileOpen!!
    }
    _FileOpen =
      lucideIcon(
        "FileOpen",
        filled = false,
        "M4 22h14a2 2 0 0 0 2-2V7l-5-5H6a2 2 0 0 0-2 2v4",
        "M14 2v4a2 2 0 0 0 2 2h4",
        "M2 15h10",
        "m9 18 3-3-3-3",
      )
    return _FileOpen!!
  }

private var _FileOpen: ImageVector? = null
