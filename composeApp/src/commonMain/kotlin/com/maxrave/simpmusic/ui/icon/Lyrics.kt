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
val SimpIcons.Lyrics: ImageVector
  get() {
    if (_Lyrics != null) {
      return _Lyrics!!
    }
    _Lyrics =
      ImageVector.Builder(
          name = "Lyrics",
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
            moveTo(7.29f, 13.75f)
            horizontalLineToRelative(2f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(10.04f, 13f)
            reflectiveQuadTo(9.82f, 12.47f)
            reflectiveQuadTo(9.29f, 12.25f)
            horizontalLineToRelative(-2f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.54f, 13f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            close()
            moveToRelative(11.52f, -2f)
            quadToRelative(-1.15f, 0f, -1.95f, -0.8f)
            reflectiveQuadTo(16.06f, 9f)
            reflectiveQuadToRelative(0.8f, -1.95f)
            reflectiveQuadToRelative(1.95f, -0.8f)
            quadToRelative(0.38f, 0f, 0.67f, 0.09f)
            quadToRelative(0.29f, 0.09f, 0.58f, 0.29f)
            verticalLineTo(2.15f)
            quadToRelative(0f, -0.38f, 0.26f, -0.64f)
            reflectiveQuadTo(20.96f, 1.25f)
            horizontalLineToRelative(1.85f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(23.56f, 2f)
            reflectiveQuadTo(23.34f, 2.53f)
            reflectiveQuadTo(22.81f, 2.75f)
            horizontalLineTo(21.56f)
            verticalLineTo(9f)
            quadToRelative(0f, 1.15f, -0.8f, 1.95f)
            reflectiveQuadToRelative(-1.95f, 0.8f)
            close()
            moveToRelative(-11.52f, -1f)
            horizontalLineToRelative(5f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(13.04f, 10f)
            reflectiveQuadTo(12.82f, 9.47f)
            reflectiveQuadTo(12.29f, 9.25f)
            horizontalLineToRelative(-5f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.54f, 10f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineToRelative(5f)
            quadToRelative(0.32f, 0f, 0.53f, -0.22f)
            reflectiveQuadTo(13.04f, 7f)
            reflectiveQuadTo(12.82f, 6.47f)
            reflectiveQuadTo(12.29f, 6.25f)
            horizontalLineToRelative(-5f)
            quadToRelative(-0.32f, 0f, -0.53f, 0.22f)
            reflectiveQuadTo(6.54f, 7f)
            reflectiveQuadTo(6.75f, 7.53f)
            reflectiveQuadTo(7.29f, 7.75f)
            close()
            moveToRelative(7.69f, 9.75f)
            horizontalLineTo(6.08f)
            lineTo(4.33f, 19.25f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.21f)
            reflectiveQuadTo(3.69f, 19.52f)
            quadToRelative(-0.35f, 0f, -0.62f, -0.25f)
            reflectiveQuadTo(2.79f, 18.6f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.75f, 0.53f, -1.28f)
            reflectiveQuadTo(4.6f, 2.5f)
            horizontalLineTo(14.98f)
            quadToRelative(0.75f, 0f, 1.28f, 0.53f)
            reflectiveQuadToRelative(0.53f, 1.28f)
            verticalLineTo(4.65f)
            quadToRelative(-0.45f, 0.21f, -0.82f, 0.5f)
            reflectiveQuadTo(15.29f, 5.79f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.13f, -0.09f, -0.22f)
            reflectiveQuadTo(14.98f, 4f)
            horizontalLineTo(4.6f)
            quadTo(4.46f, 4f, 4.38f, 4.09f)
            reflectiveQuadTo(4.29f, 4.31f)
            verticalLineTo(17.17f)
            lineTo(5.45f, 16f)
            horizontalLineToRelative(9.53f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadToRelative(0.09f, -0.22f)
            verticalLineTo(12.21f)
            quadToRelative(0.31f, 0.36f, 0.68f, 0.65f)
            reflectiveQuadToRelative(0.82f, 0.5f)
            verticalLineToRelative(2.34f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(14.98f, 17.5f)
            close()
            moveTo(4.29f, 16f)
            verticalLineTo(4.31f)
            quadToRelative(0f, -0.13f, 0f, -0.22f)
            reflectiveQuadTo(4.29f, 4f)
            quadToRelative(0f, 0f, 0f, 0.09f)
            reflectiveQuadToRelative(0f, 0.22f)
            verticalLineTo(5.79f)
            quadToRelative(0f, 0.63f, 0f, 1.45f)
            reflectiveQuadTo(4.29f, 9f)
            reflectiveQuadToRelative(0f, 1.77f)
            reflectiveQuadToRelative(0f, 1.45f)
            verticalLineToRelative(3.48f)
            quadToRelative(0f, 0.13f, 0f, 0.22f)
            reflectiveQuadToRelative(0f, 0.09f)
            close()
          }
        }
        .buildSimpIcon()
    return _Lyrics!!
  }

private var _Lyrics: ImageVector? = null
