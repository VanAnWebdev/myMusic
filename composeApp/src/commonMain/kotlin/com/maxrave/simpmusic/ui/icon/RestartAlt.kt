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
val SimpIcons.RestartAlt: ImageVector
  get() {
    if (_RestartAlt != null) {
      return _RestartAlt!!
    }
    _RestartAlt =
      ImageVector.Builder(
          name = "RestartAlt",
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
            moveTo(10.12f, 20.25f)
            quadTo(7.64f, 19.62f, 6.07f, 17.62f)
            reflectiveQuadTo(4.5f, 13f)
            quadToRelative(0f, -1.35f, 0.47f, -2.58f)
            reflectiveQuadTo(6.29f, 8.17f)
            quadTo(6.49f, 7.93f, 6.79f, 7.93f)
            reflectiveQuadTo(7.33f, 8.17f)
            quadTo(7.54f, 8.37f, 7.55f, 8.67f)
            reflectiveQuadTo(7.35f, 9.23f)
            quadToRelative(-0.66f, 0.78f, -1f, 1.75f)
            reflectiveQuadTo(6f, 13f)
            quadToRelative(0f, 2.06f, 1.25f, 3.67f)
            reflectiveQuadToRelative(3.19f, 2.13f)
            quadToRelative(0.25f, 0.07f, 0.41f, 0.28f)
            reflectiveQuadTo(11f, 19.54f)
            quadToRelative(0f, 0.37f, -0.26f, 0.59f)
            reflectiveQuadToRelative(-0.62f, 0.12f)
            close()
            moveToRelative(3.75f, 0.02f)
            quadToRelative(-0.36f, 0.1f, -0.62f, -0.13f)
            reflectiveQuadTo(13f, 19.54f)
            quadToRelative(0f, -0.23f, 0.16f, -0.44f)
            reflectiveQuadToRelative(0.41f, -0.29f)
            quadToRelative(1.93f, -0.59f, 3.18f, -2.18f)
            reflectiveQuadTo(18f, 13f)
            quadTo(18f, 10.5f, 16.25f, 8.75f)
            reflectiveQuadTo(12f, 7f)
            horizontalLineTo(11.65f)
            lineToRelative(0.82f, 0.82f)
            quadToRelative(0.22f, 0.22f, 0.22f, 0.53f)
            reflectiveQuadTo(12.47f, 8.88f)
            reflectiveQuadTo(11.94f, 9.09f)
            reflectiveQuadTo(11.42f, 8.88f)
            lineTo(9.42f, 6.88f)
            quadTo(9.28f, 6.74f, 9.22f, 6.59f)
            reflectiveQuadTo(9.17f, 6.25f)
            reflectiveQuadTo(9.22f, 5.91f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(11.42f, 3.62f)
            quadTo(11.63f, 3.41f, 11.94f, 3.41f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(12.47f, 4.68f)
            lineTo(11.65f, 5.5f)
            horizontalLineTo(12f)
            quadToRelative(3.14f, 0f, 5.32f, 2.18f)
            reflectiveQuadTo(19.5f, 13f)
            quadToRelative(0f, 2.6f, -1.58f, 4.6f)
            reflectiveQuadToRelative(-4.05f, 2.67f)
            close()
          }
        }
        .buildSimpIcon()
    return _RestartAlt!!
  }

private var _RestartAlt: ImageVector? = null
