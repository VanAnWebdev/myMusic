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
val SimpIcons.SportsEsports: ImageVector
  get() {
    if (_SportsEsports != null) {
      return _SportsEsports!!
    }
    _SportsEsports =
      ImageVector.Builder(
          name = "SportsEsports",
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
            moveTo(4.53f, 18.5f)
            quadToRelative(-1.02f, 0f, -1.58f, -0.72f)
            reflectiveQuadTo(2.53f, 16.08f)
            lineTo(3.6f, 8.53f)
            quadTo(3.8f, 7.21f, 4.76f, 6.35f)
            reflectiveQuadTo(7.05f, 5.5f)
            horizontalLineToRelative(9.9f)
            quadToRelative(1.32f, 0f, 2.29f, 0.85f)
            reflectiveQuadTo(20.4f, 8.53f)
            lineToRelative(1.07f, 7.56f)
            quadToRelative(0.14f, 0.98f, -0.42f, 1.7f)
            reflectiveQuadTo(19.47f, 18.5f)
            quadToRelative(-0.43f, 0f, -0.79f, -0.14f)
            reflectiveQuadTo(18.02f, 17.9f)
            lineToRelative(-2.4f, -2.4f)
            horizontalLineTo(8.39f)
            lineToRelative(-2.4f, 2.4f)
            quadTo(5.68f, 18.21f, 5.32f, 18.36f)
            reflectiveQuadTo(4.53f, 18.5f)
            close()
            moveToRelative(0.4f, -1.65f)
            lineTo(7.78f, 14f)
            horizontalLineToRelative(8.44f)
            lineToRelative(2.85f, 2.85f)
            quadTo(19.12f, 16.9f, 19.45f, 17f)
            quadToRelative(0.27f, 0f, 0.44f, -0.16f)
            quadTo(20.05f, 16.68f, 20f, 16.4f)
            lineTo(18.9f, 8.7f)
            quadTo(18.8f, 7.97f, 18.25f, 7.49f)
            reflectiveQuadTo(16.95f, 7f)
            horizontalLineTo(7.05f)
            quadTo(6.31f, 7f, 5.75f, 7.49f)
            quadTo(5.2f, 7.97f, 5.1f, 8.7f)
            lineTo(4f, 16.4f)
            quadToRelative(-0.05f, 0.28f, 0.11f, 0.44f)
            quadTo(4.28f, 17f, 4.55f, 17f)
            quadToRelative(0.07f, 0f, 0.38f, -0.15f)
            close()
            moveTo(17.64f, 12.64f)
            quadTo(17.9f, 12.38f, 17.9f, 12f)
            reflectiveQuadTo(17.64f, 11.36f)
            reflectiveQuadTo(17f, 11.1f)
            reflectiveQuadToRelative(-0.64f, 0.26f)
            reflectiveQuadTo(16.1f, 12f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            reflectiveQuadTo(17f, 12.9f)
            reflectiveQuadToRelative(0.64f, -0.26f)
            close()
            moveToRelative(-2f, -3f)
            quadTo(15.9f, 9.38f, 15.9f, 9f)
            reflectiveQuadTo(15.64f, 8.36f)
            reflectiveQuadTo(15f, 8.1f)
            reflectiveQuadTo(14.36f, 8.36f)
            reflectiveQuadTo(14.1f, 9f)
            reflectiveQuadToRelative(0.26f, 0.64f)
            reflectiveQuadTo(15f, 9.9f)
            reflectiveQuadTo(15.64f, 9.64f)
            close()
            moveTo(12f, 12f)
            close()
            moveTo(7.9f, 11.1f)
            verticalLineToRelative(1.15f)
            quadToRelative(0f, 0.26f, 0.17f, 0.43f)
            reflectiveQuadTo(8.5f, 12.85f)
            reflectiveQuadTo(8.93f, 12.68f)
            reflectiveQuadTo(9.1f, 12.25f)
            verticalLineTo(11.1f)
            horizontalLineToRelative(1.15f)
            quadToRelative(0.26f, 0f, 0.43f, -0.17f)
            reflectiveQuadTo(10.85f, 10.5f)
            reflectiveQuadTo(10.68f, 10.07f)
            reflectiveQuadTo(10.25f, 9.9f)
            horizontalLineTo(9.1f)
            verticalLineTo(8.75f)
            quadTo(9.1f, 8.49f, 8.93f, 8.32f)
            reflectiveQuadTo(8.5f, 8.15f)
            reflectiveQuadTo(8.07f, 8.32f)
            reflectiveQuadTo(7.9f, 8.75f)
            verticalLineTo(9.9f)
            horizontalLineTo(6.75f)
            quadToRelative(-0.26f, 0f, -0.43f, 0.17f)
            reflectiveQuadTo(6.15f, 10.5f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            reflectiveQuadTo(6.75f, 11.1f)
            horizontalLineTo(7.9f)
            close()
          }
        }
        .buildSimpIcon()
    return _SportsEsports!!
  }

private var _SportsEsports: ImageVector? = null
