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
val SimpIcons.AddCircleOutline: ImageVector
  get() {
    if (_AddCircleOutline != null) {
      return _AddCircleOutline!!
    }
    _AddCircleOutline =
      ImageVector.Builder(
          name = "AddCircleOutline",
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
            verticalLineTo(16f)
            quadToRelative(0f, 0.32f, 0.22f, 0.53f)
            reflectiveQuadTo(12f, 16.75f)
            reflectiveQuadToRelative(0.53f, -0.22f)
            reflectiveQuadTo(12.75f, 16f)
            verticalLineTo(12.75f)
            horizontalLineTo(16f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(16.75f, 12f)
            reflectiveQuadTo(16.53f, 11.47f)
            reflectiveQuadTo(16f, 11.25f)
            horizontalLineTo(12.75f)
            verticalLineTo(8f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 7.25f)
            reflectiveQuadTo(11.47f, 7.47f)
            reflectiveQuadTo(11.25f, 8f)
            verticalLineToRelative(3.25f)
            horizontalLineTo(8f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(7.25f, 12f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadTo(8f, 12.75f)
            horizontalLineToRelative(3.25f)
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
    return _AddCircleOutline!!
  }

private var _AddCircleOutline: ImageVector? = null
