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
val SimpIcons.FullscreenExit: ImageVector
  get() {
    if (_FullscreenExit != null) {
      return _FullscreenExit!!
    }
    _FullscreenExit =
      ImageVector.Builder(
          name = "FullscreenExit",
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
            moveTo(6.71f, 17.29f)
            horizontalLineTo(4.25f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.5f, 16.54f)
            reflectiveQuadTo(3.72f, 16f)
            reflectiveQuadTo(4.25f, 15.79f)
            horizontalLineTo(7.31f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            verticalLineToRelative(3.06f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(7.46f, 20.5f)
            reflectiveQuadTo(6.93f, 20.28f)
            reflectiveQuadTo(6.71f, 19.75f)
            verticalLineTo(17.29f)
            close()
            moveToRelative(10.59f, 0f)
            verticalLineToRelative(2.46f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(16.55f, 20.5f)
            reflectiveQuadTo(16.01f, 20.28f)
            reflectiveQuadTo(15.8f, 19.75f)
            verticalLineTo(16.69f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(16.7f, 15.79f)
            horizontalLineToRelative(3.06f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(17.3f)
            close()
            moveTo(6.71f, 6.71f)
            verticalLineTo(4.25f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(7.46f, 3.5f)
            reflectiveQuadTo(8f, 3.72f)
            reflectiveQuadTo(8.21f, 4.25f)
            verticalLineTo(7.31f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(7.31f, 8.21f)
            horizontalLineTo(4.25f)
            quadTo(3.93f, 8.21f, 3.72f, 8f)
            reflectiveQuadTo(3.5f, 7.46f)
            reflectiveQuadTo(3.72f, 6.93f)
            reflectiveQuadTo(4.25f, 6.71f)
            horizontalLineTo(6.71f)
            close()
            moveToRelative(10.59f, 0f)
            horizontalLineToRelative(2.46f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(20.29f, 8f)
            reflectiveQuadTo(19.76f, 8.21f)
            horizontalLineTo(16.7f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(15.8f, 7.31f)
            verticalLineTo(4.25f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(16.55f, 3.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(17.3f, 4.25f)
            verticalLineTo(6.71f)
            close()
          }
        }
        .buildSimpIcon()
    return _FullscreenExit!!
  }

private var _FullscreenExit: ImageVector? = null
