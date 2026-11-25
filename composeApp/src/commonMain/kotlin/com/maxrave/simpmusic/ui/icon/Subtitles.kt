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
val SimpIcons.Subtitles: ImageVector
  get() {
    if (_Subtitles != null) {
      return _Subtitles!!
    }
    _Subtitles =
      ImageVector.Builder(
          name = "Subtitles",
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
            moveTo(4.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.69f, 19.5f)
            horizontalLineTo(4.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(20f, 6.19f, 19.9f, 6.1f)
            reflectiveQuadTo(19.69f, 6f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 6f, 4.1f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(4.31f, 18f)
            close()
            moveTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(4f, 6.19f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6f)
            quadTo(4f, 6f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(4f, 18f)
            close()
            moveTo(7.04f, 15.71f)
            horizontalLineToRelative(6.42f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(14f, 14.43f)
            reflectiveQuadTo(13.46f, 14.21f)
            horizontalLineTo(7.04f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.29f, 14.96f)
            reflectiveQuadTo(6.5f, 15.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            close()
            moveToRelative(3.5f, -3.79f)
            horizontalLineToRelative(6.42f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(17.5f, 10.64f)
            reflectiveQuadTo(16.96f, 10.42f)
            horizontalLineTo(10.54f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(9.79f, 11.17f)
            reflectiveQuadTo(10f, 11.71f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            close()
            moveTo(7.57f, 11.71f)
            quadTo(7.79f, 11.49f, 7.79f, 11.17f)
            reflectiveQuadTo(7.57f, 10.64f)
            reflectiveQuadTo(7.04f, 10.42f)
            reflectiveQuadTo(6.5f, 10.64f)
            reflectiveQuadTo(6.29f, 11.17f)
            reflectiveQuadTo(6.5f, 11.71f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(7.57f, 11.71f)
            close()
            moveTo(17.5f, 15.5f)
            quadToRelative(0.22f, -0.22f, 0.22f, -0.53f)
            reflectiveQuadTo(17.5f, 14.43f)
            reflectiveQuadTo(16.96f, 14.21f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(17.5f, 15.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Subtitles!!
  }

private var _Subtitles: ImageVector? = null
