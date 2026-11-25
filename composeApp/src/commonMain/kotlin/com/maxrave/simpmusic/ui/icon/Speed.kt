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
val SimpIcons.Speed: ImageVector
  get() {
    if (_Speed != null) {
      return _Speed!!
    }
    _Speed =
      ImageVector.Builder(
          name = "Speed",
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
            moveTo(11.98f, 15.85f)
            quadToRelative(0.84f, -0.03f, 1.23f, -0.61f)
            lineTo(17.24f, 9.4f)
            quadTo(17.46f, 9.08f, 17.19f, 8.82f)
            reflectiveQuadTo(16.61f, 8.77f)
            lineToRelative(-5.85f, 4.02f)
            quadTo(10.17f, 13.18f, 10.12f, 14f)
            reflectiveQuadToRelative(0.49f, 1.35f)
            reflectiveQuadToRelative(1.37f, 0.51f)
            close()
            moveTo(12f, 4.5f)
            quadToRelative(0.99f, 0f, 1.89f, 0.18f)
            reflectiveQuadToRelative(1.75f, 0.55f)
            quadToRelative(0.3f, 0.12f, 0.6f, 0.43f)
            reflectiveQuadTo(16.4f, 6.25f)
            quadTo(16.25f, 6.53f, 15.76f, 6.62f)
            reflectiveQuadTo(14.95f, 6.59f)
            quadTo(14.25f, 6.29f, 13.52f, 6.15f)
            reflectiveQuadTo(12f, 6f)
            quadTo(8.68f, 6f, 6.34f, 8.34f)
            quadTo(4f, 10.68f, 4f, 14f)
            quadToRelative(0f, 1.05f, 0.29f, 2.07f)
            reflectiveQuadTo(5.1f, 18f)
            horizontalLineTo(18.9f)
            quadToRelative(0.57f, -0.95f, 0.84f, -1.98f)
            reflectiveQuadTo(20f, 13.9f)
            quadToRelative(0f, -0.71f, -0.14f, -1.45f)
            reflectiveQuadTo(19.42f, 11.02f)
            quadTo(19.29f, 10.7f, 19.37f, 10.39f)
            reflectiveQuadTo(19.7f, 9.89f)
            quadToRelative(0.25f, -0.18f, 0.54f, -0.1f)
            reflectiveQuadToRelative(0.41f, 0.35f)
            quadToRelative(0.43f, 0.94f, 0.63f, 1.85f)
            reflectiveQuadToRelative(0.22f, 1.87f)
            quadToRelative(0.02f, 1.36f, -0.31f, 2.57f)
            reflectiveQuadTo(20.23f, 18.8f)
            quadToRelative(-0.2f, 0.32f, -0.56f, 0.51f)
            reflectiveQuadTo(18.9f, 19.5f)
            horizontalLineTo(5.1f)
            quadToRelative(-0.4f, 0f, -0.75f, -0.19f)
            reflectiveQuadTo(3.77f, 18.76f)
            quadTo(3.2f, 17.76f, 2.85f, 16.58f)
            reflectiveQuadTo(2.5f, 14f)
            quadToRelative(0f, -1.96f, 0.74f, -3.68f)
            reflectiveQuadTo(5.27f, 7.29f)
            reflectiveQuadTo(8.3f, 5.25f)
            reflectiveQuadTo(12f, 4.5f)
            close()
            moveToRelative(0.11f, 7.39f)
            close()
          }
        }
        .buildSimpIcon()
    return _Speed!!
  }

private var _Speed: ImageVector? = null
