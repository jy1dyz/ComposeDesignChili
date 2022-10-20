package kg.nurtelecom.design_chili_compose.view.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.design.chili.R

@Composable
fun ComposeDesignChiliTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val lightColorPalette = lightColors(
        primary = colorResource(id = R.color.gray_4),
        primaryVariant = colorResource(id = R.color.black_1),
        secondary = colorResource(id = R.color.magenta_1),
        secondaryVariant = colorResource(id = R.color.gray_2),
        onPrimary = colorResource(id = R.color.black_5)
    )
    val darkColorPalette = darkColors(
        surface = colorResource(id = R.color.black_2),
        primaryVariant = colorResource(id = R.color.white_1),
        secondary = colorResource(id = R.color.magenta_1),
        secondaryVariant = colorResource(id = R.color.black_4)
    )
    val colors = if (darkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}