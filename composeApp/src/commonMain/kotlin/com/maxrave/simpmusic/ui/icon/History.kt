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
val SimpIcons.History: ImageVector
  get() {
    if (_History != null) {
      return _History!!
    }
    _History =
      ImageVector.Builder(
          name = "History",
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
            moveTo(11.98f, 20.5f)
            quadToRelative(-3.02f, 0f, -5.32f, -1.84f)
            reflectiveQuadTo(3.72f, 13.95f)
            quadTo(3.64f, 13.65f, 3.81f, 13.4f)
            reflectiveQuadTo(4.32f, 13.11f)
            quadToRelative(0.3f, -0.04f, 0.55f, 0.12f)
            reflectiveQuadToRelative(0.34f, 0.47f)
            quadToRelative(0.57f, 2.32f, 2.46f, 3.8f)
            reflectiveQuadTo(11.98f, 19f)
            quadToRelative(2.92f, 0f, 4.96f, -2.04f)
            quadTo(18.98f, 14.93f, 18.98f, 12f)
            quadToRelative(0f, -2.93f, -2.04f, -4.96f)
            reflectiveQuadTo(11.98f, 5f)
            quadTo(10.34f, 5f, 8.91f, 5.73f)
            reflectiveQuadToRelative(-2.47f, 2f)
            horizontalLineTo(8.31f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(9.06f, 8.48f)
            reflectiveQuadTo(8.84f, 9.02f)
            reflectiveQuadTo(8.31f, 9.23f)
            horizontalLineTo(4.88f)
            quadTo(4.5f, 9.23f, 4.24f, 8.97f)
            reflectiveQuadTo(3.98f, 8.33f)
            verticalLineTo(4.9f)
            quadTo(3.98f, 4.58f, 4.2f, 4.37f)
            reflectiveQuadTo(4.73f, 4.15f)
            reflectiveQuadTo(5.27f, 4.37f)
            reflectiveQuadTo(5.48f, 4.9f)
            verticalLineTo(6.52f)
            quadTo(6.7f, 5.09f, 8.4f, 4.29f)
            reflectiveQuadTo(11.98f, 3.5f)
            quadToRelative(1.77f, 0f, 3.32f, 0.67f)
            reflectiveQuadToRelative(2.7f, 1.82f)
            reflectiveQuadToRelative(1.82f, 2.7f)
            reflectiveQuadTo(20.48f, 12f)
            reflectiveQuadToRelative(-0.67f, 3.32f)
            reflectiveQuadToRelative(-1.82f, 2.7f)
            reflectiveQuadToRelative(-2.7f, 1.82f)
            reflectiveQuadTo(11.98f, 20.5f)
            close()
            moveToRelative(0.78f, -8.8f)
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
    return _History!!
  }

private var _History: ImageVector? = null
