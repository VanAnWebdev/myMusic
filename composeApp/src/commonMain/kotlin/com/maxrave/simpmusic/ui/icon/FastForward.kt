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
val SimpIcons.FastForward: ImageVector
  get() {
    if (_FastForward != null) {
      return _FastForward!!
    }
    _FastForward =
      ImageVector.Builder(
          name = "FastForward",
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
            moveTo(3.3f, 15.62f)
            verticalLineTo(8.38f)
            quadTo(3.3f, 7.97f, 3.57f, 7.73f)
            reflectiveQuadTo(4.2f, 7.48f)
            quadToRelative(0.13f, 0f, 0.26f, 0.03f)
            reflectiveQuadTo(4.7f, 7.62f)
            lineToRelative(5.43f, 3.63f)
            quadToRelative(0.21f, 0.14f, 0.3f, 0.33f)
            reflectiveQuadTo(10.54f, 12f)
            reflectiveQuadToRelative(-0.1f, 0.42f)
            reflectiveQuadToRelative(-0.3f, 0.33f)
            lineTo(4.7f, 16.38f)
            quadTo(4.59f, 16.47f, 4.46f, 16.49f)
            reflectiveQuadTo(4.2f, 16.52f)
            quadToRelative(-0.36f, 0f, -0.63f, -0.25f)
            reflectiveQuadTo(3.3f, 15.62f)
            close()
            moveToRelative(9.44f, 0f)
            verticalLineTo(8.38f)
            quadToRelative(0f, -0.41f, 0.27f, -0.66f)
            reflectiveQuadTo(13.64f, 7.48f)
            quadToRelative(0.13f, 0f, 0.26f, 0.03f)
            reflectiveQuadToRelative(0.25f, 0.12f)
            lineToRelative(5.43f, 3.63f)
            quadToRelative(0.21f, 0.14f, 0.3f, 0.33f)
            reflectiveQuadTo(19.98f, 12f)
            reflectiveQuadToRelative(-0.1f, 0.42f)
            reflectiveQuadToRelative(-0.3f, 0.33f)
            lineToRelative(-5.43f, 3.63f)
            quadToRelative(-0.12f, 0.09f, -0.25f, 0.12f)
            reflectiveQuadToRelative(-0.26f, 0.02f)
            quadToRelative(-0.36f, 0f, -0.63f, -0.25f)
            reflectiveQuadTo(12.74f, 15.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _FastForward!!
  }

private var _FastForward: ImageVector? = null
