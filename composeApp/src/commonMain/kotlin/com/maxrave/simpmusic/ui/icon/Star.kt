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
val SimpIcons.Star: ImageVector
  get() {
    if (_Star != null) {
      return _Star!!
    }
    _Star =
      ImageVector.Builder(
          name = "Star",
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
            moveTo(12f, 16.69f)
            lineTo(8.11f, 19.03f)
            quadTo(7.89f, 19.16f, 7.67f, 19.14f)
            reflectiveQuadTo(7.28f, 18.99f)
            reflectiveQuadTo(7.01f, 18.66f)
            reflectiveQuadTo(6.98f, 18.21f)
            lineTo(8.01f, 13.79f)
            lineTo(4.57f, 10.82f)
            quadTo(4.38f, 10.65f, 4.33f, 10.43f)
            reflectiveQuadTo(4.36f, 10f)
            reflectiveQuadTo(4.59f, 9.66f)
            reflectiveQuadTo(5f, 9.49f)
            lineTo(9.54f, 9.1f)
            lineTo(11.3f, 4.93f)
            quadToRelative(0.1f, -0.23f, 0.29f, -0.34f)
            reflectiveQuadTo(12f, 4.47f)
            reflectiveQuadToRelative(0.41f, 0.11f)
            reflectiveQuadTo(12.7f, 4.93f)
            lineTo(14.46f, 9.1f)
            lineTo(19f, 9.49f)
            quadToRelative(0.26f, 0.04f, 0.42f, 0.17f)
            reflectiveQuadTo(19.64f, 10f)
            reflectiveQuadToRelative(0.03f, 0.43f)
            reflectiveQuadToRelative(-0.25f, 0.39f)
            lineToRelative(-3.43f, 2.97f)
            lineToRelative(1.03f, 4.42f)
            quadToRelative(0.07f, 0.25f, -0.03f, 0.45f)
            reflectiveQuadToRelative(-0.27f, 0.33f)
            reflectiveQuadToRelative(-0.4f, 0.15f)
            reflectiveQuadTo(15.89f, 19.03f)
            lineTo(12f, 16.69f)
            close()
          }
        }
        .buildSimpIcon()
    return _Star!!
  }

private var _Star: ImageVector? = null
