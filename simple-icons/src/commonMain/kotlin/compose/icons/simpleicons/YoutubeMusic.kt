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

public val SimpleIcons.YoutubeMusic: VectorAsset
    get() {
        if (_youtubeMusic != null) {
            return _youtubeMusic!!
        }
        _youtubeMusic = VectorAssetBuilder(name = "YoutubeMusic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.376f, 0.0f, 0.0f, 5.376f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.376f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.376f, 12.0f, -12.0f)
                reflectiveCurveTo(18.624f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 19.104f)
                curveToRelative(-3.924f, 0.0f, -7.104f, -3.18f, -7.104f, -7.104f)
                reflectiveCurveTo(8.076f, 4.896f, 12.0f, 4.896f)
                reflectiveCurveToRelative(7.104f, 3.18f, 7.104f, 7.104f)
                reflectiveCurveToRelative(-3.18f, 7.104f, -7.104f, 7.104f)
                close()
                moveTo(12.0f, 5.772f)
                curveToRelative(-3.432f, 0.0f, -6.228f, 2.796f, -6.228f, 6.228f)
                reflectiveCurveTo(8.568f, 18.228f, 12.0f, 18.228f)
                reflectiveCurveToRelative(6.228f, -2.796f, 6.228f, -6.228f)
                reflectiveCurveTo(15.432f, 5.772f, 12.0f, 5.772f)
                close()
                moveTo(9.684f, 15.54f)
                lineTo(9.684f, 8.46f)
                lineTo(15.816f, 12.0f)
                lineToRelative(-6.132f, 3.54f)
                close()
            }
        }
        .build()
        return _youtubeMusic!!
    }

private var _youtubeMusic: VectorAsset? = null
