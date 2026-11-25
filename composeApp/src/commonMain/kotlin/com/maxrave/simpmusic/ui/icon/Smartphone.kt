package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "smartphone" (ISC licence, lucide.dev).
val SimpIcons.Smartphone: ImageVector
  get() {
    if (_Smartphone != null) {
      return _Smartphone!!
    }
    _Smartphone =
      lucideIcon(
        "Smartphone",
        filled = false,
        "M7 2h10a2 2 0 0 1 2 2v16a2 2 0 0 1 -2 2h-10a2 2 0 0 1 -2 -2v-16a2 2 0 0 1 2 -2Z",
        "M12 18h.01",
      )
    return _Smartphone!!
  }

private var _Smartphone: ImageVector? = null
