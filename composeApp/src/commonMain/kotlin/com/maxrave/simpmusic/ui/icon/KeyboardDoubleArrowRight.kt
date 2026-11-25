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
val SimpIcons.KeyboardDoubleArrowRight: ImageVector
  get() {
    if (_KeyboardDoubleArrowRight != null) {
      return _KeyboardDoubleArrowRight!!
    }
    _KeyboardDoubleArrowRight =
      ImageVector.Builder(
          name = "KeyboardDoubleArrowRight",
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
            moveTo(10.06f, 12f)
            lineTo(6f, 7.93f)
            quadTo(5.79f, 7.72f, 5.78f, 7.41f)
            reflectiveQuadTo(6f, 6.87f)
            quadTo(6.22f, 6.66f, 6.53f, 6.66f)
            reflectiveQuadTo(7.05f, 6.87f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadTo(11.8f, 12f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineTo(7.05f, 17.13f)
            quadTo(6.84f, 17.33f, 6.54f, 17.35f)
            reflectiveQuadTo(6f, 17.13f)
            quadTo(5.78f, 16.91f, 5.78f, 16.6f)
            reflectiveQuadTo(6f, 16.07f)
            lineTo(10.06f, 12f)
            close()
            moveToRelative(6.35f, 0f)
            lineTo(12.35f, 7.93f)
            quadTo(12.14f, 7.72f, 12.13f, 7.41f)
            reflectiveQuadTo(12.35f, 6.87f)
            quadTo(12.57f, 6.66f, 12.87f, 6.66f)
            reflectiveQuadTo(13.4f, 6.87f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadTo(18.15f, 12f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineTo(13.4f, 17.13f)
            quadToRelative(-0.21f, 0.21f, -0.51f, 0.22f)
            reflectiveQuadTo(12.35f, 17.13f)
            quadTo(12.13f, 16.91f, 12.13f, 16.6f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            lineTo(16.41f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _KeyboardDoubleArrowRight!!
  }

private var _KeyboardDoubleArrowRight: ImageVector? = null
