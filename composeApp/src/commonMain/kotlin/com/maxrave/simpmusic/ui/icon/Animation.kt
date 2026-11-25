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
val SimpIcons.Animation: ImageVector
  get() {
    if (_Animation != null) {
      return _Animation!!
    }
    _Animation =
      ImageVector.Builder(
          name = "Animation",
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
            moveTo(9f, 21.5f)
            quadToRelative(-1.35f, 0f, -2.53f, -0.51f)
            reflectiveQuadTo(4.41f, 19.59f)
            reflectiveQuadTo(3.01f, 17.53f)
            reflectiveQuadTo(2.5f, 15f)
            quadToRelative(0f, -1.9f, 1f, -3.48f)
            reflectiveQuadTo(6.17f, 9.13f)
            quadToRelative(0.48f, -1f, 1.23f, -1.75f)
            reflectiveQuadTo(9.13f, 6.17f)
            quadTo(9.9f, 4.51f, 11.48f, 3.51f)
            reflectiveQuadTo(15f, 2.5f)
            quadToRelative(1.35f, 0f, 2.53f, 0.51f)
            reflectiveQuadToRelative(2.06f, 1.39f)
            reflectiveQuadToRelative(1.39f, 2.06f)
            reflectiveQuadTo(21.5f, 9f)
            quadToRelative(0f, 1.99f, -0.99f, 3.52f)
            reflectiveQuadToRelative(-2.67f, 2.35f)
            quadToRelative(-0.48f, 1f, -1.22f, 1.75f)
            reflectiveQuadToRelative(-1.75f, 1.22f)
            quadToRelative(-0.8f, 1.65f, -2.36f, 2.66f)
            reflectiveQuadTo(9f, 21.5f)
            close()
            moveTo(9.02f, 20f)
            quadToRelative(0.97f, 0f, 1.91f, -0.39f)
            reflectiveQuadToRelative(1.59f, -1.16f)
            quadTo(11.03f, 18.58f, 9.71f, 18.06f)
            reflectiveQuadTo(7.43f, 16.58f)
            reflectiveQuadTo(5.94f, 14.3f)
            reflectiveQuadTo(5.56f, 11.5f)
            quadTo(4.8f, 12.16f, 4.4f, 13.09f)
            reflectiveQuadTo(4f, 15f)
            quadToRelative(0f, 1.05f, 0.4f, 1.95f)
            reflectiveQuadToRelative(1.08f, 1.58f)
            quadToRelative(0.68f, 0.67f, 1.59f, 1.07f)
            reflectiveQuadTo(9.02f, 20f)
            close()
            moveTo(12f, 17f)
            quadToRelative(1.13f, 0f, 2.05f, -0.45f)
            reflectiveQuadToRelative(1.5f, -1.11f)
            quadToRelative(-1.5f, 0.13f, -2.82f, -0.39f)
            reflectiveQuadTo(10.44f, 13.57f)
            quadTo(9.47f, 12.6f, 8.95f, 11.29f)
            reflectiveQuadTo(8.56f, 8.47f)
            quadTo(7.88f, 9.09f, 7.45f, 10.01f)
            reflectiveQuadTo(7.02f, 12f)
            quadToRelative(0f, 1.05f, 0.39f, 1.95f)
            reflectiveQuadToRelative(1.08f, 1.58f)
            quadToRelative(0.67f, 0.7f, 1.57f, 1.09f)
            reflectiveQuadTo(12f, 17f)
            close()
            moveToRelative(3.02f, -3f)
            quadToRelative(0.45f, 0f, 0.86f, -0.08f)
            reflectiveQuadTo(16.72f, 13.7f)
            quadToRelative(0.55f, -1.5f, 0.16f, -2.89f)
            quadTo(16.49f, 9.42f, 15.54f, 8.48f)
            quadTo(14.59f, 7.52f, 13.21f, 7.14f)
            reflectiveQuadTo(10.32f, 7.3f)
            quadTo(10.17f, 7.72f, 10.09f, 8.14f)
            reflectiveQuadTo(10.02f, 9f)
            quadToRelative(0f, 1.05f, 0.39f, 1.95f)
            reflectiveQuadToRelative(1.09f, 1.57f)
            quadToRelative(0.68f, 0.7f, 1.58f, 1.09f)
            reflectiveQuadTo(15.02f, 14f)
            close()
            moveToRelative(3.44f, -1.47f)
            quadTo(19.19f, 11.88f, 19.6f, 11f)
            reflectiveQuadTo(20f, 9f)
            quadTo(20f, 7.95f, 19.61f, 7.05f)
            reflectiveQuadTo(18.53f, 5.47f)
            quadTo(17.85f, 4.77f, 16.95f, 4.39f)
            reflectiveQuadTo(15f, 4f)
            quadTo(13.92f, 4f, 13.04f, 4.41f)
            reflectiveQuadTo(11.47f, 5.56f)
            quadToRelative(1.5f, -0.13f, 2.82f, 0.39f)
            reflectiveQuadToRelative(2.29f, 1.48f)
            quadToRelative(0.97f, 0.97f, 1.49f, 2.28f)
            reflectiveQuadToRelative(0.39f, 2.82f)
            close()
            moveTo(15.01f, 9f)
            close()
          }
        }
        .buildSimpIcon()
    return _Animation!!
  }

private var _Animation: ImageVector? = null
