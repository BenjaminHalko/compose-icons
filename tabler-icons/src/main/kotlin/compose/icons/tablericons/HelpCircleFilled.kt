package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HelpCircleFilled: ImageVector
    get() {
        if (_helpCircleFilled != null) {
            return _helpCircleFilled!!
        }
        _helpCircleFilled = Builder(name = "HelpCircleFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -19.995f, 0.324f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
                moveTo(13.368f, 8.327f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -3.631f, 0.728f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 1.11f, -0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.111f, 1.994f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.371f, -5.673f)
                close()
            }
        }
        .build()
        return _helpCircleFilled!!
    }

private var _helpCircleFilled: ImageVector? = null
