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
val SimpIcons.MovieOff: ImageVector
  get() {
    if (_MovieOff != null) {
      return _MovieOff!!
    }
    _MovieOff =
      ImageVector.Builder(
          name = "MovieOff",
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
            moveTo(4.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.56f, 3.03f, 5.03f)
            reflectiveQuadTo(4.32f, 4.5f)
            horizontalLineTo(4.4f)
            lineToRelative(5f, 5f)
            horizontalLineTo(4f)
            verticalLineToRelative(8.19f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(4.31f, 18f)
            horizontalLineTo(17.9f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineTo(4.31f)
            close()
            moveTo(21.09f, 18.54f)
            lineTo(20f, 17.45f)
            verticalLineTo(9.5f)
            horizontalLineTo(12.24f)
            lineToRelative(-5f, -5f)
            horizontalLineTo(8.83f)
            lineToRelative(1.39f, 2.77f)
            quadToRelative(0.18f, 0.35f, 0.5f, 0.54f)
            reflectiveQuadTo(11.42f, 8f)
            quadToRelative(0.75f, 0f, 1.14f, -0.63f)
            reflectiveQuadTo(12.6f, 6.07f)
            lineTo(11.83f, 4.5f)
            horizontalLineToRelative(2.45f)
            lineToRelative(1.37f, 2.75f)
            quadToRelative(0.17f, 0.35f, 0.5f, 0.55f)
            reflectiveQuadTo(16.85f, 8f)
            quadTo(17.6f, 8f, 18f, 7.36f)
            quadTo(18.4f, 6.72f, 18.05f, 6.05f)
            lineTo(17.28f, 4.5f)
            horizontalLineToRelative(2.41f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.5f)
            quadToRelative(0f, 0.32f, -0.1f, 0.58f)
            reflectiveQuadToRelative(-0.3f, 0.46f)
            close()
            moveToRelative(-1.78f, 2.99f)
            lineTo(2.45f, 4.68f)
            quadTo(2.23f, 4.46f, 2.22f, 4.15f)
            reflectiveQuadTo(2.45f, 3.62f)
            reflectiveQuadTo(2.98f, 3.38f)
            reflectiveQuadTo(3.52f, 3.62f)
            lineTo(20.38f, 20.48f)
            quadTo(20.61f, 20.7f, 20.61f, 21f)
            reflectiveQuadToRelative(-0.23f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.23f)
            reflectiveQuadTo(19.32f, 21.53f)
            close()
            moveToRelative(-7.8f, -7.78f)
            close()
            moveToRelative(4.61f, -0.29f)
            close()
          }
        }
        .buildSimpIcon()
    return _MovieOff!!
  }

private var _MovieOff: ImageVector? = null
