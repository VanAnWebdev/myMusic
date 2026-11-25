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
val SimpIcons.PauseCircle: ImageVector
  get() {
    if (_PauseCircle != null) {
      return _PauseCircle!!
    }
    _PauseCircle =
      ImageVector.Builder(
          name = "PauseCircle",
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
            moveTo(10.69f, 15.53f)
            quadTo(10.9f, 15.32f, 10.9f, 15f)
            verticalLineTo(9f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(10.15f, 8.25f)
            reflectiveQuadTo(9.62f, 8.47f)
            reflectiveQuadTo(9.4f, 9f)
            verticalLineToRelative(6f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveToRelative(3.69f, 0f)
            quadTo(14.6f, 15.32f, 14.6f, 15f)
            verticalLineTo(9f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(13.85f, 8.25f)
            reflectiveQuadTo(13.31f, 8.47f)
            reflectiveQuadTo(13.1f, 9f)
            verticalLineToRelative(6f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveTo(12f, 21.5f)
            quadToRelative(-1.97f, 0f, -3.71f, -0.75f)
            reflectiveQuadTo(5.28f, 18.72f)
            reflectiveQuadTo(3.25f, 15.71f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.25f, 8.3f)
            reflectiveQuadTo(5.28f, 5.28f)
            reflectiveQuadTo(8.29f, 3.25f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadTo(15.7f, 3.25f)
            reflectiveQuadToRelative(3.02f, 2.03f)
            reflectiveQuadToRelative(2.03f, 3.02f)
            reflectiveQuadTo(21.5f, 12f)
            reflectiveQuadTo(20.75f, 15.7f)
            reflectiveQuadToRelative(-2.03f, 3.02f)
            reflectiveQuadToRelative(-3.02f, 2.03f)
            reflectiveQuadTo(12f, 21.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _PauseCircle!!
  }

private var _PauseCircle: ImageVector? = null
