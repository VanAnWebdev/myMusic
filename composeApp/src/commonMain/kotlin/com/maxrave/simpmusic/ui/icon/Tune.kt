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
val SimpIcons.Tune: ImageVector
  get() {
    if (_Tune != null) {
      return _Tune!!
    }
    _Tune =
      ImageVector.Builder(
          name = "Tune",
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
            moveTo(11.47f, 20.53f)
            quadTo(11.25f, 20.32f, 11.25f, 20f)
            verticalLineTo(16f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(12f, 15.25f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(12.75f, 16f)
            verticalLineToRelative(1.25f)
            horizontalLineTo(20f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.75f, 18f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(20f, 18.75f)
            horizontalLineTo(12.75f)
            verticalLineTo(20f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(12f, 20.75f)
            reflectiveQuadTo(11.47f, 20.53f)
            close()
            moveTo(4f, 18.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.25f, 18f)
            reflectiveQuadTo(3.47f, 17.47f)
            reflectiveQuadTo(4f, 17.25f)
            horizontalLineTo(8f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(8.75f, 18f)
            reflectiveQuadTo(8.53f, 18.53f)
            reflectiveQuadTo(8f, 18.75f)
            horizontalLineTo(4f)
            close()
            moveTo(7.47f, 14.53f)
            quadTo(7.25f, 14.32f, 7.25f, 14f)
            verticalLineTo(12.75f)
            horizontalLineTo(4f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(3.25f, 12f)
            reflectiveQuadTo(3.47f, 11.47f)
            reflectiveQuadTo(4f, 11.25f)
            horizontalLineTo(7.25f)
            verticalLineTo(10f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(8f, 9.25f)
            reflectiveQuadTo(8.53f, 9.47f)
            reflectiveQuadTo(8.75f, 10f)
            verticalLineToRelative(4f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(8f, 14.75f)
            reflectiveQuadTo(7.47f, 14.53f)
            close()
            moveTo(12f, 12.75f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(11.25f, 12f)
            reflectiveQuadToRelative(0.22f, -0.53f)
            reflectiveQuadTo(12f, 11.25f)
            horizontalLineToRelative(8f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.75f, 12f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(20f, 12.75f)
            horizontalLineTo(12f)
            close()
            moveTo(15.47f, 8.53f)
            quadTo(15.25f, 8.32f, 15.25f, 8f)
            verticalLineTo(4f)
            quadToRelative(0f, -0.32f, 0.22f, -0.53f)
            reflectiveQuadTo(16f, 3.25f)
            reflectiveQuadToRelative(0.53f, 0.22f)
            reflectiveQuadTo(16.75f, 4f)
            verticalLineTo(5.25f)
            horizontalLineTo(20f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(20.75f, 6f)
            reflectiveQuadTo(20.53f, 6.53f)
            reflectiveQuadTo(20f, 6.75f)
            horizontalLineTo(16.75f)
            verticalLineTo(8f)
            quadToRelative(0f, 0.32f, -0.22f, 0.53f)
            reflectiveQuadTo(16f, 8.75f)
            reflectiveQuadTo(15.47f, 8.53f)
            close()
            moveTo(4f, 6.75f)
            quadTo(3.68f, 6.75f, 3.47f, 6.53f)
            reflectiveQuadTo(3.25f, 6f)
            reflectiveQuadTo(3.47f, 5.47f)
            reflectiveQuadTo(4f, 5.25f)
            horizontalLineToRelative(8f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(12.75f, 6f)
            reflectiveQuadTo(12.53f, 6.53f)
            reflectiveQuadTo(12f, 6.75f)
            horizontalLineTo(4f)
            close()
          }
        }
        .buildSimpIcon()
    return _Tune!!
  }

private var _Tune: ImageVector? = null
