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
val SimpIcons.PowerSettingsNew: ImageVector
  get() {
    if (_PowerSettingsNew != null) {
      return _PowerSettingsNew!!
    }
    _PowerSettingsNew =
      ImageVector.Builder(
          name = "PowerSettingsNew",
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
            moveTo(12f, 21.5f)
            quadToRelative(-1.97f, 0f, -3.71f, -0.75f)
            reflectiveQuadTo(5.28f, 18.72f)
            reflectiveQuadTo(3.25f, 15.7f)
            reflectiveQuadTo(2.5f, 12f)
            quadToRelative(0f, -1.79f, 0.61f, -3.38f)
            reflectiveQuadTo(4.81f, 5.78f)
            quadTo(5.03f, 5.52f, 5.31f, 5.54f)
            reflectiveQuadTo(5.81f, 5.75f)
            reflectiveQuadTo(6.07f, 6.24f)
            reflectiveQuadTo(5.87f, 6.85f)
            quadTo(5f, 7.9f, 4.5f, 9.21f)
            reflectiveQuadTo(4f, 12f)
            quadToRelative(0f, 3.35f, 2.33f, 5.68f)
            reflectiveQuadTo(12f, 20f)
            reflectiveQuadToRelative(5.68f, -2.32f)
            reflectiveQuadTo(20f, 12f)
            quadTo(20f, 10.52f, 19.5f, 9.21f)
            reflectiveQuadTo(18.13f, 6.85f)
            quadTo(17.87f, 6.54f, 17.93f, 6.24f)
            reflectiveQuadTo(18.19f, 5.75f)
            reflectiveQuadTo(18.69f, 5.54f)
            reflectiveQuadToRelative(0.5f, 0.24f)
            quadToRelative(1.08f, 1.25f, 1.7f, 2.84f)
            reflectiveQuadTo(21.5f, 12f)
            quadToRelative(0f, 1.97f, -0.75f, 3.7f)
            reflectiveQuadToRelative(-2.03f, 3.02f)
            reflectiveQuadToRelative(-3.02f, 2.03f)
            reflectiveQuadTo(12f, 21.5f)
            close()
            moveTo(11.47f, 12.78f)
            quadTo(11.25f, 12.57f, 11.25f, 12.25f)
            verticalLineToRelative(-9f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(9f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 13f)
            reflectiveQuadTo(11.47f, 12.78f)
            close()
          }
        }
        .buildSimpIcon()
    return _PowerSettingsNew!!
  }

private var _PowerSettingsNew: ImageVector? = null
