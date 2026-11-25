package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "trending-up" (ISC licence, lucide.dev).
val SimpIcons.TrendingUp: ImageVector
  get() {
    if (_TrendingUp != null) {
      return _TrendingUp!!
    }
    _TrendingUp =
      lucideIcon(
        "TrendingUp",
        filled = false,
        "M22 7 L13.5 15.5 L8.5 10.5 L2 17",
        "M16 7 L22 7 L22 13",
      )
    return _TrendingUp!!
  }

private var _TrendingUp: ImageVector? = null
