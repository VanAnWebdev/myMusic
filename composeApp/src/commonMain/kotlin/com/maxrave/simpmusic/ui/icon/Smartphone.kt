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
val SimpIcons.Smartphone: ImageVector
  get() {
    if (_Smartphone != null) {
      return _Smartphone!!
    }
    _Smartphone =
      ImageVector.Builder(
          name = "Smartphone",
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
            moveTo(7.31f, 22.5f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(5.5f, 20.69f)
            verticalLineTo(3.31f)
            quadTo(5.5f, 2.55f, 6.03f, 2.03f)
            reflectiveQuadTo(7.31f, 1.5f)
            horizontalLineToRelative(9.42f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            verticalLineTo(6.47f)
            quadToRelative(0.41f, 0.11f, 0.69f, 0.43f)
            reflectiveQuadTo(19.5f, 7.64f)
            verticalLineTo(9.53f)
            quadToRelative(0f, 0.43f, -0.27f, 0.75f)
            reflectiveQuadToRelative(-0.69f, 0.43f)
            verticalLineToRelative(9.98f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(16.73f, 22.5f)
            horizontalLineTo(7.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineToRelative(9.42f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadToRelative(0.09f, -0.22f)
            verticalLineTo(3.31f)
            quadToRelative(0f, -0.13f, -0.09f, -0.22f)
            reflectiveQuadTo(16.73f, 3f)
            horizontalLineTo(7.31f)
            quadTo(7.17f, 3f, 7.09f, 3.09f)
            reflectiveQuadTo(7f, 3.31f)
            verticalLineTo(20.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(7.31f, 21f)
            close()
            moveTo(7f, 21f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(7f, 20.69f)
            verticalLineTo(3.31f)
            quadTo(7f, 3.17f, 7f, 3.09f)
            reflectiveQuadTo(7f, 3f)
            quadTo(7f, 3f, 7f, 3.09f)
            reflectiveQuadTo(7f, 3.31f)
            verticalLineTo(20.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(7f, 21f)
            close()
            moveTo(12.65f, 5.9f)
            quadTo(12.9f, 5.65f, 12.9f, 5.27f)
            reflectiveQuadTo(12.65f, 4.64f)
            reflectiveQuadTo(12.02f, 4.38f)
            reflectiveQuadTo(11.39f, 4.64f)
            reflectiveQuadTo(11.13f, 5.27f)
            reflectiveQuadTo(11.39f, 5.9f)
            reflectiveQuadToRelative(0.63f, 0.25f)
            reflectiveQuadTo(12.65f, 5.9f)
            close()
          }
        }
        .buildSimpIcon()
    return _Smartphone!!
  }

private var _Smartphone: ImageVector? = null
