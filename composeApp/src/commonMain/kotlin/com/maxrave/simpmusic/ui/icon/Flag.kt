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
val SimpIcons.Flag: ImageVector
  get() {
    if (_Flag != null) {
      return _Flag!!
    }
    _Flag =
      ImageVector.Builder(
          name = "Flag",
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
            moveTo(7f, 13.5f)
            verticalLineTo(20f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(6.25f, 20.75f)
            reflectiveQuadTo(5.72f, 20.53f)
            reflectiveQuadTo(5.5f, 20f)
            verticalLineTo(5.4f)
            quadTo(5.5f, 5.02f, 5.76f, 4.76f)
            reflectiveQuadTo(6.4f, 4.5f)
            horizontalLineToRelative(6.44f)
            quadToRelative(0.32f, 0f, 0.57f, 0.2f)
            reflectiveQuadToRelative(0.32f, 0.52f)
            lineTo(14f, 6.5f)
            horizontalLineToRelative(4.6f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(19.5f, 7.4f)
            verticalLineToRelative(7.2f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(18.6f, 15.5f)
            horizontalLineTo(14.15f)
            quadToRelative(-0.32f, 0f, -0.57f, -0.2f)
            reflectiveQuadTo(13.26f, 14.78f)
            lineTo(13f, 13.5f)
            horizontalLineTo(7f)
            close()
            moveTo(14.65f, 14f)
            horizontalLineTo(18f)
            verticalLineTo(8f)
            horizontalLineTo(13.5f)
            quadTo(13.18f, 8f, 12.93f, 7.8f)
            reflectiveQuadTo(12.61f, 7.28f)
            lineTo(12.35f, 6f)
            horizontalLineTo(7f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6.5f)
            quadToRelative(0.32f, 0f, 0.57f, 0.2f)
            reflectiveQuadToRelative(0.32f, 0.52f)
            lineTo(14.65f, 14f)
            close()
            moveTo(12.5f, 10f)
            close()
          }
        }
        .buildSimpIcon()
    return _Flag!!
  }

private var _Flag: ImageVector? = null
