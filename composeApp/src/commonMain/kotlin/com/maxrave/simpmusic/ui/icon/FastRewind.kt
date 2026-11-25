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
val SimpIcons.FastRewind: ImageVector
  get() {
    if (_FastRewind != null) {
      return _FastRewind!!
    }
    _FastRewind =
      ImageVector.Builder(
          name = "FastRewind",
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
            moveTo(19.3f, 16.38f)
            lineTo(13.87f, 12.75f)
            quadToRelative(-0.21f, -0.14f, -0.3f, -0.33f)
            reflectiveQuadTo(13.46f, 12f)
            reflectiveQuadToRelative(0.1f, -0.42f)
            reflectiveQuadToRelative(0.3f, -0.33f)
            lineTo(19.3f, 7.62f)
            quadTo(19.41f, 7.53f, 19.54f, 7.51f)
            reflectiveQuadTo(19.8f, 7.48f)
            quadToRelative(0.36f, 0f, 0.63f, 0.25f)
            reflectiveQuadTo(20.7f, 8.38f)
            verticalLineToRelative(7.23f)
            quadToRelative(0f, 0.41f, -0.27f, 0.66f)
            reflectiveQuadTo(19.8f, 16.52f)
            quadToRelative(-0.13f, 0f, -0.26f, -0.02f)
            reflectiveQuadTo(19.3f, 16.38f)
            close()
            moveToRelative(-9.44f, 0f)
            lineTo(4.42f, 12.75f)
            quadTo(4.22f, 12.61f, 4.12f, 12.42f)
            reflectiveQuadTo(4.02f, 12f)
            reflectiveQuadToRelative(0.1f, -0.42f)
            reflectiveQuadToRelative(0.3f, -0.33f)
            lineTo(9.85f, 7.62f)
            quadTo(9.97f, 7.53f, 10.1f, 7.51f)
            reflectiveQuadTo(10.36f, 7.48f)
            quadToRelative(0.36f, 0f, 0.63f, 0.25f)
            reflectiveQuadToRelative(0.27f, 0.66f)
            verticalLineToRelative(7.23f)
            quadToRelative(0f, 0.41f, -0.27f, 0.66f)
            reflectiveQuadToRelative(-0.63f, 0.25f)
            quadToRelative(-0.13f, 0f, -0.26f, -0.02f)
            reflectiveQuadTo(9.85f, 16.38f)
            close()
          }
        }
        .buildSimpIcon()
    return _FastRewind!!
  }

private var _FastRewind: ImageVector? = null
