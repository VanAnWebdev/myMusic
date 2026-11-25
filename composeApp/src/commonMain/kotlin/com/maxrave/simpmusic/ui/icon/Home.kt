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
val SimpIcons.Home: ImageVector
  get() {
    if (_Home != null) {
      return _Home!!
    }
    _Home =
      ImageVector.Builder(
          name = "Home",
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
            moveTo(6f, 19f)
            horizontalLineTo(9.35f)
            verticalLineTo(13.96f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadToRelative(0.64f, -0.26f)
            horizontalLineToRelative(3.5f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            verticalLineTo(19f)
            horizontalLineTo(18f)
            verticalLineTo(10.15f)
            quadToRelative(0f, -0.08f, -0.03f, -0.14f)
            reflectiveQuadTo(17.87f, 9.9f)
            lineTo(12.18f, 5.63f)
            quadTo(12.11f, 5.56f, 12f, 5.56f)
            reflectiveQuadTo(11.82f, 5.63f)
            lineTo(6.13f, 9.9f)
            quadTo(6.07f, 9.95f, 6.03f, 10.01f)
            reflectiveQuadTo(6f, 10.15f)
            verticalLineTo(19f)
            close()
            moveTo(4.5f, 19f)
            verticalLineTo(10.15f)
            quadTo(4.5f, 9.72f, 4.69f, 9.34f)
            reflectiveQuadTo(5.22f, 8.71f)
            lineTo(10.92f, 4.42f)
            quadTo(11.39f, 4.06f, 12f, 4.06f)
            reflectiveQuadToRelative(1.09f, 0.36f)
            lineToRelative(5.69f, 4.29f)
            quadToRelative(0.34f, 0.25f, 0.53f, 0.63f)
            reflectiveQuadToRelative(0.19f, 0.81f)
            verticalLineTo(19f)
            quadToRelative(0f, 0.61f, -0.44f, 1.06f)
            reflectiveQuadTo(18f, 20.5f)
            horizontalLineTo(14.06f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(13.15f, 19.6f)
            verticalLineTo(14.56f)
            horizontalLineTo(10.85f)
            verticalLineTo(19.6f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(9.94f, 20.5f)
            horizontalLineTo(6f)
            quadToRelative(-0.61f, 0f, -1.06f, -0.44f)
            reflectiveQuadTo(4.5f, 19f)
            close()
            moveTo(12f, 12.27f)
            close()
          }
        }
        .buildSimpIcon()
    return _Home!!
  }

private var _Home: ImageVector? = null
