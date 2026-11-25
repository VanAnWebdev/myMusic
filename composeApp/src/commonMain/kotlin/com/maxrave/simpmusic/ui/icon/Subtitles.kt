package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "captions" (ISC licence, lucide.dev).
val SimpIcons.Subtitles: ImageVector
  get() {
    if (_Subtitles != null) {
      return _Subtitles!!
    }
    _Subtitles =
      lucideIcon(
        "Subtitles",
        filled = false,
        "M5 5h14a2 2 0 0 1 2 2v10a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-10a2 2 0 0 1 2 -2Z",
        "M7 15h4M15 15h2M7 11h2M13 11h4",
      )
    return _Subtitles!!
  }

private var _Subtitles: ImageVector? = null
