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
val SimpIcons.Bluetooth: ImageVector
  get() {
    if (_Bluetooth != null) {
      return _Bluetooth!!
    }
    _Bluetooth =
      ImageVector.Builder(
          name = "Bluetooth",
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
            moveTo(11.25f, 20.22f)
            verticalLineTo(13.8f)
            lineTo(6.93f, 18.13f)
            quadTo(6.72f, 18.33f, 6.4f, 18.34f)
            reflectiveQuadTo(5.87f, 18.13f)
            reflectiveQuadTo(5.66f, 17.6f)
            reflectiveQuadTo(5.87f, 17.07f)
            lineTo(10.95f, 12f)
            lineTo(5.87f, 6.93f)
            quadTo(5.67f, 6.72f, 5.66f, 6.4f)
            reflectiveQuadTo(5.87f, 5.87f)
            reflectiveQuadTo(6.4f, 5.66f)
            reflectiveQuadTo(6.93f, 5.87f)
            lineToRelative(4.32f, 4.32f)
            verticalLineTo(3.78f)
            quadToRelative(0f, -0.41f, 0.28f, -0.67f)
            reflectiveQuadTo(12.15f, 2.86f)
            quadToRelative(0.17f, 0f, 0.33f, 0.07f)
            reflectiveQuadToRelative(0.3f, 0.21f)
            lineToRelative(3.93f, 3.93f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadTo(16.98f, 7.7f)
            reflectiveQuadTo(16.92f, 8.04f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineTo(13.05f, 12f)
            lineToRelative(3.67f, 3.67f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadToRelative(0.06f, 0.34f)
            reflectiveQuadToRelative(-0.06f, 0.34f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineToRelative(-3.93f, 3.93f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.21f)
            reflectiveQuadToRelative(-0.33f, 0.07f)
            quadToRelative(-0.35f, 0f, -0.63f, -0.25f)
            reflectiveQuadTo(11.25f, 20.22f)
            close()
            moveTo(12.75f, 10.2f)
            lineToRelative(2.5f, -2.5f)
            lineTo(12.75f, 5.23f)
            verticalLineTo(10.2f)
            close()
            moveToRelative(0f, 8.57f)
            lineToRelative(2.5f, -2.47f)
            lineToRelative(-2.5f, -2.5f)
            verticalLineToRelative(4.96f)
            close()
          }
        }
        .buildSimpIcon()
    return _Bluetooth!!
  }

private var _Bluetooth: ImageVector? = null
