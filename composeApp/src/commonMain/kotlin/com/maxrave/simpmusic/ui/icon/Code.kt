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
val SimpIcons.Code: ImageVector
  get() {
    if (_Code != null) {
      return _Code!!
    }
    _Code =
      ImageVector.Builder(
          name = "Code",
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
            moveTo(4.47f, 12.02f)
            lineToRelative(4.06f, 4.06f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadTo(8.53f, 17.13f)
            reflectiveQuadTo(8f, 17.34f)
            reflectiveQuadTo(7.47f, 17.13f)
            lineTo(2.98f, 12.63f)
            quadTo(2.84f, 12.49f, 2.78f, 12.34f)
            reflectiveQuadTo(2.72f, 12f)
            reflectiveQuadTo(2.78f, 11.66f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(7.47f, 6.87f)
            quadTo(7.7f, 6.65f, 8f, 6.65f)
            reflectiveQuadTo(8.54f, 6.87f)
            reflectiveQuadTo(8.77f, 7.41f)
            reflectiveQuadTo(8.54f, 7.94f)
            lineTo(4.47f, 12.02f)
            close()
            moveTo(19.53f, 11.98f)
            lineTo(15.47f, 7.93f)
            quadTo(15.27f, 7.72f, 15.26f, 7.4f)
            reflectiveQuadTo(15.47f, 6.87f)
            reflectiveQuadTo(16f, 6.66f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineToRelative(4.49f, 4.49f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadTo(21.28f, 12f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineToRelative(-4.49f, 4.49f)
            quadTo(16.3f, 17.35f, 16f, 17.35f)
            reflectiveQuadTo(15.47f, 17.11f)
            reflectiveQuadTo(15.24f, 16.58f)
            reflectiveQuadToRelative(0.23f, -0.53f)
            lineToRelative(4.06f, -4.06f)
            close()
          }
        }
        .buildSimpIcon()
    return _Code!!
  }

private var _Code: ImageVector? = null
