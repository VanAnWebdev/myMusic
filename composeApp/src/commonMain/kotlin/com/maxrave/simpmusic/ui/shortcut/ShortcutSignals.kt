package com.maxrave.simpmusic.ui.shortcut

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

/**
 * Personal fork: keyboard shortcuts that need the navigation graph. The desktop window raises them
 * (DesktopShortcuts, jvmMain) and App collects them, since only App holds the NavController.
 */
object ShortcutSignals {
    private val _openSearch = MutableSharedFlow<Unit>(extraBufferCapacity = 1)
    val openSearch: SharedFlow<Unit> = _openSearch.asSharedFlow()

    fun requestSearch() {
        _openSearch.tryEmit(Unit)
    }
}
