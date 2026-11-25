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
val SimpIcons.Error: ImageVector
  get() {
    if (_Error != null) {
      return _Error!!
    }
    _Error =
      ImageVector.Builder(
          name = "Error",
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
            moveTo(12.57f, 16.5f)
            quadToRelative(0.23f, -0.23f, 0.23f, -0.57f)
            reflectiveQuadTo(12.57f, 15.35f)
            reflectiveQuadTo(12f, 15.12f)
            reflectiveQuadToRelative(-0.57f, 0.23f)
            reflectiveQuadToRelative(-0.23f, 0.57f)
            reflectiveQuadToRelative(0.23f, 0.57f)
            reflectiveQuadTo(12f, 16.73f)
            reflectiveQuadTo(12.57f, 16.5f)
            close()
            moveTo(12.53f, 12.86f)
            quadToRelative(0.22f, -0.22f, 0.22f, -0.53f)
            verticalLineTo(7.83f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 7.08f)
            reflectiveQuadTo(11.47f, 7.29f)
            reflectiveQuadTo(11.25f, 7.83f)
            verticalLineToRelative(4.5f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(12f, 13.08f)
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
    return _Error!!
  }

private var _Error: ImageVector? = null
