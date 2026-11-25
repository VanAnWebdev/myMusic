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
val SimpIcons.Check: ImageVector
  get() {
    if (_Check != null) {
      return _Check!!
    }
    _Check =
      ImageVector.Builder(
          name = "Check",
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
            moveTo(9.55f, 15.52f)
            lineTo(18.19f, 6.88f)
            quadTo(18.41f, 6.65f, 18.71f, 6.65f)
            reflectiveQuadToRelative(0.53f, 0.23f)
            reflectiveQuadToRelative(0.23f, 0.53f)
            reflectiveQuadTo(19.24f, 7.95f)
            lineToRelative(-9.06f, 9.07f)
            quadTo(9.91f, 17.29f, 9.55f, 17.29f)
            reflectiveQuadTo(8.92f, 17.02f)
            lineTo(4.74f, 12.85f)
            quadTo(4.52f, 12.62f, 4.52f, 12.32f)
            reflectiveQuadTo(4.76f, 11.78f)
            reflectiveQuadTo(5.29f, 11.54f)
            reflectiveQuadToRelative(0.53f, 0.23f)
            lineToRelative(3.72f, 3.74f)
            close()
          }
        }
        .buildSimpIcon()
    return _Check!!
  }

private var _Check: ImageVector? = null
