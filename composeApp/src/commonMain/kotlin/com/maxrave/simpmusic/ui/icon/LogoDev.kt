package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "code-xml" (ISC licence, lucide.dev).
val SimpIcons.LogoDev: ImageVector
  get() {
    if (_LogoDev != null) {
      return _LogoDev!!
    }
    _LogoDev =
      lucideIcon(
        "LogoDev",
        filled = false,
        "m18 16 4-4-4-4",
        "m6 8-4 4 4 4",
        "m14.5 4-5 16",
      )
    return _LogoDev!!
  }

private var _LogoDev: ImageVector? = null
