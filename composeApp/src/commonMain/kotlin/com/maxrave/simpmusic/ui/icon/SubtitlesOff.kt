package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "captions-off" (ISC licence, lucide.dev).
val SimpIcons.SubtitlesOff: ImageVector
  get() {
    if (_SubtitlesOff != null) {
      return _SubtitlesOff!!
    }
    _SubtitlesOff =
      lucideIcon(
        "SubtitlesOff",
        filled = false,
        "M10.5 5H19a2 2 0 0 1 2 2v8.5",
        "M17 11h-.5",
        "M19 19H5a2 2 0 0 1-2-2V7a2 2 0 0 1 2-2",
        "m2 2 20 20",
        "M7 11h4",
        "M7 15h2.5",
      )
    return _SubtitlesOff!!
  }

private var _SubtitlesOff: ImageVector? = null
