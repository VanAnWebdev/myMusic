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
val SimpIcons.VolumeUp: ImageVector
  get() {
    if (_VolumeUp != null) {
      return _VolumeUp!!
    }
    _VolumeUp =
      ImageVector.Builder(
          name = "VolumeUp",
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
            moveTo(18.85f, 11.98f)
            quadToRelative(0f, -2.06f, -1.11f, -3.76f)
            reflectiveQuadTo(14.78f, 5.66f)
            quadTo(14.49f, 5.53f, 14.35f, 5.26f)
            reflectiveQuadTo(14.32f, 4.7f)
            quadTo(14.44f, 4.4f, 14.75f, 4.28f)
            reflectiveQuadTo(15.37f, 4.3f)
            quadToRelative(2.26f, 1.03f, 3.62f, 3.09f)
            reflectiveQuadToRelative(1.36f, 4.58f)
            reflectiveQuadToRelative(-1.36f, 4.58f)
            reflectiveQuadToRelative(-3.62f, 3.09f)
            quadToRelative(-0.31f, 0.14f, -0.62f, 0.02f)
            reflectiveQuadTo(14.32f, 19.25f)
            quadToRelative(-0.1f, -0.28f, 0.03f, -0.55f)
            reflectiveQuadToRelative(0.42f, -0.41f)
            quadToRelative(1.86f, -0.84f, 2.96f, -2.55f)
            reflectiveQuadToRelative(1.11f, -3.76f)
            close()
            moveTo(7.37f, 14.5f)
            horizontalLineTo(4.56f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(3.65f, 13.6f)
            verticalLineTo(10.4f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(4.56f, 9.5f)
            horizontalLineTo(7.37f)
            lineTo(10.36f, 6.51f)
            quadTo(10.72f, 6.15f, 11.19f, 6.35f)
            reflectiveQuadToRelative(0.47f, 0.7f)
            verticalLineToRelative(9.9f)
            quadToRelative(0f, 0.51f, -0.47f, 0.7f)
            reflectiveQuadTo(10.36f, 17.49f)
            lineTo(7.37f, 14.5f)
            close()
            moveTo(16.15f, 12f)
            quadToRelative(0f, 0.94f, -0.39f, 1.77f)
            reflectiveQuadToRelative(-1.05f, 1.4f)
            quadToRelative(-0.21f, 0.14f, -0.45f, 0.03f)
            reflectiveQuadTo(14.04f, 14.83f)
            verticalLineTo(9.12f)
            quadToRelative(0f, -0.26f, 0.23f, -0.37f)
            reflectiveQuadToRelative(0.45f, 0.03f)
            quadToRelative(0.66f, 0.59f, 1.05f, 1.44f)
            reflectiveQuadTo(16.15f, 12f)
            close()
            moveToRelative(-6f, -3.15f)
            lineTo(8f, 11f)
            horizontalLineTo(5.15f)
            verticalLineToRelative(2f)
            horizontalLineTo(8f)
            lineToRelative(2.15f, 2.15f)
            verticalLineTo(8.85f)
            close()
            moveTo(7.65f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _VolumeUp!!
  }

private var _VolumeUp: ImageVector? = null
