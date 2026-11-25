package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "power" (ISC licence, lucide.dev).
val SimpIcons.PowerSettingsNew: ImageVector
  get() {
    if (_PowerSettingsNew != null) {
      return _PowerSettingsNew!!
    }
    _PowerSettingsNew =
      lucideIcon(
        "PowerSettingsNew",
        filled = false,
        "M12 2v10",
        "M18.4 6.6a9 9 0 1 1-12.77.04",
      )
    return _PowerSettingsNew!!
  }

private var _PowerSettingsNew: ImageVector? = null
