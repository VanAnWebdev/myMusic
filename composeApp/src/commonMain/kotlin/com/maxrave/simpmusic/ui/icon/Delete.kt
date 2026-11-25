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
val SimpIcons.Delete: ImageVector
  get() {
    if (_Delete != null) {
      return _Delete!!
    }
    _Delete =
      ImageVector.Builder(
          name = "Delete",
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
            moveTo(7.31f, 20.5f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(5.5f, 18.69f)
            verticalLineTo(6f)
            horizontalLineTo(5.25f)
            quadTo(4.93f, 6f, 4.72f, 5.78f)
            reflectiveQuadTo(4.5f, 5.25f)
            reflectiveQuadTo(4.72f, 4.72f)
            reflectiveQuadTo(5.25f, 4.5f)
            horizontalLineTo(9f)
            quadTo(9f, 4.13f, 9.26f, 3.87f)
            reflectiveQuadTo(9.88f, 3.62f)
            horizontalLineToRelative(4.23f)
            quadToRelative(0.37f, 0f, 0.63f, 0.26f)
            reflectiveQuadTo(15f, 4.5f)
            horizontalLineToRelative(3.75f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(19.5f, 5.25f)
            reflectiveQuadTo(19.28f, 5.78f)
            reflectiveQuadTo(18.75f, 6f)
            horizontalLineTo(18.5f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(16.69f, 20.5f)
            horizontalLineTo(7.31f)
            close()
            moveTo(17f, 6f)
            horizontalLineTo(7f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(7.31f, 19f)
            horizontalLineToRelative(9.38f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(17f, 18.69f)
            verticalLineTo(6f)
            close()
            moveTo(10.69f, 16.78f)
            quadTo(10.9f, 16.57f, 10.9f, 16.25f)
            verticalLineTo(8.75f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(10.15f, 8f)
            reflectiveQuadTo(9.62f, 8.22f)
            reflectiveQuadTo(9.4f, 8.75f)
            verticalLineToRelative(7.5f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(10.15f, 17f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveToRelative(3.69f, 0f)
            quadTo(14.6f, 16.57f, 14.6f, 16.25f)
            verticalLineTo(8.75f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(13.85f, 8f)
            reflectiveQuadTo(13.31f, 8.22f)
            reflectiveQuadTo(13.1f, 8.75f)
            verticalLineToRelative(7.5f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(13.85f, 17f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveTo(7f, 6f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(7f, 19f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(7f, 18.69f)
            verticalLineTo(6f)
            close()
          }
        }
        .buildSimpIcon()
    return _Delete!!
  }

private var _Delete: ImageVector? = null
