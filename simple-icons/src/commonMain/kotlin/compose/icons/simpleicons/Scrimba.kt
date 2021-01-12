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

public val SimpleIcons.Scrimba: VectorAsset
    get() {
        if (_scrimba != null) {
            return _scrimba!!
        }
        _scrimba = VectorAssetBuilder(name = "Scrimba", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.222f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, true, -2.222f, 2.222f)
                horizontalLineToRelative(-8.89f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, true, 0.0f, -4.444f)
                horizontalLineToRelative(8.89f)
                curveTo(23.005f, 4.0f, 24.0f, 4.995f, 24.0f, 6.222f)
                close()
                moveTo(16.667f, 15.556f)
                horizontalLineToRelative(-8.89f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, false, 0.0f, 4.444f)
                horizontalLineToRelative(8.89f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, false, 0.0f, -4.444f)
                close()
                moveTo(16.667f, 9.778f)
                lineTo(13.11f, 9.778f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, false, 0.0f, 4.444f)
                horizontalLineToRelative(3.556f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, false, 0.0f, -4.444f)
                close()
                moveTo(2.222f, 15.556f)
                arcToRelative(2.222f, 2.222f, 0.0f, true, false, 0.0f, 4.444f)
                arcToRelative(2.222f, 2.222f, 0.0f, false, false, 0.0f, -4.444f)
                close()
            }
        }
        .build()
        return _scrimba!!
    }

private var _scrimba: VectorAsset? = null
