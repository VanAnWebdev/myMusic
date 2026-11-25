package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "scan-qr-code" (ISC licence, lucide.dev).
val SimpIcons.QrCodeScanner: ImageVector
  get() {
    if (_QrCodeScanner != null) {
      return _QrCodeScanner!!
    }
    _QrCodeScanner =
      lucideIcon(
        "QrCodeScanner",
        filled = false,
        "M17 12v4a1 1 0 0 1-1 1h-4",
        "M17 3h2a2 2 0 0 1 2 2v2",
        "M17 8V7",
        "M21 17v2a2 2 0 0 1-2 2h-2",
        "M3 7V5a2 2 0 0 1 2-2h2",
        "M7 17h.01",
        "M7 21H5a2 2 0 0 1-2-2v-2",
        "M8 7h3a1 1 0 0 1 1 1v3a1 1 0 0 1 -1 1h-3a1 1 0 0 1 -1 -1v-3a1 1 0 0 1 1 -1Z",
      )
    return _QrCodeScanner!!
  }

private var _QrCodeScanner: ImageVector? = null
