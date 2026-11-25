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
val SimpIcons.Abc: ImageVector
  get() {
    if (_Abc != null) {
      return _Abc!!
    }
    _Abc =
      ImageVector.Builder(
          name = "Abc",
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
            moveTo(10.11f, 14.85f)
            quadToRelative(-0.18f, 0f, -0.32f, -0.14f)
            reflectiveQuadTo(9.65f, 14.39f)
            verticalLineTo(9.61f)
            quadToRelative(0f, -0.18f, 0.14f, -0.32f)
            reflectiveQuadTo(10.11f, 9.15f)
            horizontalLineToRelative(3.36f)
            quadToRelative(0.37f, 0f, 0.63f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.63f)
            verticalLineToRelative(1.12f)
            quadToRelative(0f, 0.34f, -0.22f, 0.58f)
            reflectiveQuadTo(13.56f, 12f)
            quadToRelative(0.34f, 0.03f, 0.56f, 0.27f)
            reflectiveQuadToRelative(0.22f, 0.58f)
            verticalLineToRelative(1.12f)
            quadToRelative(0f, 0.37f, -0.26f, 0.63f)
            reflectiveQuadToRelative(-0.63f, 0.26f)
            horizontalLineTo(10.11f)
            close()
            moveTo(10.85f, 11.4f)
            horizontalLineToRelative(2.31f)
            verticalLineTo(10.35f)
            horizontalLineTo(10.85f)
            verticalLineTo(11.4f)
            close()
            moveToRelative(0f, 2.25f)
            horizontalLineToRelative(2.31f)
            verticalLineTo(12.6f)
            horizontalLineTo(10.85f)
            verticalLineToRelative(1.06f)
            close()
            moveTo(3.77f, 14.85f)
            quadToRelative(-0.26f, 0f, -0.43f, -0.17f)
            reflectiveQuadTo(3.17f, 14.25f)
            verticalLineTo(10.04f)
            quadToRelative(0f, -0.37f, 0.26f, -0.63f)
            reflectiveQuadTo(4.06f, 9.15f)
            horizontalLineTo(6.98f)
            quadToRelative(0.37f, 0f, 0.63f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.63f)
            verticalLineToRelative(4.22f)
            quadToRelative(0f, 0.25f, -0.17f, 0.42f)
            reflectiveQuadTo(7.27f, 14.85f)
            reflectiveQuadTo(6.84f, 14.68f)
            reflectiveQuadTo(6.67f, 14.25f)
            verticalLineToRelative(-1f)
            horizontalLineTo(4.37f)
            verticalLineToRelative(1.01f)
            quadToRelative(0f, 0.25f, -0.17f, 0.42f)
            reflectiveQuadTo(3.77f, 14.85f)
            close()
            moveToRelative(0.6f, -2.79f)
            horizontalLineTo(6.67f)
            verticalLineTo(10.35f)
            horizontalLineTo(4.37f)
            verticalLineToRelative(1.71f)
            close()
            moveToRelative(12.65f, 2.79f)
            quadToRelative(-0.37f, 0f, -0.63f, -0.26f)
            reflectiveQuadTo(16.13f, 13.96f)
            verticalLineTo(10.04f)
            quadToRelative(0f, -0.37f, 0.26f, -0.63f)
            reflectiveQuadTo(17.02f, 9.15f)
            horizontalLineToRelative(2.92f)
            quadToRelative(0.37f, 0f, 0.63f, 0.26f)
            reflectiveQuadToRelative(0.26f, 0.63f)
            verticalLineTo(10.7f)
            quadToRelative(0f, 0.25f, -0.17f, 0.42f)
            reflectiveQuadToRelative(-0.43f, 0.17f)
            reflectiveQuadTo(19.8f, 11.12f)
            reflectiveQuadTo(19.63f, 10.69f)
            verticalLineTo(10.35f)
            horizontalLineTo(17.33f)
            verticalLineToRelative(3.31f)
            horizontalLineToRelative(2.31f)
            verticalLineTo(13.31f)
            quadToRelative(0f, -0.26f, 0.17f, -0.43f)
            reflectiveQuadToRelative(0.43f, -0.17f)
            reflectiveQuadToRelative(0.43f, 0.17f)
            reflectiveQuadToRelative(0.17f, 0.43f)
            verticalLineToRelative(0.65f)
            quadToRelative(0f, 0.37f, -0.26f, 0.63f)
            reflectiveQuadToRelative(-0.63f, 0.26f)
            horizontalLineTo(17.02f)
            close()
          }
        }
        .buildSimpIcon()
    return _Abc!!
  }

private var _Abc: ImageVector? = null
