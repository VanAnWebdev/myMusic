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
val SimpIcons.CommentOutline: ImageVector
  get() {
    if (_CommentOutline != null) {
      return _CommentOutline!!
    }
    _CommentOutline =
      ImageVector.Builder(
          name = "CommentOutline",
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
            moveTo(7f, 13.75f)
            horizontalLineTo(17f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(17.75f, 13f)
            reflectiveQuadTo(17.53f, 12.47f)
            reflectiveQuadTo(17f, 12.25f)
            horizontalLineTo(7f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.25f, 13f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(7f, 13.75f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineTo(17f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(17.75f, 10f)
            reflectiveQuadTo(17.53f, 9.47f)
            reflectiveQuadTo(17f, 9.25f)
            horizontalLineTo(7f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.25f, 10f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(7f, 10.75f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineTo(17f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(17.75f, 7f)
            reflectiveQuadTo(17.53f, 6.47f)
            reflectiveQuadTo(17f, 6.25f)
            horizontalLineTo(7f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.25f, 7f)
            reflectiveQuadTo(6.47f, 7.53f)
            reflectiveQuadTo(7f, 7.75f)
            close()
            moveTo(4.31f, 17.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 15.69f)
            verticalLineTo(4.31f)
            quadTo(2.5f, 3.55f, 3.03f, 3.03f)
            reflectiveQuadTo(4.31f, 2.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 4.31f)
            verticalLineTo(18.85f)
            quadToRelative(0f, 0.61f, -0.55f, 0.84f)
            reflectiveQuadTo(19.96f, 19.5f)
            lineToRelative(-2f, -2f)
            horizontalLineTo(4.31f)
            close()
            moveTo(18.6f, 16f)
            lineTo(20f, 17.38f)
            verticalLineTo(4.31f)
            quadTo(20f, 4.19f, 19.9f, 4.1f)
            reflectiveQuadTo(19.69f, 4f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 4f, 4.1f, 4.1f)
            reflectiveQuadTo(4f, 4.31f)
            verticalLineTo(15.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(4.31f, 16f)
            horizontalLineTo(18.6f)
            close()
            moveTo(4f, 16f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(4f, 15.69f)
            verticalLineTo(4.31f)
            quadTo(4f, 4.19f, 4f, 4.1f)
            reflectiveQuadTo(4f, 4f)
            quadTo(4f, 4f, 4f, 4.1f)
            reflectiveQuadTo(4f, 4.31f)
            verticalLineTo(16f)
            close()
          }
        }
        .buildSimpIcon()
    return _CommentOutline!!
  }

private var _CommentOutline: ImageVector? = null
