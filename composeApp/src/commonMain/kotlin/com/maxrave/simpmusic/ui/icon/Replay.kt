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
val SimpIcons.Replay: ImageVector
  get() {
    if (_Replay != null) {
      return _Replay!!
    }
    _Replay =
      ImageVector.Builder(
          name = "Replay",
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
            moveTo(8.68f, 20.83f)
            quadTo(7.14f, 20.16f, 5.99f, 19.01f)
            reflectiveQuadTo(4.17f, 16.32f)
            reflectiveQuadTo(3.5f, 13f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(4.25f, 12.25f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(5f, 13f)
            quadToRelative(0f, 2.92f, 2.04f, 4.96f)
            reflectiveQuadTo(12f, 20f)
            reflectiveQuadToRelative(4.96f, -2.04f)
            quadTo(19f, 15.93f, 19f, 13f)
            quadTo(19f, 10.07f, 16.96f, 8.04f)
            reflectiveQuadTo(12f, 6f)
            horizontalLineTo(11.73f)
            lineTo(12.8f, 7.06f)
            quadToRelative(0.22f, 0.22f, 0.22f, 0.52f)
            reflectiveQuadTo(12.8f, 8.12f)
            quadTo(12.56f, 8.35f, 12.26f, 8.36f)
            reflectiveQuadTo(11.73f, 8.13f)
            lineTo(9.48f, 5.87f)
            quadTo(9.21f, 5.6f, 9.21f, 5.24f)
            reflectiveQuadTo(9.48f, 4.61f)
            lineTo(11.75f, 2.35f)
            quadTo(11.97f, 2.13f, 12.28f, 2.13f)
            reflectiveQuadToRelative(0.54f, 0.24f)
            quadToRelative(0.22f, 0.23f, 0.22f, 0.53f)
            reflectiveQuadTo(12.82f, 3.42f)
            lineTo(11.73f, 4.5f)
            horizontalLineTo(12f)
            quadToRelative(1.77f, 0f, 3.32f, 0.67f)
            reflectiveQuadToRelative(2.7f, 1.82f)
            reflectiveQuadToRelative(1.82f, 2.7f)
            reflectiveQuadTo(20.5f, 13f)
            reflectiveQuadToRelative(-0.67f, 3.32f)
            reflectiveQuadToRelative(-1.82f, 2.7f)
            reflectiveQuadToRelative(-2.7f, 1.82f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(8.68f, 20.83f)
            close()
          }
        }
        .buildSimpIcon()
    return _Replay!!
  }

private var _Replay: ImageVector? = null
