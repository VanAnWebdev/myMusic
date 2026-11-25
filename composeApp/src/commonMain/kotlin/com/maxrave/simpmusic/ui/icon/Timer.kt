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
val SimpIcons.Timer: ImageVector
  get() {
    if (_Timer != null) {
      return _Timer!!
    }
    _Timer =
      ImageVector.Builder(
          name = "Timer",
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
            moveTo(9.94f, 2.75f)
            quadTo(9.62f, 2.75f, 9.41f, 2.53f)
            reflectiveQuadTo(9.19f, 2f)
            reflectiveQuadTo(9.41f, 1.47f)
            reflectiveQuadTo(9.94f, 1.25f)
            horizontalLineToRelative(4.12f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(14.81f, 2f)
            reflectiveQuadTo(14.59f, 2.53f)
            reflectiveQuadTo(14.06f, 2.75f)
            horizontalLineTo(9.94f)
            close()
            moveToRelative(2.59f, 10.84f)
            quadToRelative(0.22f, -0.22f, 0.22f, -0.53f)
            verticalLineTo(8.94f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 8.19f)
            reflectiveQuadTo(11.47f, 8.41f)
            reflectiveQuadTo(11.25f, 8.94f)
            verticalLineToRelative(4.12f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(12f, 13.81f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveTo(8.7f, 20.83f)
            quadTo(7.15f, 20.16f, 6f, 19f)
            reflectiveQuadTo(4.17f, 16.3f)
            reflectiveQuadTo(3.5f, 13f)
            reflectiveQuadTo(4.17f, 9.7f)
            reflectiveQuadTo(6f, 7f)
            reflectiveQuadTo(8.7f, 5.17f)
            reflectiveQuadTo(12f, 4.5f)
            quadToRelative(1.5f, 0f, 2.89f, 0.51f)
            reflectiveQuadToRelative(2.58f, 1.46f)
            lineTo(18.2f, 5.75f)
            quadTo(18.4f, 5.54f, 18.72f, 5.54f)
            reflectiveQuadToRelative(0.53f, 0.21f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(19.25f, 6.8f)
            lineTo(18.53f, 7.52f)
            quadToRelative(0.95f, 1.19f, 1.46f, 2.58f)
            reflectiveQuadTo(20.5f, 13f)
            quadToRelative(0f, 1.75f, -0.67f, 3.3f)
            reflectiveQuadTo(18f, 19f)
            reflectiveQuadToRelative(-2.7f, 1.83f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(8.7f, 20.83f)
            close()
            moveToRelative(8.25f, -2.88f)
            quadTo(19f, 15.9f, 19f, 13f)
            reflectiveQuadTo(16.95f, 8.05f)
            reflectiveQuadTo(12f, 6f)
            reflectiveQuadTo(7.05f, 8.05f)
            reflectiveQuadTo(5f, 13f)
            reflectiveQuadToRelative(2.05f, 4.95f)
            reflectiveQuadTo(12f, 20f)
            reflectiveQuadToRelative(4.95f, -2.05f)
            close()
            moveTo(12f, 13f)
            close()
          }
        }
        .buildSimpIcon()
    return _Timer!!
  }

private var _Timer: ImageVector? = null
