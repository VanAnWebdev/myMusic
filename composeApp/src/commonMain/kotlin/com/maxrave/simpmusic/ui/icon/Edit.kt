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
val SimpIcons.Edit: ImageVector
  get() {
    if (_Edit != null) {
      return _Edit!!
    }
    _Edit =
      ImageVector.Builder(
          name = "Edit",
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
            moveTo(5f, 19f)
            horizontalLineTo(6.26f)
            lineTo(16.5f, 8.76f)
            lineTo(15.24f, 7.5f)
            lineTo(5f, 17.74f)
            verticalLineTo(19f)
            close()
            moveTo(4.4f, 20.5f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(3.5f, 19.6f)
            verticalLineTo(17.86f)
            quadToRelative(0f, -0.37f, 0.14f, -0.7f)
            reflectiveQuadTo(4.03f, 16.59f)
            lineTo(16.69f, 3.93f)
            quadToRelative(0.23f, -0.21f, 0.5f, -0.32f)
            reflectiveQuadTo(17.77f, 3.5f)
            reflectiveQuadToRelative(0.58f, 0.11f)
            reflectiveQuadToRelative(0.5f, 0.34f)
            lineToRelative(1.22f, 1.24f)
            quadTo(20.3f, 5.4f, 20.4f, 5.68f)
            reflectiveQuadToRelative(0.1f, 0.57f)
            quadToRelative(0f, 0.3f, -0.1f, 0.58f)
            reflectiveQuadToRelative(-0.33f, 0.5f)
            lineTo(7.41f, 19.97f)
            quadTo(7.17f, 20.22f, 6.83f, 20.36f)
            reflectiveQuadTo(6.14f, 20.5f)
            horizontalLineTo(4.4f)
            close()
            moveTo(19.01f, 6.25f)
            lineTo(17.75f, 4.99f)
            lineToRelative(1.26f, 1.26f)
            close()
            moveToRelative(-3.15f, 1.9f)
            lineTo(15.24f, 7.5f)
            lineTo(16.5f, 8.76f)
            lineTo(15.86f, 8.14f)
            close()
          }
        }
        .buildSimpIcon()
    return _Edit!!
  }

private var _Edit: ImageVector? = null
