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
val SimpIcons.CalendarToday: ImageVector
  get() {
    if (_CalendarToday != null) {
      return _CalendarToday!!
    }
    _CalendarToday =
      ImageVector.Builder(
          name = "CalendarToday",
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
            moveTo(5.31f, 21.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 19.69f)
            verticalLineTo(6.31f)
            quadTo(3.5f, 5.55f, 4.03f, 5.03f)
            reflectiveQuadTo(5.31f, 4.5f)
            horizontalLineTo(6.69f)
            verticalLineTo(3.15f)
            quadTo(6.69f, 2.83f, 6.91f, 2.6f)
            reflectiveQuadTo(7.46f, 2.38f)
            reflectiveQuadTo(8.01f, 2.6f)
            reflectiveQuadTo(8.23f, 3.15f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(7.58f)
            verticalLineTo(3.13f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(16.56f, 2.38f)
            reflectiveQuadTo(17.09f, 2.6f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(1.38f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(20.5f, 6.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 21.5f)
            horizontalLineTo(5.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 19.69f)
            verticalLineTo(10.31f)
            horizontalLineTo(5f)
            verticalLineToRelative(9.38f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 20f)
            close()
            moveTo(5f, 8.81f)
            horizontalLineTo(19f)
            verticalLineTo(6.31f)
            quadTo(19f, 6.19f, 18.9f, 6.1f)
            reflectiveQuadTo(18.69f, 6f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 6f, 5.1f, 6.1f)
            reflectiveQuadTo(5f, 6.31f)
            verticalLineToRelative(2.5f)
            close()
            moveToRelative(0f, 0f)
            verticalLineTo(6.31f)
            quadTo(5f, 6.19f, 5f, 6.1f)
            reflectiveQuadTo(5f, 6f)
            quadTo(5f, 6f, 5f, 6.1f)
            reflectiveQuadTo(5f, 6.31f)
            verticalLineToRelative(2.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _CalendarToday!!
  }

private var _CalendarToday: ImageVector? = null
