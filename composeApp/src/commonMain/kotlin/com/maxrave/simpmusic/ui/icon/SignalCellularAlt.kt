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
val SimpIcons.SignalCellularAlt: ImageVector
  get() {
    if (_SignalCellularAlt != null) {
      return _SignalCellularAlt!!
    }
    _SignalCellularAlt =
      ImageVector.Builder(
          name = "SignalCellularAlt",
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
            moveTo(5.84f, 19.16f)
            quadTo(5.5f, 18.83f, 5.5f, 18.35f)
            verticalLineTo(15.65f)
            quadToRelative(0f, -0.48f, 0.34f, -0.82f)
            reflectiveQuadTo(6.65f, 14.5f)
            reflectiveQuadToRelative(0.82f, 0.34f)
            reflectiveQuadToRelative(0.34f, 0.82f)
            verticalLineToRelative(2.69f)
            quadToRelative(0f, 0.48f, -0.34f, 0.82f)
            reflectiveQuadTo(6.65f, 19.5f)
            reflectiveQuadTo(5.84f, 19.16f)
            close()
            moveToRelative(5.9f, 0f)
            quadTo(11.4f, 18.83f, 11.4f, 18.35f)
            verticalLineTo(10.65f)
            quadToRelative(0f, -0.48f, 0.34f, -0.82f)
            reflectiveQuadTo(12.56f, 9.5f)
            reflectiveQuadToRelative(0.82f, 0.34f)
            reflectiveQuadToRelative(0.34f, 0.82f)
            verticalLineToRelative(7.69f)
            quadToRelative(0f, 0.48f, -0.34f, 0.82f)
            reflectiveQuadTo(12.56f, 19.5f)
            reflectiveQuadTo(11.74f, 19.16f)
            close()
            moveToRelative(5.79f, 0f)
            quadTo(17.19f, 18.83f, 17.19f, 18.35f)
            verticalLineTo(5.65f)
            quadToRelative(0f, -0.48f, 0.34f, -0.82f)
            reflectiveQuadTo(18.35f, 4.5f)
            reflectiveQuadToRelative(0.82f, 0.34f)
            reflectiveQuadTo(19.5f, 5.65f)
            verticalLineTo(18.35f)
            quadToRelative(0f, 0.48f, -0.34f, 0.82f)
            reflectiveQuadTo(18.35f, 19.5f)
            reflectiveQuadTo(17.53f, 19.16f)
            close()
          }
        }
        .buildSimpIcon()
    return _SignalCellularAlt!!
  }

private var _SignalCellularAlt: ImageVector? = null
