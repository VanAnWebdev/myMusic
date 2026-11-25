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
val SimpIcons.MusicOff: ImageVector
  get() {
    if (_MusicOff != null) {
      return _MusicOff!!
    }
    _MusicOff =
      ImageVector.Builder(
          name = "MusicOff",
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
            moveTo(19.04f, 21.63f)
            lineTo(2.66f, 5.25f)
            quadTo(2.45f, 5.04f, 2.45f, 4.72f)
            reflectiveQuadTo(2.66f, 4.19f)
            reflectiveQuadTo(3.18f, 3.98f)
            reflectiveQuadTo(3.71f, 4.19f)
            lineTo(20.1f, 20.58f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadTo(20.1f, 21.63f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(19.04f, 21.63f)
            close()
            moveTo(13.75f, 6.87f)
            verticalLineTo(9.59f)
            quadToRelative(0f, 0.38f, -0.23f, 0.56f)
            reflectiveQuadTo(13f, 10.32f)
            reflectiveQuadTo(12.49f, 10.13f)
            reflectiveQuadTo(12.25f, 9.57f)
            verticalLineTo(4.5f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(13.16f, 3.6f)
            horizontalLineToRelative(3.63f)
            quadToRelative(0.39f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(17.69f, 4.5f)
            verticalLineTo(5.96f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(16.79f, 6.87f)
            horizontalLineTo(13.75f)
            close()
            moveTo(10.25f, 20.4f)
            quadToRelative(-1.44f, 0f, -2.47f, -1.03f)
            reflectiveQuadTo(6.75f, 16.9f)
            reflectiveQuadTo(7.78f, 14.43f)
            reflectiveQuadTo(10.25f, 13.4f)
            quadToRelative(0.57f, 0f, 1.08f, 0.17f)
            reflectiveQuadToRelative(0.92f, 0.51f)
            verticalLineTo(12.73f)
            lineToRelative(1.5f, 1.5f)
            verticalLineTo(16.9f)
            quadToRelative(0f, 1.44f, -1.03f, 2.47f)
            reflectiveQuadTo(10.25f, 20.4f)
            close()
          }
        }
        .buildSimpIcon()
    return _MusicOff!!
  }

private var _MusicOff: ImageVector? = null
