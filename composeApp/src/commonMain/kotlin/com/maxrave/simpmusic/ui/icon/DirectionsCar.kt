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
val SimpIcons.DirectionsCar: ImageVector
  get() {
    if (_DirectionsCar != null) {
      return _DirectionsCar!!
    }
    _DirectionsCar =
      ImageVector.Builder(
          name = "DirectionsCar",
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
            moveTo(5.62f, 18.5f)
            verticalLineToRelative(0.94f)
            quadToRelative(0f, 0.44f, -0.31f, 0.75f)
            reflectiveQuadTo(4.56f, 20.5f)
            reflectiveQuadTo(3.81f, 20.19f)
            reflectiveQuadTo(3.5f, 19.44f)
            verticalLineTo(12.39f)
            quadToRelative(0f, -0.16f, 0.02f, -0.31f)
            reflectiveQuadToRelative(0.07f, -0.3f)
            lineTo(5.38f, 6.72f)
            quadTo(5.56f, 6.18f, 6.03f, 5.84f)
            reflectiveQuadTo(7.09f, 5.5f)
            horizontalLineToRelative(9.83f)
            quadToRelative(0.58f, 0f, 1.06f, 0.34f)
            reflectiveQuadToRelative(0.65f, 0.88f)
            lineToRelative(1.79f, 5.06f)
            quadToRelative(0.05f, 0.14f, 0.07f, 0.3f)
            reflectiveQuadToRelative(0.02f, 0.31f)
            verticalLineToRelative(7.05f)
            quadToRelative(0f, 0.44f, -0.31f, 0.75f)
            reflectiveQuadTo(19.44f, 20.5f)
            reflectiveQuadTo(18.69f, 20.19f)
            reflectiveQuadTo(18.38f, 19.44f)
            verticalLineTo(18.5f)
            horizontalLineTo(5.62f)
            close()
            moveTo(5.61f, 10.58f)
            horizontalLineTo(18.39f)
            lineTo(17.21f, 7.2f)
            quadTo(17.17f, 7.11f, 17.09f, 7.05f)
            reflectiveQuadTo(16.91f, 7f)
            horizontalLineTo(7.09f)
            quadTo(6.98f, 7f, 6.91f, 7.05f)
            reflectiveQuadTo(6.79f, 7.2f)
            lineTo(5.61f, 10.58f)
            close()
            moveTo(5f, 12.08f)
            verticalLineTo(17f)
            verticalLineTo(12.08f)
            close()
            moveToRelative(2.46f, 3.77f)
            quadToRelative(0.55f, 0f, 0.93f, -0.38f)
            reflectiveQuadTo(8.77f, 14.54f)
            reflectiveQuadTo(8.39f, 13.61f)
            reflectiveQuadTo(7.46f, 13.23f)
            reflectiveQuadTo(6.53f, 13.61f)
            reflectiveQuadTo(6.15f, 14.54f)
            reflectiveQuadToRelative(0.38f, 0.93f)
            reflectiveQuadToRelative(0.93f, 0.38f)
            close()
            moveToRelative(9.08f, 0f)
            quadToRelative(0.55f, 0f, 0.93f, -0.38f)
            reflectiveQuadToRelative(0.38f, -0.93f)
            reflectiveQuadTo(17.46f, 13.61f)
            reflectiveQuadTo(16.54f, 13.23f)
            reflectiveQuadToRelative(-0.93f, 0.38f)
            reflectiveQuadToRelative(-0.38f, 0.93f)
            reflectiveQuadToRelative(0.38f, 0.93f)
            reflectiveQuadToRelative(0.93f, 0.38f)
            close()
            moveTo(5f, 17f)
            horizontalLineTo(19f)
            verticalLineTo(12.08f)
            horizontalLineTo(5f)
            verticalLineTo(17f)
            close()
          }
        }
        .buildSimpIcon()
    return _DirectionsCar!!
  }

private var _DirectionsCar: ImageVector? = null
