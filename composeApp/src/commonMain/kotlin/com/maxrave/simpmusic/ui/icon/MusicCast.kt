package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "cast" (ISC licence, lucide.dev).
val SimpIcons.MusicCast: ImageVector
  get() {
    if (_MusicCast != null) {
      return _MusicCast!!
    }
    _MusicCast =
      lucideIcon(
        "MusicCast",
        filled = false,
        "M2 8V6a2 2 0 0 1 2-2h16a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2h-6",
        "M2 12a9 9 0 0 1 8 8",
        "M2 16a5 5 0 0 1 4 4",
        "M2 20L2.01 20",
      )
    return _MusicCast!!
  }

private var _MusicCast: ImageVector? = null
