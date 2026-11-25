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
val SimpIcons.CloudOff: ImageVector
  get() {
    if (_CloudOff != null) {
      return _CloudOff!!
    }
    _CloudOff =
      ImageVector.Builder(
          name = "CloudOff",
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
            moveTo(6.5f, 19.5f)
            quadToRelative(-2.1f, 0f, -3.55f, -1.45f)
            reflectiveQuadTo(1.5f, 14.5f)
            quadToRelative(0f, -1.88f, 1.21f, -3.26f)
            reflectiveQuadTo(5.67f, 9.59f)
            quadTo(5.72f, 9.31f, 5.85f, 8.94f)
            reflectiveQuadTo(6.15f, 8.25f)
            lineTo(2.66f, 4.77f)
            quadTo(2.45f, 4.56f, 2.45f, 4.24f)
            reflectiveQuadTo(2.66f, 3.71f)
            reflectiveQuadTo(3.18f, 3.49f)
            reflectiveQuadTo(3.71f, 3.71f)
            lineTo(20.65f, 20.65f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.51f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.22f, 0.22f, -0.52f, 0.22f)
            reflectiveQuadTo(19.6f, 21.72f)
            lineTo(17.38f, 19.5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(6.5f, 18f)
            horizontalLineToRelative(9.36f)
            lineTo(7.29f, 9.43f)
            quadTo(7.16f, 9.77f, 7.08f, 10.18f)
            reflectiveQuadTo(7f, 11f)
            horizontalLineTo(6.5f)
            quadTo(5.05f, 11f, 4.03f, 12.02f)
            reflectiveQuadTo(3f, 14.5f)
            reflectiveQuadToRelative(1.03f, 2.48f)
            reflectiveQuadTo(6.5f, 18f)
            close()
            moveToRelative(5.07f, -4.29f)
            close()
            moveToRelative(9.69f, 4.7f)
            lineTo(20.17f, 17.35f)
            quadToRelative(0.41f, -0.36f, 0.62f, -0.82f)
            reflectiveQuadTo(21f, 15.5f)
            quadToRelative(0f, -1.05f, -0.72f, -1.78f)
            reflectiveQuadTo(18.5f, 13f)
            horizontalLineTo(17f)
            verticalLineTo(11f)
            quadTo(17f, 8.92f, 15.54f, 7.46f)
            reflectiveQuadTo(12f, 6f)
            quadTo(11.33f, 6f, 10.7f, 6.16f)
            reflectiveQuadTo(9.5f, 6.68f)
            lineTo(8.42f, 5.58f)
            quadTo(9.29f, 5.02f, 10.15f, 4.76f)
            reflectiveQuadTo(12f, 4.5f)
            quadToRelative(2.72f, 0f, 4.61f, 1.89f)
            reflectiveQuadTo(18.5f, 11f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(0.31f)
            quadToRelative(1.58f, 0.12f, 2.64f, 1.27f)
            reflectiveQuadTo(22.5f, 15.5f)
            quadToRelative(0f, 0.83f, -0.31f, 1.57f)
            reflectiveQuadTo(21.25f, 18.4f)
            close()
            moveTo(14.83f, 12.02f)
            close()
          }
        }
        .buildSimpIcon()
    return _CloudOff!!
  }

private var _CloudOff: ImageVector? = null
