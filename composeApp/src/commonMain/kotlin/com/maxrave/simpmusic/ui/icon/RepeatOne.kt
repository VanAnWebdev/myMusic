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
val SimpIcons.RepeatOne: ImageVector
  get() {
    if (_RepeatOne != null) {
      return _RepeatOne!!
    }
    _RepeatOne =
      ImageVector.Builder(
          name = "RepeatOne",
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
            moveTo(11.65f, 10.35f)
            horizontalLineTo(10.9f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(10.31f, 9.75f)
            reflectiveQuadTo(10.48f, 9.32f)
            reflectiveQuadTo(10.9f, 9.15f)
            horizontalLineToRelative(1.04f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.65f)
            verticalLineToRelative(4.19f)
            quadToRelative(0f, 0.26f, -0.17f, 0.43f)
            reflectiveQuadToRelative(-0.43f, 0.17f)
            reflectiveQuadTo(11.82f, 14.68f)
            reflectiveQuadTo(11.65f, 14.25f)
            verticalLineToRelative(-3.9f)
            close()
            moveTo(6.39f, 18.6f)
            lineToRelative(1.29f, 1.29f)
            quadTo(7.9f, 20.11f, 7.9f, 20.41f)
            reflectiveQuadTo(7.68f, 20.94f)
            quadTo(7.45f, 21.17f, 7.15f, 21.18f)
            reflectiveQuadTo(6.61f, 20.96f)
            lineTo(4.13f, 18.48f)
            quadTo(3.99f, 18.34f, 3.93f, 18.18f)
            reflectiveQuadTo(3.88f, 17.85f)
            reflectiveQuadTo(3.93f, 17.51f)
            reflectiveQuadToRelative(0.2f, -0.3f)
            lineTo(6.61f, 14.73f)
            quadTo(6.83f, 14.51f, 7.14f, 14.51f)
            reflectiveQuadToRelative(0.54f, 0.24f)
            quadToRelative(0.22f, 0.23f, 0.22f, 0.53f)
            reflectiveQuadTo(7.68f, 15.8f)
            lineTo(6.39f, 17.1f)
            horizontalLineTo(16.85f)
            quadToRelative(0.13f, 0f, 0.22f, -0.09f)
            reflectiveQuadToRelative(0.09f, -0.22f)
            verticalLineTo(13.85f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(17.9f, 13.1f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            verticalLineToRelative(2.94f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(16.85f, 18.6f)
            horizontalLineTo(6.39f)
            close()
            moveTo(17.61f, 6.9f)
            horizontalLineTo(7.15f)
            quadTo(7.02f, 6.9f, 6.93f, 6.99f)
            reflectiveQuadTo(6.85f, 7.21f)
            verticalLineToRelative(2.94f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(6.1f, 10.9f)
            reflectiveQuadTo(5.56f, 10.69f)
            reflectiveQuadTo(5.35f, 10.15f)
            verticalLineTo(7.21f)
            quadToRelative(0f, -0.75f, 0.53f, -1.28f)
            reflectiveQuadTo(7.15f, 5.4f)
            horizontalLineTo(17.61f)
            lineTo(16.32f, 4.11f)
            quadTo(16.1f, 3.89f, 16.1f, 3.59f)
            reflectiveQuadTo(16.32f, 3.06f)
            quadTo(16.55f, 2.83f, 16.85f, 2.82f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineToRelative(2.48f, 2.48f)
            quadToRelative(0.14f, 0.14f, 0.2f, 0.3f)
            reflectiveQuadToRelative(0.06f, 0.34f)
            reflectiveQuadTo(20.07f, 6.49f)
            reflectiveQuadToRelative(-0.2f, 0.3f)
            lineTo(17.39f, 9.27f)
            quadTo(17.17f, 9.49f, 16.86f, 9.49f)
            reflectiveQuadTo(16.32f, 9.25f)
            quadTo(16.1f, 9.02f, 16.09f, 8.72f)
            reflectiveQuadTo(16.32f, 8.2f)
            lineTo(17.61f, 6.9f)
            close()
          }
        }
        .buildSimpIcon()
    return _RepeatOne!!
  }

private var _RepeatOne: ImageVector? = null
