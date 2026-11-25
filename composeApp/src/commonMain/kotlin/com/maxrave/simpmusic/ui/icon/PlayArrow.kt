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
val SimpIcons.PlayArrow: ImageVector
  get() {
    if (_PlayArrow != null) {
      return _PlayArrow!!
    }
    _PlayArrow =
      ImageVector.Builder(
          name = "PlayArrow",
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
            moveTo(8.5f, 16.44f)
            verticalLineTo(7.56f)
            quadToRelative(0f, -0.4f, 0.27f, -0.65f)
            reflectiveQuadTo(9.4f, 6.65f)
            quadToRelative(0.12f, 0f, 0.24f, 0.03f)
            reflectiveQuadToRelative(0.24f, 0.1f)
            lineToRelative(7f, 4.45f)
            quadToRelative(0.21f, 0.14f, 0.31f, 0.34f)
            reflectiveQuadTo(17.29f, 12f)
            reflectiveQuadToRelative(-0.1f, 0.43f)
            reflectiveQuadToRelative(-0.31f, 0.34f)
            lineToRelative(-7f, 4.45f)
            quadToRelative(-0.12f, 0.07f, -0.24f, 0.1f)
            reflectiveQuadTo(9.4f, 17.35f)
            quadToRelative(-0.36f, 0f, -0.63f, -0.25f)
            reflectiveQuadTo(8.5f, 16.44f)
            close()
          }
        }
        .buildSimpIcon()
    return _PlayArrow!!
  }

private var _PlayArrow: ImageVector? = null
