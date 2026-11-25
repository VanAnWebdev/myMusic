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
val SimpIcons.Wifi: ImageVector
  get() {
    if (_Wifi != null) {
      return _Wifi!!
    }
    _Wifi =
      ImageVector.Builder(
          name = "Wifi",
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
            moveTo(10.57f, 20.13f)
            quadTo(9.98f, 19.54f, 9.98f, 18.69f)
            reflectiveQuadToRelative(0.59f, -1.43f)
            reflectiveQuadTo(12f, 16.67f)
            reflectiveQuadToRelative(1.43f, 0.59f)
            reflectiveQuadToRelative(0.59f, 1.43f)
            reflectiveQuadToRelative(-0.59f, 1.43f)
            reflectiveQuadTo(12f, 20.71f)
            reflectiveQuadTo(10.57f, 20.13f)
            close()
            moveToRelative(4.87f, -8.76f)
            quadToRelative(1.62f, 0.6f, 2.93f, 1.66f)
            quadToRelative(0.37f, 0.29f, 0.39f, 0.75f)
            reflectiveQuadToRelative(-0.32f, 0.79f)
            quadToRelative(-0.32f, 0.32f, -0.79f, 0.32f)
            reflectiveQuadTo(16.8f, 14.62f)
            quadTo(15.82f, 13.87f, 14.59f, 13.43f)
            reflectiveQuadTo(12f, 13f)
            reflectiveQuadTo(9.41f, 13.43f)
            reflectiveQuadTo(7.2f, 14.62f)
            quadTo(6.82f, 14.89f, 6.35f, 14.88f)
            reflectiveQuadTo(5.57f, 14.55f)
            quadTo(5.25f, 14.22f, 5.25f, 13.76f)
            reflectiveQuadTo(5.63f, 13.01f)
            quadTo(6.94f, 11.95f, 8.56f, 11.36f)
            reflectiveQuadTo(12f, 10.77f)
            reflectiveQuadToRelative(3.44f, 0.6f)
            close()
            moveTo(17.78f, 5.81f)
            quadToRelative(2.7f, 1.04f, 4.82f, 2.91f)
            quadTo(22.97f, 9.04f, 23f, 9.51f)
            reflectiveQuadToRelative(-0.31f, 0.81f)
            reflectiveQuadToRelative(-0.8f, 0.32f)
            reflectiveQuadTo(21.03f, 10.31f)
            quadTo(19.2f, 8.74f, 16.89f, 7.87f)
            reflectiveQuadTo(12f, 7f)
            reflectiveQuadTo(7.11f, 7.87f)
            reflectiveQuadTo(2.97f, 10.31f)
            quadTo(2.59f, 10.63f, 2.12f, 10.64f)
            reflectiveQuadTo(1.32f, 10.32f)
            quadTo(0.98f, 9.98f, 1f, 9.51f)
            reflectiveQuadTo(1.4f, 8.72f)
            quadTo(3.52f, 6.85f, 6.22f, 5.81f)
            reflectiveQuadTo(12f, 4.77f)
            reflectiveQuadToRelative(5.78f, 1.04f)
            close()
          }
        }
        .buildSimpIcon()
    return _Wifi!!
  }

private var _Wifi: ImageVector? = null
