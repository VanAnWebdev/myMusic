package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "pin" (ISC licence, lucide.dev).
val SimpIcons.PushPin: ImageVector
  get() {
    if (_PushPin != null) {
      return _PushPin!!
    }
    _PushPin =
      lucideIcon(
        "PushPin",
        filled = false,
        "M12 17v5",
        "M9 10.76a2 2 0 0 1-1.11 1.79l-1.78.9A2 2 0 0 0 5 15.24V16a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-.76a2 2 0 0 0-1.11-1.79l-1.78-.9A2 2 0 0 1 15 10.76V7a1 1 0 0 1 1-1 2 2 0 0 0 0-4H8a2 2 0 0 0 0 4 1 1 0 0 1 1 1z",
      )
    return _PushPin!!
  }

private var _PushPin: ImageVector? = null
