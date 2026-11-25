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
val SimpIcons.Cookie: ImageVector
  get() {
    if (_Cookie != null) {
      return _Cookie!!
    }
    _Cookie =
      ImageVector.Builder(
          name = "Cookie",
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
            moveTo(12f, 21.75f)
            quadToRelative(-2.03f, 0f, -3.8f, -0.77f)
            reflectiveQuadTo(5.1f, 18.9f)
            reflectiveQuadTo(3.02f, 15.8f)
            reflectiveQuadTo(2.25f, 12f)
            reflectiveQuadTo(3.09f, 8.1f)
            reflectiveQuadTo(5.38f, 4.85f)
            reflectiveQuadTo(8.82f, 2.75f)
            reflectiveQuadTo(13.07f, 2.29f)
            quadToRelative(0.31f, 0.04f, 0.48f, 0.26f)
            reflectiveQuadToRelative(0.2f, 0.57f)
            quadToRelative(0.08f, 1.73f, 1.24f, 2.86f)
            reflectiveQuadTo(17.9f, 7.23f)
            quadToRelative(0.4f, 0.02f, 0.62f, 0.25f)
            reflectiveQuadToRelative(0.23f, 0.65f)
            quadToRelative(0.04f, 1.1f, 0.69f, 1.86f)
            reflectiveQuadToRelative(1.69f, 1.12f)
            quadToRelative(0.29f, 0.11f, 0.46f, 0.31f)
            reflectiveQuadToRelative(0.17f, 0.5f)
            quadToRelative(-0.01f, 2.01f, -0.78f, 3.8f)
            reflectiveQuadToRelative(-2.09f, 3.13f)
            reflectiveQuadToRelative(-3.09f, 2.12f)
            reflectiveQuadTo(12f, 21.75f)
            close()
            moveToRelative(0f, -1.5f)
            quadToRelative(3.15f, 0f, 5.58f, -2.22f)
            reflectiveQuadToRelative(2.66f, -5.64f)
            quadToRelative(-1.29f, -0.54f, -2.02f, -1.5f)
            reflectiveQuadTo(17.31f, 8.66f)
            quadTo(15.31f, 8.43f, 13.93f, 7.09f)
            reflectiveQuadTo(12.33f, 3.73f)
            quadTo(10.37f, 3.65f, 8.79f, 4.36f)
            reflectiveQuadTo(6.09f, 6.28f)
            reflectiveQuadTo(4.36f, 9f)
            reflectiveQuadTo(3.75f, 12f)
            quadToRelative(0f, 3.42f, 2.41f, 5.84f)
            reflectiveQuadTo(12f, 20.25f)
            close()
            moveToRelative(0f, -8.4f)
            close()
            moveTo(10.5f, 9.9f)
            quadToRelative(0.59f, 0f, 1f, -0.41f)
            reflectiveQuadTo(11.9f, 8.5f)
            quadToRelative(0f, -0.59f, -0.41f, -1f)
            reflectiveQuadTo(10.5f, 7.1f)
            quadTo(9.92f, 7.1f, 9.51f, 7.5f)
            reflectiveQuadTo(9.1f, 8.5f)
            quadToRelative(0f, 0.58f, 0.41f, 0.99f)
            reflectiveQuadTo(10.5f, 9.9f)
            close()
            moveToRelative(-2f, 5f)
            quadToRelative(0.59f, 0f, 1f, -0.41f)
            reflectiveQuadTo(9.9f, 13.5f)
            quadToRelative(0f, -0.59f, -0.41f, -1f)
            reflectiveQuadTo(8.5f, 12.1f)
            quadToRelative(-0.58f, 0f, -0.99f, 0.41f)
            reflectiveQuadToRelative(-0.41f, 1f)
            quadToRelative(0f, 0.58f, 0.41f, 0.99f)
            reflectiveQuadTo(8.5f, 14.9f)
            close()
            moveToRelative(6.5f, 1f)
            quadToRelative(0.39f, 0f, 0.65f, -0.26f)
            reflectiveQuadTo(15.9f, 15f)
            quadToRelative(0f, -0.39f, -0.26f, -0.65f)
            reflectiveQuadTo(15f, 14.1f)
            quadToRelative(-0.38f, 0f, -0.64f, 0.26f)
            reflectiveQuadTo(14.1f, 15f)
            quadToRelative(0f, 0.38f, 0.26f, 0.64f)
            reflectiveQuadTo(15f, 15.9f)
            close()
          }
        }
        .buildSimpIcon()
    return _Cookie!!
  }

private var _Cookie: ImageVector? = null
