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
val SimpIcons.KeyboardArrowDown: ImageVector
  get() {
    if (_KeyboardArrowDown != null) {
      return _KeyboardArrowDown!!
    }
    _KeyboardArrowDown =
      ImageVector.Builder(
          name = "KeyboardArrowDown",
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
            moveTo(11.66f, 14.62f)
            quadToRelative(-0.16f, -0.06f, -0.3f, -0.2f)
            lineTo(6.87f, 9.93f)
            quadTo(6.67f, 9.72f, 6.66f, 9.4f)
            reflectiveQuadTo(6.87f, 8.87f)
            reflectiveQuadTo(7.4f, 8.66f)
            reflectiveQuadTo(7.93f, 8.87f)
            lineTo(12f, 12.95f)
            lineTo(16.07f, 8.87f)
            quadTo(16.28f, 8.67f, 16.6f, 8.66f)
            reflectiveQuadToRelative(0.53f, 0.21f)
            reflectiveQuadTo(17.34f, 9.4f)
            reflectiveQuadTo(17.13f, 9.93f)
            lineToRelative(-4.49f, 4.49f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 14.68f)
            reflectiveQuadTo(11.66f, 14.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardArrowDown!!
  }

private var _KeyboardArrowDown: ImageVector? = null
