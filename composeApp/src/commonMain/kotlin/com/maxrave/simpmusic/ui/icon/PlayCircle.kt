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
val SimpIcons.PlayCircle: ImageVector
  get() {
    if (_PlayCircle != null) {
      return _PlayCircle!!
    }
    _PlayCircle =
      ImageVector.Builder(
          name = "PlayCircle",
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
            moveTo(10.79f, 15.37f)
            lineToRelative(4.36f, -2.8f)
            quadTo(15.47f, 12.36f, 15.47f, 12f)
            reflectiveQuadTo(15.15f, 11.43f)
            lineTo(10.79f, 8.63f)
            quadTo(10.46f, 8.4f, 10.1f, 8.6f)
            reflectiveQuadTo(9.75f, 9.2f)
            verticalLineToRelative(5.6f)
            quadToRelative(0f, 0.41f, 0.35f, 0.6f)
            reflectiveQuadToRelative(0.69f, -0.04f)
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
    return _PlayCircle!!
  }

private var _PlayCircle: ImageVector? = null
