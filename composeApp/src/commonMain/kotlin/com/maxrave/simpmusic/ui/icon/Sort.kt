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
val SimpIcons.Sort: ImageVector
  get() {
    if (_Sort != null) {
      return _Sort!!
    }
    _Sort =
      ImageVector.Builder(
          name = "Sort",
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
            moveTo(4.25f, 17.5f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.5f, 16.75f)
            reflectiveQuadTo(3.72f, 16.22f)
            reflectiveQuadTo(4.25f, 16f)
            horizontalLineTo(8.13f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(8.66f, 17.28f)
            reflectiveQuadTo(8.13f, 17.5f)
            horizontalLineTo(4.25f)
            close()
            moveToRelative(0f, -4.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.5f, 12f)
            reflectiveQuadTo(3.72f, 11.47f)
            reflectiveQuadTo(4.25f, 11.25f)
            horizontalLineToRelative(9.68f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(14.68f, 12f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(4.25f)
            close()
            moveTo(4.25f, 8f)
            quadTo(3.93f, 8f, 3.72f, 7.78f)
            reflectiveQuadTo(3.5f, 7.25f)
            reflectiveQuadTo(3.72f, 6.72f)
            reflectiveQuadTo(4.25f, 6.5f)
            horizontalLineToRelative(15.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 7.25f)
            reflectiveQuadTo(20.28f, 7.78f)
            reflectiveQuadTo(19.75f, 8f)
            horizontalLineTo(4.25f)
            close()
          }
        }
        .buildSimpIcon()
    return _Sort!!
  }

private var _Sort: ImageVector? = null
