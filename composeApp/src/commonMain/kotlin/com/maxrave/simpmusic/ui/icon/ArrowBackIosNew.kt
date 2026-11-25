package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "chevron-left" (ISC licence, lucide.dev).
val SimpIcons.ArrowBackIosNew: ImageVector
  get() {
    if (_ArrowBackIosNew != null) {
      return _ArrowBackIosNew!!
    }
    _ArrowBackIosNew =
      lucideIcon(
        "ArrowBackIosNew",
        filled = false,
        "m15 18-6-6 6-6",
      )
    return _ArrowBackIosNew!!
  }

private var _ArrowBackIosNew: ImageVector? = null
