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
val SimpIcons.TipsAndUpdates: ImageVector
  get() {
    if (_TipsAndUpdates != null) {
      return _TipsAndUpdates!!
    }
    _TipsAndUpdates =
      ImageVector.Builder(
          name = "TipsAndUpdates",
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
            moveTo(21.45f, 8.55f)
            lineTo(20.7f, 8.21f)
            quadTo(20.56f, 8.14f, 20.56f, 8f)
            reflectiveQuadTo(20.7f, 7.79f)
            lineTo(21.45f, 7.45f)
            lineTo(21.79f, 6.7f)
            quadTo(21.86f, 6.56f, 22f, 6.56f)
            reflectiveQuadTo(22.21f, 6.7f)
            lineToRelative(0.34f, 0.75f)
            lineTo(23.3f, 7.79f)
            quadTo(23.44f, 7.86f, 23.44f, 8f)
            reflectiveQuadTo(23.3f, 8.21f)
            lineTo(22.55f, 8.55f)
            lineTo(22.21f, 9.3f)
            quadTo(22.14f, 9.44f, 22f, 9.44f)
            reflectiveQuadTo(21.79f, 9.3f)
            lineTo(21.45f, 8.55f)
            close()
            moveTo(18.17f, 3.83f)
            lineTo(16.82f, 3.21f)
            quadTo(16.68f, 3.14f, 16.68f, 3f)
            reflectiveQuadTo(16.82f, 2.79f)
            lineTo(18.17f, 2.17f)
            lineTo(18.79f, 0.82f)
            quadTo(18.86f, 0.68f, 19f, 0.68f)
            reflectiveQuadToRelative(0.21f, 0.14f)
            lineToRelative(0.63f, 1.35f)
            lineToRelative(1.35f, 0.63f)
            quadTo(21.32f, 2.86f, 21.32f, 3f)
            reflectiveQuadTo(21.18f, 3.21f)
            lineTo(19.83f, 3.83f)
            lineTo(19.21f, 5.18f)
            quadTo(19.14f, 5.32f, 19f, 5.32f)
            reflectiveQuadTo(18.79f, 5.18f)
            lineTo(18.17f, 3.83f)
            close()
            moveTo(7.69f, 21.05f)
            quadTo(7.14f, 20.53f, 7.1f, 19.77f)
            horizontalLineTo(10.9f)
            quadToRelative(-0.05f, 0.76f, -0.6f, 1.28f)
            reflectiveQuadTo(9f, 21.58f)
            reflectiveQuadTo(7.69f, 21.05f)
            close()
            moveTo(6f, 18.38f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(5.25f, 17.63f)
            reflectiveQuadTo(5.47f, 17.1f)
            reflectiveQuadTo(6f, 16.88f)
            horizontalLineToRelative(6f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(12f, 18.38f)
            horizontalLineTo(6f)
            close()
            moveTo(5.4f, 15.5f)
            quadTo(3.83f, 14.52f, 2.92f, 12.95f)
            reflectiveQuadTo(2f, 9.5f)
            quadTo(2f, 6.58f, 4.04f, 4.54f)
            reflectiveQuadTo(9f, 2.5f)
            reflectiveQuadToRelative(4.96f, 2.04f)
            reflectiveQuadTo(16f, 9.5f)
            quadToRelative(0f, 1.87f, -0.92f, 3.45f)
            reflectiveQuadTo(12.6f, 15.5f)
            horizontalLineTo(5.4f)
            close()
            moveTo(5.85f, 14f)
            horizontalLineToRelative(6.3f)
            quadToRelative(1.13f, -0.8f, 1.74f, -1.98f)
            reflectiveQuadTo(14.5f, 9.5f)
            quadToRelative(0f, -2.3f, -1.6f, -3.9f)
            reflectiveQuadTo(9f, 4f)
            reflectiveQuadTo(5.1f, 5.6f)
            reflectiveQuadTo(3.5f, 9.5f)
            quadToRelative(0f, 1.35f, 0.61f, 2.52f)
            quadTo(4.73f, 13.2f, 5.85f, 14f)
            close()
            moveTo(9f, 14f)
            close()
          }
        }
        .buildSimpIcon()
    return _TipsAndUpdates!!
  }

private var _TipsAndUpdates: ImageVector? = null
