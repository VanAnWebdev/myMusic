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
val SimpIcons.WaterDrop: ImageVector
  get() {
    if (_WaterDrop != null) {
      return _WaterDrop!!
    }
    _WaterDrop =
      ImageVector.Builder(
          name = "WaterDrop",
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
            moveTo(6.64f, 19.29f)
            quadTo(4.5f, 17.09f, 4.5f, 13.8f)
            quadToRelative(0f, -1.46f, 0.66f, -2.92f)
            reflectiveQuadTo(6.81f, 8.07f)
            reflectiveQuadTo(8.95f, 5.54f)
            reflectiveQuadTo(11.09f, 3.47f)
            quadTo(11.28f, 3.29f, 11.51f, 3.2f)
            reflectiveQuadTo(12f, 3.12f)
            reflectiveQuadTo(12.49f, 3.2f)
            reflectiveQuadToRelative(0.43f, 0.27f)
            quadToRelative(0.99f, 0.88f, 2.14f, 2.07f)
            reflectiveQuadToRelative(2.14f, 2.53f)
            reflectiveQuadToRelative(1.65f, 2.81f)
            reflectiveQuadTo(19.5f, 13.8f)
            quadToRelative(0f, 3.29f, -2.15f, 5.49f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(6.64f, 19.29f)
            close()
            moveTo(16.3f, 18.24f)
            quadTo(18f, 16.48f, 18f, 13.8f)
            quadTo(18f, 11.98f, 16.49f, 9.67f)
            quadTo(14.98f, 7.38f, 12f, 4.65f)
            quadTo(9.03f, 7.38f, 7.51f, 9.67f)
            quadTo(6f, 11.98f, 6f, 13.8f)
            quadToRelative(0f, 2.68f, 1.7f, 4.44f)
            reflectiveQuadTo(12f, 20f)
            reflectiveQuadToRelative(4.3f, -1.76f)
            close()
            moveTo(12f, 12.08f)
            close()
            moveToRelative(0.25f, 6.77f)
            quadToRelative(0.26f, -0.03f, 0.43f, -0.2f)
            reflectiveQuadToRelative(0.17f, -0.41f)
            quadToRelative(0f, -0.28f, -0.18f, -0.45f)
            reflectiveQuadTo(12.19f, 17.65f)
            quadToRelative(-1.02f, 0.07f, -2.23f, -0.6f)
            reflectiveQuadTo(8.45f, 14.7f)
            quadTo(8.4f, 14.45f, 8.24f, 14.3f)
            reflectiveQuadTo(7.84f, 14.15f)
            quadToRelative(-0.27f, 0f, -0.45f, 0.2f)
            reflectiveQuadTo(7.27f, 14.88f)
            quadTo(7.68f, 17.06f, 9.23f, 18f)
            reflectiveQuadToRelative(3.01f, 0.85f)
            close()
          }
        }
        .buildSimpIcon()
    return _WaterDrop!!
  }

private var _WaterDrop: ImageVector? = null
