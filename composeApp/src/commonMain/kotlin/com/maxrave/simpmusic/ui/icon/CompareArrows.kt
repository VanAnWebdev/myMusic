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
val SimpIcons.CompareArrows: ImageVector
  get() {
    if (_CompareArrows != null) {
      return _CompareArrows!!
    }
    _CompareArrows =
      ImageVector.Builder(
          name = "CompareArrows",
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
            moveTo(9.78f, 15.59f)
            horizontalLineTo(3.25f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(2.5f, 14.84f)
            reflectiveQuadTo(2.72f, 14.3f)
            reflectiveQuadTo(3.25f, 14.09f)
            horizontalLineTo(9.78f)
            lineTo(7.47f, 11.78f)
            quadTo(7.27f, 11.57f, 7.26f, 11.26f)
            reflectiveQuadTo(7.47f, 10.73f)
            quadTo(7.71f, 10.49f, 8.01f, 10.49f)
            reflectiveQuadToRelative(0.53f, 0.23f)
            lineToRelative(3.48f, 3.48f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadToRelative(0.06f, 0.34f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineTo(8.53f, 18.96f)
            quadTo(8.3f, 19.19f, 8f, 19.18f)
            reflectiveQuadTo(7.47f, 18.95f)
            quadTo(7.26f, 18.72f, 7.25f, 18.42f)
            reflectiveQuadTo(7.47f, 17.89f)
            lineTo(9.78f, 15.59f)
            close()
            moveTo(14.22f, 9.9f)
            lineToRelative(2.31f, 2.31f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.51f)
            reflectiveQuadToRelative(-0.21f, 0.54f)
            quadTo(16.29f, 13.5f, 15.99f, 13.5f)
            reflectiveQuadTo(15.46f, 13.27f)
            lineTo(11.98f, 9.79f)
            quadTo(11.84f, 9.65f, 11.78f, 9.49f)
            reflectiveQuadTo(11.72f, 9.15f)
            reflectiveQuadTo(11.78f, 8.82f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(15.47f, 5.03f)
            quadTo(15.7f, 4.8f, 16f, 4.81f)
            reflectiveQuadToRelative(0.53f, 0.24f)
            quadToRelative(0.22f, 0.23f, 0.22f, 0.53f)
            reflectiveQuadTo(16.53f, 6.1f)
            lineTo(14.22f, 8.4f)
            horizontalLineToRelative(6.53f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(21.5f, 9.15f)
            reflectiveQuadTo(21.28f, 9.69f)
            reflectiveQuadTo(20.75f, 9.9f)
            horizontalLineTo(14.22f)
            close()
          }
        }
        .buildSimpIcon()
    return _CompareArrows!!
  }

private var _CompareArrows: ImageVector? = null
