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
val SimpIcons.Shuffle: ImageVector
  get() {
    if (_Shuffle != null) {
      return _Shuffle!!
    }
    _Shuffle =
      ImageVector.Builder(
          name = "Shuffle",
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
            moveTo(14.87f, 19.5f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(14.12f, 18.75f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(14.87f, 18f)
            horizontalLineToRelative(2.1f)
            lineTo(14.14f, 15.18f)
            quadTo(13.92f, 14.96f, 13.92f, 14.65f)
            reflectiveQuadToRelative(0.24f, -0.54f)
            reflectiveQuadToRelative(0.53f, -0.23f)
            reflectiveQuadToRelative(0.53f, 0.23f)
            lineTo(18f, 16.9f)
            verticalLineToRelative(-2f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(3.7f)
            quadToRelative(0f, 0.39f, -0.26f, 0.65f)
            reflectiveQuadTo(18.6f, 19.5f)
            horizontalLineTo(14.87f)
            close()
            moveTo(4.72f, 19.28f)
            quadTo(4.51f, 19.06f, 4.51f, 18.75f)
            reflectiveQuadTo(4.72f, 18.22f)
            lineTo(16.95f, 6f)
            horizontalLineTo(14.87f)
            quadTo(14.55f, 6f, 14.33f, 5.78f)
            reflectiveQuadTo(14.12f, 5.25f)
            reflectiveQuadTo(14.33f, 4.72f)
            reflectiveQuadTo(14.87f, 4.5f)
            horizontalLineTo(18.6f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadTo(19.5f, 5.4f)
            verticalLineToRelative(3.7f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(18.75f, 9.86f)
            reflectiveQuadTo(18.22f, 9.64f)
            reflectiveQuadTo(18f, 9.11f)
            verticalLineTo(7.05f)
            lineTo(5.78f, 19.28f)
            quadTo(5.57f, 19.48f, 5.25f, 19.49f)
            reflectiveQuadTo(4.72f, 19.28f)
            close()
            moveTo(4.71f, 5.77f)
            quadTo(4.5f, 5.56f, 4.5f, 5.25f)
            reflectiveQuadTo(4.72f, 4.72f)
            reflectiveQuadTo(5.23f, 4.52f)
            reflectiveQuadTo(5.76f, 4.72f)
            lineTo(9.81f, 8.76f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadTo(9.81f, 9.8f)
            quadTo(9.6f, 10.01f, 9.29f, 10.01f)
            reflectiveQuadTo(8.76f, 9.8f)
            lineTo(4.71f, 5.77f)
            close()
          }
        }
        .buildSimpIcon()
    return _Shuffle!!
  }

private var _Shuffle: ImageVector? = null
