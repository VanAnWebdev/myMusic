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
val SimpIcons.IosShare: ImageVector
  get() {
    if (_IosShare != null) {
      return _IosShare!!
    }
    _IosShare =
      ImageVector.Builder(
          name = "IosShare",
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
            moveTo(6.31f, 21.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(4.5f, 19.69f)
            verticalLineTo(10.31f)
            quadTo(4.5f, 9.55f, 5.03f, 9.03f)
            reflectiveQuadTo(6.31f, 8.5f)
            horizontalLineTo(8.12f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(8.87f, 9.25f)
            reflectiveQuadTo(8.65f, 9.78f)
            reflectiveQuadTo(8.12f, 10f)
            horizontalLineTo(6.31f)
            quadTo(6.19f, 10f, 6.1f, 10.1f)
            reflectiveQuadTo(6f, 10.31f)
            verticalLineToRelative(9.38f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(6.31f, 20f)
            horizontalLineTo(17.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(18f, 19.69f)
            verticalLineTo(10.31f)
            quadTo(18f, 10.19f, 17.9f, 10.1f)
            reflectiveQuadTo(17.69f, 10f)
            horizontalLineTo(15.88f)
            quadTo(15.57f, 10f, 15.35f, 9.78f)
            reflectiveQuadTo(15.13f, 9.25f)
            reflectiveQuadTo(15.35f, 8.72f)
            reflectiveQuadTo(15.88f, 8.5f)
            horizontalLineToRelative(1.81f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadToRelative(0.52f, 1.28f)
            verticalLineToRelative(9.38f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(17.69f, 21.5f)
            horizontalLineTo(6.31f)
            close()
            moveToRelative(5.16f, -5.97f)
            quadTo(11.25f, 15.32f, 11.25f, 15f)
            verticalLineTo(4.72f)
            lineTo(9.93f, 6.04f)
            quadTo(9.7f, 6.27f, 9.4f, 6.26f)
            reflectiveQuadTo(8.87f, 6.03f)
            quadTo(8.66f, 5.79f, 8.65f, 5.5f)
            reflectiveQuadTo(8.87f, 4.97f)
            lineTo(11.37f, 2.48f)
            quadToRelative(0.14f, -0.14f, 0.3f, -0.2f)
            reflectiveQuadTo(12f, 2.22f)
            reflectiveQuadToRelative(0.34f, 0.06f)
            reflectiveQuadToRelative(0.3f, 0.2f)
            lineToRelative(2.49f, 2.49f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.51f)
            reflectiveQuadTo(15.13f, 6.03f)
            quadTo(14.89f, 6.26f, 14.59f, 6.26f)
            reflectiveQuadTo(14.06f, 6.03f)
            lineTo(12.75f, 4.72f)
            verticalLineTo(15f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 15.75f)
            reflectiveQuadTo(11.47f, 15.53f)
            close()
          }
        }
        .buildSimpIcon()
    return _IosShare!!
  }

private var _IosShare: ImageVector? = null
