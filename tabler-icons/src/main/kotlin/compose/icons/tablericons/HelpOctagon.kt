package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) {
            return _helpOctagon!!
        }
        _helpOctagon = Builder(name = "HelpOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.802f, 2.165f)
                lineToRelative(5.575f, 2.389f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0.0f, 1.604f)
                lineToRelative(-2.389f, 5.575f)
                curveToRelative(-0.206f, 0.48f, -0.589f, 0.863f, -1.07f, 1.07f)
                lineToRelative(-5.574f, 2.388f)
                curveToRelative(-0.512f, 0.22f, -1.092f, 0.22f, -1.604f, 0.0f)
                lineToRelative(-5.575f, -2.389f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 0.0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.206f, -0.48f, 0.589f, -0.863f, 1.07f, -1.07f)
                lineToRelative(5.574f, -2.388f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, 1.604f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.914f, -3.782f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -2.414f, 0.483f)
            }
        }
        .build()
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null