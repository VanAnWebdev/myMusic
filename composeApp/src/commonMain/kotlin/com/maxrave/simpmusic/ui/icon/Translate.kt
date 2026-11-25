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
val SimpIcons.Translate: ImageVector
  get() {
    if (_Translate != null) {
      return _Translate!!
    }
    _Translate =
      ImageVector.Builder(
          name = "Translate",
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
            moveTo(14.62f, 18.45f)
            lineToRelative(-0.96f, 2.58f)
            quadToRelative(-0.08f, 0.21f, -0.27f, 0.34f)
            reflectiveQuadTo(12.98f, 21.5f)
            quadToRelative(-0.38f, 0f, -0.62f, -0.32f)
            reflectiveQuadTo(12.28f, 20.49f)
            lineTo(16.17f, 10.46f)
            quadToRelative(0.1f, -0.21f, 0.28f, -0.33f)
            reflectiveQuadTo(16.86f, 10f)
            horizontalLineToRelative(0.56f)
            quadToRelative(0.22f, 0f, 0.41f, 0.13f)
            reflectiveQuadToRelative(0.28f, 0.33f)
            lineToRelative(3.89f, 10.05f)
            quadToRelative(0.15f, 0.36f, -0.07f, 0.68f)
            reflectiveQuadTo(21.31f, 21.5f)
            quadToRelative(-0.25f, 0f, -0.43f, -0.13f)
            reflectiveQuadTo(20.6f, 21.01f)
            lineTo(19.65f, 18.45f)
            horizontalLineTo(14.62f)
            close()
            moveTo(8.98f, 13.59f)
            lineTo(4.54f, 18.03f)
            quadTo(4.33f, 18.25f, 4.02f, 18.26f)
            reflectiveQuadTo(3.48f, 18.03f)
            quadTo(3.27f, 17.81f, 3.27f, 17.5f)
            reflectiveQuadTo(3.48f, 16.98f)
            lineTo(7.93f, 12.52f)
            quadTo(7.06f, 11.65f, 6.28f, 10.44f)
            reflectiveQuadTo(5f, 8f)
            horizontalLineTo(6.59f)
            quadTo(7.02f, 8.91f, 7.64f, 9.82f)
            reflectiveQuadToRelative(1.34f, 1.65f)
            quadTo(10.05f, 10.39f, 11f, 8.86f)
            reflectiveQuadTo(12.34f, 6f)
            horizontalLineTo(2.44f)
            quadTo(2.12f, 6f, 1.91f, 5.78f)
            reflectiveQuadTo(1.69f, 5.25f)
            reflectiveQuadTo(1.91f, 4.72f)
            reflectiveQuadTo(2.44f, 4.5f)
            horizontalLineTo(8.25f)
            verticalLineTo(3.63f)
            quadTo(8.25f, 3.32f, 8.47f, 3.1f)
            reflectiveQuadTo(9f, 2.88f)
            reflectiveQuadTo(9.53f, 3.1f)
            reflectiveQuadTo(9.75f, 3.63f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(5.81f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(16.09f, 5.78f)
            reflectiveQuadTo(15.56f, 6f)
            horizontalLineToRelative(-1.7f)
            quadTo(13.37f, 7.68f, 12.31f, 9.52f)
            reflectiveQuadToRelative(-2.27f, 3.03f)
            lineToRelative(2.47f, 2.53f)
            lineToRelative(-0.57f, 1.54f)
            lineTo(8.98f, 13.59f)
            close()
            moveToRelative(6.12f, 3.53f)
            horizontalLineToRelative(4.06f)
            lineTo(17.13f, 11.67f)
            lineTo(15.1f, 17.12f)
            close()
          }
        }
        .buildSimpIcon()
    return _Translate!!
  }

private var _Translate: ImageVector? = null
