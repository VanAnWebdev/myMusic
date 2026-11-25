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
val SimpIcons.TouchApp: ImageVector
  get() {
    if (_TouchApp != null) {
      return _TouchApp!!
    }
    _TouchApp =
      ImageVector.Builder(
          name = "TouchApp",
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
            moveTo(10.82f, 21.5f)
            quadToRelative(-0.76f, 0f, -1.43f, -0.32f)
            reflectiveQuadTo(8.26f, 20.26f)
            lineTo(3.49f, 14.1f)
            quadTo(3.34f, 13.91f, 3.36f, 13.67f)
            reflectiveQuadToRelative(0.18f, -0.4f)
            quadToRelative(0.37f, -0.4f, 0.9f, -0.48f)
            reflectiveQuadToRelative(0.98f, 0.2f)
            lineTo(7.85f, 14.3f)
            verticalLineTo(6.38f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(8.6f, 5.63f)
            reflectiveQuadTo(9.14f, 5.85f)
            reflectiveQuadTo(9.36f, 6.38f)
            verticalLineToRelative(9f)
            quadToRelative(0f, 0.52f, -0.45f, 0.78f)
            reflectiveQuadToRelative(-0.9f, 0.01f)
            lineTo(6.36f, 15.31f)
            lineToRelative(3.12f, 4.07f)
            quadToRelative(0.25f, 0.31f, 0.6f, 0.47f)
            reflectiveQuadTo(10.82f, 20f)
            horizontalLineToRelative(4.92f)
            quadToRelative(0.94f, 0f, 1.6f, -0.65f)
            reflectiveQuadTo(18f, 17.75f)
            verticalLineTo(13.98f)
            quadToRelative(0f, -0.51f, -0.35f, -0.86f)
            reflectiveQuadTo(16.79f, 12.77f)
            horizontalLineTo(12.5f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(11.75f, 12.02f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12.5f, 11.27f)
            horizontalLineToRelative(4.29f)
            quadToRelative(1.13f, 0f, 1.92f, 0.79f)
            reflectiveQuadToRelative(0.79f, 1.92f)
            verticalLineToRelative(3.77f)
            quadToRelative(0f, 1.55f, -1.1f, 2.65f)
            reflectiveQuadToRelative(-2.66f, 1.1f)
            horizontalLineTo(10.82f)
            close()
            moveToRelative(1.36f, -5.87f)
            close()
            moveTo(11.85f, 9.01f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(11.1f, 8.26f)
            quadToRelative(0f, -0.06f, 0.1f, -0.37f)
            quadTo(11.4f, 7.53f, 11.5f, 7.17f)
            reflectiveQuadTo(11.6f, 6.38f)
            quadToRelative(0f, -1.25f, -0.88f, -2.13f)
            reflectiveQuadTo(8.6f, 3.38f)
            reflectiveQuadTo(6.47f, 4.26f)
            reflectiveQuadTo(5.6f, 6.38f)
            quadToRelative(0f, 0.43f, 0.1f, 0.79f)
            reflectiveQuadTo(6f, 7.88f)
            quadTo(6.05f, 7.98f, 6.07f, 8.07f)
            reflectiveQuadTo(6.09f, 8.26f)
            quadToRelative(0f, 0.32f, -0.21f, 0.53f)
            reflectiveQuadTo(5.36f, 9.01f)
            quadTo(5.15f, 9.01f, 4.97f, 8.9f)
            reflectiveQuadTo(4.7f, 8.62f)
            quadTo(4.41f, 8.12f, 4.25f, 7.55f)
            reflectiveQuadTo(4.1f, 6.38f)
            quadTo(4.1f, 4.51f, 5.41f, 3.2f)
            reflectiveQuadTo(8.6f, 1.88f)
            reflectiveQuadTo(11.78f, 3.2f)
            reflectiveQuadTo(13.1f, 6.38f)
            quadToRelative(0f, 0.61f, -0.16f, 1.17f)
            reflectiveQuadTo(12.49f, 8.62f)
            quadTo(12.39f, 8.79f, 12.23f, 8.9f)
            reflectiveQuadTo(11.85f, 9.01f)
            close()
          }
        }
        .buildSimpIcon()
    return _TouchApp!!
  }

private var _TouchApp: ImageVector? = null
