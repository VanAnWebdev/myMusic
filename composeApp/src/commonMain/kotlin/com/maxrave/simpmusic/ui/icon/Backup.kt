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
val SimpIcons.Backup: ImageVector
  get() {
    if (_Backup != null) {
      return _Backup!!
    }
    _Backup =
      ImageVector.Builder(
          name = "Backup",
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
            moveTo(11.25f, 12.22f)
            lineTo(9.92f, 13.53f)
            quadTo(9.71f, 13.74f, 9.4f, 13.74f)
            reflectiveQuadTo(8.87f, 13.52f)
            quadTo(8.66f, 13.31f, 8.66f, 12.99f)
            reflectiveQuadTo(8.87f, 12.46f)
            lineTo(11.37f, 9.97f)
            quadTo(11.64f, 9.7f, 12f, 9.7f)
            reflectiveQuadToRelative(0.63f, 0.27f)
            lineToRelative(2.49f, 2.49f)
            quadToRelative(0.21f, 0.21f, 0.22f, 0.52f)
            reflectiveQuadToRelative(-0.22f, 0.54f)
            quadToRelative(-0.21f, 0.21f, -0.52f, 0.21f)
            reflectiveQuadToRelative(-0.53f, -0.2f)
            lineTo(12.75f, 12.22f)
            verticalLineToRelative(5.48f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(13.06f, 18f)
            horizontalLineTo(18.5f)
            quadToRelative(1.05f, 0f, 1.78f, -0.73f)
            reflectiveQuadTo(21f, 15.5f)
            reflectiveQuadTo(20.28f, 13.73f)
            reflectiveQuadTo(18.5f, 13f)
            horizontalLineTo(17f)
            verticalLineTo(11f)
            quadTo(17f, 8.92f, 15.54f, 7.46f)
            reflectiveQuadTo(12f, 6f)
            quadTo(9.93f, 6f, 8.46f, 7.46f)
            reflectiveQuadTo(7f, 11f)
            horizontalLineTo(6.48f)
            quadTo(5.06f, 11f, 4.03f, 12.02f)
            reflectiveQuadTo(3f, 14.5f)
            reflectiveQuadToRelative(1.03f, 2.48f)
            reflectiveQuadTo(6.5f, 18f)
            horizontalLineTo(8.25f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(9f, 18.75f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(8.25f, 19.5f)
            horizontalLineTo(6.5f)
            quadToRelative(-2.07f, 0f, -3.54f, -1.44f)
            reflectiveQuadTo(1.5f, 14.55f)
            quadToRelative(0f, -1.86f, 1.2f, -3.28f)
            reflectiveQuadTo(5.67f, 9.59f)
            quadTo(6.15f, 7.35f, 7.93f, 5.93f)
            reflectiveQuadTo(12f, 4.5f)
            quadToRelative(2.72f, 0f, 4.61f, 1.89f)
            reflectiveQuadTo(18.5f, 11f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(0.31f)
            quadToRelative(1.58f, 0.12f, 2.64f, 1.27f)
            reflectiveQuadTo(22.5f, 15.5f)
            quadToRelative(0f, 1.67f, -1.15f, 2.84f)
            reflectiveQuadTo(18.52f, 19.5f)
            horizontalLineTo(13.06f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(11.25f, 17.69f)
            verticalLineTo(12.22f)
            close()
            moveTo(12f, 12.75f)
            close()
          }
        }
        .buildSimpIcon()
    return _Backup!!
  }

private var _Backup: ImageVector? = null
