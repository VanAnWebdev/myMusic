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
val SimpIcons.Image: ImageVector
  get() {
    if (_Image != null) {
      return _Image!!
    }
    _Image =
      ImageVector.Builder(
          name = "Image",
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
            moveTo(5.31f, 20.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.55f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(20.5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(19f, 5.19f, 18.9f, 5.1f)
            reflectiveQuadTo(18.69f, 5f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 5f, 5.1f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            close()
            moveTo(5f, 19f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(5f, 5.19f, 5f, 5.1f)
            reflectiveQuadTo(5f, 5f)
            quadTo(5f, 5f, 5f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(5f, 19f)
            close()
            moveTo(7.65f, 16.75f)
            horizontalLineToRelative(8.77f)
            quadToRelative(0.27f, 0f, 0.4f, -0.25f)
            reflectiveQuadTo(16.78f, 16.03f)
            lineTo(14.4f, 12.83f)
            quadTo(14.26f, 12.65f, 14.04f, 12.65f)
            reflectiveQuadToRelative(-0.36f, 0.18f)
            lineToRelative(-2.45f, 3.19f)
            lineTo(9.59f, 13.92f)
            quadTo(9.45f, 13.75f, 9.24f, 13.75f)
            reflectiveQuadTo(8.88f, 13.93f)
            lineTo(7.3f, 16.03f)
            quadTo(7.12f, 16.26f, 7.25f, 16.5f)
            reflectiveQuadToRelative(0.4f, 0.25f)
            close()
          }
        }
        .buildSimpIcon()
    return _Image!!
  }

private var _Image: ImageVector? = null
