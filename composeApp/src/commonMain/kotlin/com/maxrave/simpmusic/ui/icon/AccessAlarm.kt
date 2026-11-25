package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "alarm-clock" (ISC licence, lucide.dev).
val SimpIcons.AccessAlarm: ImageVector
  get() {
    if (_AccessAlarm != null) {
      return _AccessAlarm!!
    }
    _AccessAlarm =
      lucideIcon(
        "AccessAlarm",
        filled = false,
        "M4 13a8 8 0 1 0 16 0a8 8 0 1 0 -16 0",
        "M12 9v4l2 2",
        "M5 3 2 6",
        "m22 6-3-3",
        "M6.38 18.7 4 21",
        "M17.64 18.67 20 21",
      )
    return _AccessAlarm!!
  }

private var _AccessAlarm: ImageVector? = null
