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
val SimpIcons.VolumeDown: ImageVector
  get() {
    if (_VolumeDown != null) {
      return _VolumeDown!!
    }
    _VolumeDown =
      ImageVector.Builder(
          name = "VolumeDown",
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
            moveTo(9.21f, 14.5f)
            horizontalLineTo(6.4f)
            quadToRelative(-0.39f, 0f, -0.65f, -0.26f)
            reflectiveQuadTo(5.5f, 13.6f)
            verticalLineTo(10.4f)
            quadToRelative(0f, -0.39f, 0.26f, -0.65f)
            reflectiveQuadTo(6.4f, 9.5f)
            horizontalLineTo(9.21f)
            lineTo(12.2f, 6.51f)
            quadTo(12.56f, 6.15f, 13.03f, 6.34f)
            reflectiveQuadTo(13.5f, 7.05f)
            verticalLineToRelative(9.9f)
            quadToRelative(0f, 0.51f, -0.47f, 0.71f)
            reflectiveQuadTo(12.2f, 17.49f)
            lineTo(9.21f, 14.5f)
            close()
            moveTo(18f, 12f)
            quadToRelative(0f, 0.93f, -0.39f, 1.77f)
            reflectiveQuadToRelative(-1.05f, 1.41f)
            quadToRelative(-0.21f, 0.14f, -0.45f, 0.03f)
            reflectiveQuadTo(15.88f, 14.83f)
            verticalLineTo(9.12f)
            quadToRelative(0f, -0.26f, 0.23f, -0.37f)
            reflectiveQuadToRelative(0.45f, 0.03f)
            quadToRelative(0.66f, 0.59f, 1.05f, 1.44f)
            reflectiveQuadTo(18f, 12f)
            close()
            moveTo(12f, 8.85f)
            lineTo(9.85f, 11f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            horizontalLineTo(9.85f)
            lineTo(12f, 15.15f)
            verticalLineTo(8.85f)
            close()
            moveTo(9.5f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _VolumeDown!!
  }

private var _VolumeDown: ImageVector? = null
