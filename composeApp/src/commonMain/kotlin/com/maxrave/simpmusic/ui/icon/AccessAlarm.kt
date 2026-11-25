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
val SimpIcons.AccessAlarm: ImageVector
  get() {
    if (_AccessAlarm != null) {
      return _AccessAlarm!!
    }
    _AccessAlarm =
      ImageVector.Builder(
          name = "AccessAlarm",
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
            moveTo(12.75f, 12.7f)
            verticalLineTo(8.75f)
            quadToRelative(0f, -0.32f, -0.22f, -0.53f)
            reflectiveQuadTo(12f, 8f)
            reflectiveQuadTo(11.47f, 8.22f)
            reflectiveQuadTo(11.25f, 8.75f)
            verticalLineToRelative(4.18f)
            quadToRelative(0f, 0.18f, 0.07f, 0.34f)
            reflectiveQuadToRelative(0.21f, 0.3f)
            lineToRelative(2.93f, 2.93f)
            quadToRelative(0.21f, 0.21f, 0.52f, 0.21f)
            reflectiveQuadTo(15.5f, 16.5f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(15.5f, 15.45f)
            lineTo(12.75f, 12.7f)
            close()
            moveTo(8.68f, 20.83f)
            quadTo(7.14f, 20.16f, 5.99f, 19.01f)
            reflectiveQuadTo(4.17f, 16.32f)
            reflectiveQuadTo(3.5f, 13f)
            reflectiveQuadTo(4.17f, 9.68f)
            reflectiveQuadTo(5.99f, 6.99f)
            reflectiveQuadTo(8.68f, 5.17f)
            reflectiveQuadTo(12f, 4.5f)
            reflectiveQuadToRelative(3.32f, 0.67f)
            reflectiveQuadToRelative(2.7f, 1.82f)
            reflectiveQuadToRelative(1.82f, 2.7f)
            reflectiveQuadTo(20.5f, 13f)
            reflectiveQuadToRelative(-0.67f, 3.32f)
            reflectiveQuadToRelative(-1.82f, 2.7f)
            reflectiveQuadToRelative(-2.7f, 1.82f)
            reflectiveQuadTo(12f, 21.5f)
            reflectiveQuadTo(8.68f, 20.83f)
            close()
            moveTo(12f, 13f)
            close()
            moveTo(2.42f, 7.28f)
            quadTo(2.2f, 7.06f, 2.2f, 6.75f)
            reflectiveQuadTo(2.42f, 6.23f)
            lineTo(5.23f, 3.42f)
            quadTo(5.43f, 3.21f, 5.75f, 3.2f)
            reflectiveQuadTo(6.28f, 3.42f)
            reflectiveQuadTo(6.5f, 3.94f)
            reflectiveQuadTo(6.28f, 4.47f)
            lineTo(3.47f, 7.28f)
            quadTo(3.26f, 7.49f, 2.95f, 7.49f)
            reflectiveQuadTo(2.42f, 7.28f)
            close()
            moveToRelative(19.17f, 0f)
            quadTo(21.37f, 7.5f, 21.06f, 7.5f)
            reflectiveQuadTo(20.53f, 7.28f)
            lineTo(17.72f, 4.47f)
            quadTo(17.51f, 4.26f, 17.51f, 3.95f)
            reflectiveQuadTo(17.72f, 3.42f)
            reflectiveQuadTo(18.25f, 3.2f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            lineToRelative(2.81f, 2.81f)
            quadToRelative(0.21f, 0.21f, 0.21f, 0.52f)
            reflectiveQuadTo(21.58f, 7.28f)
            close()
            moveTo(12f, 20f)
            quadToRelative(2.92f, 0f, 4.96f, -2.04f)
            reflectiveQuadTo(19f, 13f)
            reflectiveQuadTo(16.96f, 8.04f)
            reflectiveQuadTo(12f, 6f)
            reflectiveQuadTo(7.04f, 8.04f)
            reflectiveQuadTo(5f, 13f)
            reflectiveQuadToRelative(2.04f, 4.96f)
            reflectiveQuadTo(12f, 20f)
            close()
          }
        }
        .buildSimpIcon()
    return _AccessAlarm!!
  }

private var _AccessAlarm: ImageVector? = null
