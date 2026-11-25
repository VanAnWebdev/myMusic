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
val SimpIcons.Download: ImageVector
  get() {
    if (_Download != null) {
      return _Download!!
    }
    _Download =
      ImageVector.Builder(
          name = "Download",
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
            moveTo(11.66f, 15.35f)
            quadToRelative(-0.16f, -0.06f, -0.3f, -0.2f)
            lineTo(8.26f, 12.05f)
            quadTo(8.03f, 11.82f, 8.04f, 11.52f)
            reflectiveQuadTo(8.26f, 10.99f)
            quadTo(8.49f, 10.76f, 8.79f, 10.75f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineToRelative(1.92f, 1.92f)
            verticalLineTo(5.25f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 4.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(12.9f)
            lineToRelative(1.92f, -1.92f)
            quadTo(14.9f, 10.75f, 15.2f, 10.76f)
            reflectiveQuadToRelative(0.54f, 0.24f)
            quadToRelative(0.22f, 0.23f, 0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            lineToRelative(-3.11f, 3.11f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 15.41f)
            reflectiveQuadTo(11.66f, 15.35f)
            close()
            moveTo(6.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(4.5f, 17.69f)
            verticalLineTo(15.73f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(5.25f, 14.98f)
            reflectiveQuadTo(5.78f, 15.2f)
            reflectiveQuadTo(6f, 15.73f)
            verticalLineToRelative(1.96f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(6.31f, 18f)
            horizontalLineTo(17.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(18f, 17.69f)
            verticalLineTo(15.73f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(1.96f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(17.69f, 19.5f)
            horizontalLineTo(6.31f)
            close()
          }
        }
        .buildSimpIcon()
    return _Download!!
  }

private var _Download: ImageVector? = null
