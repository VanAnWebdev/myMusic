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
val SimpIcons.Palette: ImageVector
  get() {
    if (_Palette != null) {
      return _Palette!!
    }
    _Palette =
      ImageVector.Builder(
          name = "Palette",
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
            moveTo(11.98f, 21.5f)
            quadToRelative(-1.94f, 0f, -3.67f, -0.75f)
            reflectiveQuadTo(5.29f, 18.71f)
            reflectiveQuadTo(3.25f, 15.69f)
            reflectiveQuadTo(2.5f, 12f)
            quadToRelative(0f, -1.98f, 0.77f, -3.71f)
            reflectiveQuadTo(5.36f, 5.27f)
            reflectiveQuadTo(8.45f, 3.24f)
            reflectiveQuadTo(12.22f, 2.5f)
            quadToRelative(1.87f, 0f, 3.55f, 0.64f)
            reflectiveQuadToRelative(2.95f, 1.77f)
            reflectiveQuadTo(20.75f, 7.6f)
            reflectiveQuadToRelative(0.75f, 3.38f)
            quadToRelative(0f, 2.6f, -1.54f, 4.06f)
            reflectiveQuadTo(16f, 16.5f)
            horizontalLineTo(14.19f)
            quadToRelative(-0.43f, 0f, -0.68f, 0.28f)
            reflectiveQuadToRelative(-0.26f, 0.66f)
            quadToRelative(0f, 0.46f, 0.38f, 0.96f)
            reflectiveQuadTo(14f, 19.55f)
            quadToRelative(0f, 0.99f, -0.55f, 1.47f)
            reflectiveQuadTo(11.98f, 21.5f)
            close()
            moveTo(12f, 12f)
            close()
            moveTo(7.39f, 12.39f)
            quadTo(7.75f, 12.03f, 7.75f, 11.5f)
            reflectiveQuadTo(7.39f, 10.61f)
            reflectiveQuadTo(6.5f, 10.25f)
            reflectiveQuadTo(5.61f, 10.61f)
            reflectiveQuadTo(5.25f, 11.5f)
            reflectiveQuadToRelative(0.36f, 0.89f)
            reflectiveQuadTo(6.5f, 12.75f)
            reflectiveQuadTo(7.39f, 12.39f)
            close()
            moveToRelative(3f, -4f)
            quadTo(10.75f, 8.03f, 10.75f, 7.5f)
            reflectiveQuadTo(10.39f, 6.61f)
            reflectiveQuadTo(9.5f, 6.25f)
            reflectiveQuadTo(8.61f, 6.61f)
            reflectiveQuadTo(8.25f, 7.5f)
            reflectiveQuadTo(8.61f, 8.39f)
            reflectiveQuadTo(9.5f, 8.75f)
            reflectiveQuadTo(10.39f, 8.39f)
            close()
            moveToRelative(5f, 0f)
            quadTo(15.75f, 8.03f, 15.75f, 7.5f)
            reflectiveQuadTo(15.39f, 6.61f)
            reflectiveQuadTo(14.5f, 6.25f)
            reflectiveQuadTo(13.61f, 6.61f)
            reflectiveQuadTo(13.25f, 7.5f)
            reflectiveQuadToRelative(0.36f, 0.89f)
            reflectiveQuadTo(14.5f, 8.75f)
            reflectiveQuadTo(15.39f, 8.39f)
            close()
            moveToRelative(3f, 4f)
            quadToRelative(0.36f, -0.36f, 0.36f, -0.89f)
            reflectiveQuadTo(18.39f, 10.61f)
            reflectiveQuadTo(17.5f, 10.25f)
            reflectiveQuadToRelative(-0.89f, 0.36f)
            reflectiveQuadTo(16.25f, 11.5f)
            reflectiveQuadToRelative(0.36f, 0.89f)
            reflectiveQuadToRelative(0.89f, 0.36f)
            reflectiveQuadToRelative(0.89f, -0.36f)
            close()
            moveTo(11.98f, 20f)
            quadToRelative(0.24f, 0f, 0.38f, -0.12f)
            reflectiveQuadTo(12.5f, 19.55f)
            quadToRelative(0f, -0.35f, -0.38f, -0.79f)
            reflectiveQuadTo(11.75f, 17.4f)
            quadToRelative(0f, -1.07f, 0.73f, -1.73f)
            reflectiveQuadTo(14.25f, 15f)
            horizontalLineTo(16f)
            quadToRelative(1.77f, 0f, 2.88f, -1.03f)
            reflectiveQuadTo(20f, 10.97f)
            quadToRelative(0f, -3.03f, -2.33f, -5f)
            reflectiveQuadTo(12.22f, 4f)
            quadTo(8.79f, 4f, 6.4f, 6.32f)
            reflectiveQuadTo(4f, 12f)
            quadToRelative(0f, 3.32f, 2.34f, 5.66f)
            reflectiveQuadTo(11.98f, 20f)
            close()
          }
        }
        .buildSimpIcon()
    return _Palette!!
  }

private var _Palette: ImageVector? = null
