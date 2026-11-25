package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "cloud-upload" (ISC licence, lucide.dev).
val SimpIcons.Backup: ImageVector
  get() {
    if (_Backup != null) {
      return _Backup!!
    }
    _Backup =
      lucideIcon(
        "Backup",
        filled = false,
        "M12 13v8",
        "M4 14.899A7 7 0 1 1 15.71 8h1.79a4.5 4.5 0 0 1 2.5 8.242",
        "m8 17 4-4 4 4",
      )
    return _Backup!!
  }

private var _Backup: ImageVector? = null
