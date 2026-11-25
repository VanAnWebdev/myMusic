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
val SimpIcons.Key: ImageVector
  get() {
    if (_Key != null) {
      return _Key!!
    }
    _Key =
      ImageVector.Builder(
          name = "Key",
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
            moveTo(5.86f, 13.14f)
            quadTo(5.38f, 12.67f, 5.38f, 12f)
            reflectiveQuadTo(5.86f, 10.86f)
            reflectiveQuadTo(7f, 10.38f)
            reflectiveQuadToRelative(1.14f, 0.47f)
            reflectiveQuadTo(8.62f, 12f)
            reflectiveQuadTo(8.14f, 13.14f)
            reflectiveQuadTo(7f, 13.62f)
            reflectiveQuadTo(5.86f, 13.14f)
            close()
            moveTo(7f, 17.5f)
            quadToRelative(-2.29f, 0f, -3.89f, -1.61f)
            reflectiveQuadTo(1.5f, 12f)
            reflectiveQuadTo(3.11f, 8.11f)
            reflectiveQuadTo(7f, 6.5f)
            quadToRelative(1.61f, 0f, 2.91f, 0.83f)
            reflectiveQuadTo(11.89f, 9.5f)
            horizontalLineToRelative(8.63f)
            quadToRelative(0.18f, 0f, 0.34f, 0.07f)
            reflectiveQuadToRelative(0.3f, 0.21f)
            lineToRelative(1.6f, 1.6f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadTo(23.02f, 12f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineToRelative(-2.65f, 2.64f)
            quadTo(20f, 15.38f, 19.84f, 15.45f)
            reflectiveQuadToRelative(-0.31f, 0.09f)
            reflectiveQuadTo(19.22f, 15.51f)
            reflectiveQuadToRelative(-0.3f, -0.15f)
            lineTo(17.69f, 14.43f)
            lineToRelative(-1.4f, 1.04f)
            quadToRelative(-0.12f, 0.09f, -0.25f, 0.13f)
            reflectiveQuadToRelative(-0.27f, 0.04f)
            reflectiveQuadTo(15.5f, 15.6f)
            reflectiveQuadTo(15.25f, 15.47f)
            lineTo(13.84f, 14.5f)
            horizontalLineTo(11.89f)
            quadToRelative(-0.68f, 1.33f, -1.98f, 2.17f)
            reflectiveQuadTo(7f, 17.5f)
            close()
            moveTo(7f, 16f)
            quadToRelative(1.44f, 0f, 2.49f, -0.87f)
            reflectiveQuadTo(10.87f, 13f)
            horizontalLineToRelative(3.44f)
            lineToRelative(1.44f, 1f)
            quadToRelative(-0.01f, 0f, -0f, 0.01f)
            reflectiveQuadToRelative(0f, -0.01f)
            lineTo(17.7f, 12.57f)
            lineToRelative(1.7f, 1.3f)
            quadToRelative(0f, -0.01f, 0f, -0f)
            reflectiveQuadToRelative(0f, 0f)
            lineTo(21.27f, 12f)
            quadToRelative(-0.02f, 0f, -0.01f, 0f)
            reflectiveQuadToRelative(0.01f, 0f)
            lineToRelative(-1f, -1f)
            quadToRelative(0f, -0.02f, 0f, -0.01f)
            reflectiveQuadToRelative(0f, 0.01f)
            horizontalLineToRelative(-9.4f)
            quadTo(10.54f, 9.74f, 9.49f, 8.87f)
            reflectiveQuadTo(7f, 8f)
            quadTo(5.35f, 8f, 4.18f, 9.17f)
            reflectiveQuadTo(3f, 12f)
            reflectiveQuadToRelative(1.17f, 2.82f)
            reflectiveQuadTo(7f, 16f)
            close()
          }
        }
        .buildSimpIcon()
    return _Key!!
  }

private var _Key: ImageVector? = null
