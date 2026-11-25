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
val SimpIcons.VpnLock: ImageVector
  get() {
    if (_VpnLock != null) {
      return _VpnLock!!
    }
    _VpnLock =
      ImageVector.Builder(
          name = "VpnLock",
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
            moveTo(8.3f, 20.76f)
            quadTo(6.57f, 20.01f, 5.28f, 18.72f)
            reflectiveQuadTo(3.24f, 15.7f)
            reflectiveQuadTo(2.5f, 11.99f)
            reflectiveQuadTo(3.24f, 8.3f)
            reflectiveQuadTo(5.28f, 5.28f)
            reflectiveQuadTo(8.3f, 3.24f)
            reflectiveQuadTo(12f, 2.5f)
            quadToRelative(0.59f, 0f, 1.15f, 0.06f)
            reflectiveQuadToRelative(1.1f, 0.2f)
            quadToRelative(0.34f, 0.08f, 0.54f, 0.35f)
            reflectiveQuadTo(15f, 3.73f)
            verticalLineTo(5f)
            quadToRelative(0f, 0.82f, -0.59f, 1.41f)
            reflectiveQuadTo(13f, 7f)
            horizontalLineTo(11f)
            verticalLineTo(9f)
            quadToRelative(0f, 0.42f, -0.29f, 0.71f)
            reflectiveQuadTo(10f, 10f)
            horizontalLineTo(8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(6f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(15f, 13f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(1f)
            quadToRelative(0.68f, 0f, 1.19f, 0.4f)
            reflectiveQuadToRelative(0.71f, 1f)
            quadToRelative(0.97f, -1.08f, 1.54f, -2.45f)
            reflectiveQuadTo(20f, 12f)
            quadToRelative(0f, -0.07f, 0f, -0.13f)
            reflectiveQuadTo(19.99f, 11.76f)
            quadToRelative(0f, -0.3f, 0.2f, -0.53f)
            reflectiveQuadTo(20.72f, 11f)
            quadToRelative(0.32f, 0f, 0.54f, 0.2f)
            reflectiveQuadToRelative(0.23f, 0.52f)
            quadToRelative(0.01f, 0.07f, 0.01f, 0.13f)
            reflectiveQuadToRelative(0f, 0.13f)
            quadToRelative(0f, 1.98f, -0.74f, 3.71f)
            reflectiveQuadToRelative(-2.03f, 3.02f)
            reflectiveQuadTo(15.7f, 20.76f)
            reflectiveQuadToRelative(-3.7f, 0.74f)
            reflectiveQuadTo(8.3f, 20.76f)
            close()
            moveTo(11f, 19.95f)
            verticalLineTo(18f)
            quadTo(10.18f, 18f, 9.59f, 17.41f)
            reflectiveQuadTo(9f, 16f)
            verticalLineTo(15f)
            lineTo(4.2f, 10.2f)
            quadTo(4.13f, 10.65f, 4.06f, 11.1f)
            reflectiveQuadTo(4f, 12f)
            quadToRelative(0f, 3.08f, 2.01f, 5.33f)
            reflectiveQuadTo(11f, 19.95f)
            close()
            moveTo(17.9f, 9f)
            quadTo(17.52f, 9f, 17.26f, 8.74f)
            reflectiveQuadTo(17f, 8.1f)
            verticalLineTo(5.13f)
            quadTo(17f, 4.75f, 17.26f, 4.49f)
            reflectiveQuadTo(17.9f, 4.23f)
            horizontalLineTo(18f)
            verticalLineToRelative(-1f)
            quadTo(18f, 2.44f, 18.55f, 1.9f)
            reflectiveQuadTo(19.88f, 1.35f)
            reflectiveQuadTo(21.22f, 1.9f)
            reflectiveQuadToRelative(0.55f, 1.34f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(0.1f)
            quadToRelative(0.39f, 0f, 0.65f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.65f)
            verticalLineTo(8.1f)
            quadToRelative(0f, 0.39f, -0.26f, 0.65f)
            reflectiveQuadTo(21.87f, 9f)
            horizontalLineTo(17.9f)
            close()
            moveTo(18.88f, 4.23f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1f)
            quadToRelative(0f, -0.42f, -0.29f, -0.71f)
            reflectiveQuadTo(19.88f, 2.23f)
            reflectiveQuadTo(19.17f, 2.52f)
            reflectiveQuadTo(18.88f, 3.23f)
            verticalLineToRelative(1f)
            close()
          }
        }
        .buildSimpIcon()
    return _VpnLock!!
  }

private var _VpnLock: ImageVector? = null
