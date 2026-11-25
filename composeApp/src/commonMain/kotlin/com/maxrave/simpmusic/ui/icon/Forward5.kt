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
val SimpIcons.Forward5: ImageVector
  get() {
    if (_Forward5 != null) {
      return _Forward5!!
    }
    _Forward5 =
      ImageVector.Builder(
          name = "Forward5",
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
            moveTo(8.68f, 20.83f)
            quadTo(7.14f, 20.16f, 5.99f, 19.01f)
            reflectiveQuadTo(4.17f, 16.32f)
            reflectiveQuadTo(3.5f, 13f)
            reflectiveQuadTo(4.17f, 9.68f)
            reflectiveQuadTo(5.99f, 6.99f)
            reflectiveQuadTo(8.68f, 5.17f)
            reflectiveQuadTo(12f, 4.5f)
            horizontalLineToRelative(0.27f)
            lineTo(11.18f, 3.42f)
            quadTo(10.95f, 3.19f, 10.96f, 2.89f)
            reflectiveQuadTo(11.18f, 2.37f)
            quadTo(11.42f, 2.13f, 11.72f, 2.13f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineToRelative(2.27f, 2.26f)
            quadToRelative(0.27f, 0.27f, 0.27f, 0.63f)
            reflectiveQuadTo(14.52f, 5.87f)
            lineTo(12.27f, 8.13f)
            quadTo(12.04f, 8.36f, 11.74f, 8.36f)
            reflectiveQuadTo(11.2f, 8.12f)
            quadTo(10.99f, 7.88f, 10.98f, 7.58f)
            reflectiveQuadTo(11.2f, 7.06f)
            lineTo(12.27f, 6f)
            horizontalLineTo(12f)
            quadTo(9.08f, 6f, 7.04f, 8.04f)
            reflectiveQuadTo(5f, 13f)
            reflectiveQuadToRelative(2.04f, 4.96f)
            reflectiveQuadTo(12f, 20f)
            reflectiveQuadToRelative(4.96f, -2.04f)
            quadTo(19f, 15.93f, 19f, 13f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 13f)
            quadToRelative(0f, 1.77f, -0.67f, 3.32f)
            reflectiveQuadToRelative(-1.82f, 2.7f)
            reflectiveQuadToRelative(-2.7f, 1.82f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(8.68f, 20.83f)
            close()
            moveTo(13f, 15.85f)
            horizontalLineTo(10.25f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(9.65f, 15.25f)
            reflectiveQuadTo(9.82f, 14.82f)
            reflectiveQuadToRelative(0.43f, -0.17f)
            horizontalLineToRelative(2.4f)
            verticalLineTo(13.44f)
            horizontalLineToRelative(-2.4f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(9.65f, 12.85f)
            verticalLineToRelative(-2.1f)
            quadToRelative(0f, -0.26f, 0.17f, -0.43f)
            reflectiveQuadToRelative(0.43f, -0.17f)
            horizontalLineToRelative(3f)
            quadToRelative(0.26f, 0f, 0.43f, 0.17f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            reflectiveQuadToRelative(-0.17f, 0.43f)
            reflectiveQuadToRelative(-0.43f, 0.17f)
            horizontalLineToRelative(-2.4f)
            verticalLineToRelative(1.21f)
            horizontalLineToRelative(2.4f)
            quadToRelative(0.26f, 0f, 0.43f, 0.17f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            verticalLineTo(15f)
            quadToRelative(0f, 0.36f, -0.24f, 0.6f)
            reflectiveQuadTo(13f, 15.85f)
            close()
          }
        }
        .buildSimpIcon()
    return _Forward5!!
  }

private var _Forward5: ImageVector? = null
