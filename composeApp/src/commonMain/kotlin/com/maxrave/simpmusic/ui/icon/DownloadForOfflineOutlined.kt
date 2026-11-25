package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "circle-arrow-down" (ISC licence, lucide.dev).
val SimpIcons.DownloadForOfflineOutlined: ImageVector
  get() {
    if (_DownloadForOfflineOutlined != null) {
      return _DownloadForOfflineOutlined!!
    }
    _DownloadForOfflineOutlined =
      lucideIcon(
        "DownloadForOfflineOutlined",
        filled = false,
        "M2 12a10 10 0 1 0 20 0a10 10 0 1 0 -20 0",
        "M12 8v8",
        "m8 12 4 4 4-4",
      )
    return _DownloadForOfflineOutlined!!
  }

private var _DownloadForOfflineOutlined: ImageVector? = null
