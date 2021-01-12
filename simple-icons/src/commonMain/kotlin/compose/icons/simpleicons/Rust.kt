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

public val SimpleIcons.Rust: VectorAsset
    get() {
        if (_rust != null) {
            return _rust!!
        }
        _rust = VectorAssetBuilder(name = "Rust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8346f, 11.7033f)
                lineToRelative(-1.0073f, -0.6236f)
                arcToRelative(13.7268f, 13.7268f, 0.0f, false, false, -0.0283f, -0.2936f)
                lineToRelative(0.8656f, -0.8069f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, -0.1154f, -0.578f)
                lineToRelative(-1.1066f, -0.414f)
                arcToRelative(8.4958f, 8.4958f, 0.0f, false, false, -0.087f, -0.2856f)
                lineToRelative(0.6904f, -0.9587f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, -0.2257f, -0.5446f)
                lineToRelative(-1.1663f, -0.1894f)
                arcToRelative(9.3574f, 9.3574f, 0.0f, false, false, -0.1407f, -0.2622f)
                lineToRelative(0.49f, -1.0761f)
                arcToRelative(0.3437f, 0.3437f, 0.0f, false, false, -0.0274f, -0.3361f)
                arcToRelative(0.3486f, 0.3486f, 0.0f, false, false, -0.3006f, -0.154f)
                lineToRelative(-1.1845f, 0.0416f)
                arcToRelative(6.7444f, 6.7444f, 0.0f, false, false, -0.1873f, -0.2268f)
                lineToRelative(0.2723f, -1.153f)
                arcToRelative(0.3472f, 0.3472f, 0.0f, false, false, -0.417f, -0.4172f)
                lineToRelative(-1.1532f, 0.2724f)
                arcToRelative(14.0183f, 14.0183f, 0.0f, false, false, -0.2278f, -0.1873f)
                lineToRelative(0.0415f, -1.1845f)
                arcToRelative(0.3442f, 0.3442f, 0.0f, false, false, -0.49f, -0.328f)
                lineToRelative(-1.076f, 0.491f)
                curveToRelative(-0.0872f, -0.0476f, -0.1742f, -0.0952f, -0.2623f, -0.1407f)
                lineToRelative(-0.1903f, -1.1673f)
                arcTo(0.3483f, 0.3483f, 0.0f, false, false, 16.256f, 0.955f)
                lineToRelative(-0.9597f, 0.6905f)
                arcToRelative(8.4867f, 8.4867f, 0.0f, false, false, -0.2855f, -0.086f)
                lineToRelative(-0.414f, -1.1066f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, -0.5781f, -0.1154f)
                lineToRelative(-0.8069f, 0.8666f)
                arcToRelative(9.2936f, 9.2936f, 0.0f, false, false, -0.2936f, -0.0284f)
                lineTo(12.2946f, 0.1683f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, -0.5892f, 0.0f)
                lineToRelative(-0.6236f, 1.0073f)
                arcToRelative(13.7383f, 13.7383f, 0.0f, false, false, -0.2936f, 0.0284f)
                lineTo(9.9803f, 0.3374f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, -0.578f, 0.1154f)
                lineToRelative(-0.4141f, 1.1065f)
                curveToRelative(-0.0962f, 0.0274f, -0.1903f, 0.0567f, -0.2855f, 0.086f)
                lineTo(7.744f, 0.955f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, -0.5447f, 0.2258f)
                lineTo(7.009f, 2.348f)
                arcToRelative(9.3574f, 9.3574f, 0.0f, false, false, -0.2622f, 0.1407f)
                lineToRelative(-1.0762f, -0.491f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, -0.49f, 0.328f)
                lineToRelative(0.0416f, 1.1845f)
                arcToRelative(7.9826f, 7.9826f, 0.0f, false, false, -0.2278f, 0.1873f)
                lineTo(3.8413f, 3.425f)
                arcToRelative(0.3472f, 0.3472f, 0.0f, false, false, -0.4171f, 0.4171f)
                lineToRelative(0.2713f, 1.1531f)
                curveToRelative(-0.0628f, 0.075f, -0.1255f, 0.1509f, -0.1863f, 0.2268f)
                lineToRelative(-1.1845f, -0.0415f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, -0.328f, 0.49f)
                lineToRelative(0.491f, 1.0761f)
                arcToRelative(9.167f, 9.167f, 0.0f, false, false, -0.1407f, 0.2622f)
                lineToRelative(-1.1662f, 0.1894f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, -0.2258f, 0.5446f)
                lineToRelative(0.6904f, 0.9587f)
                arcToRelative(13.303f, 13.303f, 0.0f, false, false, -0.087f, 0.2855f)
                lineToRelative(-1.1065f, 0.414f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, -0.1155f, 0.5781f)
                lineToRelative(0.8656f, 0.807f)
                arcToRelative(9.2936f, 9.2936f, 0.0f, false, false, -0.0283f, 0.2935f)
                lineToRelative(-1.0073f, 0.6236f)
                arcToRelative(0.3442f, 0.3442f, 0.0f, false, false, 0.0f, 0.5892f)
                lineToRelative(1.0073f, 0.6236f)
                curveToRelative(0.008f, 0.0982f, 0.0182f, 0.1964f, 0.0283f, 0.2936f)
                lineToRelative(-0.8656f, 0.8079f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, 0.1155f, 0.578f)
                lineToRelative(1.1065f, 0.4141f)
                curveToRelative(0.0273f, 0.0962f, 0.0567f, 0.1914f, 0.087f, 0.2855f)
                lineToRelative(-0.6904f, 0.9587f)
                arcToRelative(0.3452f, 0.3452f, 0.0f, false, false, 0.2268f, 0.5447f)
                lineToRelative(1.1662f, 0.1893f)
                curveToRelative(0.0456f, 0.088f, 0.0922f, 0.1751f, 0.1408f, 0.2622f)
                lineToRelative(-0.491f, 1.0762f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, 0.328f, 0.49f)
                lineToRelative(1.1834f, -0.0415f)
                curveToRelative(0.0618f, 0.0769f, 0.1235f, 0.1528f, 0.1873f, 0.2277f)
                lineToRelative(-0.2713f, 1.1541f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, 0.4171f, 0.4161f)
                lineToRelative(1.153f, -0.2713f)
                curveToRelative(0.075f, 0.0638f, 0.151f, 0.1255f, 0.2279f, 0.1863f)
                lineToRelative(-0.0415f, 1.1845f)
                arcToRelative(0.3442f, 0.3442f, 0.0f, false, false, 0.49f, 0.327f)
                lineToRelative(1.0761f, -0.49f)
                curveToRelative(0.087f, 0.0486f, 0.1741f, 0.0951f, 0.2622f, 0.1407f)
                lineToRelative(0.1903f, 1.1662f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, 0.5447f, 0.2268f)
                lineToRelative(0.9587f, -0.6904f)
                arcToRelative(9.299f, 9.299f, 0.0f, false, false, 0.2855f, 0.087f)
                lineToRelative(0.414f, 1.1066f)
                arcToRelative(0.3452f, 0.3452f, 0.0f, false, false, 0.5781f, 0.1154f)
                lineToRelative(0.8079f, -0.8656f)
                curveToRelative(0.0972f, 0.0111f, 0.1954f, 0.0203f, 0.2936f, 0.0294f)
                lineToRelative(0.6236f, 1.0073f)
                arcToRelative(0.3472f, 0.3472f, 0.0f, false, false, 0.5892f, 0.0f)
                lineToRelative(0.6236f, -1.0073f)
                curveToRelative(0.0982f, -0.0091f, 0.1964f, -0.0183f, 0.2936f, -0.0294f)
                lineToRelative(0.8069f, 0.8656f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, 0.578f, -0.1154f)
                lineToRelative(0.4141f, -1.1066f)
                arcToRelative(8.4626f, 8.4626f, 0.0f, false, false, 0.2855f, -0.087f)
                lineToRelative(0.9587f, 0.6904f)
                arcToRelative(0.3452f, 0.3452f, 0.0f, false, false, 0.5447f, -0.2268f)
                lineToRelative(0.1903f, -1.1662f)
                curveToRelative(0.088f, -0.0456f, 0.1751f, -0.0931f, 0.2622f, -0.1407f)
                lineToRelative(1.0762f, 0.49f)
                arcToRelative(0.3472f, 0.3472f, 0.0f, false, false, 0.49f, -0.327f)
                lineToRelative(-0.0415f, -1.1845f)
                arcToRelative(6.7267f, 6.7267f, 0.0f, false, false, 0.2267f, -0.1863f)
                lineToRelative(1.1531f, 0.2713f)
                arcToRelative(0.3472f, 0.3472f, 0.0f, false, false, 0.4171f, -0.416f)
                lineToRelative(-0.2713f, -1.1542f)
                curveToRelative(0.0628f, -0.0749f, 0.1255f, -0.1508f, 0.1863f, -0.2278f)
                lineToRelative(1.1845f, 0.0415f)
                arcToRelative(0.3442f, 0.3442f, 0.0f, false, false, 0.328f, -0.49f)
                lineToRelative(-0.49f, -1.076f)
                curveToRelative(0.0475f, -0.0872f, 0.0951f, -0.1742f, 0.1407f, -0.2623f)
                lineToRelative(1.1662f, -0.1893f)
                arcToRelative(0.3483f, 0.3483f, 0.0f, false, false, 0.2258f, -0.5447f)
                lineToRelative(-0.6904f, -0.9587f)
                lineToRelative(0.087f, -0.2855f)
                lineToRelative(1.1066f, -0.414f)
                arcToRelative(0.3462f, 0.3462f, 0.0f, false, false, 0.1154f, -0.5781f)
                lineToRelative(-0.8656f, -0.8079f)
                curveToRelative(0.0101f, -0.0972f, 0.0202f, -0.1954f, 0.0283f, -0.2936f)
                lineToRelative(1.0073f, -0.6236f)
                arcToRelative(0.3442f, 0.3442f, 0.0f, false, false, 0.0f, -0.5892f)
                close()
                moveTo(17.0933f, 20.0584f)
                arcToRelative(0.7138f, 0.7138f, 0.0f, false, true, 0.2986f, -1.396f)
                arcToRelative(0.714f, 0.714f, 0.0f, true, true, -0.2997f, 1.396f)
                close()
                moveTo(16.7511f, 17.7442f)
                arcToRelative(0.649f, 0.649f, 0.0f, false, false, -0.7715f, 0.5f)
                lineToRelative(-0.3573f, 1.6685f)
                curveToRelative(-1.1035f, 0.501f, -2.3285f, 0.7795f, -3.6193f, 0.7795f)
                arcToRelative(8.7368f, 8.7368f, 0.0f, false, true, -3.6951f, -0.814f)
                lineToRelative(-0.3574f, -1.6684f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, -0.7714f, -0.499f)
                lineToRelative(-1.473f, 0.3158f)
                arcToRelative(8.7216f, 8.7216f, 0.0f, false, true, -0.7613f, -0.898f)
                horizontalLineToRelative(7.1676f)
                curveToRelative(0.081f, 0.0f, 0.1356f, -0.0141f, 0.1356f, -0.088f)
                verticalLineToRelative(-2.536f)
                curveToRelative(0.0f, -0.074f, -0.0536f, -0.0881f, -0.1356f, -0.0881f)
                horizontalLineToRelative(-2.0966f)
                verticalLineToRelative(-1.6077f)
                horizontalLineToRelative(2.2677f)
                curveToRelative(0.2065f, 0.0f, 1.1065f, 0.0587f, 1.394f, 1.2088f)
                curveToRelative(0.0901f, 0.3533f, 0.2875f, 1.5044f, 0.4232f, 1.8729f)
                curveToRelative(0.1346f, 0.413f, 0.6833f, 1.2381f, 1.2685f, 1.2381f)
                horizontalLineToRelative(3.5716f)
                arcToRelative(0.7492f, 0.7492f, 0.0f, false, false, 0.1296f, -0.0131f)
                arcToRelative(8.7874f, 8.7874f, 0.0f, false, true, -0.8119f, 0.9526f)
                close()
                moveTo(6.8369f, 20.024f)
                arcToRelative(0.714f, 0.714f, 0.0f, true, true, -0.2997f, -1.396f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, 0.2997f, 1.396f)
                close()
                moveTo(4.1177f, 8.9972f)
                arcToRelative(0.7137f, 0.7137f, 0.0f, true, true, -1.304f, 0.5791f)
                arcToRelative(0.7137f, 0.7137f, 0.0f, false, true, 1.304f, -0.579f)
                close()
                moveTo(3.2825f, 10.9785f)
                lineToRelative(1.5347f, -0.6824f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.33f, -0.8585f)
                lineToRelative(-0.3158f, -0.7147f)
                horizontalLineToRelative(1.2432f)
                verticalLineToRelative(5.6025f)
                lineTo(3.5669f, 14.3254f)
                arcToRelative(8.7753f, 8.7753f, 0.0f, false, true, -0.2834f, -3.348f)
                close()
                moveTo(10.0168f, 10.4348f)
                lineTo(10.0168f, 8.7836f)
                horizontalLineToRelative(2.9601f)
                curveToRelative(0.153f, 0.0f, 1.0792f, 0.1772f, 1.0792f, 0.8697f)
                curveToRelative(0.0f, 0.575f, -0.7107f, 0.7815f, -1.2948f, 0.7815f)
                close()
                moveTo(20.7742f, 11.921f)
                curveToRelative(0.0f, 0.2187f, -0.008f, 0.4363f, -0.0243f, 0.651f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-0.09f, 0.0f, -0.1265f, 0.0586f, -0.1265f, 0.1477f)
                verticalLineToRelative(0.413f)
                curveToRelative(0.0f, 0.973f, -0.5487f, 1.1846f, -1.0296f, 1.2382f)
                curveToRelative(-0.4576f, 0.0517f, -0.9648f, -0.1913f, -1.0275f, -0.4717f)
                curveToRelative(-0.2704f, -1.5186f, -0.7198f, -1.8436f, -1.4305f, -2.4034f)
                curveToRelative(0.8817f, -0.5599f, 1.799f, -1.386f, 1.799f, -2.4915f)
                curveToRelative(0.0f, -1.1936f, -0.819f, -1.9458f, -1.3769f, -2.3153f)
                curveToRelative(-0.7825f, -0.5163f, -1.6491f, -0.6195f, -1.883f, -0.6195f)
                lineTo(5.4682f, 6.0695f)
                arcToRelative(8.7651f, 8.7651f, 0.0f, false, true, 4.907f, -2.7699f)
                lineToRelative(1.0974f, 1.151f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, 0.9182f, 0.0213f)
                lineToRelative(1.227f, -1.1743f)
                arcToRelative(8.7753f, 8.7753f, 0.0f, false, true, 6.0044f, 4.2762f)
                lineToRelative(-0.8403f, 1.8982f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, 0.33f, 0.8585f)
                lineToRelative(1.6178f, 0.7188f)
                curveToRelative(0.0283f, 0.2875f, 0.0425f, 0.577f, 0.0425f, 0.8717f)
                close()
                moveTo(11.4736f, 2.3217f)
                arcToRelative(0.7128f, 0.7128f, 0.0f, true, true, 0.984f, 1.0316f)
                arcToRelative(0.7137f, 0.7137f, 0.0f, false, true, -0.984f, -1.0316f)
                close()
                moveTo(19.8125f, 9.0317f)
                arcToRelative(0.7107f, 0.7107f, 0.0f, false, true, 0.9395f, -0.3625f)
                arcToRelative(0.7137f, 0.7137f, 0.0f, true, true, -0.9405f, 0.3635f)
                close()
            }
        }
        .build()
        return _rust!!
    }

private var _rust: VectorAsset? = null
