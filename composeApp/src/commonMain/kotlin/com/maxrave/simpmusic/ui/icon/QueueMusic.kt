package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "list-music" (ISC licence, lucide.dev).
val SimpIcons.QueueMusic: ImageVector
  get() {
    if (_QueueMusic != null) {
      return _QueueMusic!!
    }
    _QueueMusic =
      lucideIcon(
        "QueueMusic",
        filled = false,
        "M21 15V6",
        "M18.5 18a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5Z",
        "M12 12H3",
        "M16 6H3",
        "M12 18H3",
      )
    return _QueueMusic!!
  }

private var _QueueMusic: ImageVector? = null
