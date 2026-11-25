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
val SimpIcons.DataUsage: ImageVector
  get() {
    if (_DataUsage != null) {
      return _DataUsage!!
    }
    _DataUsage =
      ImageVector.Builder(
          name = "DataUsage",
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
            moveTo(12f, 21.5f)
            quadToRelative(-1.97f, 0f, -3.7f, -0.75f)
            reflectiveQuadTo(5.28f, 18.72f)
            reflectiveQuadTo(3.25f, 15.7f)
            reflectiveQuadTo(2.5f, 12f)
            quadTo(2.5f, 8.77f, 4.43f, 6.25f)
            reflectiveQuadTo(9.48f, 2.87f)
            quadTo(10f, 2.7f, 10.42f, 3f)
            reflectiveQuadToRelative(0.42f, 0.82f)
            quadToRelative(0f, 0.36f, -0.2f, 0.64f)
            reflectiveQuadTo(10.13f, 4.85f)
            quadTo(7.68f, 5.46f, 6.15f, 7.45f)
            reflectiveQuadTo(4.62f, 12f)
            quadToRelative(0f, 3.08f, 2.15f, 5.23f)
            reflectiveQuadTo(12f, 19.38f)
            quadToRelative(1.49f, 0f, 2.87f, -0.57f)
            reflectiveQuadToRelative(2.38f, -1.61f)
            quadToRelative(0.27f, -0.26f, 0.64f, -0.27f)
            reflectiveQuadToRelative(0.65f, 0.23f)
            quadToRelative(0.4f, 0.35f, 0.42f, 0.83f)
            reflectiveQuadToRelative(-0.4f, 0.85f)
            quadToRelative(-1.34f, 1.3f, -3.01f, 1.98f)
            reflectiveQuadTo(12f, 21.5f)
            close()
            moveTo(19.38f, 12f)
            quadToRelative(0f, -2.55f, -1.55f, -4.54f)
            reflectiveQuadTo(13.84f, 4.85f)
            quadTo(13.52f, 4.75f, 13.32f, 4.46f)
            reflectiveQuadTo(13.12f, 3.82f)
            quadToRelative(0f, -0.51f, 0.43f, -0.81f)
            reflectiveQuadTo(14.49f, 2.87f)
            quadToRelative(3.12f, 0.83f, 5.06f, 3.37f)
            reflectiveQuadTo(21.5f, 12f)
            quadToRelative(0f, 0.58f, -0.07f, 1.16f)
            reflectiveQuadToRelative(-0.24f, 1.16f)
            quadToRelative(-0.1f, 0.5f, -0.53f, 0.72f)
            reflectiveQuadToRelative(-0.94f, 0.03f)
            quadTo(19.38f, 14.94f, 19.2f, 14.61f)
            reflectiveQuadToRelative(-0.1f, -0.69f)
            quadToRelative(0.13f, -0.54f, 0.2f, -1.01f)
            reflectiveQuadTo(19.38f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _DataUsage!!
  }

private var _DataUsage: ImageVector? = null
