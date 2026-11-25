package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "archive-restore" (ISC licence, lucide.dev).
val SimpIcons.Restore: ImageVector
  get() {
    if (_Restore != null) {
      return _Restore!!
    }
    _Restore =
      lucideIcon(
        "Restore",
        filled = false,
        "M3 3h18a1 1 0 0 1 1 1v3a1 1 0 0 1 -1 1h-18a1 1 0 0 1 -1 -1v-3a1 1 0 0 1 1 -1Z",
        "M4 8v11a2 2 0 0 0 2 2h2",
        "M20 8v11a2 2 0 0 1-2 2h-2",
        "m9 15 3-3 3 3",
        "M12 12v9",
      )
    return _Restore!!
  }

private var _Restore: ImageVector? = null
