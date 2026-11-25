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
val SimpIcons.PushPin: ImageVector
  get() {
    if (_PushPin != null) {
      return _PushPin!!
    }
    _PushPin =
      ImageVector.Builder(
          name = "PushPin",
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
            moveTo(15.5f, 5f)
            verticalLineToRelative(7.21f)
            lineToRelative(1.57f, 1.57f)
            quadToRelative(0.11f, 0.11f, 0.17f, 0.25f)
            reflectiveQuadToRelative(0.06f, 0.29f)
            verticalLineToRelative(0.43f)
            quadToRelative(0f, 0.32f, -0.22f, 0.54f)
            reflectiveQuadTo(16.53f, 15.5f)
            horizontalLineTo(12.75f)
            verticalLineToRelative(5.39f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 21.64f)
            reflectiveQuadTo(11.47f, 21.42f)
            reflectiveQuadTo(11.25f, 20.89f)
            verticalLineTo(15.5f)
            horizontalLineTo(7.47f)
            quadToRelative(-0.32f, 0f, -0.54f, -0.22f)
            reflectiveQuadTo(6.71f, 14.74f)
            verticalLineTo(14.32f)
            quadToRelative(0f, -0.15f, 0.06f, -0.29f)
            reflectiveQuadTo(6.93f, 13.78f)
            lineTo(8.5f, 12.21f)
            verticalLineTo(5f)
            horizontalLineTo(8.25f)
            quadTo(7.93f, 5f, 7.72f, 4.78f)
            reflectiveQuadTo(7.5f, 4.25f)
            reflectiveQuadTo(7.72f, 3.72f)
            reflectiveQuadTo(8.25f, 3.5f)
            horizontalLineToRelative(7.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(16.5f, 4.25f)
            reflectiveQuadTo(16.28f, 4.78f)
            reflectiveQuadTo(15.75f, 5f)
            horizontalLineTo(15.5f)
            close()
            moveTo(8.85f, 14f)
            horizontalLineToRelative(6.3f)
            lineTo(14f, 12.85f)
            verticalLineTo(5f)
            horizontalLineTo(10f)
            verticalLineToRelative(7.85f)
            lineTo(8.85f, 14f)
            close()
            moveTo(12f, 14f)
            close()
          }
        }
        .buildSimpIcon()
    return _PushPin!!
  }

private var _PushPin: ImageVector? = null
