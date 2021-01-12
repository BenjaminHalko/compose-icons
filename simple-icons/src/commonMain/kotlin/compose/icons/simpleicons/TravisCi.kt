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

public val SimpleIcons.TravisCi: VectorAsset
    get() {
        if (_travisCi != null) {
            return _travisCi!!
        }
        _travisCi = VectorAssetBuilder(name = "TravisCi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.32f, 13.025f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, true, -0.97f, 0.0f)
                curveToRelative(0.0f, -0.446f, -0.167f, -0.758f, -0.406f, -0.758f)
                curveToRelative(-0.239f, 0.0f, -0.405f, 0.312f, -0.405f, 0.758f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, true, -0.97f, 0.0f)
                curveToRelative(0.0f, -1.187f, 0.713f, -1.728f, 1.375f, -1.728f)
                reflectiveCurveToRelative(1.376f, 0.541f, 1.376f, 1.728f)
                close()
                moveTo(15.337f, 13.51f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, 0.485f, -0.485f)
                curveToRelative(0.0f, -0.446f, 0.167f, -0.758f, 0.405f, -0.758f)
                reflectiveCurveToRelative(0.405f, 0.312f, 0.405f, 0.758f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, false, 0.97f, 0.0f)
                curveToRelative(0.0f, -1.187f, -0.713f, -1.728f, -1.375f, -1.728f)
                reflectiveCurveToRelative(-1.375f, 0.541f, -1.375f, 1.728f)
                curveToRelative(0.0f, 0.268f, 0.217f, 0.485f, 0.485f, 0.485f)
                close()
                moveTo(23.304f, 9.056f)
                lineToRelative(-0.191f, 2.459f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.367f, 0.623f)
                arcToRelative(0.852f, 0.852f, 0.0f, false, true, -0.46f, 0.13f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, -0.366f, -0.068f)
                curveToRelative(-0.271f, -0.101f, -0.544f, -0.192f, -0.817f, -0.285f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, true, -0.094f, 1.614f)
                curveToRelative(-0.04f, 0.242f, -0.092f, 0.471f, -0.138f, 0.707f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, -0.024f, 0.125f)
                arcToRelative(19.471f, 19.471f, 0.0f, false, true, -1.033f, 3.513f)
                lineToRelative(0.033f, -0.02f)
                lineToRelative(0.897f, -0.537f)
                curveToRelative(0.193f, -0.137f, 0.599f, -0.122f, 0.815f, 0.1f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, true, 0.173f, 0.577f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.053f, 0.159f)
                curveToRelative(-0.061f, 0.135f, -0.319f, 0.706f, -0.866f, 1.906f)
                curveToRelative(-0.675f, 1.483f, -2.06f, 1.77f, -2.121f, 1.782f)
                curveToRelative(0.001f, 0.001f, -0.907f, 0.214f, -1.879f, 0.44f)
                curveTo(15.458f, 23.419f, 13.87f, 24.0f, 12.087f, 24.0f)
                curveToRelative(-1.84f, 0.0f, -3.448f, -0.58f, -4.787f, -1.713f)
                lineToRelative(-1.924f, -0.45f)
                curveToRelative(-0.041f, -0.008f, -1.427f, -0.294f, -2.103f, -1.778f)
                lineToRelative(-0.87f, -1.914f)
                curveToRelative(-0.005f, -0.019f, -0.05f, -0.158f, -0.053f, -0.177f)
                curveToRelative(-0.009f, -0.625f, 0.621f, -0.914f, 1.023f, -0.632f)
                lineToRelative(0.858f, 0.512f)
                curveToRelative(0.006f, 0.003f, 0.074f, 0.043f, 0.171f, 0.085f)
                arcToRelative(20.443f, 20.443f, 0.0f, false, true, -0.982f, -3.444f)
                curveToRelative(-0.063f, -0.317f, -0.129f, -0.63f, -0.183f, -0.96f)
                arcToRelative(8.937f, 8.937f, 0.0f, false, true, -0.09f, -1.7f)
                curveToRelative(-0.357f, 0.118f, -0.713f, 0.24f, -1.066f, 0.372f)
                curveToRelative(-0.292f, 0.109f, -0.593f, 0.087f, -0.827f, -0.062f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, -0.366f, -0.621f)
                lineTo(0.695f, 9.055f)
                curveToRelative(-0.036f, -0.475f, 0.305f, -0.969f, 0.794f, -1.152f)
                lineToRelative(0.3f, -0.117f)
                curveToRelative(0.225f, -0.089f, 0.505f, -0.198f, 0.837f, -0.318f)
                curveTo(3.65f, 3.124f, 7.566f, 0.0f, 12.041f, 0.0f)
                curveToRelative(4.516f, 0.0f, 8.438f, 3.158f, 9.434f, 7.549f)
                curveToRelative(0.472f, 0.153f, 0.843f, 0.281f, 1.036f, 0.355f)
                curveToRelative(0.492f, 0.183f, 0.833f, 0.677f, 0.793f, 1.152f)
                close()
                moveTo(18.692f, 18.029f)
                curveToRelative(0.369f, -0.815f, 0.678f, -1.708f, 0.93f, -2.67f)
                lineToRelative(-0.997f, 0.713f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, true, -0.655f, 0.166f)
                lineToRelative(-4.467f, -0.47f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -0.821f, -0.698f)
                lineToRelative(-0.558f, -1.923f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, false, -0.244f, 0.0f)
                lineToRelative(-0.56f, 1.93f)
                arcToRelative(0.955f, 0.955f, 0.0f, false, true, -0.82f, 0.691f)
                lineToRelative(-4.471f, 0.471f)
                arcToRelative(0.951f, 0.951f, 0.0f, false, true, -0.642f, -0.162f)
                lineToRelative(-0.723f, -0.503f)
                curveToRelative(0.231f, 0.889f, 0.506f, 1.708f, 0.824f, 2.451f)
                curveToRelative(0.609f, -0.028f, 1.207f, -0.069f, 1.209f, -0.069f)
                curveToRelative(0.001f, 0.0f, 0.434f, -0.039f, 0.788f, -0.332f)
                lineToRelative(1.061f, -0.885f)
                curveToRelative(0.148f, -0.165f, 0.652f, -0.465f, 1.33f, -0.271f)
                curveToRelative(0.196f, 0.055f, 0.495f, 0.146f, 0.815f, 0.243f)
                curveToRelative(0.062f, 0.019f, 0.12f, 0.05f, 0.17f, 0.092f)
                curveToRelative(0.532f, 0.445f, 1.832f, 0.445f, 2.365f, 0.002f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, true, 0.168f, -0.091f)
                curveToRelative(0.337f, -0.103f, 0.631f, -0.192f, 0.823f, -0.247f)
                curveToRelative(0.68f, -0.193f, 1.182f, 0.108f, 1.374f, 0.314f)
                lineToRelative(1.016f, 0.843f)
                curveToRelative(0.353f, 0.294f, 0.785f, 0.332f, 0.789f, 0.332f)
                curveToRelative(-0.001f, 0.001f, 0.658f, 0.045f, 1.296f, 0.073f)
                close()
                moveTo(12.087f, 23.03f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, false, 1.949f, -0.313f)
                curveToRelative(-0.932f, -0.209f, -1.555f, -1.019f, -1.588f, -1.062f)
                lineToRelative(-0.406f, -0.542f)
                lineToRelative(-0.407f, 0.543f)
                curveToRelative(-0.031f, 0.043f, -0.641f, 0.842f, -1.558f, 1.06f)
                curveToRelative(0.63f, 0.196f, 1.295f, 0.314f, 2.01f, 0.314f)
                close()
                moveTo(19.028f, 19.014f)
                arcToRelative(63.622f, 63.622f, 0.0f, false, true, -1.701f, -0.089f)
                arcToRelative(2.519f, 2.519f, 0.0f, false, true, -1.339f, -0.554f)
                lineToRelative(-1.065f, -0.888f)
                curveToRelative(-0.055f, -0.051f, -0.187f, -0.152f, -0.442f, -0.083f)
                curveToRelative(-0.176f, 0.05f, -0.436f, 0.13f, -0.717f, 0.216f)
                curveToRelative(-0.878f, 0.655f, -2.567f, 0.655f, -3.443f, -0.003f)
                arcToRelative(43.693f, 43.693f, 0.0f, false, false, -0.709f, -0.212f)
                curveToRelative(-0.258f, -0.076f, -0.386f, 0.03f, -0.411f, 0.052f)
                lineToRelative(-1.097f, 0.918f)
                arcToRelative(2.523f, 2.523f, 0.0f, false, true, -1.341f, 0.553f)
                reflectiveCurveToRelative(-0.872f, 0.059f, -1.594f, 0.085f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.106f, 0.004f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, true, -1.341f, -0.343f)
                lineToRelative(-0.018f, -0.01f)
                lineToRelative(0.453f, 0.996f)
                curveToRelative(0.463f, 1.017f, 1.389f, 1.225f, 1.427f, 1.232f)
                curveToRelative(0.014f, 0.004f, 2.754f, 0.646f, 3.822f, 0.889f)
                curveToRelative(0.781f, 0.174f, 1.447f, -0.696f, 1.454f, -0.705f)
                lineToRelative(0.795f, -1.061f)
                curveToRelative(0.183f, -0.245f, 0.594f, -0.245f, 0.776f, 0.0f)
                lineToRelative(0.796f, 1.061f)
                curveToRelative(0.007f, 0.009f, 0.682f, 0.881f, 1.455f, 0.705f)
                curveToRelative(1.067f, -0.243f, 3.807f, -0.886f, 3.807f, -0.886f)
                arcToRelative(2.193f, 2.193f, 0.0f, false, false, 1.442f, -1.236f)
                lineToRelative(0.452f, -0.993f)
                lineToRelative(-0.026f, 0.015f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -1.327f, 0.337f)
                close()
                moveTo(20.124f, 11.602f)
                arcToRelative(28.286f, 28.286f, 0.0f, false, false, -15.998f, -0.075f)
                arcToRelative(8.025f, 8.025f, 0.0f, false, false, 0.067f, 1.845f)
                curveToRelative(0.045f, 0.275f, 0.1f, 0.535f, 0.152f, 0.8f)
                lineToRelative(1.591f, 1.108f)
                lineToRelative(4.461f, -0.476f)
                lineToRelative(0.642f, -2.243f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, true, 0.395f, -0.345f)
                arcToRelative(3.855f, 3.855f, 0.0f, false, true, 1.135f, 0.003f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, true, 0.394f, 0.344f)
                lineToRelative(0.652f, 2.245f)
                lineToRelative(4.462f, 0.468f)
                lineToRelative(1.864f, -1.336f)
                curveToRelative(0.036f, -0.19f, 0.079f, -0.374f, 0.111f, -0.568f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, 0.072f, -1.77f)
                close()
                moveTo(22.338f, 8.979f)
                curveToRelative(-0.005f, -0.034f, -0.073f, -0.133f, -0.165f, -0.167f)
                lineToRelative(-0.004f, -0.001f)
                curveToRelative(-0.22f, -0.083f, -0.68f, -0.242f, -1.256f, -0.423f)
                lineToRelative(-0.007f, -0.005f)
                curveToRelative(-0.955f, -0.299f, -2.771f, -0.823f, -4.267f, -0.99f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, 0.108f, -0.964f)
                curveToRelative(1.192f, 0.134f, 2.529f, 0.466f, 3.637f, 0.787f)
                curveTo(19.298f, 3.552f, 15.913f, 0.97f, 12.041f, 0.97f)
                curveToRelative(-3.832f, 0.0f, -7.207f, 2.549f, -8.318f, 6.165f)
                arcToRelative(20.252f, 20.252f, 0.0f, false, true, 3.27f, -0.705f)
                arcToRelative(0.484f, 0.484f, 0.0f, true, true, 0.121f, 0.962f)
                arcToRelative(19.235f, 19.235f, 0.0f, false, false, -3.909f, 0.899f)
                lineToRelative(-0.005f, 0.004f)
                curveToRelative(-0.432f, 0.149f, -0.785f, 0.288f, -1.056f, 0.394f)
                lineToRelative(-0.315f, 0.123f)
                curveToRelative(-0.094f, 0.035f, -0.162f, 0.135f, -0.167f, 0.175f)
                lineToRelative(0.177f, 2.264f)
                arcToRelative(29.36f, 29.36f, 0.0f, false, true, 10.164f, -1.817f)
                curveToRelative(3.442f, 0.0f, 6.881f, 0.607f, 10.157f, 1.82f)
                lineToRelative(0.178f, -2.275f)
                close()
                moveTo(13.804f, 2.993f)
                horizontalLineToRelative(-3.539f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, -0.485f, 0.485f)
                verticalLineToRelative(0.811f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, false, 0.97f, 0.0f)
                verticalLineToRelative(-0.326f)
                horizontalLineToRelative(0.746f)
                verticalLineToRelative(3.308f)
                horizontalLineToRelative(-0.521f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, false, 0.0f, 0.97f)
                horizontalLineToRelative(2.061f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, false, 0.0f, -0.97f)
                horizontalLineToRelative(-0.57f)
                lineTo(12.466f, 3.963f)
                horizontalLineToRelative(0.853f)
                verticalLineToRelative(0.326f)
                arcToRelative(0.485f, 0.485f, 0.0f, true, false, 0.97f, 0.0f)
                verticalLineToRelative(-0.811f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, -0.485f, -0.485f)
                close()
            }
        }
        .build()
        return _travisCi!!
    }

private var _travisCi: VectorAsset? = null
