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
val SimpIcons.ThumbUp: ImageVector
  get() {
    if (_ThumbUp != null) {
      return _ThumbUp!!
    }
    _ThumbUp =
      ImageVector.Builder(
          name = "ThumbUp",
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
            moveTo(20.69f, 8.5f)
            quadToRelative(0.71f, 0f, 1.26f, 0.55f)
            reflectiveQuadToRelative(0.55f, 1.26f)
            verticalLineToRelative(1.62f)
            quadToRelative(0f, 0.16f, -0.03f, 0.34f)
            reflectiveQuadToRelative(-0.1f, 0.34f)
            lineTo(19.5f, 19.36f)
            quadToRelative(-0.22f, 0.48f, -0.72f, 0.81f)
            reflectiveQuadTo(17.73f, 20.5f)
            horizontalLineTo(9.63f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(7.83f, 18.69f)
            verticalLineTo(9.25f)
            quadToRelative(0f, -0.36f, 0.15f, -0.7f)
            reflectiveQuadTo(8.37f, 7.97f)
            lineTo(13.66f, 2.72f)
            quadToRelative(0.3f, -0.28f, 0.69f, -0.35f)
            reflectiveQuadTo(15.1f, 2.49f)
            reflectiveQuadToRelative(0.52f, 0.54f)
            reflectiveQuadToRelative(0.06f, 0.75f)
            lineTo(14.61f, 8.5f)
            horizontalLineToRelative(6.08f)
            close()
            moveTo(4.31f, 20.5f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(2.5f, 18.69f)
            verticalLineTo(10.31f)
            quadTo(2.5f, 9.56f, 3.03f, 9.03f)
            reflectiveQuadTo(4.31f, 8.5f)
            horizontalLineTo(4.52f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            verticalLineTo(18.7f)
            quadToRelative(0f, 0.75f, -0.53f, 1.27f)
            reflectiveQuadTo(4.52f, 20.5f)
            horizontalLineTo(4.31f)
            close()
          }
        }
        .buildSimpIcon()
    return _ThumbUp!!
  }

private var _ThumbUp: ImageVector? = null
