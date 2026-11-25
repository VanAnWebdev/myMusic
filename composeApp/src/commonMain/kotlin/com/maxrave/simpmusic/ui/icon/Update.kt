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
val SimpIcons.Update: ImageVector
  get() {
    if (_Update != null) {
      return _Update!!
    }
    _Update =
      ImageVector.Builder(
          name = "Update",
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
            moveTo(12.01f, 20.5f)
            quadToRelative(-1.77f, 0f, -3.32f, -0.67f)
            reflectiveQuadTo(6f, 18.01f)
            reflectiveQuadTo(4.18f, 15.32f)
            reflectiveQuadTo(3.51f, 12f)
            reflectiveQuadTo(4.18f, 8.68f)
            reflectiveQuadTo(6f, 5.99f)
            reflectiveQuadTo(8.69f, 4.17f)
            reflectiveQuadTo(12.01f, 3.5f)
            quadToRelative(1.89f, 0f, 3.58f, 0.79f)
            reflectiveQuadToRelative(2.92f, 2.23f)
            verticalLineTo(4.9f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(19.26f, 4.15f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(20.01f, 4.9f)
            verticalLineTo(8.33f)
            quadToRelative(0f, 0.39f, -0.26f, 0.65f)
            reflectiveQuadTo(19.11f, 9.23f)
            horizontalLineTo(15.68f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(14.93f, 8.48f)
            reflectiveQuadTo(15.15f, 7.95f)
            reflectiveQuadTo(15.68f, 7.73f)
            horizontalLineToRelative(1.87f)
            quadToRelative(-1.03f, -1.27f, -2.47f, -2f)
            reflectiveQuadTo(12.01f, 5f)
            quadTo(9.08f, 5f, 7.05f, 7.04f)
            reflectiveQuadTo(5.01f, 12f)
            reflectiveQuadToRelative(2.04f, 4.96f)
            reflectiveQuadTo(12.01f, 19f)
            quadToRelative(2.42f, 0f, 4.31f, -1.49f)
            reflectiveQuadToRelative(2.46f, -3.8f)
            quadToRelative(0.1f, -0.31f, 0.34f, -0.47f)
            reflectiveQuadToRelative(0.55f, -0.12f)
            quadTo(20f, 13.15f, 20.18f, 13.4f)
            reflectiveQuadToRelative(0.1f, 0.55f)
            quadToRelative(-0.65f, 2.87f, -2.95f, 4.71f)
            reflectiveQuadTo(12.01f, 20.5f)
            close()
            moveToRelative(0.75f, -8.8f)
            lineToRelative(2.75f, 2.75f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadTo(15.51f, 15.5f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(14.46f, 15.5f)
            lineTo(11.53f, 12.57f)
            quadToRelative(-0.14f, -0.14f, -0.21f, -0.3f)
            reflectiveQuadTo(11.26f, 11.93f)
            verticalLineTo(7.75f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12.01f, 7f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(11.7f)
            close()
          }
        }
        .buildSimpIcon()
    return _Update!!
  }

private var _Update: ImageVector? = null
