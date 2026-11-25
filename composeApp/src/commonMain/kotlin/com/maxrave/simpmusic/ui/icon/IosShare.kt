package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "share" (ISC licence, lucide.dev).
val SimpIcons.IosShare: ImageVector
  get() {
    if (_IosShare != null) {
      return _IosShare!!
    }
    _IosShare =
      lucideIcon(
        "IosShare",
        filled = false,
        "M4 12v8a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2v-8",
        "M16 6 L12 2 L8 6",
        "M12 2L12 15",
      )
    return _IosShare!!
  }

private var _IosShare: ImageVector? = null
