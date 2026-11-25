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
val SimpIcons.Storage: ImageVector
  get() {
    if (_Storage != null) {
      return _Storage!!
    }
    _Storage =
      ImageVector.Builder(
          name = "Storage",
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
            moveTo(5.15f, 19.79f)
            quadToRelative(-0.74f, 0f, -1.26f, -0.53f)
            reflectiveQuadTo(3.37f, 18f)
            reflectiveQuadTo(3.89f, 16.74f)
            reflectiveQuadTo(5.15f, 16.21f)
            horizontalLineTo(18.85f)
            quadToRelative(0.74f, 0f, 1.26f, 0.53f)
            reflectiveQuadTo(20.63f, 18f)
            reflectiveQuadToRelative(-0.53f, 1.26f)
            reflectiveQuadToRelative(-1.26f, 0.52f)
            horizontalLineTo(5.15f)
            close()
            moveToRelative(0f, -12f)
            quadTo(4.42f, 7.79f, 3.89f, 7.26f)
            reflectiveQuadTo(3.37f, 6f)
            reflectiveQuadTo(3.89f, 4.74f)
            reflectiveQuadTo(5.15f, 4.21f)
            horizontalLineTo(18.85f)
            quadToRelative(0.74f, 0f, 1.26f, 0.53f)
            reflectiveQuadTo(20.63f, 6f)
            reflectiveQuadTo(20.11f, 7.26f)
            reflectiveQuadTo(18.85f, 7.79f)
            horizontalLineTo(5.15f)
            close()
            moveToRelative(0f, 6f)
            quadToRelative(-0.74f, 0f, -1.26f, -0.53f)
            reflectiveQuadTo(3.37f, 12f)
            reflectiveQuadTo(3.89f, 10.74f)
            reflectiveQuadTo(5.15f, 10.21f)
            horizontalLineTo(18.85f)
            quadToRelative(0.74f, 0f, 1.26f, 0.53f)
            reflectiveQuadTo(20.63f, 12f)
            reflectiveQuadToRelative(-0.53f, 1.26f)
            reflectiveQuadToRelative(-1.26f, 0.52f)
            horizontalLineTo(5.15f)
            close()
            moveTo(6.68f, 6.64f)
            quadTo(6.94f, 6.38f, 6.94f, 6f)
            reflectiveQuadTo(6.68f, 5.35f)
            reflectiveQuadTo(6.04f, 5.1f)
            reflectiveQuadTo(5.39f, 5.36f)
            reflectiveQuadTo(5.13f, 6f)
            reflectiveQuadTo(5.39f, 6.65f)
            reflectiveQuadTo(6.04f, 6.9f)
            quadToRelative(0.38f, 0f, 0.64f, -0.26f)
            close()
            moveToRelative(0f, 6f)
            quadTo(6.94f, 12.38f, 6.94f, 12f)
            reflectiveQuadTo(6.68f, 11.35f)
            reflectiveQuadTo(6.04f, 11.1f)
            reflectiveQuadTo(5.39f, 11.36f)
            reflectiveQuadTo(5.13f, 12f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            reflectiveQuadTo(6.04f, 12.9f)
            quadToRelative(0.38f, 0f, 0.64f, -0.26f)
            close()
            moveToRelative(0f, 6f)
            quadTo(6.94f, 18.38f, 6.94f, 18f)
            reflectiveQuadTo(6.68f, 17.35f)
            reflectiveQuadTo(6.04f, 17.1f)
            reflectiveQuadTo(5.39f, 17.36f)
            reflectiveQuadTo(5.13f, 18f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            reflectiveQuadTo(6.04f, 18.9f)
            quadToRelative(0.38f, 0f, 0.64f, -0.26f)
            close()
          }
        }
        .buildSimpIcon()
    return _Storage!!
  }

private var _Storage: ImageVector? = null
