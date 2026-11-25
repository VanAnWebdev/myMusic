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
val SimpIcons.SkipNext: ImageVector
  get() {
    if (_SkipNext != null) {
      return _SkipNext!!
    }
    _SkipNext =
      ImageVector.Builder(
          name = "SkipNext",
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
            moveTo(16.38f, 16.56f)
            verticalLineTo(7.44f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(17.13f, 6.69f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(9.12f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(16.6f, 17.09f)
            reflectiveQuadTo(16.38f, 16.56f)
            close()
            moveTo(6.12f, 15.62f)
            verticalLineTo(8.38f)
            quadToRelative(0f, -0.41f, 0.27f, -0.66f)
            reflectiveQuadTo(7.02f, 7.48f)
            quadToRelative(0.13f, 0f, 0.26f, 0.03f)
            reflectiveQuadTo(7.52f, 7.62f)
            lineToRelative(5.43f, 3.63f)
            quadToRelative(0.21f, 0.14f, 0.3f, 0.33f)
            reflectiveQuadTo(13.35f, 12f)
            reflectiveQuadToRelative(-0.1f, 0.42f)
            reflectiveQuadToRelative(-0.3f, 0.33f)
            lineTo(7.52f, 16.38f)
            quadTo(7.41f, 16.47f, 7.28f, 16.49f)
            reflectiveQuadTo(7.02f, 16.52f)
            quadToRelative(-0.36f, 0f, -0.63f, -0.25f)
            reflectiveQuadTo(6.12f, 15.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _SkipNext!!
  }

private var _SkipNext: ImageVector? = null
