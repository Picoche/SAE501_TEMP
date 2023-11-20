package com.panierdantan.custom_icons

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val Icons.FavorisIcon: ImageVector
    get() {
        if (_favorisIcon != null) {
            return _favorisIcon!!
        }
        _favorisIcon = ImageVector.Builder(
            name = "FavorisIcon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            tintColor = Color.White
        ).apply {
            path(
                stroke = SolidColor(Color.White), // Set the stroke color to white
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
            ) {
                moveTo(21f, 8.25f)
                curveToRelative(0f, -2.485f, -2.099f, -4.5f, -4.688f, -4.5f)
                curveToRelative(-1.935f, 0f, -3.597f, 1.126f, -4.312f, 2.733f)
                curveToRelative(-0.715f, -1.607f, -2.377f, -2.733f, -4.313f, -2.733f)
                curveTo(5.1f, 3.75f, 3f, 5.765f, 3f, 8.25f)
                curveToRelative(0f, 7.22f, 9f, 12f, 9f, 12f)
                reflectiveCurveToRelative(9f, -4.78f, 9f, -12f)
                close()
            }
        }.build()
        return _favorisIcon!!
    }
private var _favorisIcon: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconVectorPreview() {
    Image(imageVector = Icons.FavorisIcon, contentDescription = null)
}