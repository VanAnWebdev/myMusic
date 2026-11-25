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
val SimpIcons.Pause: ImageVector
  get() {
    if (_Pause != null) {
      return _Pause!!
    }
    _Pause =
      ImageVector.Builder(
          name = "Pause",
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
            moveTo(15.5f, 18.5f)
            quadToRelative(-0.61f, 0f, -1.06f, -0.44f)
            reflectiveQuadTo(14f, 17f)
            verticalLineTo(7f)
            quadTo(14f, 6.39f, 14.44f, 5.94f)
            reflectiveQuadTo(15.5f, 5.5f)
            horizontalLineToRelative(0.75f)
            quadToRelative(0.61f, 0f, 1.06f, 0.44f)
            reflectiveQuadTo(17.75f, 7f)
            verticalLineTo(17f)
            quadToRelative(0f, 0.61f, -0.44f, 1.06f)
            reflectiveQuadTo(16.25f, 18.5f)
            horizontalLineTo(15.5f)
            close()
            moveToRelative(-7.75f, 0f)
            quadToRelative(-0.61f, 0f, -1.06f, -0.44f)
            reflectiveQuadTo(6.25f, 17f)
            verticalLineTo(7f)
            quadToRelative(0f, -0.61f, 0.44f, -1.06f)
            reflectiveQuadTo(7.75f, 5.5f)
            horizontalLineTo(8.5f)
            quadToRelative(0.61f, 0f, 1.06f, 0.44f)
            reflectiveQuadTo(10f, 7f)
            verticalLineTo(17f)
            quadToRelative(0f, 0.61f, -0.44f, 1.06f)
            reflectiveQuadTo(8.5f, 18.5f)
            horizontalLineTo(7.75f)
            close()
          }
        }
        .buildSimpIcon()
    return _Pause!!
  }

private var _Pause: ImageVector? = null
