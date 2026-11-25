package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "panel-left-close" (ISC licence, lucide.dev).
val SimpIcons.LeftPanelClose: ImageVector
  get() {
    if (_LeftPanelClose != null) {
      return _LeftPanelClose!!
    }
    _LeftPanelClose =
      lucideIcon(
        "LeftPanelClose",
        filled = false,
        "M5 3h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-14a2 2 0 0 1 2 -2Z",
        "M9 3v18",
        "m16 15-3-3 3-3",
      )
    return _LeftPanelClose!!
  }

private var _LeftPanelClose: ImageVector? = null
