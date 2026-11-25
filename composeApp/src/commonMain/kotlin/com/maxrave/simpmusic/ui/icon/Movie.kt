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
val SimpIcons.Movie: ImageVector
  get() {
    if (_Movie != null) {
      return _Movie!!
    }
    _Movie =
      ImageVector.Builder(
          name = "Movie",
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
            moveTo(4.31f, 4.5f)
            lineTo(5.68f, 7.25f)
            quadTo(5.86f, 7.6f, 6.18f, 7.8f)
            reflectiveQuadTo(6.88f, 8f)
            quadTo(7.63f, 8f, 8.03f, 7.36f)
            quadTo(8.43f, 6.72f, 8.08f, 6.05f)
            lineTo(7.31f, 4.5f)
            horizontalLineToRelative(2f)
            lineToRelative(1.37f, 2.75f)
            quadToRelative(0.17f, 0.35f, 0.5f, 0.55f)
            reflectiveQuadTo(11.88f, 8f)
            quadToRelative(0.75f, 0f, 1.15f, -0.64f)
            quadToRelative(0.4f, -0.64f, 0.05f, -1.31f)
            lineTo(12.31f, 4.5f)
            horizontalLineToRelative(2f)
            lineToRelative(1.37f, 2.75f)
            quadToRelative(0.17f, 0.35f, 0.5f, 0.55f)
            reflectiveQuadTo(16.88f, 8f)
            quadToRelative(0.75f, 0f, 1.15f, -0.64f)
            quadToRelative(0.4f, -0.64f, 0.05f, -1.31f)
            lineTo(17.31f, 4.5f)
            horizontalLineToRelative(2.38f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.69f, 19.5f)
            horizontalLineTo(4.31f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            close()
            moveTo(4f, 9.5f)
            verticalLineToRelative(8.19f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(4.31f, 18f)
            horizontalLineTo(19.69f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(9.5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, 0f)
            verticalLineToRelative(8.19f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(9.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Movie!!
  }

private var _Movie: ImageVector? = null
