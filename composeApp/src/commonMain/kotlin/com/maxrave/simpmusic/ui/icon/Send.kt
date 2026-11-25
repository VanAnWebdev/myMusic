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
val SimpIcons.Send: ImageVector
  get() {
    if (_Send != null) {
      return _Send!!
    }
    _Send =
      ImageVector.Builder(
          name = "Send",
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
            moveTo(18.72f, 12.84f)
            lineTo(4.77f, 18.72f)
            quadTo(4.31f, 18.9f, 3.91f, 18.65f)
            reflectiveQuadTo(3.5f, 17.89f)
            verticalLineTo(6.11f)
            quadTo(3.5f, 5.61f, 3.91f, 5.35f)
            reflectiveQuadTo(4.77f, 5.28f)
            lineToRelative(13.96f, 5.88f)
            quadToRelative(0.56f, 0.25f, 0.56f, 0.84f)
            reflectiveQuadToRelative(-0.56f, 0.84f)
            close()
            moveTo(5f, 17f)
            lineTo(16.85f, 12f)
            lineTo(5f, 7f)
            verticalLineToRelative(3.69f)
            lineTo(10.42f, 12f)
            lineTo(5f, 13.31f)
            verticalLineTo(17f)
            close()
            moveToRelative(0f, 0f)
            verticalLineTo(12f)
            verticalLineTo(7f)
            verticalLineToRelative(3.69f)
            verticalLineToRelative(2.62f)
            verticalLineTo(17f)
            close()
          }
        }
        .buildSimpIcon()
    return _Send!!
  }

private var _Send: ImageVector? = null
