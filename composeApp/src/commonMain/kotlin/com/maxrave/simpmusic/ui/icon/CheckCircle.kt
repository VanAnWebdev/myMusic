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
val SimpIcons.CheckCircle: ImageVector
  get() {
    if (_CheckCircle != null) {
      return _CheckCircle!!
    }
    _CheckCircle =
      ImageVector.Builder(
          name = "CheckCircle",
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
            moveTo(10.58f, 14.15f)
            lineTo(8.26f, 11.82f)
            quadTo(8.05f, 11.62f, 7.74f, 11.61f)
            reflectiveQuadTo(7.2f, 11.82f)
            reflectiveQuadTo(6.99f, 12.35f)
            reflectiveQuadTo(7.2f, 12.88f)
            lineToRelative(2.74f, 2.74f)
            quadToRelative(0.27f, 0.27f, 0.63f, 0.27f)
            reflectiveQuadToRelative(0.63f, -0.27f)
            lineToRelative(5.56f, -5.56f)
            quadTo(16.98f, 9.85f, 16.99f, 9.54f)
            reflectiveQuadTo(16.78f, 9f)
            reflectiveQuadTo(16.25f, 8.79f)
            reflectiveQuadTo(15.72f, 9f)
            lineToRelative(-5.14f, 5.14f)
            close()
            moveTo(12f, 21.5f)
            quadToRelative(-1.97f, 0f, -3.71f, -0.75f)
            reflectiveQuadTo(5.28f, 18.72f)
            reflectiveQuadTo(3.25f, 15.71f)
            reflectiveQuadTo(2.5f, 12f)
            reflectiveQuadTo(3.25f, 8.3f)
            reflectiveQuadTo(5.28f, 5.28f)
            reflectiveQuadTo(8.29f, 3.25f)
            reflectiveQuadTo(12f, 2.5f)
            reflectiveQuadTo(15.7f, 3.25f)
            reflectiveQuadToRelative(3.02f, 2.03f)
            reflectiveQuadToRelative(2.03f, 3.02f)
            reflectiveQuadTo(21.5f, 12f)
            reflectiveQuadTo(20.75f, 15.7f)
            reflectiveQuadToRelative(-2.03f, 3.02f)
            reflectiveQuadToRelative(-3.02f, 2.03f)
            reflectiveQuadTo(12f, 21.5f)
            close()
          }
        }
        .buildSimpIcon()
    return _CheckCircle!!
  }

private var _CheckCircle: ImageVector? = null
