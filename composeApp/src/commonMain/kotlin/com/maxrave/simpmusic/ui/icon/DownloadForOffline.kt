package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
val SimpIcons.DownloadForOffline: ImageVector
  get() {
    if (_DownloadForOffline != null) {
      return _DownloadForOffline!!
    }
    _DownloadForOffline =
      ImageVector.Builder(
          name = "DownloadForOffline",
          defaultWidth = 24.dp,
          defaultHeight = 24.dp,
          viewportWidth = 24f,
          viewportHeight = 24f,
        )
        .apply {
          path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
          ) {
            moveTo(8f, 16.75f)
            horizontalLineToRelative(8f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(16.75f, 16f)
            reflectiveQuadTo(16.53f, 15.47f)
            reflectiveQuadTo(16f, 15.25f)
            horizontalLineTo(8f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(7.25f, 16f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(8f, 16.75f)
            close()
            moveToRelative(3.25f, -5.98f)
            lineTo(9.93f, 9.46f)
            quadTo(9.72f, 9.25f, 9.41f, 9.25f)
            reflectiveQuadTo(8.87f, 9.48f)
            quadTo(8.66f, 9.69f, 8.66f, 10f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            lineToRelative(2.49f, 2.49f)
            quadToRelative(0.27f, 0.27f, 0.63f, 0.27f)
            reflectiveQuadToRelative(0.63f, -0.27f)
            lineToRelative(2.49f, -2.49f)
            quadToRelative(0.21f, -0.21f, 0.22f, -0.51f)
            reflectiveQuadTo(15.12f, 9.47f)
            quadTo(14.91f, 9.26f, 14.61f, 9.25f)
            reflectiveQuadTo(14.07f, 9.46f)
            lineToRelative(-1.32f, 1.31f)
            verticalLineTo(7f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 6.25f)
            reflectiveQuadTo(11.47f, 6.47f)
            reflectiveQuadTo(11.25f, 7f)
            verticalLineToRelative(3.77f)
            close()
            moveTo(12f, 21.5f)
            quadToRelative(-1.97f, 0f, -3.71f, -0.75f)
            reflectiveQuadTo(5.28f, 18.72f)
            reflectiveQuadTo(3.25f, 15.71f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.25f, 8.3f)
            reflectiveQuadTo(5.28f, 5.28f)
            reflectiveQuadTo(8.29f, 3.25f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadTo(15.7f, 3.25f)
            reflectiveQuadToRelative(3.02f, 2.03f)
            reflectiveQuadToRelative(2.03f, 3.02f)
            reflectiveQuadTo(21.5f, 12f)
            reflectiveQuadTo(20.75f, 15.7f)
            reflectiveQuadToRelative(-2.03f, 3.02f)
            reflectiveQuadToRelative(-3.02f, 2.03f)
            reflectiveQuadTo(12f, 21.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _DownloadForOffline!!
  }

private var _DownloadForOffline: ImageVector? = null
