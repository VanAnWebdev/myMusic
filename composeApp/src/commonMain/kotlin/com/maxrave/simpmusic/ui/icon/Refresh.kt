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
val SimpIcons.Refresh: ImageVector
  get() {
    if (_Refresh != null) {
      return _Refresh!!
    }
    _Refresh =
      ImageVector.Builder(
          name = "Refresh",
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
            moveTo(12.04f, 19.5f)
            quadTo(8.9f, 19.5f, 6.72f, 17.32f)
            reflectiveQuadTo(4.54f, 12f)
            reflectiveQuadTo(6.72f, 6.68f)
            reflectiveQuadTo(12.04f, 4.5f)
            quadToRelative(1.75f, 0f, 3.32f, 0.78f)
            reflectiveQuadToRelative(2.6f, 2.2f)
            verticalLineTo(5.25f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(18.71f, 4.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(9.71f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadToRelative(-0.64f, 0.26f)
            horizontalLineTo(14.1f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(13.35f, 9.87f)
            reflectiveQuadTo(13.56f, 9.33f)
            reflectiveQuadTo(14.1f, 9.12f)
            horizontalLineToRelative(3.2f)
            quadTo(16.51f, 7.67f, 15.1f, 6.83f)
            reflectiveQuadTo(12.04f, 6f)
            quadTo(9.54f, 6f, 7.79f, 7.75f)
            reflectiveQuadTo(6.04f, 12f)
            reflectiveQuadToRelative(1.75f, 4.25f)
            reflectiveQuadTo(12.04f, 18f)
            quadToRelative(1.74f, 0f, 3.19f, -0.92f)
            reflectiveQuadToRelative(2.19f, -2.44f)
            quadToRelative(0.14f, -0.27f, 0.42f, -0.38f)
            reflectiveQuadToRelative(0.56f, -0.01f)
            quadToRelative(0.31f, 0.1f, 0.43f, 0.4f)
            reflectiveQuadToRelative(-0.02f, 0.58f)
            quadToRelative(-0.93f, 1.94f, -2.74f, 3.11f)
            reflectiveQuadTo(12.04f, 19.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Refresh!!
  }

private var _Refresh: ImageVector? = null
