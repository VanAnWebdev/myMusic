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
val SimpIcons.Lightbulb: ImageVector
  get() {
    if (_Lightbulb != null) {
      return _Lightbulb!!
    }
    _Lightbulb =
      ImageVector.Builder(
          name = "Lightbulb",
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
            moveTo(10.69f, 21.05f)
            quadTo(10.14f, 20.53f, 10.1f, 19.77f)
            horizontalLineTo(13.9f)
            quadToRelative(-0.05f, 0.76f, -0.6f, 1.28f)
            reflectiveQuadTo(12f, 21.58f)
            reflectiveQuadTo(10.69f, 21.05f)
            close()
            moveTo(9f, 18.38f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(8.25f, 17.63f)
            reflectiveQuadTo(8.47f, 17.1f)
            reflectiveQuadTo(9f, 16.88f)
            horizontalLineToRelative(6f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(15f, 18.38f)
            horizontalLineTo(9f)
            close()
            moveTo(8.4f, 15.5f)
            quadTo(6.83f, 14.52f, 5.92f, 12.95f)
            reflectiveQuadTo(5f, 9.5f)
            quadTo(5f, 6.58f, 7.04f, 4.54f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadToRelative(4.96f, 2.04f)
            reflectiveQuadTo(19f, 9.5f)
            quadToRelative(0f, 1.87f, -0.92f, 3.45f)
            reflectiveQuadTo(15.6f, 15.5f)
            horizontalLineTo(8.4f)
            close()
            moveTo(8.85f, 14f)
            horizontalLineToRelative(6.3f)
            quadToRelative(1.13f, -0.8f, 1.74f, -1.98f)
            reflectiveQuadTo(17.5f, 9.5f)
            quadToRelative(0f, -2.3f, -1.6f, -3.9f)
            reflectiveQuadTo(12f, 4f)
            reflectiveQuadTo(8.1f, 5.6f)
            reflectiveQuadTo(6.5f, 9.5f)
            quadToRelative(0f, 1.35f, 0.61f, 2.52f)
            reflectiveQuadTo(8.85f, 14f)
            close()
            moveTo(12f, 14f)
            close()
          }
        }
        .buildSimpIcon()
    return _Lightbulb!!
  }

private var _Lightbulb: ImageVector? = null
