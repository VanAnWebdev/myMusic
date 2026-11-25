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
val SimpIcons.Share: ImageVector
  get() {
    if (_Share != null) {
      return _Share!!
    }
    _Share =
      ImageVector.Builder(
          name = "Share",
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
            moveTo(16.81f, 21.5f)
            quadToRelative(-1.12f, 0f, -1.91f, -0.79f)
            reflectiveQuadTo(14.12f, 18.81f)
            quadToRelative(0f, -0.15f, 0.1f, -0.73f)
            lineTo(7.11f, 13.89f)
            quadTo(6.75f, 14.27f, 6.25f, 14.48f)
            reflectiveQuadTo(5.18f, 14.69f)
            quadToRelative(-1.12f, 0f, -1.9f, -0.79f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.28f, 10.1f)
            reflectiveQuadTo(5.18f, 9.31f)
            quadToRelative(0.57f, 0f, 1.07f, 0.21f)
            reflectiveQuadToRelative(0.86f, 0.59f)
            lineTo(14.22f, 5.93f)
            quadTo(14.16f, 5.75f, 14.14f, 5.57f)
            reflectiveQuadTo(14.12f, 5.19f)
            quadToRelative(0f, -1.12f, 0.79f, -1.91f)
            reflectiveQuadTo(16.81f, 2.5f)
            reflectiveQuadToRelative(1.91f, 0.79f)
            reflectiveQuadTo(19.5f, 5.19f)
            reflectiveQuadTo(18.71f, 7.1f)
            reflectiveQuadTo(16.81f, 7.88f)
            quadToRelative(-0.57f, 0f, -1.06f, -0.22f)
            reflectiveQuadTo(14.89f, 7.07f)
            lineTo(7.78f, 11.26f)
            quadToRelative(0.06f, 0.18f, 0.08f, 0.36f)
            reflectiveQuadTo(7.88f, 12f)
            reflectiveQuadTo(7.86f, 12.38f)
            reflectiveQuadTo(7.78f, 12.74f)
            lineToRelative(7.11f, 4.19f)
            quadToRelative(0.36f, -0.38f, 0.85f, -0.59f)
            reflectiveQuadToRelative(1.06f, -0.22f)
            quadToRelative(1.12f, 0f, 1.91f, 0.79f)
            reflectiveQuadToRelative(0.79f, 1.91f)
            reflectiveQuadToRelative(-0.79f, 1.91f)
            reflectiveQuadTo(16.81f, 21.5f)
            close()
            moveToRelative(0f, -1.5f)
            quadToRelative(0.51f, 0f, 0.85f, -0.34f)
            reflectiveQuadTo(18f, 18.81f)
            reflectiveQuadTo(17.66f, 17.96f)
            reflectiveQuadTo(16.81f, 17.62f)
            reflectiveQuadToRelative(-0.85f, 0.34f)
            reflectiveQuadToRelative(-0.34f, 0.85f)
            reflectiveQuadToRelative(0.34f, 0.85f)
            reflectiveQuadTo(16.81f, 20f)
            close()
            moveTo(5.18f, 13.19f)
            quadToRelative(0.51f, 0f, 0.86f, -0.35f)
            reflectiveQuadTo(6.38f, 12f)
            reflectiveQuadTo(6.04f, 11.15f)
            reflectiveQuadTo(5.18f, 10.81f)
            quadToRelative(-0.5f, 0f, -0.84f, 0.35f)
            reflectiveQuadTo(4f, 12f)
            reflectiveQuadToRelative(0.34f, 0.85f)
            reflectiveQuadToRelative(0.84f, 0.35f)
            close()
            moveTo(17.65f, 6.04f)
            quadTo(18f, 5.7f, 18f, 5.19f)
            reflectiveQuadTo(17.66f, 4.34f)
            reflectiveQuadTo(16.81f, 4f)
            reflectiveQuadTo(15.96f, 4.34f)
            reflectiveQuadTo(15.62f, 5.19f)
            reflectiveQuadToRelative(0.35f, 0.85f)
            reflectiveQuadToRelative(0.85f, 0.34f)
            reflectiveQuadTo(17.65f, 6.04f)
            close()
            moveTo(16.81f, 18.81f)
            close()
            moveTo(5.19f, 12f)
            close()
            moveTo(16.81f, 5.19f)
            close()
          }
        }
        .buildSimpIcon()
    return _Share!!
  }

private var _Share: ImageVector? = null
