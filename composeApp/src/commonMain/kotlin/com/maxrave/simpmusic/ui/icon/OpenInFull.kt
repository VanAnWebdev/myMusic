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
val SimpIcons.OpenInFull: ImageVector
  get() {
    if (_OpenInFull != null) {
      return _OpenInFull!!
    }
    _OpenInFull =
      ImageVector.Builder(
          name = "OpenInFull",
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
            moveTo(4.4f, 20.5f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(3.5f, 19.6f)
            verticalLineTo(13.75f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(4.25f, 13f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(5f, 13.75f)
            verticalLineToRelative(4.21f)
            lineTo(17.96f, 5f)
            horizontalLineTo(13.75f)
            quadTo(13.43f, 5f, 13.22f, 4.78f)
            reflectiveQuadTo(13f, 4.25f)
            reflectiveQuadTo(13.22f, 3.72f)
            reflectiveQuadTo(13.75f, 3.5f)
            horizontalLineTo(19.6f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(20.5f, 4.4f)
            verticalLineToRelative(5.85f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(19.75f, 11f)
            reflectiveQuadTo(19.22f, 10.78f)
            reflectiveQuadTo(19f, 10.25f)
            verticalLineTo(6.04f)
            lineTo(6.04f, 19f)
            horizontalLineToRelative(4.21f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(11f, 19.75f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(10.25f, 20.5f)
            horizontalLineTo(4.4f)
            close()
          }
        }
        .buildSimpIcon()
    return _OpenInFull!!
  }

private var _OpenInFull: ImageVector? = null
