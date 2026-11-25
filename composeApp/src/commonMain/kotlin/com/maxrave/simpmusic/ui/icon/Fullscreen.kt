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
val SimpIcons.Fullscreen: ImageVector
  get() {
    if (_Fullscreen != null) {
      return _Fullscreen!!
    }
    _Fullscreen =
      ImageVector.Builder(
          name = "Fullscreen",
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
            moveTo(5f, 19f)
            horizontalLineTo(7.46f)
            quadTo(7.78f, 19f, 8f, 19.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(8f, 20.28f)
            reflectiveQuadTo(7.46f, 20.5f)
            horizontalLineTo(4.4f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(3.5f, 19.6f)
            verticalLineTo(16.54f)
            quadTo(3.5f, 16.22f, 3.72f, 16f)
            reflectiveQuadTo(4.25f, 15.79f)
            reflectiveQuadTo(4.78f, 16f)
            reflectiveQuadTo(5f, 16.54f)
            verticalLineTo(19f)
            close()
            moveToRelative(14.01f, 0f)
            verticalLineTo(16.54f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadTo(20.29f, 16f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(19.6f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(19.61f, 20.5f)
            horizontalLineTo(16.55f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(15.8f, 19.75f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(16.55f, 19f)
            horizontalLineToRelative(2.46f)
            close()
            moveTo(5f, 5f)
            verticalLineTo(7.46f)
            quadTo(5f, 7.78f, 4.78f, 8f)
            reflectiveQuadTo(4.25f, 8.21f)
            reflectiveQuadTo(3.72f, 8f)
            reflectiveQuadTo(3.5f, 7.46f)
            verticalLineTo(4.4f)
            quadTo(3.5f, 4.02f, 3.76f, 3.76f)
            reflectiveQuadTo(4.4f, 3.5f)
            horizontalLineTo(7.46f)
            quadTo(7.78f, 3.5f, 8f, 3.72f)
            reflectiveQuadTo(8.21f, 4.25f)
            reflectiveQuadTo(8f, 4.78f)
            reflectiveQuadTo(7.46f, 5f)
            horizontalLineTo(5f)
            close()
            moveTo(19.01f, 5f)
            horizontalLineTo(16.55f)
            quadTo(16.23f, 5f, 16.01f, 4.78f)
            reflectiveQuadTo(15.8f, 4.25f)
            reflectiveQuadTo(16.01f, 3.72f)
            reflectiveQuadTo(16.55f, 3.5f)
            horizontalLineToRelative(3.06f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(20.51f, 4.4f)
            verticalLineTo(7.46f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(19.76f, 8.21f)
            reflectiveQuadTo(19.22f, 8f)
            reflectiveQuadTo(19.01f, 7.46f)
            verticalLineTo(5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Fullscreen!!
  }

private var _Fullscreen: ImageVector? = null
