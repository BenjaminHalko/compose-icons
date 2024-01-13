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

public val TablerIcons.Magnetic: ImageVector
    get() {
        if (_magnetic != null) {
            return _magnetic!!
        }
        _magnetic = Builder(name = "Magnetic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveToRelative(-0.633f, -1.255f, -1.538f, -2.0f, -2.5f, -2.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 3.134f, -3.5f, 7.0f)
                reflectiveCurveToRelative(1.567f, 7.0f, 3.5f, 7.0f)
                reflectiveCurveToRelative(3.5f, -3.134f, 3.5f, -7.0f)
                verticalLineToRelative(-1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveToRelative(0.633f, -1.255f, 1.538f, -2.0f, 2.5f, -2.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, 3.134f, 3.5f, 7.0f)
                reflectiveCurveToRelative(-1.567f, 7.0f, -3.5f, 7.0f)
                reflectiveCurveToRelative(-3.5f, -3.134f, -3.5f, -7.0f)
                verticalLineToRelative(-1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
            }
        }
        .build()
        return _magnetic!!
    }

private var _magnetic: ImageVector? = null