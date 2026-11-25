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
val SimpIcons.Link: ImageVector
  get() {
    if (_Link != null) {
      return _Link!!
    }
    _Link =
      ImageVector.Builder(
          name = "Link",
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
            moveTo(7.04f, 16.54f)
            quadToRelative(-1.88f, 0f, -3.21f, -1.33f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.83f, 8.79f)
            reflectiveQuadTo(7.04f, 7.46f)
            horizontalLineToRelative(3.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(10.59f, 8.75f)
            reflectiveQuadTo(10.06f, 8.96f)
            horizontalLineTo(7.04f)
            quadToRelative(-1.26f, 0f, -2.15f, 0.89f)
            reflectiveQuadTo(4f, 12f)
            reflectiveQuadToRelative(0.89f, 2.15f)
            reflectiveQuadToRelative(2.15f, 0.89f)
            horizontalLineToRelative(3.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(7.04f)
            close()
            moveTo(9f, 12.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(8.25f, 12f)
            reflectiveQuadTo(8.47f, 11.47f)
            reflectiveQuadTo(9f, 11.25f)
            horizontalLineToRelative(6f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(15.75f, 12f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(15f, 12.75f)
            horizontalLineTo(9f)
            close()
            moveToRelative(4.94f, 3.79f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(13.19f, 15.79f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            horizontalLineToRelative(3.02f)
            quadToRelative(1.26f, 0f, 2.15f, -0.89f)
            reflectiveQuadTo(20f, 12f)
            reflectiveQuadTo(19.11f, 9.85f)
            reflectiveQuadTo(16.96f, 8.96f)
            horizontalLineTo(13.94f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(13.19f, 8.21f)
            reflectiveQuadTo(13.41f, 7.68f)
            reflectiveQuadTo(13.94f, 7.46f)
            horizontalLineToRelative(3.02f)
            quadToRelative(1.88f, 0f, 3.21f, 1.33f)
            reflectiveQuadTo(21.5f, 12f)
            reflectiveQuadToRelative(-1.33f, 3.21f)
            reflectiveQuadToRelative(-3.21f, 1.33f)
            horizontalLineTo(13.94f)
            close()
          }
        }
        .buildSimpIcon()
    return _Link!!
  }

private var _Link: ImageVector? = null
