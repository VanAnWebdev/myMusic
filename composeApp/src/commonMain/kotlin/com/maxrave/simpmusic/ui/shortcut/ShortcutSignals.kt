package com.maxrave.simpmusic.ui.shortcut

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Personal fork: signals between the desktop window chrome and the screens.
 * - [openSearch]: Ctrl+F; the top bar focuses its search field.
 * - [pendingQuery]: a query typed in the top bar; the Search screen runs it and clears it.
 */
object ShortcutSignals {
    private val _openSearch = MutableSharedFlow<Unit>(extraBufferCapacity = 1)
    val openSearch: SharedFlow<Unit> = _openSearch.asSharedFlow()

    fun requestSearch() {
        _openSearch.tryEmit(Unit)
    }

    private val _pendingQuery = MutableStateFlow<String?>(null)
    val pendingQuery: StateFlow<String?> = _pendingQuery.asStateFlow()

    fun submitQuery(query: String) {
        _pendingQuery.value = query
    }

    fun consumeQuery(): String? = _pendingQuery.value.also { _pendingQuery.value = null }
}
