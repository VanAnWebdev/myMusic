package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "message-square" (ISC licence, lucide.dev).
val SimpIcons.CommentOutline: ImageVector
  get() {
    if (_CommentOutline != null) {
      return _CommentOutline!!
    }
    _CommentOutline =
      lucideIcon(
        "CommentOutline",
        filled = false,
        "M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z",
      )
    return _CommentOutline!!
  }

private var _CommentOutline: ImageVector? = null
