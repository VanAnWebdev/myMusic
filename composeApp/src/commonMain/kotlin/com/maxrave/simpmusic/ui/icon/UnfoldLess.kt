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
val SimpIcons.UnfoldLess: ImageVector
  get() {
    if (_UnfoldLess != null) {
      return _UnfoldLess!!
    }
    _UnfoldLess =
      ImageVector.Builder(
          name = "UnfoldLess",
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
            moveTo(12f, 16.55f)
            lineTo(9.43f, 19.13f)
            quadTo(9.22f, 19.33f, 8.9f, 19.34f)
            reflectiveQuadTo(8.37f, 19.13f)
            reflectiveQuadTo(8.16f, 18.6f)
            reflectiveQuadTo(8.37f, 18.07f)
            lineToRelative(2.99f, -2.99f)
            quadToRelative(0.14f, -0.14f, 0.3f, -0.2f)
            reflectiveQuadTo(12f, 14.82f)
            reflectiveQuadToRelative(0.34f, 0.06f)
            reflectiveQuadToRelative(0.3f, 0.2f)
            lineToRelative(2.99f, 2.99f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            reflectiveQuadTo(15.1f, 19.34f)
            reflectiveQuadTo(14.57f, 19.13f)
            lineTo(12f, 16.55f)
            close()
            moveTo(12f, 7.45f)
            lineTo(14.57f, 4.87f)
            quadTo(14.78f, 4.67f, 15.1f, 4.66f)
            reflectiveQuadToRelative(0.53f, 0.21f)
            reflectiveQuadTo(15.84f, 5.4f)
            reflectiveQuadTo(15.63f, 5.93f)
            lineTo(12.63f, 8.92f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 9.18f)
            reflectiveQuadTo(11.66f, 9.12f)
            reflectiveQuadToRelative(-0.3f, -0.2f)
            lineTo(8.37f, 5.93f)
            quadTo(8.17f, 5.72f, 8.16f, 5.4f)
            reflectiveQuadTo(8.37f, 4.87f)
            reflectiveQuadTo(8.9f, 4.66f)
            reflectiveQuadTo(9.43f, 4.87f)
            lineTo(12f, 7.45f)
            close()
          }
        }
        .buildSimpIcon()
    return _UnfoldLess!!
  }

private var _UnfoldLess: ImageVector? = null
