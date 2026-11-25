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
val SimpIcons.SurroundSound: ImageVector
  get() {
    if (_SurroundSound != null) {
      return _SurroundSound!!
    }
    _SurroundSound =
      ImageVector.Builder(
          name = "SurroundSound",
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
            moveTo(13.88f, 13.88f)
            quadTo(14.65f, 13.11f, 14.65f, 12f)
            reflectiveQuadTo(13.88f, 10.12f)
            reflectiveQuadTo(12f, 9.35f)
            reflectiveQuadToRelative(-1.88f, 0.77f)
            reflectiveQuadTo(9.35f, 12f)
            reflectiveQuadToRelative(0.77f, 1.88f)
            reflectiveQuadTo(12f, 14.65f)
            reflectiveQuadToRelative(1.88f, -0.77f)
            close()
            moveTo(17.23f, 12f)
            quadToRelative(0f, 0.8f, -0.21f, 1.54f)
            reflectiveQuadToRelative(-0.67f, 1.4f)
            quadToRelative(-0.18f, 0.26f, -0.17f, 0.58f)
            reflectiveQuadToRelative(0.22f, 0.54f)
            quadToRelative(0.23f, 0.23f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.49f, -0.27f)
            quadToRelative(0.64f, -0.86f, 0.97f, -1.89f)
            reflectiveQuadTo(18.73f, 12f)
            reflectiveQuadTo(18.39f, 9.88f)
            reflectiveQuadTo(17.42f, 7.99f)
            quadTo(17.22f, 7.74f, 16.93f, 7.73f)
            reflectiveQuadTo(16.4f, 7.94f)
            quadTo(16.19f, 8.16f, 16.18f, 8.48f)
            reflectiveQuadToRelative(0.17f, 0.58f)
            quadToRelative(0.45f, 0.65f, 0.67f, 1.4f)
            reflectiveQuadTo(17.23f, 12f)
            close()
            moveTo(6.98f, 10.46f)
            quadTo(7.2f, 9.72f, 7.65f, 9.06f)
            quadTo(7.83f, 8.8f, 7.82f, 8.48f)
            reflectiveQuadTo(7.6f, 7.94f)
            quadTo(7.36f, 7.71f, 7.07f, 7.73f)
            reflectiveQuadTo(6.58f, 7.99f)
            quadTo(5.95f, 8.85f, 5.61f, 9.88f)
            reflectiveQuadTo(5.27f, 12f)
            reflectiveQuadToRelative(0.34f, 2.12f)
            reflectiveQuadToRelative(0.97f, 1.89f)
            quadToRelative(0.19f, 0.25f, 0.49f, 0.27f)
            reflectiveQuadTo(7.6f, 16.06f)
            quadTo(7.81f, 15.84f, 7.82f, 15.52f)
            reflectiveQuadTo(7.65f, 14.94f)
            quadTo(7.2f, 14.28f, 6.98f, 13.54f)
            reflectiveQuadTo(6.77f, 12f)
            reflectiveQuadTo(6.98f, 10.46f)
            close()
            moveTo(4.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.69f, 19.5f)
            horizontalLineTo(4.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(20f, 6.19f, 19.9f, 6.1f)
            reflectiveQuadTo(19.69f, 6f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 6f, 4.1f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(4.31f, 18f)
            close()
            moveTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(4f, 6.19f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6f)
            quadTo(4f, 6f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(4f, 18f)
            close()
          }
        }
        .buildSimpIcon()
    return _SurroundSound!!
  }

private var _SurroundSound: ImageVector? = null
