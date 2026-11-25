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
val SimpIcons.RssFeed: ImageVector
  get() {
    if (_RssFeed != null) {
      return _RssFeed!!
    }
    _RssFeed =
      ImageVector.Builder(
          name = "RssFeed",
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
            moveTo(3.97f, 20.03f)
            quadTo(3.5f, 19.56f, 3.5f, 18.88f)
            reflectiveQuadTo(3.97f, 17.74f)
            reflectiveQuadTo(5.12f, 17.27f)
            reflectiveQuadToRelative(1.14f, 0.47f)
            reflectiveQuadToRelative(0.47f, 1.14f)
            reflectiveQuadTo(6.26f, 20.03f)
            reflectiveQuadTo(5.12f, 20.5f)
            reflectiveQuadTo(3.97f, 20.03f)
            close()
            moveTo(18.38f, 20.5f)
            quadToRelative(-0.49f, 0f, -0.81f, -0.36f)
            reflectiveQuadTo(17.2f, 19.27f)
            quadTo(16.98f, 16.78f, 15.95f, 14.61f)
            reflectiveQuadTo(13.24f, 10.76f)
            reflectiveQuadTo(9.39f, 8.05f)
            reflectiveQuadTo(4.73f, 6.8f)
            quadTo(4.23f, 6.75f, 3.86f, 6.42f)
            reflectiveQuadTo(3.5f, 5.62f)
            reflectiveQuadTo(3.85f, 4.82f)
            reflectiveQuadTo(4.67f, 4.55f)
            quadToRelative(2.98f, 0.22f, 5.57f, 1.44f)
            reflectiveQuadToRelative(4.57f, 3.2f)
            reflectiveQuadToRelative(3.2f, 4.57f)
            reflectiveQuadToRelative(1.44f, 5.57f)
            quadToRelative(0.04f, 0.47f, -0.27f, 0.82f)
            reflectiveQuadToRelative(-0.8f, 0.35f)
            close()
            moveToRelative(-5.77f, 0f)
            quadToRelative(-0.47f, 0f, -0.8f, -0.34f)
            reflectiveQuadTo(11.4f, 19.35f)
            quadTo(11.21f, 18.02f, 10.63f, 16.89f)
            reflectiveQuadTo(9.15f, 14.85f)
            reflectiveQuadTo(7.11f, 13.37f)
            reflectiveQuadTo(4.65f, 12.6f)
            quadTo(4.18f, 12.52f, 3.84f, 12.19f)
            reflectiveQuadTo(3.5f, 11.38f)
            quadToRelative(0f, -0.49f, 0.35f, -0.8f)
            reflectiveQuadTo(4.67f, 10.34f)
            quadToRelative(1.78f, 0.2f, 3.32f, 0.96f)
            reflectiveQuadToRelative(2.75f, 1.96f)
            reflectiveQuadToRelative(1.96f, 2.75f)
            reflectiveQuadToRelative(0.96f, 3.32f)
            quadToRelative(0.07f, 0.47f, -0.24f, 0.82f)
            reflectiveQuadToRelative(-0.8f, 0.35f)
            close()
          }
        }
        .buildSimpIcon()
    return _RssFeed!!
  }

private var _RssFeed: ImageVector? = null
