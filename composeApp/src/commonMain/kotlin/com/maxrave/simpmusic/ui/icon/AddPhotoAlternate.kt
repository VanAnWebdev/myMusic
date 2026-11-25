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
val SimpIcons.AddPhotoAlternate: ImageVector
  get() {
    if (_AddPhotoAlternate != null) {
      return _AddPhotoAlternate!!
    }
    _AddPhotoAlternate =
      ImageVector.Builder(
          name = "AddPhotoAlternate",
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
            moveTo(12f, 12f)
            close()
            moveTo(5.31f, 20.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.55f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineToRelative(6.75f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(12.59f, 4.78f)
            reflectiveQuadTo(12.06f, 5f)
            horizontalLineTo(5.31f)
            quadTo(5.17f, 5f, 5.09f, 5.09f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(5.31f, 19f)
            horizontalLineTo(18.69f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(11.94f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(6.75f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveTo(6.38f, 16.69f)
            horizontalLineTo(17.62f)
            lineTo(14.12f, 12.04f)
            lineToRelative(-3f, 3.89f)
            lineTo(9f, 13.23f)
            lineTo(6.38f, 16.69f)
            close()
            moveTo(17f, 7f)
            horizontalLineTo(15.75f)
            quadTo(15.43f, 7f, 15.22f, 6.78f)
            reflectiveQuadTo(15f, 6.25f)
            reflectiveQuadTo(15.22f, 5.72f)
            reflectiveQuadTo(15.75f, 5.5f)
            horizontalLineTo(17f)
            verticalLineTo(4.25f)
            quadTo(17f, 3.93f, 17.22f, 3.72f)
            reflectiveQuadTo(17.75f, 3.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(18.5f, 4.25f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(1.25f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.5f, 6.25f)
            reflectiveQuadTo(20.28f, 6.78f)
            reflectiveQuadTo(19.75f, 7f)
            horizontalLineTo(18.5f)
            verticalLineTo(8.25f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(17.75f, 9f)
            reflectiveQuadTo(17.22f, 8.78f)
            reflectiveQuadTo(17f, 8.25f)
            verticalLineTo(7f)
            close()
          }
        }
        .buildSimpIcon()
    return _AddPhotoAlternate!!
  }

private var _AddPhotoAlternate: ImageVector? = null
