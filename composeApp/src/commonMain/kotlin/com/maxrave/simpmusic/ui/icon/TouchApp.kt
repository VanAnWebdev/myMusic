package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "pointer" (ISC licence, lucide.dev).
val SimpIcons.TouchApp: ImageVector
  get() {
    if (_TouchApp != null) {
      return _TouchApp!!
    }
    _TouchApp =
      lucideIcon(
        "TouchApp",
        filled = false,
        "M22 14a8 8 0 0 1-8 8",
        "M18 11v-1a2 2 0 0 0-2-2a2 2 0 0 0-2 2",
        "M14 10V9a2 2 0 0 0-2-2a2 2 0 0 0-2 2v1",
        "M10 9.5V4a2 2 0 0 0-2-2a2 2 0 0 0-2 2v10",
        "M18 11a2 2 0 1 1 4 0v3a8 8 0 0 1-8 8h-2c-2.8 0-4.5-.86-5.99-2.34l-3.6-3.6a2 2 0 0 1 2.83-2.82L7 15",
      )
    return _TouchApp!!
  }

private var _TouchApp: ImageVector? = null
