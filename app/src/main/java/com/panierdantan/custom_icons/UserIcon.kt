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

val Icons.UserIcon: ImageVector
    get() {
        if (_userIcon != null) {
            return _userIcon!!
        }
        _userIcon = ImageVector.Builder(
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
                moveTo(15.75f, 6f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 0f)
                close()
                moveTo(4.501f, 20.118f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.998f, 0f)
                arcTo(17.933f, 17.933f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.75f)
                curveToRelative(-2.676f, 0f, -5.216f, -0.584f, -7.499f, -1.632f)
                close()
            }
        }.build()
        return _userIcon!!
    }
private var _userIcon: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconUserIconPreview() {
    Image(imageVector = Icons.UserIcon, contentDescription = null)
}