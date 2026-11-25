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
val SimpIcons.GraphicEq: ImageVector
  get() {
    if (_GraphicEq != null) {
      return _GraphicEq!!
    }
    _GraphicEq =
      ImageVector.Builder(
          name = "GraphicEq",
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
            moveTo(7.38f, 16.81f)
            verticalLineTo(7.19f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(8.13f, 6.44f)
            reflectiveQuadTo(8.66f, 6.66f)
            reflectiveQuadTo(8.87f, 7.19f)
            verticalLineToRelative(9.62f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(8.12f, 17.56f)
            reflectiveQuadTo(7.59f, 17.34f)
            reflectiveQuadTo(7.38f, 16.81f)
            close()
            moveToRelative(3.87f, 3.94f)
            verticalLineTo(3.25f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(17.5f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(11.47f, 21.28f)
            reflectiveQuadTo(11.25f, 20.75f)
            close()
            moveTo(3.5f, 12.9f)
            verticalLineTo(11.1f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(4.25f, 10.35f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(5f, 11.1f)
            verticalLineTo(12.9f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(4.25f, 13.65f)
            reflectiveQuadTo(3.72f, 13.44f)
            reflectiveQuadTo(3.5f, 12.9f)
            close()
            moveToRelative(11.62f, 3.9f)
            verticalLineTo(7.19f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(15.88f, 6.44f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(9.62f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(15.34f, 17.34f)
            reflectiveQuadTo(15.13f, 16.81f)
            close()
            moveTo(19f, 12.9f)
            verticalLineTo(11.1f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 11.1f)
            verticalLineTo(12.9f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(19.22f, 13.44f)
            reflectiveQuadTo(19f, 12.9f)
            close()
          }
        }
        .buildSimpIcon()
    return _GraphicEq!!
  }

private var _GraphicEq: ImageVector? = null
