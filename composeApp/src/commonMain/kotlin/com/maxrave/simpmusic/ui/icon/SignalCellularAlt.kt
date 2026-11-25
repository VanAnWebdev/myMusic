package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "signal" (ISC licence, lucide.dev).
val SimpIcons.SignalCellularAlt: ImageVector
  get() {
    if (_SignalCellularAlt != null) {
      return _SignalCellularAlt!!
    }
    _SignalCellularAlt =
      lucideIcon(
        "SignalCellularAlt",
        filled = false,
        "M2 20h.01",
        "M7 20v-4",
        "M12 20v-8",
        "M17 20V8",
        "M22 4v16",
      )
    return _SignalCellularAlt!!
  }

private var _SignalCellularAlt: ImageVector? = null
