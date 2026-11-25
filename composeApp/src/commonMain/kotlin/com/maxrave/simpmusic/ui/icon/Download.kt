package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "download" (ISC licence, lucide.dev).
val SimpIcons.Download: ImageVector
  get() {
    if (_Download != null) {
      return _Download!!
    }
    _Download =
      lucideIcon(
        "Download",
        filled = false,
        "M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4",
        "M7 10 L12 15 L17 10",
        "M12 15L12 3",
      )
    return _Download!!
  }

private var _Download: ImageVector? = null
