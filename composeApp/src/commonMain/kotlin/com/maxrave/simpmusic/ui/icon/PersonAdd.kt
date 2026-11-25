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
val SimpIcons.PersonAdd: ImageVector
  get() {
    if (_PersonAdd != null) {
      return _PersonAdd!!
    }
    _PersonAdd =
      ImageVector.Builder(
          name = "PersonAdd",
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
            moveTo(18.13f, 10.75f)
            horizontalLineTo(15.87f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(15.13f, 10f)
            reflectiveQuadTo(15.34f, 9.47f)
            reflectiveQuadTo(15.87f, 9.25f)
            horizontalLineToRelative(2.25f)
            verticalLineTo(7f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(18.88f, 6.25f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(19.62f, 7f)
            verticalLineTo(9.25f)
            horizontalLineToRelative(2.25f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(22.62f, 10f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(19.62f)
            verticalLineTo(13f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            reflectiveQuadTo(18.34f, 13.53f)
            reflectiveQuadTo(18.13f, 13f)
            verticalLineTo(10.75f)
            close()
            moveTo(6.53f, 10.67f)
            quadTo(5.5f, 9.64f, 5.5f, 8.19f)
            reflectiveQuadTo(6.53f, 5.72f)
            reflectiveQuadTo(9f, 4.69f)
            reflectiveQuadToRelative(2.47f, 1.03f)
            reflectiveQuadTo(12.5f, 8.19f)
            reflectiveQuadToRelative(-1.03f, 2.47f)
            reflectiveQuadTo(9f, 11.69f)
            reflectiveQuadTo(6.53f, 10.67f)
            close()
            moveTo(1.5f, 17.79f)
            verticalLineToRelative(-0.7f)
            quadToRelative(0f, -0.73f, 0.4f, -1.36f)
            reflectiveQuadTo(2.97f, 14.76f)
            quadTo(4.45f, 14.03f, 5.96f, 13.67f)
            reflectiveQuadTo(9f, 13.31f)
            reflectiveQuadToRelative(3.04f, 0.36f)
            reflectiveQuadToRelative(2.99f, 1.09f)
            quadToRelative(0.67f, 0.34f, 1.07f, 0.96f)
            reflectiveQuadToRelative(0.4f, 1.36f)
            verticalLineToRelative(0.7f)
            quadToRelative(0f, 0.63f, -0.44f, 1.08f)
            reflectiveQuadToRelative(-1.08f, 0.44f)
            horizontalLineTo(3.02f)
            quadToRelative(-0.63f, 0f, -1.08f, -0.44f)
            reflectiveQuadTo(1.5f, 17.79f)
            close()
            moveTo(3f, 17.81f)
            horizontalLineTo(15f)
            verticalLineTo(17.08f)
            quadToRelative(0f, -0.3f, -0.18f, -0.56f)
            reflectiveQuadTo(14.35f, 16.1f)
            quadTo(13.05f, 15.46f, 11.71f, 15.14f)
            reflectiveQuadTo(9f, 14.81f)
            reflectiveQuadTo(6.29f, 15.14f)
            reflectiveQuadTo(3.65f, 16.1f)
            quadToRelative(-0.3f, 0.16f, -0.48f, 0.42f)
            reflectiveQuadTo(3f, 17.08f)
            verticalLineToRelative(0.72f)
            close()
            moveTo(10.41f, 9.6f)
            quadTo(11f, 9.02f, 11f, 8.19f)
            reflectiveQuadTo(10.41f, 6.78f)
            reflectiveQuadTo(9f, 6.19f)
            quadToRelative(-0.82f, 0f, -1.41f, 0.59f)
            reflectiveQuadTo(7f, 8.19f)
            reflectiveQuadTo(7.59f, 9.6f)
            reflectiveQuadTo(9f, 10.19f)
            quadToRelative(0.83f, 0f, 1.41f, -0.59f)
            close()
            moveTo(9f, 8.19f)
            close()
            moveToRelative(0f, 9.62f)
            close()
          }
        }
        .buildSimpIcon()
    return _PersonAdd!!
  }

private var _PersonAdd: ImageVector? = null
