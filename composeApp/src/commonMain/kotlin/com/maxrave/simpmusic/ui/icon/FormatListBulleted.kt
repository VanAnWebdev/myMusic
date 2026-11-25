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
val SimpIcons.FormatListBulleted: ImageVector
  get() {
    if (_FormatListBulleted != null) {
      return _FormatListBulleted!!
    }
    _FormatListBulleted =
      ImageVector.Builder(
          name = "FormatListBulleted",
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
            moveTo(10.06f, 18.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(9.31f, 18f)
            reflectiveQuadTo(9.52f, 17.47f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            horizontalLineToRelative(9.69f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 18f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(10.06f)
            close()
            moveToRelative(0f, -6f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(9.31f, 12f)
            reflectiveQuadTo(9.52f, 11.47f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            horizontalLineToRelative(9.69f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 12f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(10.06f)
            close()
            moveToRelative(0f, -6f)
            quadTo(9.74f, 6.75f, 9.52f, 6.53f)
            reflectiveQuadTo(9.31f, 6f)
            reflectiveQuadTo(9.52f, 5.47f)
            reflectiveQuadTo(10.06f, 5.25f)
            horizontalLineToRelative(9.69f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 6f)
            reflectiveQuadTo(20.28f, 6.53f)
            reflectiveQuadTo(19.75f, 6.75f)
            horizontalLineTo(10.06f)
            close()
            moveTo(5.16f, 19.66f)
            quadToRelative(-0.69f, 0f, -1.17f, -0.49f)
            reflectiveQuadTo(3.5f, 18f)
            reflectiveQuadTo(3.99f, 16.83f)
            reflectiveQuadTo(5.16f, 16.34f)
            reflectiveQuadToRelative(1.17f, 0.49f)
            reflectiveQuadTo(6.83f, 18f)
            reflectiveQuadTo(6.34f, 19.17f)
            reflectiveQuadTo(5.16f, 19.66f)
            close()
            moveToRelative(0f, -6f)
            quadToRelative(-0.69f, 0f, -1.17f, -0.49f)
            reflectiveQuadTo(3.5f, 12f)
            reflectiveQuadTo(3.99f, 10.82f)
            reflectiveQuadTo(5.16f, 10.34f)
            reflectiveQuadToRelative(1.17f, 0.49f)
            reflectiveQuadTo(6.83f, 12f)
            reflectiveQuadTo(6.34f, 13.18f)
            reflectiveQuadTo(5.16f, 13.66f)
            close()
            moveTo(3.99f, 7.18f)
            quadTo(3.5f, 6.69f, 3.5f, 6f)
            reflectiveQuadTo(3.99f, 4.82f)
            reflectiveQuadTo(5.16f, 4.34f)
            reflectiveQuadTo(6.34f, 4.82f)
            reflectiveQuadTo(6.83f, 6f)
            reflectiveQuadTo(6.34f, 7.18f)
            reflectiveQuadTo(5.16f, 7.66f)
            reflectiveQuadTo(3.99f, 7.18f)
            close()
          }
        }
        .buildSimpIcon()
    return _FormatListBulleted!!
  }

private var _FormatListBulleted: ImageVector? = null
