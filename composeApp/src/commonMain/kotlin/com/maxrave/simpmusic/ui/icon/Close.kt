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
val SimpIcons.Close: ImageVector
  get() {
    if (_Close != null) {
      return _Close!!
    }
    _Close =
      ImageVector.Builder(
          name = "Close",
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
            moveTo(12f, 13.05f)
            lineTo(6.93f, 18.13f)
            quadTo(6.72f, 18.33f, 6.4f, 18.34f)
            reflectiveQuadTo(5.87f, 18.13f)
            reflectiveQuadTo(5.66f, 17.6f)
            reflectiveQuadTo(5.87f, 17.07f)
            lineTo(10.95f, 12f)
            lineTo(5.87f, 6.93f)
            quadTo(5.67f, 6.72f, 5.66f, 6.4f)
            reflectiveQuadTo(5.87f, 5.87f)
            reflectiveQuadTo(6.4f, 5.66f)
            reflectiveQuadTo(6.93f, 5.87f)
            lineTo(12f, 10.95f)
            lineTo(17.07f, 5.87f)
            quadTo(17.28f, 5.67f, 17.6f, 5.66f)
            reflectiveQuadToRelative(0.53f, 0.21f)
            reflectiveQuadTo(18.34f, 6.4f)
            reflectiveQuadTo(18.13f, 6.93f)
            lineTo(13.05f, 12f)
            lineToRelative(5.07f, 5.07f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            reflectiveQuadTo(17.6f, 18.34f)
            reflectiveQuadTo(17.07f, 18.13f)
            lineTo(12f, 13.05f)
            close()
          }
        }
        .buildSimpIcon()
    return _Close!!
  }

private var _Close: ImageVector? = null
