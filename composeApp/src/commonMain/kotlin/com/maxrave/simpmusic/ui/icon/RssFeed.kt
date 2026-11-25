package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "rss" (ISC licence, lucide.dev).
val SimpIcons.RssFeed: ImageVector
  get() {
    if (_RssFeed != null) {
      return _RssFeed!!
    }
    _RssFeed =
      lucideIcon(
        "RssFeed",
        filled = false,
        "M4 11a9 9 0 0 1 9 9",
        "M4 4a16 16 0 0 1 16 16",
        "M4 19a1 1 0 1 0 2 0a1 1 0 1 0 -2 0",
      )
    return _RssFeed!!
  }

private var _RssFeed: ImageVector? = null
