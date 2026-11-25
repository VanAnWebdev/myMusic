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
val SimpIcons.Dns: ImageVector
  get() {
    if (_Dns != null) {
      return _Dns!!
    }
    _Dns =
      ImageVector.Builder(
          name = "Dns",
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
            moveTo(7.5f, 6.56f)
            quadToRelative(-0.52f, 0f, -0.89f, 0.36f)
            reflectiveQuadTo(6.25f, 7.81f)
            reflectiveQuadTo(6.61f, 8.69f)
            reflectiveQuadTo(7.5f, 9.06f)
            reflectiveQuadTo(8.38f, 8.69f)
            reflectiveQuadTo(8.75f, 7.81f)
            reflectiveQuadTo(8.39f, 6.92f)
            reflectiveQuadTo(7.5f, 6.56f)
            close()
            moveToRelative(0f, 9.38f)
            quadToRelative(-0.52f, 0f, -0.89f, 0.36f)
            reflectiveQuadTo(6.25f, 17.19f)
            reflectiveQuadToRelative(0.36f, 0.89f)
            reflectiveQuadTo(7.5f, 18.44f)
            reflectiveQuadTo(8.38f, 18.08f)
            reflectiveQuadTo(8.75f, 17.19f)
            reflectiveQuadTo(8.39f, 16.31f)
            reflectiveQuadTo(7.5f, 15.94f)
            close()
            moveTo(4.38f, 3.81f)
            horizontalLineTo(19.62f)
            quadToRelative(0.38f, 0f, 0.63f, 0.25f)
            reflectiveQuadTo(20.5f, 4.69f)
            verticalLineToRelative(6.18f)
            quadToRelative(0f, 0.41f, -0.25f, 0.67f)
            reflectiveQuadToRelative(-0.63f, 0.27f)
            horizontalLineTo(4.38f)
            quadToRelative(-0.38f, 0f, -0.63f, -0.27f)
            reflectiveQuadTo(3.5f, 10.87f)
            verticalLineTo(4.69f)
            quadTo(3.5f, 4.32f, 3.75f, 4.06f)
            reflectiveQuadTo(4.38f, 3.81f)
            close()
            moveTo(5f, 5.31f)
            verticalLineToRelative(5f)
            horizontalLineTo(19f)
            verticalLineToRelative(-5f)
            horizontalLineTo(5f)
            close()
            moveTo(4.38f, 13.19f)
            horizontalLineTo(19.6f)
            quadToRelative(0.4f, 0f, 0.65f, 0.27f)
            reflectiveQuadToRelative(0.25f, 0.66f)
            verticalLineToRelative(6.12f)
            quadToRelative(0f, 0.43f, -0.25f, 0.69f)
            reflectiveQuadTo(19.6f, 21.19f)
            horizontalLineTo(4.4f)
            quadToRelative(-0.4f, 0f, -0.65f, -0.27f)
            reflectiveQuadTo(3.5f, 20.23f)
            verticalLineTo(14.12f)
            quadToRelative(0f, -0.39f, 0.24f, -0.66f)
            reflectiveQuadTo(4.38f, 13.19f)
            close()
            moveTo(5f, 14.69f)
            verticalLineToRelative(5f)
            horizontalLineTo(19f)
            verticalLineToRelative(-5f)
            horizontalLineTo(5f)
            close()
            moveTo(5f, 5.31f)
            verticalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(0f, 9.38f)
            verticalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Dns!!
  }

private var _Dns: ImageVector? = null
