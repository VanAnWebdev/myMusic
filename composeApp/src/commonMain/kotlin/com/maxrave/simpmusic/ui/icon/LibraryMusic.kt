package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "library" (ISC licence, lucide.dev).
val SimpIcons.LibraryMusic: ImageVector
  get() {
    if (_LibraryMusic != null) {
      return _LibraryMusic!!
    }
    _LibraryMusic =
      lucideIcon(
        "LibraryMusic",
        filled = false,
        "m16 6 4 14",
        "M12 6v14",
        "M8 8v12",
        "M4 4v16",
      )
    return _LibraryMusic!!
  }

private var _LibraryMusic: ImageVector? = null
