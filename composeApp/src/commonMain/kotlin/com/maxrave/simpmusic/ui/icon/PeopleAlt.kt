package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "users" (ISC licence, lucide.dev).
val SimpIcons.PeopleAlt: ImageVector
  get() {
    if (_PeopleAlt != null) {
      return _PeopleAlt!!
    }
    _PeopleAlt =
      lucideIcon(
        "PeopleAlt",
        filled = false,
        "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2",
        "M5 7a4 4 0 1 0 8 0a4 4 0 1 0 -8 0",
        "M22 21v-2a4 4 0 0 0-3-3.87",
        "M16 3.13a4 4 0 0 1 0 7.75",
      )
    return _PeopleAlt!!
  }

private var _PeopleAlt: ImageVector? = null
