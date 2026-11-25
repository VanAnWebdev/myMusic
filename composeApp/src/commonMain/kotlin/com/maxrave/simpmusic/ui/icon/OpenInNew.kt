package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "external-link" (ISC licence, lucide.dev).
val SimpIcons.OpenInNew: ImageVector
  get() {
    if (_OpenInNew != null) {
      return _OpenInNew!!
    }
    _OpenInNew =
      lucideIcon(
        "OpenInNew",
        filled = false,
        "M15 3h6v6",
        "M10 14 21 3",
        "M18 13v6a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h6",
      )
    return _OpenInNew!!
  }

private var _OpenInNew: ImageVector? = null
