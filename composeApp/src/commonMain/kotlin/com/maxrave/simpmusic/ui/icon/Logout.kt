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
val SimpIcons.Logout: ImageVector
  get() {
    if (_Logout != null) {
      return _Logout!!
    }
    _Logout =
      ImageVector.Builder(
          name = "Logout",
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
            moveTo(5.31f, 20.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.55f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineToRelative(5.95f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(11.79f, 4.78f)
            reflectiveQuadTo(11.26f, 5f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 5f, 5.1f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            horizontalLineToRelative(5.95f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(11.26f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveTo(17.62f, 12.75f)
            horizontalLineTo(9.85f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(9.1f, 12f)
            reflectiveQuadTo(9.31f, 11.47f)
            reflectiveQuadTo(9.85f, 11.25f)
            horizontalLineToRelative(7.77f)
            lineTo(15.69f, 9.33f)
            quadTo(15.49f, 9.12f, 15.48f, 8.82f)
            reflectiveQuadTo(15.69f, 8.29f)
            reflectiveQuadTo(16.22f, 8.05f)
            reflectiveQuadToRelative(0.54f, 0.22f)
            lineToRelative(3.09f, 3.09f)
            quadToRelative(0.27f, 0.27f, 0.27f, 0.63f)
            reflectiveQuadToRelative(-0.27f, 0.63f)
            lineToRelative(-3.09f, 3.09f)
            quadToRelative(-0.22f, 0.22f, -0.53f, 0.22f)
            reflectiveQuadTo(15.69f, 15.71f)
            quadTo(15.48f, 15.48f, 15.48f, 15.18f)
            reflectiveQuadToRelative(0.22f, -0.52f)
            lineToRelative(1.91f, -1.91f)
            close()
          }
        }
        .buildSimpIcon()
    return _Logout!!
  }

private var _Logout: ImageVector? = null
