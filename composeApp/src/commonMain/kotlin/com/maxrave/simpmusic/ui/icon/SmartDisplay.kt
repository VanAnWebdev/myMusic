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
val SimpIcons.SmartDisplay: ImageVector
  get() {
    if (_SmartDisplay != null) {
      return _SmartDisplay!!
    }
    _SmartDisplay =
      ImageVector.Builder(
          name = "SmartDisplay",
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
            moveTo(10.45f, 15.59f)
            lineToRelative(5f, -3.2f)
            quadTo(15.65f, 12.25f, 15.65f, 12f)
            reflectiveQuadTo(15.45f, 11.61f)
            lineToRelative(-5f, -3.2f)
            quadTo(10.22f, 8.26f, 9.98f, 8.39f)
            reflectiveQuadTo(9.75f, 8.79f)
            verticalLineToRelative(6.42f)
            quadToRelative(0f, 0.27f, 0.23f, 0.4f)
            reflectiveQuadToRelative(0.46f, -0.02f)
            close()
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
            moveToRelative(0f, -1.5f)
            horizontalLineTo(19.69f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(20f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(20f, 6.19f, 19.9f, 6.1f)
            reflectiveQuadTo(19.69f, 6f)
            horizontalLineTo(4.31f)
            quadTo(4.19f, 6f, 4.1f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(4.31f, 18f)
            close()
            moveTo(4f, 18f)
            quadToRelative(0f, 0f, 0f, -0.1f)
            reflectiveQuadTo(4f, 17.69f)
            verticalLineTo(6.31f)
            quadTo(4f, 6.19f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6f)
            quadTo(4f, 6f, 4f, 6.1f)
            reflectiveQuadTo(4f, 6.31f)
            verticalLineTo(17.69f)
            quadToRelative(0f, 0.12f, 0f, 0.21f)
            reflectiveQuadTo(4f, 18f)
            close()
          }
        }
        .buildSimpIcon()
    return _SmartDisplay!!
  }

private var _SmartDisplay: ImageVector? = null
