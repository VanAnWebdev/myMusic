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
val SimpIcons.Headphones: ImageVector
  get() {
    if (_Headphones != null) {
      return _Headphones!!
    }
    _Headphones =
      ImageVector.Builder(
          name = "Headphones",
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
            moveTo(6.73f, 20.5f)
            horizontalLineTo(5.31f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(12f)
            quadToRelative(0f, -1.77f, 0.67f, -3.32f)
            reflectiveQuadTo(5.99f, 5.99f)
            reflectiveQuadTo(8.68f, 4.17f)
            reflectiveQuadTo(12f, 3.5f)
            reflectiveQuadToRelative(3.32f, 0.67f)
            reflectiveQuadToRelative(2.7f, 1.82f)
            reflectiveQuadToRelative(1.82f, 2.7f)
            reflectiveQuadTo(20.5f, 12f)
            verticalLineToRelative(6.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(17.27f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(15.46f, 18.69f)
            verticalLineTo(15.23f)
            quadToRelative(0f, -0.75f, 0.53f, -1.28f)
            reflectiveQuadToRelative(1.28f, -0.53f)
            horizontalLineTo(19f)
            verticalLineTo(12f)
            quadTo(19f, 9.07f, 16.96f, 7.04f)
            reflectiveQuadTo(12f, 5f)
            quadTo(9.08f, 5f, 7.04f, 7.04f)
            reflectiveQuadTo(5f, 12f)
            verticalLineToRelative(1.42f)
            horizontalLineTo(6.73f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            verticalLineToRelative(3.46f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(6.73f, 20.5f)
            close()
            moveToRelative(0f, -5.58f)
            horizontalLineTo(5f)
            verticalLineToRelative(3.77f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            horizontalLineTo(6.73f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(7.04f, 18.69f)
            verticalLineTo(15.23f)
            quadToRelative(0f, -0.13f, -0.09f, -0.22f)
            reflectiveQuadTo(6.73f, 14.92f)
            close()
            moveToRelative(10.23f, 0.31f)
            verticalLineToRelative(3.46f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(17.27f, 19f)
            horizontalLineToRelative(1.42f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(14.92f)
            horizontalLineTo(17.27f)
            quadToRelative(-0.13f, 0f, -0.22f, 0.09f)
            reflectiveQuadToRelative(-0.09f, 0.22f)
            close()
            moveTo(6.73f, 14.92f)
            quadToRelative(0.13f, 0f, 0.22f, 0f)
            reflectiveQuadToRelative(0.09f, 0f)
            quadToRelative(0f, 0f, -0.09f, 0f)
            reflectiveQuadToRelative(-0.22f, 0f)
            horizontalLineTo(5.31f)
            quadToRelative(-0.12f, 0f, -0.21f, 0f)
            reflectiveQuadToRelative(-0.1f, 0f)
            horizontalLineTo(6.73f)
            close()
            moveToRelative(10.23f, 0f)
            quadToRelative(0f, 0f, 0.09f, 0f)
            reflectiveQuadToRelative(0.22f, 0f)
            horizontalLineTo(19f)
            quadToRelative(0f, 0f, -0.1f, 0f)
            reflectiveQuadToRelative(-0.21f, 0f)
            horizontalLineTo(17.27f)
            quadToRelative(-0.13f, 0f, -0.22f, 0f)
            reflectiveQuadToRelative(-0.09f, 0f)
            close()
          }
        }
        .buildSimpIcon()
    return _Headphones!!
  }

private var _Headphones: ImageVector? = null
