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
val SimpIcons.Info: ImageVector
  get() {
    if (_Info != null) {
      return _Info!!
    }
    _Info =
      ImageVector.Builder(
          name = "Info",
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
            moveTo(12.53f, 16.53f)
            quadTo(12.75f, 16.32f, 12.75f, 16f)
            verticalLineTo(11.75f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 11f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            verticalLineTo(16f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(12f, 16.75f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            close()
            moveTo(12.57f, 9.06f)
            quadTo(12.81f, 8.82f, 12.81f, 8.48f)
            reflectiveQuadTo(12.58f, 7.91f)
            reflectiveQuadTo(12f, 7.67f)
            reflectiveQuadTo(11.42f, 7.91f)
            reflectiveQuadTo(11.19f, 8.48f)
            reflectiveQuadToRelative(0.23f, 0.58f)
            reflectiveQuadTo(12f, 9.29f)
            reflectiveQuadTo(12.57f, 9.06f)
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
            moveTo(12f, 20f)
            quadToRelative(3.35f, 0f, 5.68f, -2.32f)
            reflectiveQuadTo(20f, 12f)
            reflectiveQuadTo(17.68f, 6.32f)
            reflectiveQuadTo(12f, 4f)
            reflectiveQuadTo(6.33f, 6.32f)
            reflectiveQuadTo(4f, 12f)
            reflectiveQuadToRelative(2.33f, 5.68f)
            reflectiveQuadTo(12f, 20f)
            close()
            moveToRelative(0f, -8f)
            close()
          }
        }
        .buildSimpIcon()
    return _Info!!
  }

private var _Info: ImageVector? = null
