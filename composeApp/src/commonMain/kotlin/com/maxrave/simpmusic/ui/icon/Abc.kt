package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "case-sensitive" (ISC licence, lucide.dev).
val SimpIcons.Abc: ImageVector
  get() {
    if (_Abc != null) {
      return _Abc!!
    }
    _Abc =
      lucideIcon(
        "Abc",
        filled = false,
        "m3 15 4-8 4 8",
        "M4 13h6",
        "M15 12a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
        "M21 9v6",
      )
    return _Abc!!
  }

private var _Abc: ImageVector? = null
