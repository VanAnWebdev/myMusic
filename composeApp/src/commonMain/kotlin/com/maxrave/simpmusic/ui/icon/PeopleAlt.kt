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
val SimpIcons.PeopleAlt: ImageVector
  get() {
    if (_PeopleAlt != null) {
      return _PeopleAlt!!
    }
    _PeopleAlt =
      ImageVector.Builder(
          name = "PeopleAlt",
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
            moveTo(1.8f, 17.08f)
            quadToRelative(0f, -0.77f, 0.4f, -1.38f)
            reflectiveQuadTo(3.26f, 14.76f)
            quadToRelative(1.43f, -0.7f, 2.87f, -1.08f)
            reflectiveQuadTo(9.3f, 13.31f)
            reflectiveQuadToRelative(3.17f, 0.38f)
            reflectiveQuadToRelative(2.87f, 1.08f)
            quadTo(16f, 15.1f, 16.4f, 15.7f)
            reflectiveQuadToRelative(0.4f, 1.38f)
            verticalLineToRelative(0.7f)
            quadToRelative(0f, 0.6f, -0.44f, 1.06f)
            reflectiveQuadToRelative(-1.08f, 0.46f)
            horizontalLineTo(3.32f)
            quadToRelative(-0.63f, 0f, -1.08f, -0.44f)
            reflectiveQuadTo(1.8f, 17.79f)
            verticalLineToRelative(-0.7f)
            close()
            moveToRelative(18.88f, 2.22f)
            horizontalLineTo(18.41f)
            quadTo(18.6f, 18.96f, 18.7f, 18.57f)
            reflectiveQuadToRelative(0.1f, -0.79f)
            verticalLineTo(16.96f)
            quadToRelative(0f, -0.98f, -0.48f, -1.88f)
            reflectiveQuadTo(16.95f, 13.55f)
            quadToRelative(1.01f, 0.15f, 1.91f, 0.46f)
            reflectiveQuadToRelative(1.72f, 0.74f)
            quadToRelative(0.77f, 0.41f, 1.2f, 0.97f)
            reflectiveQuadToRelative(0.42f, 1.23f)
            verticalLineToRelative(0.83f)
            quadToRelative(0f, 0.63f, -0.44f, 1.08f)
            reflectiveQuadToRelative(-1.08f, 0.44f)
            close()
            moveTo(6.82f, 10.67f)
            quadTo(5.8f, 9.64f, 5.8f, 8.19f)
            reflectiveQuadTo(6.82f, 5.72f)
            reflectiveQuadTo(9.3f, 4.69f)
            reflectiveQuadToRelative(2.47f, 1.03f)
            reflectiveQuadTo(12.8f, 8.19f)
            reflectiveQuadToRelative(-1.03f, 2.47f)
            reflectiveQuadTo(9.3f, 11.69f)
            reflectiveQuadTo(6.82f, 10.67f)
            close()
            moveToRelative(10.08f, 0f)
            quadToRelative(-1.03f, 1.03f, -2.47f, 1.03f)
            quadToRelative(-0.17f, 0f, -0.43f, -0.04f)
            reflectiveQuadTo(13.57f, 11.57f)
            quadToRelative(0.59f, -0.71f, 0.91f, -1.58f)
            reflectiveQuadTo(14.8f, 8.19f)
            reflectiveQuadTo(14.47f, 6.4f)
            reflectiveQuadTo(13.57f, 4.82f)
            quadTo(13.79f, 4.74f, 14f, 4.72f)
            reflectiveQuadTo(14.43f, 4.69f)
            quadToRelative(1.44f, 0f, 2.47f, 1.03f)
            reflectiveQuadToRelative(1.03f, 2.47f)
            reflectiveQuadTo(16.9f, 10.67f)
            close()
            moveTo(3.3f, 17.81f)
            horizontalLineToRelative(12f)
            verticalLineTo(17.08f)
            quadToRelative(0f, -0.31f, -0.16f, -0.56f)
            reflectiveQuadTo(14.64f, 16.1f)
            quadTo(13.41f, 15.46f, 12.1f, 15.14f)
            reflectiveQuadTo(9.3f, 14.81f)
            reflectiveQuadToRelative(-2.8f, 0.33f)
            reflectiveQuadTo(3.95f, 16.1f)
            quadToRelative(-0.34f, 0.18f, -0.5f, 0.43f)
            reflectiveQuadTo(3.3f, 17.08f)
            verticalLineToRelative(0.72f)
            close()
            moveTo(10.71f, 9.6f)
            quadTo(11.3f, 9.02f, 11.3f, 8.19f)
            reflectiveQuadTo(10.71f, 6.78f)
            reflectiveQuadTo(9.3f, 6.19f)
            reflectiveQuadTo(7.89f, 6.78f)
            reflectiveQuadTo(7.3f, 8.19f)
            reflectiveQuadTo(7.89f, 9.6f)
            reflectiveQuadTo(9.3f, 10.19f)
            reflectiveQuadTo(10.71f, 9.6f)
            close()
            moveTo(9.3f, 17.81f)
            close()
            moveToRelative(0f, -9.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _PeopleAlt!!
  }

private var _PeopleAlt: ImageVector? = null
