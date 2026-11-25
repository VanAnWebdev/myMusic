package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "languages" (ISC licence, lucide.dev).
val SimpIcons.Translate: ImageVector
  get() {
    if (_Translate != null) {
      return _Translate!!
    }
    _Translate =
      lucideIcon(
        "Translate",
        filled = false,
        "m5 8 6 6",
        "m4 14 6-6 2-3",
        "M2 5h12",
        "M7 2h1",
        "m22 22-5-10-5 10",
        "M14 18h6",
      )
    return _Translate!!
  }

private var _Translate: ImageVector? = null
