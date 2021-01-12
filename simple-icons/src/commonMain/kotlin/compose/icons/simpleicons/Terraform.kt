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

public val SimpleIcons.Terraform: VectorAsset
    get() {
        if (_terraform != null) {
            return _terraform!!
        }
        _terraform = VectorAssetBuilder(name = "Terraform", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.44f, 0.0f)
                verticalLineToRelative(7.575f)
                lineToRelative(6.561f, 3.79f)
                lineTo(8.001f, 3.787f)
                close()
                moveTo(22.56f, 4.227f)
                lineToRelative(-6.561f, 3.791f)
                verticalLineToRelative(7.574f)
                lineToRelative(6.56f, -3.787f)
                close()
                moveTo(8.72f, 4.23f)
                verticalLineToRelative(7.575f)
                lineToRelative(6.561f, 3.787f)
                lineTo(15.281f, 8.018f)
                close()
                moveTo(8.72f, 12.635f)
                verticalLineToRelative(7.575f)
                lineTo(15.28f, 24.0f)
                verticalLineToRelative(-7.578f)
                close()
            }
        }
        .build()
        return _terraform!!
    }

private var _terraform: VectorAsset? = null
