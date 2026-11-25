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
val SimpIcons.PictureInPictureAlt: ImageVector
  get() {
    if (_PictureInPictureAlt != null) {
      return _PictureInPictureAlt!!
    }
    _PictureInPictureAlt =
      ImageVector.Builder(
          name = "PictureInPictureAlt",
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
            moveTo(4.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.69f, 19.5f)
            horizontalLineTo(4.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(20f, 6.19f, 19.9f, 6.1f)
            reflectiveQuadTo(19.69f, 6f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 6f, 4.1f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(4.31f, 18f)
            close()
            moveTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(4f, 6.19f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6f)
            quadTo(4f, 6f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(4f, 18f)
            close()
            moveToRelative(8.06f, -1.02f)
            horizontalLineTo(18.1f)
            quadToRelative(0.39f, 0f, 0.65f, -0.26f)
            reflectiveQuadTo(19f, 16.08f)
            verticalLineTo(12.04f)
            quadToRelative(0f, -0.39f, -0.26f, -0.65f)
            reflectiveQuadTo(18.1f, 11.13f)
            horizontalLineTo(12.06f)
            quadToRelative(-0.39f, 0f, -0.65f, 0.26f)
            reflectiveQuadToRelative(-0.26f, 0.65f)
            verticalLineToRelative(4.04f)
            quadToRelative(0f, 0.39f, 0.26f, 0.65f)
            reflectiveQuadToRelative(0.65f, 0.26f)
            close()
            moveToRelative(0.6f, -1.5f)
            verticalLineTo(12.63f)
            horizontalLineTo(17.5f)
            verticalLineToRelative(2.85f)
            horizontalLineTo(12.65f)
            close()
          }
        }
        .buildSimpIcon()
    return _PictureInPictureAlt!!
  }

private var _PictureInPictureAlt: ImageVector? = null
