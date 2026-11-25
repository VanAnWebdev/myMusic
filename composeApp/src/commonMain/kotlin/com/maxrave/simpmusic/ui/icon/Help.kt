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
val SimpIcons.Help: ImageVector
  get() {
    if (_Help != null) {
      return _Help!!
    }
    _Help =
      ImageVector.Builder(
          name = "Help",
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
            moveTo(12.71f, 17.32f)
            quadToRelative(0.3f, -0.3f, 0.3f, -0.72f)
            reflectiveQuadToRelative(-0.3f, -0.72f)
            reflectiveQuadToRelative(-0.72f, -0.3f)
            reflectiveQuadToRelative(-0.72f, 0.3f)
            reflectiveQuadToRelative(-0.3f, 0.72f)
            reflectiveQuadToRelative(0.3f, 0.72f)
            reflectiveQuadToRelative(0.72f, 0.3f)
            reflectiveQuadToRelative(0.72f, -0.3f)
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
            moveTo(12.08f, 7.72f)
            quadToRelative(0.69f, 0f, 1.2f, 0.44f)
            reflectiveQuadToRelative(0.51f, 1.09f)
            quadToRelative(0f, 0.55f, -0.32f, 0.98f)
            reflectiveQuadToRelative(-0.74f, 0.81f)
            quadToRelative(-0.54f, 0.48f, -0.96f, 1.06f)
            reflectiveQuadToRelative(-0.44f, 1.29f)
            quadToRelative(-0.01f, 0.27f, 0.19f, 0.46f)
            reflectiveQuadToRelative(0.47f, 0.18f)
            quadToRelative(0.29f, 0f, 0.49f, -0.19f)
            reflectiveQuadToRelative(0.26f, -0.47f)
            quadToRelative(0.1f, -0.52f, 0.43f, -0.92f)
            reflectiveQuadToRelative(0.71f, -0.77f)
            quadToRelative(0.55f, -0.53f, 0.95f, -1.16f)
            reflectiveQuadToRelative(0.41f, -1.4f)
            quadToRelative(0f, -1.19f, -0.94f, -1.95f)
            reflectiveQuadTo(12.1f, 6.4f)
            quadToRelative(-0.89f, 0f, -1.68f, 0.4f)
            reflectiveQuadTo(9.19f, 7.95f)
            quadTo(9.05f, 8.18f, 9.1f, 8.44f)
            reflectiveQuadTo(9.36f, 8.83f)
            quadTo(9.64f, 8.98f, 9.93f, 8.92f)
            reflectiveQuadTo(10.42f, 8.59f)
            quadTo(10.72f, 8.2f, 11.15f, 7.96f)
            reflectiveQuadTo(12.08f, 7.72f)
            close()
          }
        }
        .buildSimpIcon()
    return _Help!!
  }

private var _Help: ImageVector? = null
