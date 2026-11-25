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
val SimpIcons.AvTimer: ImageVector
  get() {
    if (_AvTimer != null) {
      return _AvTimer!!
    }
    _AvTimer =
      ImageVector.Builder(
          name = "AvTimer",
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
            moveTo(8.7f, 19.83f)
            quadTo(7.15f, 19.16f, 6f, 18f)
            reflectiveQuadTo(4.17f, 15.3f)
            reflectiveQuadTo(3.5f, 12f)
            quadToRelative(0f, -1.82f, 0.69f, -3.4f)
            reflectiveQuadTo(6.08f, 5.89f)
            quadTo(6.35f, 5.63f, 6.73f, 5.64f)
            reflectiveQuadTo(7.36f, 5.9f)
            lineToRelative(5.32f, 5.32f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadToRelative(-0.21f, 0.53f)
            reflectiveQuadTo(12.15f, 12.5f)
            reflectiveQuadTo(11.63f, 12.28f)
            lineTo(6.75f, 7.41f)
            quadTo(5.98f, 8.3f, 5.49f, 9.44f)
            reflectiveQuadTo(5f, 12f)
            quadToRelative(0f, 2.9f, 2.05f, 4.95f)
            reflectiveQuadTo(12f, 19f)
            reflectiveQuadToRelative(4.95f, -2.05f)
            reflectiveQuadTo(19f, 12f)
            quadTo(19f, 9.35f, 17.26f, 7.37f)
            reflectiveQuadTo(12.75f, 5.06f)
            verticalLineTo(6.25f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 7f)
            reflectiveQuadTo(11.47f, 6.78f)
            reflectiveQuadTo(11.25f, 6.25f)
            verticalLineToRelative(-2f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 3.5f)
            quadToRelative(1.75f, 0f, 3.3f, 0.67f)
            reflectiveQuadTo(18f, 6f)
            reflectiveQuadTo(19.83f, 8.7f)
            reflectiveQuadTo(20.5f, 12f)
            reflectiveQuadToRelative(-0.67f, 3.3f)
            reflectiveQuadTo(18f, 18f)
            reflectiveQuadToRelative(-2.7f, 1.83f)
            reflectiveQuadTo(12f, 20.5f)
            reflectiveQuadTo(8.7f, 19.83f)
            close()
            moveTo(6.37f, 12.63f)
            quadTo(6.12f, 12.38f, 6.12f, 12f)
            reflectiveQuadTo(6.37f, 11.37f)
            reflectiveQuadTo(7f, 11.12f)
            reflectiveQuadToRelative(0.63f, 0.25f)
            reflectiveQuadTo(7.88f, 12f)
            reflectiveQuadTo(7.63f, 12.63f)
            reflectiveQuadTo(7f, 12.88f)
            reflectiveQuadTo(6.37f, 12.63f)
            close()
            moveToRelative(5f, 5f)
            quadTo(11.12f, 17.38f, 11.12f, 17f)
            reflectiveQuadToRelative(0.25f, -0.63f)
            reflectiveQuadTo(12f, 16.12f)
            reflectiveQuadToRelative(0.63f, 0.25f)
            reflectiveQuadTo(12.88f, 17f)
            reflectiveQuadToRelative(-0.25f, 0.63f)
            reflectiveQuadTo(12f, 17.88f)
            reflectiveQuadTo(11.37f, 17.63f)
            close()
            moveToRelative(5f, -5f)
            quadTo(16.12f, 12.38f, 16.12f, 12f)
            reflectiveQuadToRelative(0.25f, -0.63f)
            reflectiveQuadTo(17f, 11.12f)
            reflectiveQuadToRelative(0.63f, 0.25f)
            reflectiveQuadTo(17.88f, 12f)
            reflectiveQuadToRelative(-0.25f, 0.63f)
            reflectiveQuadTo(17f, 12.88f)
            reflectiveQuadTo(16.37f, 12.63f)
            close()
          }
        }
        .buildSimpIcon()
    return _AvTimer!!
  }

private var _AvTimer: ImageVector? = null
