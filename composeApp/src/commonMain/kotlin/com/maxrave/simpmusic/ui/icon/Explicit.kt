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
val SimpIcons.Explicit: ImageVector
  get() {
    if (_Explicit != null) {
      return _Explicit!!
    }
    _Explicit =
      ImageVector.Builder(
          name = "Explicit",
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
            moveTo(10.75f, 15.25f)
            verticalLineToRelative(-2.5f)
            horizontalLineTo(14f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(14.75f, 12f)
            reflectiveQuadTo(14.53f, 11.47f)
            reflectiveQuadTo(14f, 11.25f)
            horizontalLineTo(10.75f)
            verticalLineTo(8.75f)
            horizontalLineTo(14f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(14.75f, 8f)
            reflectiveQuadTo(14.53f, 7.47f)
            reflectiveQuadTo(14f, 7.25f)
            horizontalLineTo(10f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(9.25f, 8f)
            verticalLineToRelative(8f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(10f, 16.75f)
            horizontalLineToRelative(4f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(14.75f, 16f)
            reflectiveQuadTo(14.53f, 15.47f)
            reflectiveQuadTo(14f, 15.25f)
            horizontalLineTo(10.75f)
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
    return _Explicit!!
  }

private var _Explicit: ImageVector? = null
