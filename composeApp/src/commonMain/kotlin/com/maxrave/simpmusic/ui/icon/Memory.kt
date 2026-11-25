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
val SimpIcons.Memory: ImageVector
  get() {
    if (_Memory != null) {
      return _Memory!!
    }
    _Memory =
      ImageVector.Builder(
          name = "Memory",
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
            moveTo(9.5f, 13.6f)
            verticalLineTo(10.4f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(10.4f, 9.5f)
            horizontalLineTo(13.6f)
            quadToRelative(0.38f, 0f, 0.64f, 0.26f)
            reflectiveQuadTo(14.5f, 10.4f)
            verticalLineTo(13.6f)
            quadToRelative(0f, 0.38f, -0.26f, 0.64f)
            reflectiveQuadTo(13.6f, 14.5f)
            horizontalLineTo(10.4f)
            quadToRelative(-0.38f, 0f, -0.64f, -0.26f)
            reflectiveQuadTo(9.5f, 13.6f)
            close()
            moveTo(11f, 13f)
            horizontalLineToRelative(2f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            verticalLineToRelative(2f)
            close()
            moveTo(9.25f, 19.52f)
            verticalLineTo(18.5f)
            horizontalLineTo(7.31f)
            quadToRelative(-0.76f, 0f, -1.28f, -0.52f)
            reflectiveQuadTo(5.5f, 16.69f)
            verticalLineTo(14.75f)
            horizontalLineTo(4.48f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.73f, 14f)
            reflectiveQuadTo(3.95f, 13.47f)
            reflectiveQuadTo(4.48f, 13.25f)
            horizontalLineTo(5.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineTo(4.48f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.73f, 10f)
            reflectiveQuadTo(3.95f, 9.47f)
            reflectiveQuadTo(4.48f, 9.25f)
            horizontalLineTo(5.5f)
            verticalLineTo(7.31f)
            quadTo(5.5f, 6.55f, 6.03f, 6.03f)
            reflectiveQuadTo(7.31f, 5.5f)
            horizontalLineTo(9.25f)
            verticalLineTo(4.48f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(10f, 3.73f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(4.48f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(14f, 3.73f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(1.94f)
            quadToRelative(0.76f, 0f, 1.28f, 0.52f)
            reflectiveQuadTo(18.5f, 7.31f)
            verticalLineTo(9.25f)
            horizontalLineToRelative(1.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.27f, 10f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(1.02f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.27f, 14f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(1.94f)
            quadToRelative(0f, 0.76f, -0.52f, 1.28f)
            reflectiveQuadTo(16.69f, 18.5f)
            horizontalLineTo(14.75f)
            verticalLineToRelative(1.02f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(14f, 20.27f)
            reflectiveQuadTo(13.47f, 20.05f)
            reflectiveQuadTo(13.25f, 19.52f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(1.02f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(10f, 20.27f)
            reflectiveQuadTo(9.47f, 20.05f)
            reflectiveQuadTo(9.25f, 19.52f)
            close()
            moveTo(16.69f, 17f)
            quadToRelative(0.12f, 0f, 0.21f, -0.1f)
            reflectiveQuadTo(17f, 16.69f)
            verticalLineTo(7.31f)
            quadTo(17f, 7.19f, 16.9f, 7.1f)
            reflectiveQuadTo(16.69f, 7f)
            horizontalLineTo(7.31f)
            quadTo(7.19f, 7f, 7.1f, 7.1f)
            reflectiveQuadTo(7f, 7.31f)
            verticalLineToRelative(9.38f)
            quadToRelative(0f, 0.12f, 0.1f, 0.21f)
            reflectiveQuadTo(7.31f, 17f)
            horizontalLineToRelative(9.38f)
            close()
            moveTo(12f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _Memory!!
  }

private var _Memory: ImageVector? = null
