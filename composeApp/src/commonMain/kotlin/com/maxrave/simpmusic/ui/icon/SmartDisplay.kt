package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "tv-minimal-play" (ISC licence, lucide.dev).
val SimpIcons.SmartDisplay: ImageVector
  get() {
    if (_SmartDisplay != null) {
      return _SmartDisplay!!
    }
    _SmartDisplay =
      lucideIcon(
        "SmartDisplay",
        filled = false,
        "M10 7.75a.75.75 0 0 1 1.142-.638l3.664 2.249a.75.75 0 0 1 0 1.278l-3.664 2.25a.75.75 0 0 1-1.142-.64z",
        "M7 21h10",
        "M4 3h16a2 2 0 0 1 2 2v10a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2v-10a2 2 0 0 1 2 -2Z",
      )
    return _SmartDisplay!!
  }

private var _SmartDisplay: ImageVector? = null
