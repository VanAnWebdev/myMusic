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
val SimpIcons.FavoriteBorder: ImageVector
  get() {
    if (_FavoriteBorder != null) {
      return _FavoriteBorder!!
    }
    _FavoriteBorder =
      ImageVector.Builder(
          name = "FavoriteBorder",
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
            moveTo(11.35f, 19.59f)
            quadTo(11.02f, 19.48f, 10.78f, 19.23f)
            lineTo(9.34f, 17.93f)
            quadTo(6.68f, 15.5f, 4.59f, 13.16f)
            reflectiveQuadTo(2.5f, 8.15f)
            quadTo(2.5f, 6.02f, 3.94f, 4.59f)
            reflectiveQuadTo(7.5f, 3.15f)
            quadToRelative(1.21f, 0f, 2.39f, 0.56f)
            reflectiveQuadTo(12f, 5.52f)
            quadTo(12.93f, 4.27f, 14.11f, 3.71f)
            reflectiveQuadTo(16.5f, 3.15f)
            quadToRelative(2.13f, 0f, 3.56f, 1.44f)
            reflectiveQuadTo(21.5f, 8.15f)
            quadToRelative(0f, 2.7f, -2.13f, 5.07f)
            reflectiveQuadToRelative(-4.74f, 4.72f)
            lineToRelative(-1.42f, 1.29f)
            quadToRelative(-0.25f, 0.25f, -0.57f, 0.36f)
            reflectiveQuadToRelative(-0.65f, 0.12f)
            reflectiveQuadTo(11.35f, 19.59f)
            close()
            moveTo(11.28f, 7.04f)
            quadTo(10.47f, 5.8f, 9.57f, 5.23f)
            quadTo(8.68f, 4.65f, 7.5f, 4.65f)
            quadTo(6f, 4.65f, 5f, 5.65f)
            reflectiveQuadTo(4f, 8.15f)
            quadToRelative(0f, 1.2f, 0.78f, 2.52f)
            reflectiveQuadToRelative(1.95f, 2.61f)
            reflectiveQuadToRelative(2.54f, 2.54f)
            reflectiveQuadToRelative(2.53f, 2.3f)
            quadToRelative(0.09f, 0.08f, 0.2f, 0.08f)
            reflectiveQuadToRelative(0.2f, -0.08f)
            quadToRelative(1.17f, -1.06f, 2.53f, -2.3f)
            reflectiveQuadToRelative(2.54f, -2.54f)
            reflectiveQuadToRelative(1.95f, -2.61f)
            reflectiveQuadTo(20f, 8.15f)
            quadToRelative(0f, -1.5f, -1f, -2.5f)
            reflectiveQuadToRelative(-2.5f, -1f)
            quadToRelative(-1.17f, 0f, -2.07f, 0.58f)
            reflectiveQuadTo(12.72f, 7.04f)
            quadTo(12.59f, 7.23f, 12.4f, 7.33f)
            reflectiveQuadTo(12f, 7.42f)
            reflectiveQuadTo(11.6f, 7.33f)
            reflectiveQuadTo(11.28f, 7.04f)
            close()
            moveTo(12f, 11.44f)
            close()
          }
        }
        .buildSimpIcon()
    return _FavoriteBorder!!
  }

private var _FavoriteBorder: ImageVector? = null
