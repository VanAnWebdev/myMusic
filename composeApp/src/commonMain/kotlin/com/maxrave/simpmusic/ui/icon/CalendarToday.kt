package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "calendar" (ISC licence, lucide.dev).
val SimpIcons.CalendarToday: ImageVector
  get() {
    if (_CalendarToday != null) {
      return _CalendarToday!!
    }
    _CalendarToday =
      lucideIcon(
        "CalendarToday",
        filled = false,
        "M8 2v4",
        "M16 2v4",
        "M5 4h14a2 2 0 0 1 2 2v14a2 2 0 0 1 -2 2h-14a2 2 0 0 1 -2 -2v-14a2 2 0 0 1 2 -2Z",
        "M3 10h18",
      )
    return _CalendarToday!!
  }

private var _CalendarToday: ImageVector? = null
