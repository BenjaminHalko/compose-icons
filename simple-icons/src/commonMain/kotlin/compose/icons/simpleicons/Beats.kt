package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Beats: VectorAsset
    get() {
        if (_beats != null) {
            return _beats!!
        }
        _beats = VectorAssetBuilder(name = "Beats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.625f, 0.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(8.25f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.0f, -15.0f)
                close()
                moveTo(19.641f, 11.705f)
                curveToRelative(-1.571f, 3.261f, -4.91f, 5.517f, -8.766f, 5.517f)
                horizontalLineToRelative(-8.25f)
                lineTo(2.625f, 24.0f)
                horizontalLineToRelative(11.25f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 5.766f, -12.295f)
                close()
            }
        }
        .build()
        return _beats!!
    }

private var _beats: VectorAsset? = null
