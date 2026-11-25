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
val SimpIcons.Notifications: ImageVector
  get() {
    if (_Notifications != null) {
      return _Notifications!!
    }
    _Notifications =
      ImageVector.Builder(
          name = "Notifications",
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
            moveTo(5.25f, 18.88f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(4.5f, 18.13f)
            reflectiveQuadTo(4.72f, 17.6f)
            reflectiveQuadTo(5.25f, 17.38f)
            horizontalLineTo(6.31f)
            verticalLineTo(9.92f)
            quadToRelative(0f, -2.02f, 1.25f, -3.57f)
            reflectiveQuadToRelative(3.2f, -1.98f)
            verticalLineTo(3.75f)
            quadToRelative(0f, -0.52f, 0.36f, -0.89f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadToRelative(0.89f, 0.36f)
            reflectiveQuadToRelative(0.37f, 0.89f)
            verticalLineTo(4.37f)
            quadToRelative(1.95f, 0.43f, 3.2f, 1.98f)
            reflectiveQuadToRelative(1.25f, 3.57f)
            verticalLineToRelative(7.46f)
            horizontalLineToRelative(1.06f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadToRelative(0.22f, 0.53f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadToRelative(-0.53f, 0.22f)
            horizontalLineTo(5.25f)
            close()
            moveTo(12f, 11.56f)
            close()
            moveTo(12f, 21.69f)
            quadToRelative(-0.75f, 0f, -1.28f, -0.53f)
            reflectiveQuadTo(10.19f, 19.88f)
            horizontalLineToRelative(3.62f)
            quadToRelative(0f, 0.75f, -0.53f, 1.28f)
            reflectiveQuadTo(12f, 21.69f)
            close()
            moveTo(7.81f, 17.38f)
            horizontalLineToRelative(8.38f)
            verticalLineTo(9.92f)
            quadToRelative(0f, -1.74f, -1.23f, -2.96f)
            reflectiveQuadTo(12f, 5.73f)
            reflectiveQuadTo(9.04f, 6.96f)
            reflectiveQuadTo(7.81f, 9.92f)
            verticalLineToRelative(7.46f)
            close()
          }
        }
        .buildSimpIcon()
    return _Notifications!!
  }

private var _Notifications: ImageVector? = null
