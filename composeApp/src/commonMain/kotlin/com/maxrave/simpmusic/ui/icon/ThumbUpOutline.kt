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
val SimpIcons.ThumbUpOutline: ImageVector
  get() {
    if (_ThumbUpOutline != null) {
      return _ThumbUpOutline!!
    }
    _ThumbUpOutline =
      ImageVector.Builder(
          name = "ThumbUpOutline",
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
            moveTo(20.69f, 8.5f)
            quadToRelative(0.71f, 0f, 1.26f, 0.55f)
            reflectiveQuadToRelative(0.55f, 1.26f)
            verticalLineToRelative(1.62f)
            quadToRelative(0f, 0.16f, -0.04f, 0.34f)
            reflectiveQuadTo(22.37f, 12.6f)
            lineTo(19.5f, 19.36f)
            quadToRelative(-0.21f, 0.48f, -0.72f, 0.81f)
            reflectiveQuadTo(17.73f, 20.5f)
            horizontalLineTo(7.21f)
            verticalLineTo(8.5f)
            lineTo(13.03f, 2.73f)
            quadToRelative(0.3f, -0.3f, 0.69f, -0.36f)
            reflectiveQuadToRelative(0.75f, 0.13f)
            reflectiveQuadTo(15f, 3.06f)
            reflectiveQuadToRelative(0.07f, 0.73f)
            lineTo(13.99f, 8.5f)
            horizontalLineToRelative(6.7f)
            close()
            moveTo(8.71f, 9.14f)
            verticalLineTo(19f)
            horizontalLineToRelative(9.02f)
            quadToRelative(0.11f, 0f, 0.22f, -0.06f)
            reflectiveQuadToRelative(0.17f, -0.19f)
            lineTo(21f, 12f)
            verticalLineTo(10.31f)
            quadToRelative(0f, -0.13f, -0.09f, -0.22f)
            reflectiveQuadTo(20.69f, 10f)
            horizontalLineTo(12.1f)
            lineTo(13.35f, 4.52f)
            lineTo(8.71f, 9.14f)
            close()
            moveTo(4.31f, 20.5f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(2.5f, 18.69f)
            verticalLineTo(10.31f)
            quadTo(2.5f, 9.56f, 3.03f, 9.03f)
            reflectiveQuadTo(4.31f, 8.5f)
            horizontalLineToRelative(2.9f)
            verticalLineTo(10f)
            horizontalLineTo(4.31f)
            quadTo(4.17f, 10f, 4.09f, 10.09f)
            reflectiveQuadTo(4f, 10.31f)
            verticalLineToRelative(8.38f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(4.31f, 19f)
            horizontalLineToRelative(2.9f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(4.31f)
            close()
            moveTo(8.71f, 19f)
            verticalLineTo(9.14f)
            verticalLineTo(10f)
            quadToRelative(0f, 0f, 0f, 0.09f)
            reflectiveQuadToRelative(0f, 0.22f)
            verticalLineTo(12f)
            verticalLineToRelative(6.75f)
            quadToRelative(0f, 0.13f, 0f, 0.19f)
            reflectiveQuadToRelative(0f, 0.06f)
            close()
          }
        }
        .buildSimpIcon()
    return _ThumbUpOutline!!
  }

private var _ThumbUpOutline: ImageVector? = null
