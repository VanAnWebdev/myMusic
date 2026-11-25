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
val SimpIcons.Devices: ImageVector
  get() {
    if (_Devices != null) {
      return _Devices!!
    }
    _Devices =
      ImageVector.Builder(
          name = "Devices",
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
            moveTo(12.02f, 10.65f)
            close()
            moveTo(11.27f, 19.5f)
            horizontalLineTo(3.25f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(2.5f, 18.75f)
            reflectiveQuadTo(2.72f, 18.22f)
            reflectiveQuadTo(3.25f, 18f)
            horizontalLineToRelative(8.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(11.8f, 19.28f)
            reflectiveQuadTo(11.27f, 19.5f)
            close()
            moveTo(5.31f, 16.81f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 15f)
            verticalLineTo(6.31f)
            quadTo(3.5f, 5.55f, 4.03f, 5.03f)
            reflectiveQuadTo(5.31f, 4.5f)
            horizontalLineTo(19.67f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(20.21f, 5.78f)
            reflectiveQuadTo(19.67f, 6f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 6f, 5.1f, 6.1f)
            reflectiveQuadTo(5f, 6.31f)
            verticalLineTo(15f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadToRelative(0.21f, 0.1f)
            horizontalLineToRelative(5.96f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(11.8f, 16.59f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(5.31f)
            close()
            moveTo(20.1f, 17.84f)
            verticalLineTo(10.05f)
            quadToRelative(0f, -0.07f, -0.05f, -0.12f)
            reflectiveQuadTo(19.93f, 9.88f)
            horizontalLineTo(16.07f)
            quadTo(16f, 9.88f, 15.95f, 9.93f)
            reflectiveQuadTo(15.9f, 10.05f)
            verticalLineToRelative(7.79f)
            quadToRelative(0f, 0.07f, 0.05f, 0.12f)
            reflectiveQuadTo(16.07f, 18f)
            horizontalLineToRelative(3.87f)
            quadTo(20f, 18f, 20.05f, 17.95f)
            reflectiveQuadTo(20.1f, 17.84f)
            close()
            moveTo(15.76f, 19.5f)
            quadToRelative(-0.56f, 0f, -0.96f, -0.4f)
            reflectiveQuadTo(14.4f, 18.14f)
            verticalLineTo(9.74f)
            quadToRelative(0f, -0.56f, 0.4f, -0.96f)
            reflectiveQuadToRelative(0.96f, -0.4f)
            horizontalLineToRelative(4.48f)
            quadToRelative(0.56f, 0f, 0.96f, 0.4f)
            reflectiveQuadToRelative(0.4f, 0.96f)
            verticalLineToRelative(8.4f)
            quadToRelative(0f, 0.56f, -0.4f, 0.96f)
            reflectiveQuadToRelative(-0.96f, 0.4f)
            horizontalLineTo(15.76f)
            close()
            moveTo(18f, 12.5f)
            quadToRelative(0.31f, 0f, 0.51f, -0.21f)
            reflectiveQuadToRelative(0.2f, -0.5f)
            quadToRelative(0f, -0.31f, -0.2f, -0.51f)
            reflectiveQuadTo(18f, 11.08f)
            quadToRelative(-0.29f, 0f, -0.5f, 0.2f)
            reflectiveQuadToRelative(-0.21f, 0.51f)
            quadToRelative(0f, 0.29f, 0.21f, 0.5f)
            reflectiveQuadTo(18f, 12.5f)
            close()
            moveToRelative(0f, 1.44f)
            close()
          }
        }
        .buildSimpIcon()
    return _Devices!!
  }

private var _Devices: ImageVector? = null
