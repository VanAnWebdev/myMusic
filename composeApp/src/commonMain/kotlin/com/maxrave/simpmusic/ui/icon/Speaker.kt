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
val SimpIcons.Speaker: ImageVector
  get() {
    if (_Speaker != null) {
      return _Speaker!!
    }
    _Speaker =
      ImageVector.Builder(
          name = "Speaker",
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
            moveTo(16.69f, 21.5f)
            horizontalLineTo(7.31f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(5.5f, 19.69f)
            verticalLineTo(4.31f)
            quadTo(5.5f, 3.56f, 6.03f, 3.03f)
            reflectiveQuadTo(7.31f, 2.5f)
            horizontalLineToRelative(9.38f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadTo(18.5f, 4.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(16.69f, 21.5f)
            close()
            moveToRelative(0f, -1.5f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(17f, 19.69f)
            verticalLineTo(4.31f)
            quadTo(17f, 4.17f, 16.91f, 4.09f)
            reflectiveQuadTo(16.69f, 4f)
            horizontalLineTo(7.31f)
            quadTo(7.17f, 4f, 7.09f, 4.09f)
            reflectiveQuadTo(7f, 4.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(7.31f, 20f)
            horizontalLineToRelative(9.38f)
            close()
            moveTo(13.28f, 8.28f)
            quadTo(13.81f, 7.75f, 13.81f, 7f)
            reflectiveQuadTo(13.28f, 5.72f)
            reflectiveQuadTo(12f, 5.19f)
            reflectiveQuadTo(10.72f, 5.72f)
            reflectiveQuadTo(10.19f, 7f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            reflectiveQuadTo(12f, 8.81f)
            reflectiveQuadTo(13.28f, 8.28f)
            close()
            moveToRelative(1.36f, 9.36f)
            quadTo(15.73f, 16.54f, 15.73f, 15f)
            reflectiveQuadTo(14.64f, 12.36f)
            reflectiveQuadTo(12f, 11.27f)
            reflectiveQuadTo(9.36f, 12.36f)
            reflectiveQuadTo(8.27f, 15f)
            reflectiveQuadToRelative(1.09f, 2.64f)
            reflectiveQuadTo(12f, 18.73f)
            reflectiveQuadToRelative(2.64f, -1.09f)
            close()
            moveTo(10.42f, 16.58f)
            quadTo(9.77f, 15.92f, 9.77f, 15f)
            reflectiveQuadToRelative(0.65f, -1.58f)
            reflectiveQuadTo(12f, 12.77f)
            reflectiveQuadToRelative(1.58f, 0.65f)
            reflectiveQuadTo(14.23f, 15f)
            reflectiveQuadToRelative(-0.65f, 1.58f)
            reflectiveQuadTo(12f, 17.23f)
            reflectiveQuadTo(10.42f, 16.58f)
            close()
            moveTo(7f, 4f)
            quadTo(7f, 4f, 7f, 4.09f)
            reflectiveQuadTo(7f, 4.31f)
            verticalLineTo(19.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(7f, 20f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(7f, 19.69f)
            verticalLineTo(4.31f)
            quadTo(7f, 4.17f, 7f, 4.09f)
            reflectiveQuadTo(7f, 4f)
            close()
          }
        }
        .buildSimpIcon()
    return _Speaker!!
  }

private var _Speaker: ImageVector? = null
