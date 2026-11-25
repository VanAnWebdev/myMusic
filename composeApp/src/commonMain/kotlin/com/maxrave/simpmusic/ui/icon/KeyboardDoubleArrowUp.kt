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
val SimpIcons.KeyboardDoubleArrowUp: ImageVector
  get() {
    if (_KeyboardDoubleArrowUp != null) {
      return _KeyboardDoubleArrowUp!!
    }
    _KeyboardDoubleArrowUp =
      ImageVector.Builder(
          name = "KeyboardDoubleArrowUp",
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
            moveTo(12f, 13.47f)
            lineTo(7.93f, 17.53f)
            quadTo(7.72f, 17.73f, 7.41f, 17.75f)
            reflectiveQuadTo(6.87f, 17.53f)
            quadTo(6.66f, 17.31f, 6.66f, 17f)
            reflectiveQuadTo(6.87f, 16.47f)
            lineToRelative(4.49f, -4.49f)
            quadToRelative(0.14f, -0.14f, 0.3f, -0.2f)
            reflectiveQuadTo(12f, 11.72f)
            reflectiveQuadToRelative(0.34f, 0.06f)
            reflectiveQuadToRelative(0.3f, 0.2f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.22f, 0.22f, -0.53f, 0.22f)
            reflectiveQuadTo(16.07f, 17.53f)
            lineTo(12f, 13.47f)
            close()
            moveToRelative(0f, -6f)
            lineTo(7.93f, 11.53f)
            quadTo(7.72f, 11.73f, 7.41f, 11.75f)
            reflectiveQuadTo(6.87f, 11.53f)
            quadTo(6.66f, 11.31f, 6.66f, 11f)
            reflectiveQuadTo(6.87f, 10.47f)
            lineTo(11.37f, 5.98f)
            quadToRelative(0.14f, -0.14f, 0.3f, -0.2f)
            reflectiveQuadTo(12f, 5.72f)
            reflectiveQuadToRelative(0.34f, 0.06f)
            reflectiveQuadToRelative(0.3f, 0.2f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.22f, 0.22f, -0.53f, 0.22f)
            reflectiveQuadTo(16.07f, 11.53f)
            lineTo(12f, 7.47f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardDoubleArrowUp!!
  }

private var _KeyboardDoubleArrowUp: ImageVector? = null
