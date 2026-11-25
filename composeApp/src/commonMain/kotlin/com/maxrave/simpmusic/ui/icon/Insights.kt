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
val SimpIcons.Insights: ImageVector
  get() {
    if (_Insights != null) {
      return _Insights!!
    }
    _Insights =
      ImageVector.Builder(
          name = "Insights",
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
            moveTo(3f, 19.75f)
            quadToRelative(-0.73f, 0f, -1.24f, -0.51f)
            reflectiveQuadTo(1.25f, 18f)
            reflectiveQuadTo(1.76f, 16.76f)
            reflectiveQuadTo(3f, 16.25f)
            quadToRelative(0.17f, 0f, 0.31f, 0.01f)
            reflectiveQuadToRelative(0.27f, 0.09f)
            lineTo(8.36f, 11.58f)
            quadTo(8.28f, 11.44f, 8.26f, 11.31f)
            reflectiveQuadTo(8.25f, 11f)
            quadToRelative(0f, -0.73f, 0.51f, -1.24f)
            reflectiveQuadTo(10f, 9.25f)
            reflectiveQuadToRelative(1.24f, 0.51f)
            reflectiveQuadTo(11.75f, 11f)
            quadToRelative(0f, 0.09f, -0.09f, 0.56f)
            lineToRelative(2.78f, 2.78f)
            quadToRelative(0.13f, -0.06f, 0.26f, -0.07f)
            reflectiveQuadTo(15f, 14.25f)
            reflectiveQuadToRelative(0.3f, 0.01f)
            reflectiveQuadToRelative(0.26f, 0.09f)
            lineToRelative(3.8f, -3.8f)
            quadTo(19.28f, 10.43f, 19.26f, 10.3f)
            reflectiveQuadTo(19.25f, 10f)
            quadToRelative(0f, -0.73f, 0.51f, -1.24f)
            reflectiveQuadTo(21f, 8.25f)
            reflectiveQuadToRelative(1.24f, 0.51f)
            reflectiveQuadTo(22.75f, 10f)
            reflectiveQuadToRelative(-0.51f, 1.24f)
            reflectiveQuadTo(21f, 11.75f)
            quadToRelative(-0.17f, 0f, -0.3f, -0.01f)
            reflectiveQuadTo(20.44f, 11.64f)
            lineToRelative(-3.8f, 3.8f)
            quadToRelative(0.08f, 0.13f, 0.09f, 0.26f)
            reflectiveQuadTo(16.75f, 16f)
            quadToRelative(0f, 0.73f, -0.51f, 1.24f)
            reflectiveQuadTo(15f, 17.75f)
            reflectiveQuadTo(13.76f, 17.24f)
            reflectiveQuadTo(13.25f, 16f)
            quadToRelative(0f, -0.17f, 0.01f, -0.31f)
            reflectiveQuadToRelative(0.09f, -0.27f)
            lineTo(10.58f, 12.64f)
            quadToRelative(-0.13f, 0.08f, -0.27f, 0.09f)
            reflectiveQuadTo(10f, 12.75f)
            quadToRelative(-0.09f, 0f, -0.56f, -0.09f)
            lineTo(4.66f, 17.44f)
            quadToRelative(0.06f, 0.13f, 0.07f, 0.26f)
            reflectiveQuadTo(4.75f, 18f)
            quadToRelative(0f, 0.73f, -0.51f, 1.24f)
            reflectiveQuadTo(3f, 19.75f)
            close()
            moveTo(4f, 9.58f)
            lineTo(3.5f, 8.5f)
            lineTo(2.42f, 8f)
            lineTo(3.5f, 7.5f)
            lineTo(4f, 6.42f)
            lineTo(4.5f, 7.5f)
            lineTo(5.58f, 8f)
            lineTo(4.5f, 8.5f)
            lineTo(4f, 9.58f)
            close()
            moveTo(15f, 8.39f)
            lineTo(14.24f, 6.76f)
            lineTo(12.61f, 6f)
            lineTo(14.24f, 5.24f)
            lineTo(15f, 3.61f)
            lineToRelative(0.76f, 1.64f)
            lineTo(17.39f, 6f)
            lineTo(15.76f, 6.76f)
            lineTo(15f, 8.39f)
            close()
          }
        }
        .buildSimpIcon()
    return _Insights!!
  }

private var _Insights: ImageVector? = null
