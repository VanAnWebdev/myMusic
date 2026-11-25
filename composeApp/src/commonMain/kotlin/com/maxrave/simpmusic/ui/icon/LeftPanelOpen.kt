package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "panel-left-open" (ISC licence, lucide.dev).
val SimpIcons.LeftPanelOpen: ImageVector
  get() {
    if (_LeftPanelOpen != null) {
      return _LeftPanelOpen!!
    }
    _LeftPanelOpen =
      lucideIcon(
        "LeftPanelOpen",
        filled = false,
        "M5 3h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-14a2 2 0 0 1 2 -2Z",
        "M9 3v18",
        "m14 9 3 3-3 3",
      )
    return _LeftPanelOpen!!
  }

private var _LeftPanelOpen: ImageVector? = null
