package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "user" (ISC licence, lucide.dev).
val SimpIcons.Person: ImageVector
  get() {
    if (_Person != null) {
      return _Person!!
    }
    _Person =
      lucideIcon(
        "Person",
        filled = false,
        "M19 21v-2a4 4 0 0 0-4-4H9a4 4 0 0 0-4 4v2",
        "M8 7a4 4 0 1 0 8 0a4 4 0 1 0 -8 0",
      )
    return _Person!!
  }

private var _Person: ImageVector? = null
