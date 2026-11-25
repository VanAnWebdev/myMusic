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
val SimpIcons.Sensors: ImageVector
  get() {
    if (_Sensors != null) {
      return _Sensors!!
    }
    _Sensors =
      ImageVector.Builder(
          name = "Sensors",
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
            moveTo(4f, 12f)
            quadToRelative(0f, 1.47f, 0.47f, 2.75f)
            reflectiveQuadToRelative(1.33f, 2.3f)
            quadToRelative(0.22f, 0.26f, 0.23f, 0.57f)
            reflectiveQuadTo(5.81f, 18.18f)
            reflectiveQuadTo(5.26f, 18.39f)
            reflectiveQuadTo(4.73f, 18.11f)
            quadTo(3.68f, 16.86f, 3.09f, 15.31f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.09f, 8.68f)
            reflectiveQuadTo(4.73f, 5.89f)
            quadTo(4.95f, 5.63f, 5.26f, 5.61f)
            reflectiveQuadTo(5.81f, 5.82f)
            reflectiveQuadTo(6.03f, 6.37f)
            reflectiveQuadTo(5.8f, 6.94f)
            quadTo(4.95f, 7.99f, 4.47f, 9.27f)
            reflectiveQuadTo(4f, 12f)
            close()
            moveToRelative(4f, 0f)
            quadToRelative(0f, 0.63f, 0.19f, 1.2f)
            reflectiveQuadToRelative(0.52f, 1.04f)
            quadToRelative(0.18f, 0.26f, 0.17f, 0.58f)
            reflectiveQuadTo(8.65f, 15.37f)
            reflectiveQuadTo(8.1f, 15.58f)
            reflectiveQuadTo(7.6f, 15.3f)
            quadTo(7.08f, 14.62f, 6.79f, 13.77f)
            reflectiveQuadTo(6.5f, 12f)
            quadToRelative(0f, -0.94f, 0.29f, -1.78f)
            reflectiveQuadTo(7.6f, 8.7f)
            quadTo(7.79f, 8.43f, 8.1f, 8.43f)
            reflectiveQuadTo(8.65f, 8.65f)
            reflectiveQuadTo(8.88f, 9.19f)
            reflectiveQuadTo(8.71f, 9.76f)
            quadTo(8.38f, 10.24f, 8.19f, 10.8f)
            reflectiveQuadTo(8f, 12f)
            close()
            moveToRelative(2.94f, 1.06f)
            quadTo(10.5f, 12.61f, 10.5f, 12f)
            reflectiveQuadToRelative(0.44f, -1.06f)
            reflectiveQuadTo(12f, 10.5f)
            reflectiveQuadToRelative(1.06f, 0.44f)
            reflectiveQuadTo(13.5f, 12f)
            reflectiveQuadToRelative(-0.44f, 1.06f)
            reflectiveQuadTo(12f, 13.5f)
            reflectiveQuadTo(10.94f, 13.06f)
            close()
            moveTo(16f, 12f)
            quadToRelative(0f, -0.63f, -0.19f, -1.2f)
            reflectiveQuadTo(15.29f, 9.76f)
            quadTo(15.11f, 9.49f, 15.12f, 9.18f)
            reflectiveQuadTo(15.37f, 8.63f)
            reflectiveQuadTo(15.9f, 8.42f)
            reflectiveQuadTo(16.4f, 8.7f)
            quadToRelative(0.53f, 0.69f, 0.81f, 1.53f)
            reflectiveQuadTo(17.5f, 12f)
            quadToRelative(0f, 0.92f, -0.29f, 1.77f)
            reflectiveQuadTo(16.4f, 15.3f)
            quadToRelative(-0.18f, 0.26f, -0.5f, 0.27f)
            reflectiveQuadTo(15.35f, 15.35f)
            reflectiveQuadTo(15.12f, 14.81f)
            reflectiveQuadToRelative(0.17f, -0.57f)
            quadToRelative(0.33f, -0.48f, 0.52f, -1.04f)
            reflectiveQuadTo(16f, 12f)
            close()
            moveToRelative(4f, 0f)
            quadTo(20f, 10.54f, 19.53f, 9.26f)
            reflectiveQuadTo(18.2f, 6.94f)
            quadTo(17.98f, 6.68f, 17.96f, 6.37f)
            reflectiveQuadTo(18.18f, 5.82f)
            reflectiveQuadTo(18.73f, 5.61f)
            reflectiveQuadToRelative(0.54f, 0.28f)
            quadToRelative(1.05f, 1.24f, 1.64f, 2.79f)
            reflectiveQuadTo(21.5f, 12f)
            reflectiveQuadToRelative(-0.59f, 3.31f)
            reflectiveQuadToRelative(-1.64f, 2.8f)
            quadToRelative(-0.22f, 0.26f, -0.53f, 0.28f)
            reflectiveQuadTo(18.19f, 18.18f)
            reflectiveQuadTo(17.97f, 17.63f)
            reflectiveQuadTo(18.2f, 17.06f)
            quadToRelative(0.86f, -1.04f, 1.33f, -2.33f)
            reflectiveQuadTo(20f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _Sensors!!
  }

private var _Sensors: ImageVector? = null
