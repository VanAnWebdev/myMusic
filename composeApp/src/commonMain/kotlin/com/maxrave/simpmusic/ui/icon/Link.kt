package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "link" (ISC licence, lucide.dev).
val SimpIcons.Link: ImageVector
  get() {
    if (_Link != null) {
      return _Link!!
    }
    _Link =
      lucideIcon(
        "Link",
        filled = false,
        "M10 13a5 5 0 0 0 7.54.54l3-3a5 5 0 0 0-7.07-7.07l-1.72 1.71",
        "M14 11a5 5 0 0 0-7.54-.54l-3 3a5 5 0 0 0 7.07 7.07l1.71-1.71",
      )
    return _Link!!
  }

private var _Link: ImageVector? = null
