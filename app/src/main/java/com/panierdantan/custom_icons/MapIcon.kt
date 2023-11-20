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


val Icons.MapIcon: ImageVector
    get() {
        if (_mapIcon != null) {
            return _mapIcon!!
        }
        _mapIcon = ImageVector.Builder(
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
                moveTo(9f, 6.75f)
                verticalLineTo(15f)
                moveToRelative(6f, -6f)
                verticalLineToRelative(8.25f)
                moveToRelative(0.503f, 3.498f)
                lineToRelative(4.875f, -2.437f)
                curveToRelative(0.381f, -0.19f, 0.622f, -0.58f, 0.622f, -1.006f)
                verticalLineTo(4.82f)
                curveToRelative(0f, -0.836f, -0.88f, -1.38f, -1.628f, -1.006f)
                lineToRelative(-3.869f, 1.934f)
                curveToRelative(-0.317f, 0.159f, -0.69f, 0.159f, -1.006f, 0f)
                lineTo(9.503f, 3.252f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.006f, 0f)
                lineTo(3.622f, 5.689f)
                curveTo(3.24f, 5.88f, 3f, 6.27f, 3f, 6.695f)
                verticalLineTo(19.18f)
                curveToRelative(0f, 0.836f, 0.88f, 1.38f, 1.628f, 1.006f)
                lineToRelative(3.869f, -1.934f)
                curveToRelative(0.317f, -0.159f, 0.69f, -0.159f, 1.006f, 0f)
                lineToRelative(4.994f, 2.497f)
                curveToRelative(0.317f, 0.158f, 0.69f, 0.158f, 1.006f, 0f)
                close()
            }
        }.build()
        return _mapIcon!!
    }
private var _mapIcon: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconMapIconPreview() {
    Image(imageVector = Icons.MapIcon, contentDescription = null)
}