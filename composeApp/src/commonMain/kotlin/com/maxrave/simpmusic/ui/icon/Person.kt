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
val SimpIcons.Person: ImageVector
  get() {
    if (_Person != null) {
      return _Person!!
    }
    _Person =
      ImageVector.Builder(
          name = "Person",
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
            moveTo(9.53f, 10.67f)
            quadTo(8.5f, 9.64f, 8.5f, 8.19f)
            reflectiveQuadTo(9.53f, 5.72f)
            reflectiveQuadTo(12f, 4.69f)
            reflectiveQuadToRelative(2.47f, 1.03f)
            reflectiveQuadTo(15.5f, 8.19f)
            reflectiveQuadToRelative(-1.03f, 2.47f)
            reflectiveQuadTo(12f, 11.69f)
            reflectiveQuadTo(9.53f, 10.67f)
            close()
            moveTo(4.5f, 17.79f)
            verticalLineToRelative(-0.7f)
            quadToRelative(0f, -0.73f, 0.4f, -1.36f)
            reflectiveQuadTo(5.97f, 14.76f)
            quadTo(7.45f, 14.03f, 8.96f, 13.67f)
            reflectiveQuadTo(12f, 13.31f)
            reflectiveQuadToRelative(3.04f, 0.36f)
            reflectiveQuadToRelative(2.99f, 1.09f)
            quadToRelative(0.67f, 0.34f, 1.07f, 0.96f)
            reflectiveQuadToRelative(0.4f, 1.36f)
            verticalLineToRelative(0.7f)
            quadToRelative(0f, 0.63f, -0.44f, 1.08f)
            reflectiveQuadToRelative(-1.08f, 0.44f)
            horizontalLineTo(6.02f)
            quadToRelative(-0.63f, 0f, -1.08f, -0.44f)
            reflectiveQuadTo(4.5f, 17.79f)
            close()
            moveTo(6f, 17.81f)
            horizontalLineTo(18f)
            verticalLineTo(17.08f)
            quadToRelative(0f, -0.3f, -0.18f, -0.56f)
            reflectiveQuadTo(17.35f, 16.1f)
            quadTo(16.05f, 15.46f, 14.71f, 15.14f)
            reflectiveQuadTo(12f, 14.81f)
            reflectiveQuadTo(9.29f, 15.14f)
            reflectiveQuadTo(6.65f, 16.1f)
            quadToRelative(-0.3f, 0.16f, -0.48f, 0.42f)
            reflectiveQuadTo(6f, 17.08f)
            verticalLineToRelative(0.72f)
            close()
            moveTo(13.41f, 9.6f)
            quadTo(14f, 9.02f, 14f, 8.19f)
            reflectiveQuadTo(13.41f, 6.78f)
            reflectiveQuadTo(12f, 6.19f)
            reflectiveQuadTo(10.59f, 6.78f)
            reflectiveQuadTo(10f, 8.19f)
            reflectiveQuadTo(10.59f, 9.6f)
            reflectiveQuadTo(12f, 10.19f)
            reflectiveQuadTo(13.41f, 9.6f)
            close()
            moveTo(12f, 8.19f)
            close()
            moveToRelative(0f, 9.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _Person!!
  }

private var _Person: ImageVector? = null
