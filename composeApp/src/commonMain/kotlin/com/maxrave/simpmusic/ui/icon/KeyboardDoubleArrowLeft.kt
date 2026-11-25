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
val SimpIcons.KeyboardDoubleArrowLeft: ImageVector
  get() {
    if (_KeyboardDoubleArrowLeft != null) {
      return _KeyboardDoubleArrowLeft!!
    }
    _KeyboardDoubleArrowLeft =
      ImageVector.Builder(
          name = "KeyboardDoubleArrowLeft",
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
            moveTo(7.59f, 12f)
            lineToRelative(4.06f, 4.07f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.22f, 0.22f, -0.53f, 0.22f)
            reflectiveQuadTo(10.6f, 17.13f)
            lineTo(6.1f, 12.63f)
            quadTo(5.96f, 12.49f, 5.91f, 12.34f)
            reflectiveQuadTo(5.85f, 12f)
            reflectiveQuadTo(5.91f, 11.66f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(10.6f, 6.87f)
            quadTo(10.81f, 6.67f, 11.11f, 6.65f)
            reflectiveQuadToRelative(0.54f, 0.22f)
            quadToRelative(0.22f, 0.22f, 0.22f, 0.53f)
            reflectiveQuadTo(11.65f, 7.93f)
            lineTo(7.59f, 12f)
            close()
            moveToRelative(6.35f, 0f)
            lineTo(18f, 16.07f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadTo(18f, 17.13f)
            quadToRelative(-0.22f, 0.22f, -0.53f, 0.22f)
            reflectiveQuadTo(16.95f, 17.13f)
            lineTo(12.45f, 12.63f)
            quadToRelative(-0.14f, -0.14f, -0.2f, -0.3f)
            reflectiveQuadTo(12.2f, 12f)
            reflectiveQuadToRelative(0.06f, -0.34f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(16.95f, 6.87f)
            quadTo(17.16f, 6.67f, 17.46f, 6.65f)
            reflectiveQuadTo(18f, 6.87f)
            quadToRelative(0.22f, 0.22f, 0.22f, 0.53f)
            reflectiveQuadTo(18f, 7.93f)
            lineTo(13.94f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardDoubleArrowLeft!!
  }

private var _KeyboardDoubleArrowLeft: ImageVector? = null
