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
val SimpIcons.MusicCast: ImageVector
  get() {
    if (_MusicCast != null) {
      return _MusicCast!!
    }
    _MusicCast =
      ImageVector.Builder(
          name = "MusicCast",
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
            moveTo(11.63f, 18.47f)
            quadTo(10.61f, 17.45f, 10.61f, 16f)
            reflectiveQuadToRelative(1.03f, -2.47f)
            reflectiveQuadTo(14.11f, 12.5f)
            quadToRelative(0.57f, 0f, 1.08f, 0.17f)
            reflectiveQuadToRelative(0.92f, 0.51f)
            verticalLineTo(5.25f)
            quadToRelative(0f, -0.39f, 0.26f, -0.65f)
            reflectiveQuadTo(17.01f, 4.35f)
            horizontalLineToRelative(3.63f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.65f)
            verticalLineTo(6.1f)
            quadToRelative(0f, 0.39f, -0.26f, 0.65f)
            reflectiveQuadTo(20.64f, 7f)
            horizontalLineTo(17.61f)
            verticalLineToRelative(9f)
            quadToRelative(0f, 1.45f, -1.03f, 2.47f)
            reflectiveQuadTo(14.11f, 19.5f)
            reflectiveQuadTo(11.63f, 18.47f)
            close()
            moveTo(4.91f, 11.71f)
            quadTo(4.13f, 13.33f, 3.98f, 15.19f)
            quadTo(3.95f, 15.52f, 3.74f, 15.76f)
            reflectiveQuadTo(3.2f, 16f)
            quadTo(2.87f, 16f, 2.66f, 15.75f)
            reflectiveQuadTo(2.48f, 15.17f)
            quadTo(2.64f, 12.99f, 3.54f, 11.1f)
            reflectiveQuadTo(5.88f, 7.77f)
            reflectiveQuadTo(9.21f, 5.43f)
            reflectiveQuadTo(13.27f, 4.38f)
            quadTo(13.6f, 4.35f, 13.85f, 4.56f)
            reflectiveQuadTo(14.11f, 5.1f)
            quadToRelative(0f, 0.32f, -0.24f, 0.53f)
            reflectiveQuadTo(13.3f, 5.88f)
            quadTo(11.44f, 6.03f, 9.82f, 6.8f)
            reflectiveQuadTo(6.95f, 8.82f)
            reflectiveQuadTo(4.91f, 11.71f)
            close()
            moveToRelative(3.75f, 1.6f)
            quadToRelative(-0.46f, 0.9f, -0.58f, 1.94f)
            quadTo(8.03f, 15.58f, 7.81f, 15.79f)
            reflectiveQuadTo(7.28f, 16f)
            reflectiveQuadTo(6.75f, 15.76f)
            reflectiveQuadTo(6.58f, 15.2f)
            quadToRelative(0.14f, -1.34f, 0.7f, -2.49f)
            reflectiveQuadTo(8.75f, 10.65f)
            reflectiveQuadTo(10.81f, 9.17f)
            reflectiveQuadToRelative(2.49f, -0.7f)
            quadToRelative(0.32f, -0.03f, 0.56f, 0.18f)
            reflectiveQuadToRelative(0.24f, 0.53f)
            reflectiveQuadTo(13.89f, 9.71f)
            reflectiveQuadTo(13.35f, 9.98f)
            quadToRelative(-1.04f, 0.12f, -1.93f, 0.57f)
            reflectiveQuadTo(9.82f, 11.7f)
            reflectiveQuadTo(8.67f, 13.3f)
            close()
          }
        }
        .buildSimpIcon()
    return _MusicCast!!
  }

private var _MusicCast: ImageVector? = null
