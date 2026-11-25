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
val SimpIcons.MicOff: ImageVector
  get() {
    if (_MicOff != null) {
      return _MicOff!!
    }
    _MicOff =
      ImageVector.Builder(
          name = "MicOff",
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
            moveTo(16.52f, 13.9f)
            quadTo(16.26f, 13.76f, 16.17f, 13.45f)
            reflectiveQuadToRelative(0.06f, -0.57f)
            quadToRelative(0.15f, -0.26f, 0.22f, -0.54f)
            reflectiveQuadToRelative(0.12f, -0.58f)
            quadToRelative(0.07f, -0.32f, 0.29f, -0.53f)
            reflectiveQuadTo(17.39f, 11f)
            reflectiveQuadToRelative(0.53f, 0.23f)
            reflectiveQuadToRelative(0.18f, 0.55f)
            quadToRelative(-0.06f, 0.47f, -0.19f, 0.93f)
            reflectiveQuadToRelative(-0.36f, 0.87f)
            quadToRelative(-0.14f, 0.27f, -0.45f, 0.37f)
            reflectiveQuadTo(16.52f, 13.9f)
            close()
            moveTo(11.64f, 8.54f)
            close()
            moveToRelative(0f, -6.04f)
            quadToRelative(1.05f, 0f, 1.77f, 0.73f)
            reflectiveQuadTo(14.14f, 5f)
            verticalLineTo(9.25f)
            quadToRelative(0f, 0.37f, -0.24f, 0.56f)
            reflectiveQuadTo(13.39f, 10f)
            reflectiveQuadTo(12.88f, 9.8f)
            reflectiveQuadTo(12.64f, 9.23f)
            verticalLineTo(5f)
            quadToRelative(0f, -0.43f, -0.29f, -0.71f)
            reflectiveQuadTo(11.64f, 4f)
            reflectiveQuadTo(10.93f, 4.29f)
            reflectiveQuadTo(10.64f, 5f)
            verticalLineTo(5.73f)
            quadToRelative(0f, 0.37f, -0.24f, 0.56f)
            reflectiveQuadTo(9.89f, 6.48f)
            reflectiveQuadTo(9.38f, 6.29f)
            reflectiveQuadTo(9.14f, 5.72f)
            verticalLineTo(5f)
            quadToRelative(0f, -1.05f, 0.73f, -1.77f)
            reflectiveQuadTo(11.64f, 2.5f)
            close()
            moveTo(10.89f, 20f)
            verticalLineTo(17.45f)
            quadTo(8.66f, 17.21f, 7.07f, 15.63f)
            reflectiveQuadTo(5.2f, 11.77f)
            quadTo(5.16f, 11.46f, 5.37f, 11.23f)
            reflectiveQuadTo(5.89f, 11f)
            reflectiveQuadToRelative(0.54f, 0.22f)
            reflectiveQuadToRelative(0.28f, 0.54f)
            quadToRelative(0.27f, 1.85f, 1.67f, 3.05f)
            reflectiveQuadTo(11.64f, 16f)
            quadToRelative(0.97f, 0f, 1.81f, -0.34f)
            reflectiveQuadToRelative(1.5f, -0.95f)
            lineToRelative(1.07f, 1.07f)
            quadToRelative(-0.73f, 0.68f, -1.65f, 1.13f)
            reflectiveQuadToRelative(-1.99f, 0.55f)
            verticalLineTo(20f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(11.11f, 20.53f)
            reflectiveQuadTo(10.89f, 20f)
            close()
            moveToRelative(8.45f, 1.19f)
            lineTo(2.21f, 4.05f)
            quadTo(2f, 3.85f, 1.99f, 3.53f)
            reflectiveQuadTo(2.21f, 3f)
            reflectiveQuadTo(2.73f, 2.78f)
            reflectiveQuadTo(3.26f, 3f)
            lineTo(20.39f, 20.13f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(19.34f, 21.19f)
            close()
          }
        }
        .buildSimpIcon()
    return _MicOff!!
  }

private var _MicOff: ImageVector? = null
