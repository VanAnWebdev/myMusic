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
val SimpIcons.LeftPanelOpen: ImageVector
  get() {
    if (_LeftPanelOpen != null) {
      return _LeftPanelOpen!!
    }
    _LeftPanelOpen =
      ImageVector.Builder(
          name = "LeftPanelOpen",
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
            moveTo(12.45f, 9.5f)
            verticalLineToRelative(5f)
            quadToRelative(0f, 0.31f, 0.28f, 0.43f)
            reflectiveQuadToRelative(0.5f, -0.11f)
            lineToRelative(2.19f, -2.19f)
            quadTo(15.69f, 12.36f, 15.69f, 12f)
            reflectiveQuadTo(15.42f, 11.37f)
            lineTo(13.22f, 9.18f)
            quadTo(13f, 8.96f, 12.73f, 9.07f)
            reflectiveQuadTo(12.45f, 9.5f)
            close()
            moveToRelative(-7.14f, 11f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(3.5f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(3.5f, 4.56f, 4.03f, 4.03f)
            reflectiveQuadTo(5.31f, 3.5f)
            horizontalLineTo(18.69f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadTo(20.5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(18.69f, 20.5f)
            horizontalLineTo(5.31f)
            close()
            moveTo(8f, 19f)
            verticalLineTo(5f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 5f, 5.1f, 5.1f)
            reflectiveQuadTo(5f, 5.31f)
            verticalLineTo(18.69f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(5.31f, 19f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1.5f, 0f)
            horizontalLineToRelative(9.19f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(19f, 18.69f)
            verticalLineTo(5.31f)
            quadTo(19f, 5.19f, 18.9f, 5.1f)
            reflectiveQuadTo(18.69f, 5f)
            horizontalLineTo(9.5f)
            verticalLineTo(19f)
            close()
            moveTo(8f, 19f)
            horizontalLineTo(5.31f)
            quadTo(5.19f, 19f, 5.1f, 19f)
            reflectiveQuadTo(5f, 19f)
            quadToRelative(0f, 0f, 0.1f, 0f)
            reflectiveQuadToRelative(0.21f, 0f)
            horizontalLineTo(8f)
            close()
          }
        }
        .buildSimpIcon()
    return _LeftPanelOpen!!
  }

private var _LeftPanelOpen: ImageVector? = null
