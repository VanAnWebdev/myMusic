package com.maxrave.simpmusic.utils

import coil3.PlatformContext
import coil3.SingletonImageLoader
import com.maxrave.logger.Logger
import com.sun.jna.Library
import com.sun.jna.Native
import com.sun.jna.Pointer

/**
 * Personal fork: gives memory back while the window is hidden or minimised (music keeps playing,
 * the Dynamic Island keeps working).
 *
 * 1. Drops the decoded covers Coil keeps in memory (they live in native Skia memory).
 * 2. Runs a full GC; with -XX:MaxHeapFreeRatio the JVM then uncommits the heap it no longer needs.
 * 3. On Windows, asks the OS to trim the process's working set (K32EmptyWorkingSet), which is what
 *    Task Manager's "Memory" column counts. Pages the app touches again come straight back, so the
 *    first moments after reopening the window can be a touch slower; nothing is lost.
 */
object MemoryTrimmer {
    private const val TAG = "MemoryTrimmer"
    private val isWindows = System.getProperty("os.name", "").contains("Windows", ignoreCase = true)

    @Suppress("FunctionName")
    private interface Kernel32 : Library {
        fun GetCurrentProcess(): Pointer

        fun K32EmptyWorkingSet(process: Pointer): Boolean
    }

    private val kernel32: Kernel32? by lazy {
        if (!isWindows) {
            null
        } else {
            runCatching { Native.load("kernel32", Kernel32::class.java) }
                .onFailure { Logger.w(TAG, "kernel32 unavailable: ${it.message}") }
                .getOrNull()
        }
    }

    fun trim() {
        runCatching { SingletonImageLoader.get(PlatformContext.INSTANCE).memoryCache?.clear() }
        System.gc()
        val k = kernel32 ?: return
        runCatching {
            val ok = k.K32EmptyWorkingSet(k.GetCurrentProcess())
            Logger.d(TAG, "Working set trimmed: $ok")
        }.onFailure { Logger.w(TAG, "Trim failed: ${it.message}") }
    }
}
