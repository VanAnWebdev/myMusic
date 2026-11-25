package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "music" (ISC licence, lucide.dev).
val SimpIcons.MusicNote: ImageVector
  get() {
    if (_MusicNote != null) {
      return _MusicNote!!
    }
    _MusicNote =
      lucideIcon(
        "MusicNote",
        filled = false,
        "M9 18V5l12-2v13",
        "M3 18a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
        "M15 16a3 3 0 1 0 6 0a3 3 0 1 0 -6 0",
      )
    return _MusicNote!!
  }

private var _MusicNote: ImageVector? = null
