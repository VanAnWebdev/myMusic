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
val SimpIcons.KeyboardArrowUp: ImageVector
  get() {
    if (_KeyboardArrowUp != null) {
      return _KeyboardArrowUp!!
    }
    _KeyboardArrowUp =
      ImageVector.Builder(
          name = "KeyboardArrowUp",
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
            moveTo(12f, 10.45f)
            lineTo(7.93f, 14.53f)
            quadTo(7.72f, 14.73f, 7.4f, 14.74f)
            reflectiveQuadTo(6.87f, 14.53f)
            reflectiveQuadTo(6.66f, 14f)
            reflectiveQuadTo(6.87f, 13.47f)
            lineTo(11.37f, 8.98f)
            quadTo(11.64f, 8.71f, 12f, 8.71f)
            reflectiveQuadToRelative(0.63f, 0.27f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            reflectiveQuadTo(16.6f, 14.74f)
            reflectiveQuadTo(16.07f, 14.53f)
            lineTo(12f, 10.45f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardArrowUp!!
  }

private var _KeyboardArrowUp: ImageVector? = null
