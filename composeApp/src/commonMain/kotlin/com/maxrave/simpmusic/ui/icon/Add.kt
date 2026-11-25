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
val SimpIcons.Add: ImageVector
  get() {
    if (_Add != null) {
      return _Add!!
    }
    _Add =
      ImageVector.Builder(
          name = "Add",
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
            moveTo(11.25f, 12.75f)
            horizontalLineToRelative(-5f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(5.5f, 12f)
            reflectiveQuadTo(5.72f, 11.47f)
            reflectiveQuadTo(6.25f, 11.25f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 5.5f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(18.5f, 12f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 18.5f)
            reflectiveQuadTo(11.47f, 18.28f)
            reflectiveQuadTo(11.25f, 17.75f)
            verticalLineToRelative(-5f)
            close()
          }
        }
        .buildSimpIcon()
    return _Add!!
  }

private var _Add: ImageVector? = null
