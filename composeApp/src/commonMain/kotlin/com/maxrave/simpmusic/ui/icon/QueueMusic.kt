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
val SimpIcons.QueueMusic: ImageVector
  get() {
    if (_QueueMusic != null) {
      return _QueueMusic!!
    }
    _QueueMusic =
      ImageVector.Builder(
          name = "QueueMusic",
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
            moveTo(15.89f, 19.5f)
            quadToRelative(-1.12f, 0f, -1.91f, -0.78f)
            reflectiveQuadTo(13.2f, 16.82f)
            quadToRelative(0f, -1.13f, 0.79f, -1.91f)
            reflectiveQuadToRelative(1.91f, -0.79f)
            quadToRelative(0.33f, 0f, 0.63f, 0.09f)
            reflectiveQuadToRelative(0.56f, 0.27f)
            verticalLineTo(7.37f)
            quadTo(17.09f, 7f, 17.34f, 6.75f)
            reflectiveQuadTo(17.95f, 6.5f)
            horizontalLineToRelative(2.68f)
            quadToRelative(0.37f, 0f, 0.62f, 0.25f)
            reflectiveQuadTo(21.5f, 7.37f)
            reflectiveQuadTo(21.25f, 7.98f)
            reflectiveQuadTo(20.63f, 8.23f)
            horizontalLineTo(18.59f)
            verticalLineToRelative(8.59f)
            quadToRelative(0f, 1.12f, -0.79f, 1.9f)
            reflectiveQuadTo(15.89f, 19.5f)
            close()
            moveTo(4.25f, 15.38f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.5f, 14.63f)
            reflectiveQuadTo(3.72f, 14.1f)
            reflectiveQuadTo(4.25f, 13.88f)
            horizontalLineToRelative(6.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(10.8f, 15.17f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(4.25f)
            close()
            moveToRelative(0f, -3.69f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.5f, 10.94f)
            reflectiveQuadTo(3.72f, 10.41f)
            reflectiveQuadTo(4.25f, 10.19f)
            horizontalLineToRelative(9.89f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(4.25f)
            close()
            moveTo(4.25f, 8f)
            quadTo(3.93f, 8f, 3.72f, 7.78f)
            reflectiveQuadTo(3.5f, 7.25f)
            reflectiveQuadTo(3.72f, 6.72f)
            reflectiveQuadTo(4.25f, 6.5f)
            horizontalLineToRelative(9.89f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(14.68f, 7.78f)
            reflectiveQuadTo(14.14f, 8f)
            horizontalLineTo(4.25f)
            close()
          }
        }
        .buildSimpIcon()
    return _QueueMusic!!
  }

private var _QueueMusic: ImageVector? = null
