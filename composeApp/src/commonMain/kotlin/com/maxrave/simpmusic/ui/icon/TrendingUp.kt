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
val SimpIcons.TrendingUp: ImageVector
  get() {
    if (_TrendingUp != null) {
      return _TrendingUp!!
    }
    _TrendingUp =
      ImageVector.Builder(
          name = "TrendingUp",
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
            moveTo(3.03f, 17.26f)
            quadTo(2.79f, 17.03f, 2.81f, 16.72f)
            reflectiveQuadTo(3.03f, 16.22f)
            lineTo(8.07f, 11.11f)
            quadTo(8.59f, 10.58f, 9.35f, 10.58f)
            reflectiveQuadToRelative(1.29f, 0.53f)
            lineToRelative(2.5f, 2.51f)
            quadToRelative(0.09f, 0.09f, 0.21f, 0.09f)
            reflectiveQuadToRelative(0.22f, -0.09f)
            lineTo(18.97f, 8.29f)
            horizontalLineTo(16.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(16f, 7.54f)
            reflectiveQuadTo(16.22f, 7f)
            reflectiveQuadTo(16.75f, 6.79f)
            horizontalLineTo(20.6f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadTo(21.5f, 7.69f)
            verticalLineToRelative(3.85f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(20.22f, 12.08f)
            reflectiveQuadTo(20f, 11.55f)
            verticalLineTo(9.34f)
            lineToRelative(-5.37f, 5.37f)
            quadToRelative(-0.52f, 0.52f, -1.28f, 0.52f)
            reflectiveQuadTo(12.07f, 14.71f)
            lineToRelative(-2.5f, -2.5f)
            quadTo(9.49f, 12.12f, 9.35f, 12.12f)
            reflectiveQuadTo(9.13f, 12.21f)
            lineTo(4.08f, 17.26f)
            quadTo(3.86f, 17.48f, 3.55f, 17.48f)
            reflectiveQuadTo(3.03f, 17.26f)
            close()
          }
        }
        .buildSimpIcon()
    return _TrendingUp!!
  }

private var _TrendingUp: ImageVector? = null
