package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "list-plus" (ISC licence, lucide.dev).
val SimpIcons.PlaylistAdd: ImageVector
  get() {
    if (_PlaylistAdd != null) {
      return _PlaylistAdd!!
    }
    _PlaylistAdd =
      lucideIcon(
        "PlaylistAdd",
        filled = false,
        "M11 12H3",
        "M16 6H3",
        "M16 18H3",
        "M18 9v6",
        "M21 12h-6",
      )
    return _PlaylistAdd!!
  }

private var _PlaylistAdd: ImageVector? = null
