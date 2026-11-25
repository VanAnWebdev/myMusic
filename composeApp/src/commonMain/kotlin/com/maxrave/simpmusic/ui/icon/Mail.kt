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
val SimpIcons.Mail: ImageVector
  get() {
    if (_Mail != null) {
      return _Mail!!
    }
    _Mail =
      ImageVector.Builder(
          name = "Mail",
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
            moveTo(4.31f, 19.5f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(2.5f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(2.5f, 5.55f, 3.03f, 5.03f)
            reflectiveQuadTo(4.31f, 4.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(21.5f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(19.69f, 19.5f)
            horizontalLineTo(4.31f)
            close()
            moveTo(20f, 7.44f)
            lineToRelative(-7.51f, 4.81f)
            quadToRelative(-0.12f, 0.07f, -0.24f, 0.1f)
            reflectiveQuadTo(12f, 12.39f)
            reflectiveQuadTo(11.75f, 12.35f)
            reflectiveQuadToRelative(-0.24f, -0.1f)
            lineTo(4f, 7.44f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.13f, 0.09f, 0.22f)
            reflectiveQuadTo(4.31f, 18f)
            horizontalLineTo(19.69f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(7.44f)
            close()
            moveTo(12f, 11f)
            lineTo(19.85f, 6f)
            horizontalLineTo(4.15f)
            lineTo(12f, 11f)
            close()
            moveTo(4f, 7.44f)
            verticalLineTo(7.67f)
            quadTo(4f, 7.57f, 4f, 7.4f)
            reflectiveQuadTo(4f, 7.04f)
            quadTo(4f, 6.7f, 4f, 6.53f)
            reflectiveQuadTo(4f, 6.56f)
            verticalLineTo(6f)
            verticalLineTo(6.56f)
            quadTo(4f, 6.36f, 4f, 6.53f)
            reflectiveQuadTo(4f, 7.03f)
            quadToRelative(0f, 0.2f, 0f, 0.37f)
            reflectiveQuadTo(4f, 7.67f)
            verticalLineTo(7.44f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.09f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(7.44f)
            close()
          }
        }
        .buildSimpIcon()
    return _Mail!!
  }

private var _Mail: ImageVector? = null
