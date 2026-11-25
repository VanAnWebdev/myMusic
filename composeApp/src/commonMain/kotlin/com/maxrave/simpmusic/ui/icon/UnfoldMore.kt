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
val SimpIcons.UnfoldMore: ImageVector
  get() {
    if (_UnfoldMore != null) {
      return _UnfoldMore!!
    }
    _UnfoldMore =
      ImageVector.Builder(
          name = "UnfoldMore",
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
            moveTo(12f, 18.47f)
            lineToRelative(2.55f, -2.55f)
            quadToRelative(0.22f, -0.22f, 0.54f, -0.23f)
            reflectiveQuadToRelative(0.55f, 0.23f)
            reflectiveQuadToRelative(0.23f, 0.54f)
            reflectiveQuadTo(15.63f, 17f)
            lineToRelative(-3f, 3f)
            quadToRelative(-0.14f, 0.14f, -0.3f, 0.2f)
            reflectiveQuadTo(12f, 20.26f)
            reflectiveQuadTo(11.66f, 20.2f)
            reflectiveQuadTo(11.37f, 20f)
            lineToRelative(-3f, -3f)
            quadTo(8.15f, 16.78f, 8.14f, 16.47f)
            reflectiveQuadTo(8.37f, 15.92f)
            reflectiveQuadTo(8.91f, 15.69f)
            reflectiveQuadToRelative(0.54f, 0.23f)
            lineTo(12f, 18.47f)
            close()
            moveTo(12f, 5.6f)
            lineTo(9.45f, 8.14f)
            quadTo(9.23f, 8.37f, 8.92f, 8.37f)
            reflectiveQuadTo(8.37f, 8.14f)
            reflectiveQuadTo(8.14f, 7.6f)
            reflectiveQuadTo(8.37f, 7.06f)
            lineToRelative(3f, -3f)
            quadToRelative(0.14f, -0.14f, 0.3f, -0.2f)
            reflectiveQuadTo(12f, 3.8f)
            reflectiveQuadToRelative(0.34f, 0.06f)
            reflectiveQuadToRelative(0.3f, 0.2f)
            lineToRelative(3f, 3f)
            quadToRelative(0.22f, 0.22f, 0.23f, 0.54f)
            reflectiveQuadTo(15.63f, 8.14f)
            reflectiveQuadTo(15.09f, 8.37f)
            reflectiveQuadTo(14.55f, 8.14f)
            lineTo(12f, 5.6f)
            close()
          }
        }
        .buildSimpIcon()
    return _UnfoldMore!!
  }

private var _UnfoldMore: ImageVector? = null
