package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chart-pie" (ISC licence, lucide.dev).
val SimpIcons.DataUsage: ImageVector
  get() {
    if (_DataUsage != null) {
      return _DataUsage!!
    }
    _DataUsage =
      lucideIcon(
        "DataUsage",
        filled = false,
        "M21 12c.552 0 1.005-.449.95-.998a10 10 0 0 0-8.953-8.951c-.55-.055-.998.398-.998.95v8a1 1 0 0 0 1 1z",
        "M21.21 15.89A10 10 0 1 1 8 2.83",
      )
    return _DataUsage!!
  }

private var _DataUsage: ImageVector? = null
