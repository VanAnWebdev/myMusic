package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "undo-2" (ISC licence, lucide.dev).
val SimpIcons.Replay5: ImageVector
  get() {
    if (_Replay5 != null) {
      return _Replay5!!
    }
    _Replay5 =
      lucideIcon(
        "Replay5",
        filled = false,
        "M9 14 4 9l5-5",
        "M4 9h10.5a5.5 5.5 0 0 1 5.5 5.5a5.5 5.5 0 0 1-5.5 5.5H11",
      )
    return _Replay5!!
  }

private var _Replay5: ImageVector? = null
