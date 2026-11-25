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
val SimpIcons.LibraryMusic: ImageVector
  get() {
    if (_LibraryMusic != null) {
      return _LibraryMusic!!
    }
    _LibraryMusic =
      ImageVector.Builder(
          name = "LibraryMusic",
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
            moveTo(12.35f, 14.85f)
            quadToRelative(0.94f, 0f, 1.6f, -0.65f)
            reflectiveQuadTo(14.6f, 12.6f)
            verticalLineTo(6.98f)
            horizontalLineToRelative(1.98f)
            quadToRelative(0.37f, 0f, 0.63f, -0.25f)
            reflectiveQuadTo(17.46f, 6.1f)
            quadToRelative(0f, -0.37f, -0.26f, -0.63f)
            reflectiveQuadTo(16.58f, 5.21f)
            horizontalLineTo(14.6f)
            quadToRelative(-0.37f, 0f, -0.63f, 0.26f)
            reflectiveQuadTo(13.71f, 6.1f)
            verticalLineToRelative(4.77f)
            quadTo(13.42f, 10.61f, 13.08f, 10.48f)
            reflectiveQuadTo(12.35f, 10.35f)
            quadToRelative(-0.94f, 0f, -1.6f, 0.65f)
            reflectiveQuadTo(10.1f, 12.6f)
            reflectiveQuadToRelative(0.65f, 1.6f)
            reflectiveQuadToRelative(1.6f, 0.65f)
            close()
            moveTo(8.06f, 17.5f)
            quadTo(7.3f, 17.5f, 6.78f, 16.97f)
            reflectiveQuadTo(6.25f, 15.69f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.76f, 0.52f, -1.28f)
            reflectiveQuadTo(8.06f, 2.5f)
            horizontalLineTo(19.44f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadToRelative(0.52f, 1.28f)
            verticalLineTo(15.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.44f, 17.5f)
            horizontalLineTo(8.06f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(19.44f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadToRelative(0.1f, -0.21f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.12f, -0.1f, -0.21f)
            reflectiveQuadTo(19.44f, 4f)
            horizontalLineTo(8.06f)
            quadTo(7.94f, 4f, 7.85f, 4.1f)
            reflectiveQuadTo(7.75f, 4.31f)
            verticalLineTo(15.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(8.06f, 16f)
            close()
            moveToRelative(-3.5f, 5f)
            quadTo(3.8f, 21f, 3.28f, 20.47f)
            reflectiveQuadTo(2.75f, 19.19f)
            verticalLineTo(7.06f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(3.5f, 6.31f)
            reflectiveQuadTo(4.03f, 6.52f)
            reflectiveQuadTo(4.25f, 7.06f)
            verticalLineTo(19.19f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadToRelative(0.21f, 0.1f)
            horizontalLineTo(16.69f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(16.69f, 21f)
            horizontalLineTo(4.56f)
            close()
            moveTo(7.75f, 4f)
            quadToRelative(0f, 0f, 0f, 0.09f)
            reflectiveQuadToRelative(0f, 0.22f)
            verticalLineTo(15.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadToRelative(0f, 0.09f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadToRelative(0f, -0.22f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.13f, 0f, -0.22f)
            reflectiveQuadTo(7.75f, 4f)
            close()
          }
        }
        .buildSimpIcon()
    return _LibraryMusic!!
  }

private var _LibraryMusic: ImageVector? = null
