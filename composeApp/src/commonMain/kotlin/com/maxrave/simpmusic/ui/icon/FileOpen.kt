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
val SimpIcons.FileOpen: ImageVector
  get() {
    if (_FileOpen != null) {
      return _FileOpen!!
    }
    _FileOpen =
      ImageVector.Builder(
          name = "FileOpen",
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
            moveTo(6.31f, 21.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(4.5f, 19.69f)
            verticalLineTo(4.31f)
            quadTo(4.5f, 3.55f, 5.03f, 3.03f)
            reflectiveQuadTo(6.31f, 2.5f)
            horizontalLineTo(13.5f)
            quadToRelative(0.36f, 0f, 0.7f, 0.14f)
            reflectiveQuadToRelative(0.58f, 0.39f)
            lineToRelative(4.2f, 4.2f)
            quadToRelative(0.25f, 0.25f, 0.39f, 0.58f)
            reflectiveQuadTo(19.5f, 8.5f)
            verticalLineToRelative(5f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(18f, 13.5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(14.4f)
            quadToRelative(-0.39f, 0f, -0.65f, -0.26f)
            reflectiveQuadTo(13.5f, 7.6f)
            verticalLineTo(4f)
            horizontalLineTo(6.31f)
            quadTo(6.19f, 4f, 6.1f, 4.1f)
            reflectiveQuadTo(6f, 4.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(6.31f, 20f)
            horizontalLineTo(14.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(14.5f, 21.5f)
            horizontalLineTo(6.31f)
            close()
            moveTo(18.75f, 18.82f)
            verticalLineToRelative(1.84f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(18f, 21.41f)
            reflectiveQuadTo(17.47f, 21.19f)
            reflectiveQuadTo(17.25f, 20.66f)
            verticalLineTo(17.15f)
            quadToRelative(0f, -0.39f, 0.26f, -0.65f)
            reflectiveQuadToRelative(0.65f, -0.26f)
            horizontalLineToRelative(3.51f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(22.41f, 17f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(19.79f)
            lineToRelative(2.68f, 2.68f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.51f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            quadToRelative(-0.22f, 0.23f, -0.53f, 0.23f)
            reflectiveQuadTo(21.41f, 21.48f)
            lineTo(18.75f, 18.82f)
            close()
            moveTo(6f, 20f)
            verticalLineTo(14.25f)
            verticalLineTo(8.5f)
            verticalLineTo(4f)
            quadTo(6f, 4f, 6f, 4.1f)
            reflectiveQuadTo(6f, 4.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(6f, 20f)
            close()
          }
        }
        .buildSimpIcon()
    return _FileOpen!!
  }

private var _FileOpen: ImageVector? = null
