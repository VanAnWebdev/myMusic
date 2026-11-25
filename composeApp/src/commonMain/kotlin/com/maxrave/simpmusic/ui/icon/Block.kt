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
val SimpIcons.Block: ImageVector
  get() {
    if (_Block != null) {
      return _Block!!
    }
    _Block =
      ImageVector.Builder(
          name = "Block",
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
            moveTo(8.3f, 20.75f)
            quadTo(6.56f, 20f, 5.28f, 18.72f)
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
            reflectiveQuadTo(8.3f, 20.75f)
            close()
            moveTo(12f, 20f)
            quadToRelative(1.41f, 0f, 2.71f, -0.48f)
            reflectiveQuadToRelative(2.38f, -1.38f)
            lineTo(5.85f, 6.91f)
            quadTo(4.96f, 7.99f, 4.48f, 9.29f)
            reflectiveQuadTo(4f, 12f)
            quadToRelative(0f, 3.35f, 2.33f, 5.68f)
            reflectiveQuadTo(12f, 20f)
            close()
            moveToRelative(6.15f, -2.91f)
            quadToRelative(0.9f, -1.08f, 1.38f, -2.38f)
            reflectiveQuadTo(20f, 12f)
            quadTo(20f, 8.65f, 17.68f, 6.32f)
            reflectiveQuadTo(12f, 4f)
            quadTo(10.59f, 4f, 9.28f, 4.47f)
            reflectiveQuadTo(6.91f, 5.85f)
            lineTo(18.15f, 17.09f)
            close()
            moveTo(12f, 12f)
            close()
          }
        }
        .buildSimpIcon()
    return _Block!!
  }

private var _Block: ImageVector? = null
