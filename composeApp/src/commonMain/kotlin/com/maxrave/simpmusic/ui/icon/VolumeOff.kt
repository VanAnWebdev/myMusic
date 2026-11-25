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
val SimpIcons.VolumeOff: ImageVector
  get() {
    if (_VolumeOff != null) {
      return _VolumeOff!!
    }
    _VolumeOff =
      ImageVector.Builder(
          name = "VolumeOff",
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
            moveTo(16.46f, 19.12f)
            quadToRelative(-0.25f, 0.16f, -0.5f, 0.3f)
            reflectiveQuadToRelative(-0.53f, 0.26f)
            quadToRelative(-0.28f, 0.13f, -0.58f, 0f)
            reflectiveQuadTo(14.44f, 19.25f)
            quadTo(14.33f, 18.97f, 14.47f, 18.7f)
            reflectiveQuadToRelative(0.42f, -0.4f)
            quadToRelative(0.13f, -0.06f, 0.25f, -0.12f)
            reflectiveQuadToRelative(0.24f, -0.14f)
            lineTo(11.79f, 14.45f)
            verticalLineToRelative(2.5f)
            quadToRelative(0f, 0.51f, -0.47f, 0.71f)
            reflectiveQuadTo(10.49f, 17.49f)
            lineTo(7.5f, 14.5f)
            horizontalLineTo(4.69f)
            quadToRelative(-0.39f, 0f, -0.65f, -0.26f)
            reflectiveQuadTo(3.79f, 13.6f)
            verticalLineTo(10.4f)
            quadToRelative(0f, -0.39f, 0.26f, -0.65f)
            reflectiveQuadTo(4.69f, 9.5f)
            horizontalLineTo(6.83f)
            lineTo(2.52f, 5.19f)
            quadTo(2.32f, 4.98f, 2.31f, 4.67f)
            reflectiveQuadTo(2.52f, 4.13f)
            reflectiveQuadTo(3.05f, 3.92f)
            reflectiveQuadTo(3.58f, 4.13f)
            lineTo(20f, 20.56f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadTo(20f, 21.61f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(18.95f, 21.61f)
            lineTo(16.46f, 19.12f)
            close()
            moveToRelative(2.52f, -7.15f)
            quadToRelative(0f, -2.06f, -1.1f, -3.76f)
            reflectiveQuadTo(14.91f, 5.66f)
            quadTo(14.62f, 5.53f, 14.49f, 5.26f)
            reflectiveQuadTo(14.46f, 4.71f)
            quadTo(14.58f, 4.4f, 14.88f, 4.28f)
            reflectiveQuadTo(15.5f, 4.3f)
            quadToRelative(2.26f, 1.03f, 3.62f, 3.08f)
            reflectiveQuadToRelative(1.36f, 4.59f)
            quadToRelative(0f, 0.96f, -0.22f, 1.87f)
            reflectiveQuadToRelative(-0.64f, 1.73f)
            quadToRelative(-0.17f, 0.41f, -0.48f, 0.5f)
            reflectiveQuadToRelative(-0.57f, -0f)
            reflectiveQuadTo(18.16f, 15.72f)
            reflectiveQuadToRelative(0.01f, -0.56f)
            quadToRelative(0.41f, -0.74f, 0.61f, -1.52f)
            reflectiveQuadToRelative(0.2f, -1.67f)
            close()
            moveTo(14.86f, 8.77f)
            quadToRelative(0.7f, 0.53f, 1.06f, 1.45f)
            reflectiveQuadTo(16.29f, 12f)
            quadToRelative(0f, 0.22f, -0.02f, 0.44f)
            reflectiveQuadToRelative(-0.09f, 0.43f)
            quadToRelative(-0.07f, 0.29f, -0.35f, 0.36f)
            reflectiveQuadToRelative(-0.5f, -0.15f)
            lineTo(14.44f, 12.19f)
            quadTo(14.3f, 12.05f, 14.24f, 11.89f)
            reflectiveQuadTo(14.17f, 11.54f)
            verticalLineTo(9.13f)
            quadToRelative(0f, -0.26f, 0.24f, -0.38f)
            reflectiveQuadToRelative(0.45f, 0.02f)
            close()
            moveTo(9.94f, 7.69f)
            quadTo(9.8f, 7.55f, 9.81f, 7.37f)
            reflectiveQuadTo(9.95f, 7.05f)
            lineTo(10.49f, 6.51f)
            quadTo(10.85f, 6.15f, 11.32f, 6.34f)
            reflectiveQuadToRelative(0.47f, 0.71f)
            verticalLineTo(8.44f)
            quadToRelative(0f, 0.31f, -0.28f, 0.43f)
            reflectiveQuadTo(11.02f, 8.76f)
            lineTo(9.94f, 7.69f)
            close()
            moveToRelative(0.35f, 7.46f)
            verticalLineToRelative(-2.2f)
            lineTo(8.33f, 11f)
            horizontalLineTo(5.29f)
            verticalLineToRelative(2f)
            horizontalLineTo(8.14f)
            lineToRelative(2.15f, 2.15f)
            close()
            moveTo(9.31f, 11.98f)
            close()
          }
        }
        .buildSimpIcon()
    return _VolumeOff!!
  }

private var _VolumeOff: ImageVector? = null
