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
val SimpIcons.AutoGraph: ImageVector
  get() {
    if (_AutoGraph != null) {
      return _AutoGraph!!
    }
    _AutoGraph =
      ImageVector.Builder(
          name = "AutoGraph",
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
            moveTo(7.5f, 6.41f)
            lineTo(6.27f, 5.84f)
            quadTo(6.04f, 5.75f, 6.04f, 5.5f)
            reflectiveQuadTo(6.27f, 5.16f)
            lineTo(7.5f, 4.59f)
            lineTo(8.06f, 3.37f)
            quadTo(8.16f, 3.13f, 8.4f, 3.13f)
            reflectiveQuadTo(8.75f, 3.37f)
            lineTo(9.31f, 4.59f)
            lineToRelative(1.23f, 0.56f)
            quadToRelative(0.23f, 0.1f, 0.23f, 0.34f)
            reflectiveQuadTo(10.54f, 5.84f)
            lineTo(9.31f, 6.41f)
            lineTo(8.75f, 7.63f)
            quadTo(8.65f, 7.87f, 8.4f, 7.87f)
            reflectiveQuadTo(8.06f, 7.63f)
            lineTo(7.5f, 6.41f)
            close()
            moveToRelative(6.65f, 3.35f)
            lineTo(13.25f, 9.34f)
            quadTo(13.04f, 9.25f, 13.04f, 9f)
            reflectiveQuadTo(13.25f, 8.66f)
            lineTo(14.15f, 8.24f)
            lineTo(14.56f, 7.35f)
            quadTo(14.66f, 7.13f, 14.9f, 7.13f)
            reflectiveQuadToRelative(0.34f, 0.22f)
            lineToRelative(0.41f, 0.89f)
            lineToRelative(0.89f, 0.41f)
            quadTo(16.77f, 8.75f, 16.77f, 9f)
            reflectiveQuadTo(16.55f, 9.34f)
            lineTo(15.66f, 9.76f)
            lineToRelative(-0.41f, 0.89f)
            quadToRelative(-0.1f, 0.22f, -0.34f, 0.22f)
            reflectiveQuadTo(14.56f, 10.65f)
            lineTo(14.15f, 9.76f)
            close()
            moveToRelative(-11f, 2f)
            lineTo(2.25f, 11.34f)
            quadTo(2.04f, 11.25f, 2.04f, 11f)
            reflectiveQuadTo(2.25f, 10.66f)
            lineTo(3.15f, 10.24f)
            lineTo(3.56f, 9.35f)
            quadTo(3.66f, 9.13f, 3.9f, 9.13f)
            reflectiveQuadTo(4.25f, 9.35f)
            lineToRelative(0.41f, 0.89f)
            lineToRelative(0.89f, 0.41f)
            quadTo(5.77f, 10.75f, 5.77f, 11f)
            reflectiveQuadTo(5.55f, 11.34f)
            lineTo(4.66f, 11.76f)
            lineTo(4.25f, 12.65f)
            quadTo(4.15f, 12.87f, 3.9f, 12.87f)
            reflectiveQuadTo(3.56f, 12.65f)
            lineTo(3.15f, 11.76f)
            close()
            moveToRelative(0.66f, 6.72f)
            lineTo(9.12f, 13.17f)
            quadTo(9.64f, 12.65f, 10.4f, 12.65f)
            reflectiveQuadToRelative(1.28f, 0.52f)
            lineToRelative(2.49f, 2.49f)
            quadToRelative(0.1f, 0.1f, 0.23f, 0.09f)
            reflectiveQuadToRelative(0.22f, -0.11f)
            lineToRelative(6.3f, -7.16f)
            quadTo(21.14f, 8.23f, 21.45f, 8.23f)
            reflectiveQuadTo(22f, 8.45f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.49f)
            reflectiveQuadToRelative(-0.2f, 0.52f)
            lineToRelative(-6.34f, 7.23f)
            quadToRelative(-0.52f, 0.59f, -1.29f, 0.62f)
            reflectiveQuadTo(13.06f, 16.77f)
            lineTo(10.63f, 14.34f)
            quadTo(10.54f, 14.25f, 10.4f, 14.25f)
            reflectiveQuadToRelative(-0.22f, 0.09f)
            lineTo(4.92f, 19.6f)
            quadTo(4.68f, 19.83f, 4.37f, 19.84f)
            reflectiveQuadTo(3.81f, 19.6f)
            reflectiveQuadTo(3.56f, 19.04f)
            reflectiveQuadTo(3.81f, 18.48f)
            close()
          }
        }
        .buildSimpIcon()
    return _AutoGraph!!
  }

private var _AutoGraph: ImageVector? = null
