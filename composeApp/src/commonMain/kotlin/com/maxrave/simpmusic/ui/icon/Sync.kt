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
val SimpIcons.Sync: ImageVector
  get() {
    if (_Sync != null) {
      return _Sync!!
    }
    _Sync =
      ImageVector.Builder(
          name = "Sync",
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
            moveTo(5.75f, 12.07f)
            quadToRelative(0f, 1.17f, 0.44f, 2.28f)
            reflectiveQuadToRelative(1.38f, 2.04f)
            lineToRelative(0.63f, 0.63f)
            verticalLineTo(15.04f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(8.96f, 14.29f)
            reflectiveQuadTo(9.5f, 14.5f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(3.73f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(8.81f, 19.67f)
            horizontalLineTo(5.08f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(4.33f, 18.92f)
            reflectiveQuadTo(4.54f, 18.39f)
            reflectiveQuadTo(5.08f, 18.17f)
            horizontalLineTo(7.25f)
            lineTo(6.52f, 17.48f)
            quadTo(5.29f, 16.34f, 4.77f, 14.92f)
            reflectiveQuadTo(4.25f, 12.07f)
            quadToRelative(0f, -2.26f, 1.16f, -4.12f)
            reflectiveQuadTo(8.53f, 5.08f)
            quadTo(8.8f, 4.93f, 9.1f, 5.05f)
            reflectiveQuadTo(9.5f, 5.46f)
            quadTo(9.6f, 5.75f, 9.49f, 6.03f)
            reflectiveQuadTo(9.11f, 6.47f)
            quadTo(7.57f, 7.3f, 6.66f, 8.79f)
            reflectiveQuadTo(5.75f, 12.07f)
            close()
            moveToRelative(12.5f, -0.14f)
            quadToRelative(0f, -1.17f, -0.44f, -2.28f)
            reflectiveQuadTo(16.42f, 7.61f)
            lineTo(15.79f, 6.97f)
            verticalLineTo(8.96f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(15.04f, 9.71f)
            reflectiveQuadTo(14.5f, 9.5f)
            reflectiveQuadTo(14.29f, 8.96f)
            verticalLineTo(5.23f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(15.19f, 4.33f)
            horizontalLineToRelative(3.73f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(19.46f, 5.61f)
            reflectiveQuadTo(18.92f, 5.83f)
            horizontalLineTo(16.75f)
            lineToRelative(0.73f, 0.7f)
            quadToRelative(1.18f, 1.18f, 1.73f, 2.58f)
            reflectiveQuadToRelative(0.54f, 2.83f)
            quadToRelative(0f, 2.26f, -1.16f, 4.12f)
            reflectiveQuadToRelative(-3.11f, 2.86f)
            quadToRelative(-0.27f, 0.15f, -0.57f, 0.04f)
            reflectiveQuadToRelative(-0.4f, -0.41f)
            quadToRelative(-0.1f, -0.28f, 0.01f, -0.57f)
            reflectiveQuadToRelative(0.37f, -0.44f)
            quadToRelative(1.54f, -0.83f, 2.45f, -2.32f)
            reflectiveQuadToRelative(0.91f, -3.28f)
            close()
          }
        }
        .buildSimpIcon()
    return _Sync!!
  }

private var _Sync: ImageVector? = null
