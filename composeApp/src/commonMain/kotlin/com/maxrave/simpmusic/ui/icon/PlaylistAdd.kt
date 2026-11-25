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
val SimpIcons.PlaylistAdd: ImageVector
  get() {
    if (_PlaylistAdd != null) {
      return _PlaylistAdd!!
    }
    _PlaylistAdd =
      ImageVector.Builder(
          name = "PlaylistAdd",
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
            moveTo(4f, 15.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.25f, 15f)
            reflectiveQuadTo(3.47f, 14.47f)
            reflectiveQuadTo(4f, 14.25f)
            horizontalLineTo(9.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(10.25f, 15f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(9.5f, 15.75f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, -4f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.25f, 11f)
            reflectiveQuadTo(3.47f, 10.47f)
            reflectiveQuadTo(4f, 10.25f)
            horizontalLineToRelative(9.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(14.25f, 11f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(13.5f, 11.75f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, -4f)
            quadTo(3.68f, 7.75f, 3.47f, 7.53f)
            reflectiveQuadTo(3.25f, 7f)
            reflectiveQuadTo(3.47f, 6.47f)
            reflectiveQuadTo(4f, 6.25f)
            horizontalLineToRelative(9.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(14.25f, 7f)
            reflectiveQuadTo(14.03f, 7.53f)
            reflectiveQuadTo(13.5f, 7.75f)
            horizontalLineTo(4f)
            close()
            moveTo(16.47f, 19.53f)
            quadTo(16.25f, 19.32f, 16.25f, 19f)
            verticalLineTo(15.75f)
            horizontalLineTo(13f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(12.25f, 15f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(13f, 14.25f)
            horizontalLineToRelative(3.25f)
            verticalLineTo(11f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(17f, 10.25f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(17.75f, 11f)
            verticalLineToRelative(3.25f)
            horizontalLineTo(21f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(21.75f, 15f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(21f, 15.75f)
            horizontalLineTo(17.75f)
            verticalLineTo(19f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(17f, 19.75f)
            reflectiveQuadTo(16.47f, 19.53f)
            close()
          }
        }
        .buildSimpIcon()
    return _PlaylistAdd!!
  }

private var _PlaylistAdd: ImageVector? = null
