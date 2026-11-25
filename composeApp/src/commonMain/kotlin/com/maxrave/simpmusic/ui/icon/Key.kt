package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "key-round" (ISC licence, lucide.dev).
val SimpIcons.Key: ImageVector
  get() {
    if (_Key != null) {
      return _Key!!
    }
    _Key =
      lucideIcon(
        "Key",
        filled = false,
        "M2.586 17.414A2 2 0 0 0 2 18.828V21a1 1 0 0 0 1 1h3a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h1a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h.172a2 2 0 0 0 1.414-.586l.814-.814a6.5 6.5 0 1 0-4-4z",
        "M16 7.5a0.5 0.5 0 1 0 1 0a0.5 0.5 0 1 0 -1 0",
      )
    return _Key!!
  }

private var _Key: ImageVector? = null
