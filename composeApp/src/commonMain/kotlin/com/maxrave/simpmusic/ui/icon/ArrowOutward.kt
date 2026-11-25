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
val SimpIcons.ArrowOutward: ImageVector
  get() {
    if (_ArrowOutward != null) {
      return _ArrowOutward!!
    }
    _ArrowOutward =
      ImageVector.Builder(
          name = "ArrowOutward",
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
            moveTo(16.14f, 7.8f)
            lineTo(6.81f, 17.13f)
            quadTo(6.6f, 17.33f, 6.29f, 17.33f)
            reflectiveQuadTo(5.77f, 17.12f)
            reflectiveQuadTo(5.56f, 16.6f)
            reflectiveQuadTo(5.77f, 16.08f)
            lineTo(15.09f, 6.75f)
            horizontalLineTo(6.89f)
            quadTo(6.58f, 6.75f, 6.36f, 6.53f)
            reflectiveQuadTo(6.14f, 6f)
            reflectiveQuadTo(6.36f, 5.47f)
            reflectiveQuadTo(6.89f, 5.25f)
            horizontalLineToRelative(9.85f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            verticalLineTo(16f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(16.36f, 16.53f)
            reflectiveQuadTo(16.14f, 16f)
            verticalLineTo(7.8f)
            close()
          }
        }
        .buildSimpIcon()
    return _ArrowOutward!!
  }

private var _ArrowOutward: ImageVector? = null
