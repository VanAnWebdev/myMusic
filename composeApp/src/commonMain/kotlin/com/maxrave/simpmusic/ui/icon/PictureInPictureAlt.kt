package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "picture-in-picture-2" (ISC licence, lucide.dev).
val SimpIcons.PictureInPictureAlt: ImageVector
  get() {
    if (_PictureInPictureAlt != null) {
      return _PictureInPictureAlt!!
    }
    _PictureInPictureAlt =
      lucideIcon(
        "PictureInPictureAlt",
        filled = false,
        "M21 9V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v10c0 1.1.9 2 2 2h4",
        "M14 13h6a2 2 0 0 1 2 2v3a2 2 0 0 1 -2 2h-6a2 2 0 0 1 -2 -2v-3a2 2 0 0 1 2 -2Z",
      )
    return _PictureInPictureAlt!!
  }

private var _PictureInPictureAlt: ImageVector? = null
