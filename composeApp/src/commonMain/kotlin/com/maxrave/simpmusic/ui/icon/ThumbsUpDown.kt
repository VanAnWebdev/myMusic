package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "thumbs-up" (ISC licence, lucide.dev).
val SimpIcons.ThumbsUpDown: ImageVector
  get() {
    if (_ThumbsUpDown != null) {
      return _ThumbsUpDown!!
    }
    _ThumbsUpDown =
      lucideIcon(
        "ThumbsUpDown",
        filled = false,
        "M7 10v12",
        "M15 5.88 14 10h5.83a2 2 0 0 1 1.92 2.56l-2.33 8A2 2 0 0 1 17.5 22H4a2 2 0 0 1-2-2v-8a2 2 0 0 1 2-2h2.76a2 2 0 0 0 1.79-1.11L12 2a3.13 3.13 0 0 1 3 3.88Z",
      )
    return _ThumbsUpDown!!
  }

private var _ThumbsUpDown: ImageVector? = null
