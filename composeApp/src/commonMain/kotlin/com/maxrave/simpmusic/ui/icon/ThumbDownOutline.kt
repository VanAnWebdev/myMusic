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
val SimpIcons.ThumbDownOutline: ImageVector
  get() {
    if (_ThumbDownOutline != null) {
      return _ThumbDownOutline!!
    }
    _ThumbDownOutline =
      ImageVector.Builder(
          name = "ThumbDownOutline",
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
            moveTo(3.31f, 15.5f)
            quadToRelative(-0.71f, 0f, -1.26f, -0.55f)
            reflectiveQuadTo(1.5f, 13.69f)
            verticalLineTo(12.08f)
            quadToRelative(0f, -0.16f, 0.04f, -0.34f)
            reflectiveQuadTo(1.63f, 11.4f)
            lineTo(4.5f, 4.64f)
            quadTo(4.71f, 4.16f, 5.22f, 3.83f)
            reflectiveQuadTo(6.27f, 3.5f)
            horizontalLineTo(16.79f)
            verticalLineToRelative(12f)
            lineToRelative(-5.82f, 5.77f)
            quadToRelative(-0.3f, 0.3f, -0.69f, 0.36f)
            reflectiveQuadTo(9.53f, 21.49f)
            reflectiveQuadTo(9f, 20.94f)
            reflectiveQuadTo(8.93f, 20.21f)
            lineTo(10.01f, 15.5f)
            horizontalLineTo(3.31f)
            close()
            moveTo(15.29f, 14.86f)
            verticalLineTo(5f)
            horizontalLineTo(6.27f)
            quadTo(6.16f, 5f, 6.05f, 5.06f)
            reflectiveQuadTo(5.88f, 5.25f)
            lineTo(3f, 12f)
            verticalLineToRelative(1.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(3.31f, 14f)
            horizontalLineToRelative(8.6f)
            lineToRelative(-1.25f, 5.48f)
            lineToRelative(4.64f, -4.62f)
            close()
            moveTo(19.69f, 3.5f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadTo(21.5f, 5.31f)
            verticalLineToRelative(8.38f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(19.69f, 15.5f)
            horizontalLineToRelative(-2.9f)
            verticalLineTo(14f)
            horizontalLineToRelative(2.9f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(20f, 13.69f)
            verticalLineTo(5.31f)
            quadTo(20f, 5.17f, 19.91f, 5.09f)
            reflectiveQuadTo(19.69f, 5f)
            horizontalLineToRelative(-2.9f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(2.9f)
            close()
            moveTo(15.29f, 5f)
            verticalLineToRelative(9.86f)
            verticalLineTo(14f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadToRelative(0f, -0.22f)
            verticalLineTo(12f)
            verticalLineTo(5.25f)
            quadToRelative(0f, -0.13f, 0f, -0.19f)
            reflectiveQuadTo(15.29f, 5f)
            close()
          }
        }
        .buildSimpIcon()
    return _ThumbDownOutline!!
  }

private var _ThumbDownOutline: ImageVector? = null
