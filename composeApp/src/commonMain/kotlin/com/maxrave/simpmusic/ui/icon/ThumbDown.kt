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
val SimpIcons.ThumbDown: ImageVector
  get() {
    if (_ThumbDown != null) {
      return _ThumbDown!!
    }
    _ThumbDown =
      ImageVector.Builder(
          name = "ThumbDown",
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
            quadToRelative(0f, -0.16f, 0.03f, -0.34f)
            reflectiveQuadTo(1.63f, 11.4f)
            lineTo(4.5f, 4.64f)
            quadTo(4.71f, 4.16f, 5.22f, 3.83f)
            reflectiveQuadTo(6.27f, 3.5f)
            horizontalLineToRelative(8.1f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            verticalLineToRelative(9.44f)
            quadToRelative(0f, 0.36f, -0.15f, 0.7f)
            reflectiveQuadToRelative(-0.39f, 0.58f)
            lineToRelative(-5.29f, 5.26f)
            quadToRelative(-0.3f, 0.28f, -0.69f, 0.35f)
            reflectiveQuadTo(8.9f, 21.51f)
            reflectiveQuadTo(8.38f, 20.98f)
            reflectiveQuadTo(8.32f, 20.22f)
            lineTo(9.39f, 15.5f)
            horizontalLineTo(3.31f)
            close()
            moveTo(19.69f, 3.5f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadTo(21.5f, 5.31f)
            verticalLineToRelative(8.38f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(19.69f, 15.5f)
            horizontalLineTo(19.48f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(17.67f, 13.69f)
            verticalLineTo(5.3f)
            quadToRelative(0f, -0.75f, 0.53f, -1.27f)
            reflectiveQuadTo(19.48f, 3.5f)
            horizontalLineToRelative(0.21f)
            close()
          }
        }
        .buildSimpIcon()
    return _ThumbDown!!
  }

private var _ThumbDown: ImageVector? = null
