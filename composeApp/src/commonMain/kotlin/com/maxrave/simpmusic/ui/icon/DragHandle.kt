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
val SimpIcons.DragHandle: ImageVector
  get() {
    if (_DragHandle != null) {
      return _DragHandle!!
    }
    _DragHandle =
      ImageVector.Builder(
          name = "DragHandle",
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
            moveTo(5.25f, 14.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(4.5f, 14f)
            reflectiveQuadTo(4.72f, 13.47f)
            reflectiveQuadTo(5.25f, 13.25f)
            horizontalLineToRelative(13.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(19.5f, 14f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(0f, -4f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(4.5f, 10f)
            reflectiveQuadTo(4.72f, 9.47f)
            reflectiveQuadTo(5.25f, 9.25f)
            horizontalLineToRelative(13.5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(19.5f, 10f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(5.25f)
            close()
          }
        }
        .buildSimpIcon()
    return _DragHandle!!
  }

private var _DragHandle: ImageVector? = null
