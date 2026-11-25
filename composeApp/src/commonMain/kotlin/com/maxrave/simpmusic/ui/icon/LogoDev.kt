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
val SimpIcons.LogoDev: ImageVector
  get() {
    if (_LogoDev != null) {
      return _LogoDev!!
    }
    _LogoDev =
      ImageVector.Builder(
          name = "LogoDev",
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
            moveTo(8.27f, 14.85f)
            quadToRelative(0.49f, 0f, 0.84f, -0.35f)
            reflectiveQuadTo(9.46f, 13.65f)
            verticalLineTo(10.34f)
            quadTo(9.46f, 9.85f, 9.12f, 9.5f)
            reflectiveQuadTo(8.27f, 9.15f)
            horizontalLineTo(6.69f)
            quadToRelative(-0.26f, 0f, -0.43f, 0.17f)
            reflectiveQuadTo(6.1f, 9.75f)
            verticalLineToRelative(4.5f)
            quadToRelative(0f, 0.26f, 0.17f, 0.43f)
            reflectiveQuadToRelative(0.43f, 0.17f)
            horizontalLineTo(8.27f)
            close()
            moveTo(7.07f, 13.87f)
            verticalLineTo(10.13f)
            horizontalLineToRelative(1.2f)
            quadToRelative(0.11f, 0f, 0.16f, 0.05f)
            reflectiveQuadToRelative(0.05f, 0.16f)
            verticalLineToRelative(3.31f)
            quadToRelative(0f, 0.11f, -0.05f, 0.16f)
            reflectiveQuadTo(8.27f, 13.87f)
            horizontalLineTo(7.07f)
            close()
            moveToRelative(3.88f, 0.98f)
            horizontalLineToRelative(1.8f)
            quadToRelative(0.2f, 0f, 0.33f, -0.15f)
            reflectiveQuadToRelative(0.14f, -0.36f)
            quadToRelative(0f, -0.2f, -0.14f, -0.33f)
            reflectiveQuadTo(12.76f, 13.87f)
            horizontalLineTo(11.2f)
            verticalLineToRelative(-1.4f)
            horizontalLineToRelative(0.86f)
            quadToRelative(0.21f, 0f, 0.35f, -0.14f)
            reflectiveQuadToRelative(0.14f, -0.35f)
            reflectiveQuadTo(12.41f, 11.63f)
            reflectiveQuadTo(12.06f, 11.5f)
            horizontalLineTo(11.2f)
            verticalLineTo(10.13f)
            horizontalLineToRelative(1.54f)
            quadToRelative(0.21f, 0f, 0.35f, -0.14f)
            reflectiveQuadTo(13.23f, 9.64f)
            reflectiveQuadTo(13.09f, 9.29f)
            reflectiveQuadTo(12.74f, 9.15f)
            horizontalLineTo(10.95f)
            quadToRelative(-0.31f, 0f, -0.52f, 0.21f)
            reflectiveQuadTo(10.22f, 9.88f)
            verticalLineToRelative(4.23f)
            quadToRelative(0f, 0.31f, 0.21f, 0.52f)
            reflectiveQuadToRelative(0.52f, 0.21f)
            close()
            moveToRelative(5.55f, -0.22f)
            quadToRelative(0.22f, -0.21f, 0.3f, -0.51f)
            lineTo(17.97f, 9.77f)
            quadTo(18.04f, 9.54f, 17.89f, 9.35f)
            reflectiveQuadTo(17.5f, 9.15f)
            quadToRelative(-0.17f, 0f, -0.3f, 0.1f)
            reflectiveQuadTo(17.01f, 9.52f)
            lineTo(15.98f, 13.4f)
            lineTo(14.91f, 9.51f)
            quadTo(14.86f, 9.34f, 14.73f, 9.25f)
            reflectiveQuadTo(14.43f, 9.15f)
            quadToRelative(-0.25f, 0f, -0.39f, 0.19f)
            reflectiveQuadTo(13.96f, 9.77f)
            lineToRelative(1.18f, 4.34f)
            quadToRelative(0.07f, 0.31f, 0.3f, 0.51f)
            reflectiveQuadToRelative(0.53f, 0.21f)
            reflectiveQuadToRelative(0.53f, -0.21f)
            close()
            moveTo(5.31f, 20.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.55f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(20.5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveToRelative(0f, -1.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(19f, 5.19f, 18.9f, 5.1f)
            reflectiveQuadTo(18.69f, 5f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 5f, 5.1f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            close()
            moveTo(5f, 5f)
            quadTo(5f, 5f, 5f, 5.09f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(5f, 19f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(5f, 5.17f, 5f, 5.09f)
            reflectiveQuadTo(5f, 5f)
            close()
          }
        }
        .buildSimpIcon()
    return _LogoDev!!
  }

private var _LogoDev: ImageVector? = null
