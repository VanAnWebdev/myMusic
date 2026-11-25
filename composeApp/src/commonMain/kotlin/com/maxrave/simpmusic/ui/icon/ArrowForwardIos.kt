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
val SimpIcons.ArrowForwardIos: ImageVector
  get() {
    if (_ArrowForwardIos != null) {
      return _ArrowForwardIos!!
    }
    _ArrowForwardIos =
      ImageVector.Builder(
          name = "ArrowForwardIos",
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
            moveTo(14.83f, 12f)
            lineTo(7.3f, 4.47f)
            quadTo(7f, 4.17f, 7.01f, 3.76f)
            reflectiveQuadTo(7.31f, 3.05f)
            reflectiveQuadTo(8.02f, 2.75f)
            reflectiveQuadToRelative(0.71f, 0.3f)
            lineToRelative(7.66f, 7.67f)
            quadToRelative(0.27f, 0.27f, 0.4f, 0.61f)
            reflectiveQuadTo(16.92f, 12f)
            reflectiveQuadToRelative(-0.13f, 0.67f)
            reflectiveQuadToRelative(-0.4f, 0.61f)
            lineTo(8.72f, 20.95f)
            quadToRelative(-0.3f, 0.3f, -0.7f, 0.29f)
            reflectiveQuadTo(7.31f, 20.94f)
            reflectiveQuadTo(7.02f, 20.23f)
            reflectiveQuadToRelative(0.3f, -0.71f)
            lineTo(14.83f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _ArrowForwardIos!!
  }

private var _ArrowForwardIos: ImageVector? = null
