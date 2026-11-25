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
val SimpIcons.KeyboardDoubleArrowDown: ImageVector
  get() {
    if (_KeyboardDoubleArrowDown != null) {
      return _KeyboardDoubleArrowDown!!
    }
    _KeyboardDoubleArrowDown =
      ImageVector.Builder(
          name = "KeyboardDoubleArrowDown",
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
            moveTo(12f, 16.51f)
            lineToRelative(4.07f, -4.06f)
            quadToRelative(0.21f, -0.21f, 0.51f, -0.22f)
            reflectiveQuadToRelative(0.54f, 0.22f)
            quadToRelative(0.22f, 0.22f, 0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            lineTo(12.63f, 18f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 18.26f)
            reflectiveQuadTo(11.66f, 18.2f)
            reflectiveQuadTo(11.37f, 18f)
            lineTo(6.87f, 13.51f)
            quadTo(6.67f, 13.3f, 6.65f, 12.99f)
            reflectiveQuadTo(6.87f, 12.45f)
            quadTo(7.09f, 12.24f, 7.4f, 12.24f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineTo(12f, 16.51f)
            close()
            moveToRelative(0f, -5.98f)
            lineTo(16.07f, 6.47f)
            quadTo(16.28f, 6.27f, 16.59f, 6.25f)
            reflectiveQuadToRelative(0.54f, 0.22f)
            quadTo(17.34f, 6.69f, 17.34f, 7f)
            reflectiveQuadTo(17.13f, 7.53f)
            lineToRelative(-4.49f, 4.49f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 12.28f)
            reflectiveQuadTo(11.66f, 12.22f)
            reflectiveQuadToRelative(-0.3f, -0.2f)
            lineTo(6.87f, 7.53f)
            quadTo(6.67f, 7.32f, 6.65f, 7.01f)
            reflectiveQuadTo(6.87f, 6.47f)
            quadTo(7.09f, 6.26f, 7.4f, 6.26f)
            reflectiveQuadTo(7.93f, 6.47f)
            lineTo(12f, 10.53f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardDoubleArrowDown!!
  }

private var _KeyboardDoubleArrowDown: ImageVector? = null
