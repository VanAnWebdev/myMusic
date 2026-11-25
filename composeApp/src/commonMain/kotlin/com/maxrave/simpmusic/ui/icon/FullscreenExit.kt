package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "minimize" (ISC licence, lucide.dev).
val SimpIcons.FullscreenExit: ImageVector
  get() {
    if (_FullscreenExit != null) {
      return _FullscreenExit!!
    }
    _FullscreenExit =
      lucideIcon(
        "FullscreenExit",
        filled = false,
        "M8 3v3a2 2 0 0 1-2 2H3",
        "M21 8h-3a2 2 0 0 1-2-2V3",
        "M3 16h3a2 2 0 0 1 2 2v3",
        "M16 21v-3a2 2 0 0 1 2-2h3",
      )
    return _FullscreenExit!!
  }

private var _FullscreenExit: ImageVector? = null
