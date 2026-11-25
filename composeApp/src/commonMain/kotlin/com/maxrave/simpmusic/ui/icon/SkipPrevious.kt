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
val SimpIcons.SkipPrevious: ImageVector
  get() {
    if (_SkipPrevious != null) {
      return _SkipPrevious!!
    }
    _SkipPrevious =
      ImageVector.Builder(
          name = "SkipPrevious",
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
            moveTo(6.12f, 16.56f)
            verticalLineTo(7.44f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(6.87f, 6.69f)
            reflectiveQuadTo(7.4f, 6.91f)
            reflectiveQuadTo(7.62f, 7.44f)
            verticalLineToRelative(9.12f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(6.87f, 17.31f)
            reflectiveQuadTo(6.33f, 17.09f)
            reflectiveQuadTo(6.12f, 16.56f)
            close()
            moveTo(16.48f, 16.38f)
            lineTo(11.05f, 12.75f)
            quadToRelative(-0.21f, -0.14f, -0.3f, -0.33f)
            reflectiveQuadTo(10.65f, 12f)
            reflectiveQuadToRelative(0.1f, -0.42f)
            reflectiveQuadToRelative(0.3f, -0.33f)
            lineTo(16.48f, 7.62f)
            quadTo(16.59f, 7.53f, 16.72f, 7.51f)
            reflectiveQuadTo(16.98f, 7.48f)
            quadToRelative(0.36f, 0f, 0.63f, 0.25f)
            reflectiveQuadToRelative(0.27f, 0.66f)
            verticalLineToRelative(7.23f)
            quadToRelative(0f, 0.41f, -0.27f, 0.66f)
            reflectiveQuadToRelative(-0.63f, 0.25f)
            quadToRelative(-0.13f, 0f, -0.26f, -0.02f)
            reflectiveQuadTo(16.48f, 16.38f)
            close()
          }
        }
        .buildSimpIcon()
    return _SkipPrevious!!
  }

private var _SkipPrevious: ImageVector? = null
