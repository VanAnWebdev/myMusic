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
val SimpIcons.DarkMode: ImageVector
  get() {
    if (_DarkMode != null) {
      return _DarkMode!!
    }
    _DarkMode =
      ImageVector.Builder(
          name = "DarkMode",
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
            moveTo(12.03f, 20.5f)
            quadTo(8.48f, 20.5f, 6f, 18.03f)
            reflectiveQuadTo(3.53f, 12f)
            quadToRelative(0f, -2.96f, 1.83f, -5.26f)
            reflectiveQuadTo(10.24f, 3.77f)
            quadTo(10.56f, 3.69f, 10.8f, 3.79f)
            reflectiveQuadToRelative(0.39f, 0.28f)
            reflectiveQuadToRelative(0.18f, 0.45f)
            reflectiveQuadTo(11.24f, 5.05f)
            quadTo(10.93f, 5.62f, 10.78f, 6.22f)
            reflectiveQuadTo(10.63f, 7.5f)
            quadToRelative(0f, 2.46f, 1.72f, 4.18f)
            reflectiveQuadToRelative(4.18f, 1.72f)
            quadToRelative(0.74f, 0f, 1.41f, -0.19f)
            reflectiveQuadToRelative(1.17f, -0.43f)
            quadToRelative(0.25f, -0.11f, 0.48f, -0.08f)
            reflectiveQuadToRelative(0.4f, 0.16f)
            quadToRelative(0.18f, 0.13f, 0.27f, 0.34f)
            reflectiveQuadToRelative(0.02f, 0.51f)
            quadToRelative(-0.53f, 2.95f, -2.87f, 4.87f)
            reflectiveQuadTo(12.03f, 20.5f)
            close()
            moveToRelative(0f, -1.5f)
            quadToRelative(2.2f, 0f, 3.95f, -1.21f)
            reflectiveQuadToRelative(2.55f, -3.16f)
            quadToRelative(-0.5f, 0.13f, -1f, 0.2f)
            reflectiveQuadToRelative(-1f, 0.08f)
            quadToRelative(-3.08f, 0f, -5.24f, -2.16f)
            quadTo(9.13f, 10.58f, 9.13f, 7.5f)
            quadTo(9.13f, 7f, 9.2f, 6.5f)
            reflectiveQuadToRelative(0.2f, -1f)
            quadTo(7.45f, 6.3f, 6.24f, 8.05f)
            reflectiveQuadTo(5.03f, 12f)
            quadToRelative(0f, 2.9f, 2.05f, 4.95f)
            reflectiveQuadTo(12.03f, 19f)
            close()
            moveTo(11.78f, 12.25f)
            close()
          }
        }
        .buildSimpIcon()
    return _DarkMode!!
  }

private var _DarkMode: ImageVector? = null
