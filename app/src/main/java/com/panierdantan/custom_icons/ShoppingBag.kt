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

val Icons.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = ImageVector.Builder(
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
                moveTo(15.75f, 10.5f)
                verticalLineTo(6f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(11.356f, -1.993f)
                lineToRelative(1.263f, 12f)
                curveToRelative(0.07f, 0.665f, -0.45f, 1.243f, -1.119f, 1.243f)
                horizontalLineTo(4.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.12f, -1.243f)
                lineToRelative(1.264f, -12f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.513f, 7.5f)
                horizontalLineToRelative(12.974f)
                curveToRelative(0.576f, 0f, 1.059f, 0.435f, 1.119f, 1.007f)
                close()
                moveTo(8.625f, 10.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveToRelative(7.5f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()
        return _shoppingBag!!
    }
private var _shoppingBag: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconShoppingBagPreview() {
    Image(imageVector = Icons.ShoppingBag, contentDescription = null)
}