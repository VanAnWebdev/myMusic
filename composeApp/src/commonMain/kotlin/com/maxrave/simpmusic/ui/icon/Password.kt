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
val SimpIcons.Password: ImageVector
  get() {
    if (_Password != null) {
      return _Password!!
    }
    _Password =
      ImageVector.Builder(
          name = "Password",
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
            moveTo(3f, 17.25f)
            horizontalLineTo(21f)
            quadToRelative(0.32f, 0f, 0.53f, 0.22f)
            reflectiveQuadTo(21.75f, 18f)
            reflectiveQuadToRelative(-0.22f, 0.53f)
            reflectiveQuadTo(21f, 18.75f)
            horizontalLineTo(3f)
            quadToRelative(-0.32f, 0f, -0.53f, -0.22f)
            reflectiveQuadTo(2.25f, 18f)
            reflectiveQuadTo(2.47f, 17.47f)
            reflectiveQuadTo(3f, 17.25f)
            close()
            moveTo(4f, 11.14f)
            lineTo(3.39f, 12.22f)
            quadTo(3.27f, 12.44f, 3.03f, 12.5f)
            reflectiveQuadTo(2.58f, 12.44f)
            reflectiveQuadTo(2.3f, 12.08f)
            reflectiveQuadTo(2.36f, 11.63f)
            lineTo(2.97f, 10.55f)
            horizontalLineTo(1.75f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(1.15f, 9.95f)
            reflectiveQuadTo(1.32f, 9.52f)
            reflectiveQuadTo(1.75f, 9.35f)
            horizontalLineTo(2.97f)
            lineTo(2.36f, 8.32f)
            quadTo(2.24f, 8.11f, 2.3f, 7.87f)
            reflectiveQuadTo(2.58f, 7.51f)
            reflectiveQuadTo(3.03f, 7.45f)
            reflectiveQuadTo(3.39f, 7.73f)
            lineTo(4f, 8.76f)
            lineTo(4.61f, 7.73f)
            quadTo(4.73f, 7.51f, 4.97f, 7.45f)
            reflectiveQuadTo(5.42f, 7.51f)
            reflectiveQuadTo(5.7f, 7.87f)
            reflectiveQuadTo(5.64f, 8.32f)
            lineTo(5.03f, 9.35f)
            horizontalLineTo(6.25f)
            quadToRelative(0.26f, 0f, 0.43f, 0.17f)
            reflectiveQuadTo(6.85f, 9.95f)
            reflectiveQuadTo(6.68f, 10.38f)
            reflectiveQuadTo(6.25f, 10.55f)
            horizontalLineTo(5.03f)
            lineToRelative(0.61f, 1.08f)
            quadToRelative(0.12f, 0.22f, 0.06f, 0.46f)
            reflectiveQuadTo(5.42f, 12.44f)
            reflectiveQuadTo(4.97f, 12.5f)
            reflectiveQuadTo(4.61f, 12.22f)
            lineTo(4f, 11.14f)
            close()
            moveToRelative(8f, 0f)
            lineToRelative(-0.61f, 1.08f)
            quadToRelative(-0.12f, 0.22f, -0.36f, 0.28f)
            reflectiveQuadTo(10.58f, 12.44f)
            reflectiveQuadTo(10.3f, 12.08f)
            reflectiveQuadToRelative(0.06f, -0.46f)
            lineToRelative(0.61f, -1.08f)
            horizontalLineTo(9.75f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(9.15f, 9.95f)
            reflectiveQuadTo(9.32f, 9.52f)
            reflectiveQuadTo(9.75f, 9.35f)
            horizontalLineToRelative(1.22f)
            lineTo(10.36f, 8.32f)
            quadTo(10.24f, 8.11f, 10.3f, 7.87f)
            reflectiveQuadTo(10.58f, 7.51f)
            reflectiveQuadTo(11.03f, 7.45f)
            reflectiveQuadToRelative(0.36f, 0.28f)
            lineTo(12f, 8.76f)
            lineTo(12.61f, 7.73f)
            quadTo(12.73f, 7.51f, 12.97f, 7.45f)
            reflectiveQuadToRelative(0.46f, 0.06f)
            reflectiveQuadTo(13.7f, 7.87f)
            reflectiveQuadTo(13.64f, 8.32f)
            lineTo(13.03f, 9.35f)
            horizontalLineToRelative(1.22f)
            quadToRelative(0.26f, 0f, 0.43f, 0.17f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            reflectiveQuadToRelative(-0.17f, 0.43f)
            reflectiveQuadToRelative(-0.43f, 0.17f)
            horizontalLineTo(13.03f)
            lineToRelative(0.61f, 1.08f)
            quadToRelative(0.12f, 0.22f, 0.06f, 0.46f)
            reflectiveQuadToRelative(-0.28f, 0.36f)
            reflectiveQuadTo(12.97f, 12.5f)
            reflectiveQuadTo(12.61f, 12.22f)
            lineTo(12f, 11.14f)
            close()
            moveToRelative(8f, 0f)
            lineToRelative(-0.61f, 1.08f)
            quadToRelative(-0.12f, 0.22f, -0.36f, 0.28f)
            reflectiveQuadTo(18.58f, 12.44f)
            reflectiveQuadTo(18.3f, 12.08f)
            reflectiveQuadToRelative(0.06f, -0.46f)
            lineToRelative(0.61f, -1.08f)
            horizontalLineTo(17.75f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(17.15f, 9.95f)
            reflectiveQuadTo(17.32f, 9.52f)
            reflectiveQuadTo(17.75f, 9.35f)
            horizontalLineToRelative(1.22f)
            lineTo(18.36f, 8.32f)
            quadTo(18.24f, 8.11f, 18.3f, 7.87f)
            reflectiveQuadTo(18.58f, 7.51f)
            reflectiveQuadTo(19.03f, 7.45f)
            reflectiveQuadToRelative(0.36f, 0.28f)
            lineTo(20f, 8.76f)
            lineTo(20.61f, 7.73f)
            quadTo(20.73f, 7.51f, 20.97f, 7.45f)
            reflectiveQuadToRelative(0.46f, 0.06f)
            reflectiveQuadTo(21.7f, 7.87f)
            reflectiveQuadTo(21.64f, 8.32f)
            lineTo(21.03f, 9.35f)
            horizontalLineToRelative(1.22f)
            quadToRelative(0.26f, 0f, 0.43f, 0.17f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            reflectiveQuadToRelative(-0.17f, 0.43f)
            reflectiveQuadToRelative(-0.43f, 0.17f)
            horizontalLineTo(21.03f)
            lineToRelative(0.61f, 1.08f)
            quadToRelative(0.12f, 0.22f, 0.06f, 0.46f)
            reflectiveQuadToRelative(-0.28f, 0.36f)
            reflectiveQuadTo(20.97f, 12.5f)
            reflectiveQuadTo(20.61f, 12.22f)
            lineTo(20f, 11.14f)
            close()
          }
        }
        .buildSimpIcon()
    return _Password!!
  }

private var _Password: ImageVector? = null
