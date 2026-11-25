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
val SimpIcons.OpenInNew: ImageVector
  get() {
    if (_OpenInNew != null) {
      return _OpenInNew!!
    }
    _OpenInNew =
      ImageVector.Builder(
          name = "OpenInNew",
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
            moveTo(5.31f, 20.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.55f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineToRelative(5.56f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(11.4f, 4.78f)
            reflectiveQuadTo(10.87f, 5f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 5f, 5.1f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            horizontalLineTo(18.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(13.13f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(5.56f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveTo(19f, 6.05f)
            lineToRelative(-8.75f, 8.75f)
            quadToRelative(-0.21f, 0.21f, -0.52f, 0.21f)
            reflectiveQuadTo(9.19f, 14.81f)
            reflectiveQuadTo(8.98f, 14.28f)
            reflectiveQuadTo(9.19f, 13.75f)
            lineTo(17.95f, 5f)
            horizontalLineToRelative(-3.2f)
            quadTo(14.43f, 5f, 14.22f, 4.78f)
            reflectiveQuadTo(14f, 4.25f)
            reflectiveQuadTo(14.22f, 3.72f)
            reflectiveQuadTo(14.75f, 3.5f)
            horizontalLineTo(19.6f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadTo(20.5f, 4.4f)
            verticalLineTo(9.25f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(19.75f, 10f)
            reflectiveQuadTo(19.22f, 9.78f)
            reflectiveQuadTo(19f, 9.25f)
            verticalLineTo(6.05f)
            close()
          }
        }
        .buildSimpIcon()
    return _OpenInNew!!
  }

private var _OpenInNew: ImageVector? = null
