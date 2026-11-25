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
val SimpIcons.Numbers: ImageVector
  get() {
    if (_Numbers != null) {
      return _Numbers!!
    }
    _Numbers =
      ImageVector.Builder(
          name = "Numbers",
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
            moveTo(9.05f, 15.54f)
            lineTo(8.18f, 19.01f)
            quadTo(8.12f, 19.25f, 7.94f, 19.4f)
            reflectiveQuadTo(7.49f, 19.54f)
            quadToRelative(-0.35f, 0f, -0.57f, -0.28f)
            reflectiveQuadTo(6.79f, 18.65f)
            lineTo(7.57f, 15.54f)
            horizontalLineTo(4.72f)
            quadToRelative(-0.37f, 0f, -0.6f, -0.29f)
            reflectiveQuadTo(3.98f, 14.61f)
            quadTo(4.05f, 14.34f, 4.25f, 14.19f)
            reflectiveQuadTo(4.72f, 14.04f)
            horizontalLineTo(7.94f)
            lineTo(8.96f, 9.96f)
            horizontalLineTo(6.11f)
            quadToRelative(-0.37f, 0f, -0.6f, -0.29f)
            reflectiveQuadTo(5.38f, 9.03f)
            quadTo(5.44f, 8.77f, 5.65f, 8.61f)
            reflectiveQuadTo(6.11f, 8.46f)
            horizontalLineTo(9.34f)
            lineTo(10.21f, 4.99f)
            quadTo(10.27f, 4.75f, 10.45f, 4.6f)
            reflectiveQuadTo(10.89f, 4.46f)
            quadToRelative(0.35f, 0f, 0.57f, 0.28f)
            reflectiveQuadToRelative(0.13f, 0.61f)
            lineTo(10.82f, 8.46f)
            horizontalLineToRelative(4.13f)
            lineTo(15.83f, 4.99f)
            quadTo(15.88f, 4.75f, 16.06f, 4.6f)
            reflectiveQuadTo(16.51f, 4.46f)
            quadToRelative(0.35f, 0f, 0.57f, 0.28f)
            reflectiveQuadToRelative(0.13f, 0.61f)
            lineTo(16.43f, 8.46f)
            horizontalLineToRelative(2.85f)
            quadToRelative(0.37f, 0f, 0.6f, 0.29f)
            reflectiveQuadToRelative(0.13f, 0.65f)
            quadTo(19.95f, 9.66f, 19.75f, 9.81f)
            reflectiveQuadTo(19.28f, 9.96f)
            horizontalLineTo(16.06f)
            lineToRelative(-1.02f, 4.08f)
            horizontalLineToRelative(2.85f)
            quadToRelative(0.37f, 0f, 0.6f, 0.29f)
            reflectiveQuadToRelative(0.13f, 0.65f)
            quadToRelative(-0.07f, 0.26f, -0.27f, 0.42f)
            reflectiveQuadToRelative(-0.47f, 0.15f)
            horizontalLineTo(14.66f)
            lineToRelative(-0.87f, 3.47f)
            quadToRelative(-0.06f, 0.25f, -0.24f, 0.39f)
            reflectiveQuadToRelative(-0.45f, 0.14f)
            quadToRelative(-0.35f, 0f, -0.57f, -0.28f)
            reflectiveQuadTo(12.41f, 18.65f)
            lineToRelative(0.78f, -3.11f)
            horizontalLineTo(9.05f)
            close()
            moveToRelative(0.37f, -1.5f)
            horizontalLineToRelative(4.13f)
            lineTo(14.58f, 9.96f)
            horizontalLineTo(10.44f)
            lineTo(9.42f, 14.04f)
            close()
          }
        }
        .buildSimpIcon()
    return _Numbers!!
  }

private var _Numbers: ImageVector? = null
