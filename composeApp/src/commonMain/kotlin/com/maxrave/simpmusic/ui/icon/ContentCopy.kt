package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "copy" (ISC licence, lucide.dev).
val SimpIcons.ContentCopy: ImageVector
  get() {
    if (_ContentCopy != null) {
      return _ContentCopy!!
    }
    _ContentCopy =
      lucideIcon(
        "ContentCopy",
        filled = false,
        "M10 8h10a2 2 0 0 1 2 2v10a2 2 0 0 1 -2 2h-10a2 2 0 0 1 -2 -2v-10a2 2 0 0 1 2 -2Z",
        "M4 16c-1.1 0-2-.9-2-2V4c0-1.1.9-2 2-2h10c1.1 0 2 .9 2 2",
      )
    return _ContentCopy!!
  }

private var _ContentCopy: ImageVector? = null
