package com.panierdantan.custom_icons

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Icons.ShopIcon: ImageVector
    get() {
        if (_shopIcon != null) {
            return _shopIcon!!
        }
        _shopIcon = ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13.5f, 21f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineTo(21f)
                moveToRelative(-4.5f, 0f)
                horizontalLineTo(2.36f)
                moveToRelative(11.14f, 0f)
                horizontalLineTo(18f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.64f)
                moveToRelative(-1.39f, 0f)
                verticalLineTo(9.349f)
                moveToRelative(-16.5f, 11.65f)
                verticalLineTo(9.35f)
                moveToRelative(0f, 0f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, -0.615f)
                arcTo(2.993f, 2.993f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, 9.75f)
                curveToRelative(0.896f, 0f, 1.7f, -0.393f, 2.25f, -1.016f)
                arcToRelative(2.993f, 2.993f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 1.016f)
                curveToRelative(0.896f, 0f, 1.7f, -0.393f, 2.25f, -1.016f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 0.614f)
                moveToRelative(-16.5f, 0f)
                arcToRelative(3.004f, 3.004f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.621f, -4.72f)
                lineTo(4.318f, 3.44f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.378f, 3f)
                horizontalLineToRelative(13.243f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.44f)
                lineToRelative(1.19f, 1.189f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.621f, 4.72f)
                moveToRelative(-13.5f, 8.65f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineTo(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        return _shopIcon!!
    }
private var _shopIcon: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconShopIconPreview() {
    Image(imageVector = Icons.ShopIcon, contentDescription = null)
}