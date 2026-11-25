package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.vector.ImageVector

// Lucide "receipt-text" (ISC licence, lucide.dev).
val SimpIcons.ReceiptLong: ImageVector
  get() {
    if (_ReceiptLong != null) {
      return _ReceiptLong!!
    }
    _ReceiptLong =
      lucideIcon(
        "ReceiptLong",
        filled = false,
        "M4 2v20l2-1 2 1 2-1 2 1 2-1 2 1 2-1 2 1V2l-2 1-2-1-2 1-2-1-2 1-2-1-2 1Z",
        "M14 8H8",
        "M16 12H8",
        "M13 16H8",
      )
    return _ReceiptLong!!
  }

private var _ReceiptLong: ImageVector? = null
