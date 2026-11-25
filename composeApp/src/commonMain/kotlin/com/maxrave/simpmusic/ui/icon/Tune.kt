package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "sliders-horizontal" (ISC licence, lucide.dev).
val SimpIcons.Tune: ImageVector
  get() {
    if (_Tune != null) {
      return _Tune!!
    }
    _Tune =
      lucideIcon(
        "Tune",
        filled = false,
        "M21 4L14 4",
        "M10 4L3 4",
        "M21 12L12 12",
        "M8 12L3 12",
        "M21 20L16 20",
        "M12 20L3 20",
        "M14 2L14 6",
        "M8 10L8 14",
        "M16 18L16 22",
      )
    return _Tune!!
  }

private var _Tune: ImageVector? = null
