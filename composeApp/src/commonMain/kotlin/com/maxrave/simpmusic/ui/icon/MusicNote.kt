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
val SimpIcons.MusicNote: ImageVector
  get() {
    if (_MusicNote != null) {
      return _MusicNote!!
    }
    _MusicNote =
      ImageVector.Builder(
          name = "MusicNote",
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
            moveTo(7.55f, 19.38f)
            quadTo(6.53f, 18.35f, 6.53f, 16.9f)
            reflectiveQuadTo(7.56f, 14.43f)
            reflectiveQuadTo(10.03f, 13.4f)
            quadToRelative(0.57f, 0f, 1.08f, 0.17f)
            reflectiveQuadToRelative(0.92f, 0.51f)
            verticalLineTo(4.5f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(12.94f, 3.6f)
            horizontalLineToRelative(3.63f)
            quadToRelative(0.39f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(17.47f, 4.5f)
            verticalLineTo(5.96f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(16.57f, 6.87f)
            horizontalLineTo(13.53f)
            verticalLineTo(16.9f)
            quadToRelative(0f, 1.44f, -1.03f, 2.47f)
            reflectiveQuadTo(10.03f, 20.4f)
            reflectiveQuadTo(7.55f, 19.38f)
            close()
          }
        }
        .buildSimpIcon()
    return _MusicNote!!
  }

private var _MusicNote: ImageVector? = null
