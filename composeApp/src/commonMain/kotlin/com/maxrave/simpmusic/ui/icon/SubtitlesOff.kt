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
val SimpIcons.SubtitlesOff: ImageVector
  get() {
    if (_SubtitlesOff != null) {
      return _SubtitlesOff!!
    }
    _SubtitlesOff =
      ImageVector.Builder(
          name = "SubtitlesOff",
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
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            horizontalLineTo(4.4f)
            lineTo(5.9f, 6f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 6f, 4.1f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(4.31f, 18f)
            horizontalLineTo(15.77f)
            lineTo(13.48f, 15.71f)
            horizontalLineTo(7.04f)
            quadTo(6.72f, 15.71f, 6.5f, 15.5f)
            reflectiveQuadTo(6.29f, 14.96f)
            reflectiveQuadTo(6.5f, 14.43f)
            reflectiveQuadTo(7.04f, 14.21f)
            horizontalLineToRelative(4.94f)
            lineTo(2.04f, 4.25f)
            quadTo(1.83f, 4.04f, 1.82f, 3.73f)
            reflectiveQuadTo(2.04f, 3.19f)
            quadTo(2.26f, 2.98f, 2.57f, 2.98f)
            reflectiveQuadTo(3.1f, 3.19f)
            lineTo(20.48f, 20.58f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.22f, 0.22f, -0.52f, 0.22f)
            reflectiveQuadTo(19.42f, 21.63f)
            lineTo(17.27f, 19.5f)
            horizontalLineTo(4.31f)
            close()
            moveTo(21.5f, 6.31f)
            verticalLineTo(16.94f)
            quadToRelative(0f, 0.37f, -0.23f, 0.56f)
            reflectiveQuadToRelative(-0.52f, 0.19f)
            quadToRelative(-0.31f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(20f, 16.93f)
            verticalLineTo(6.31f)
            quadTo(20f, 6.17f, 19.91f, 6.09f)
            reflectiveQuadTo(19.69f, 6f)
            horizontalLineTo(9.07f)
            quadTo(8.7f, 6f, 8.51f, 5.77f)
            reflectiveQuadTo(8.32f, 5.25f)
            quadToRelative(0f, -0.31f, 0.21f, -0.53f)
            reflectiveQuadTo(9.07f, 4.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            close()
            moveToRelative(-4.54f, 5.62f)
            horizontalLineTo(15f)
            quadToRelative(-0.37f, 0f, -0.56f, -0.23f)
            reflectiveQuadTo(14.25f, 11.17f)
            quadToRelative(0f, -0.28f, 0.19f, -0.52f)
            reflectiveQuadTo(15f, 10.42f)
            horizontalLineToRelative(1.97f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(17.5f, 11.71f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            close()
            moveToRelative(-2.58f, -0.3f)
            close()
            moveToRelative(-4.35f, 0.64f)
            close()
            moveTo(6.5f, 11.71f)
            quadTo(6.29f, 11.49f, 6.29f, 11.17f)
            reflectiveQuadTo(6.5f, 10.64f)
            reflectiveQuadTo(7.04f, 10.42f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(7.57f, 11.71f)
            reflectiveQuadTo(7.04f, 11.92f)
            reflectiveQuadTo(6.5f, 11.71f)
            close()
          }
        }
        .buildSimpIcon()
    return _SubtitlesOff!!
  }

private var _SubtitlesOff: ImageVector? = null
