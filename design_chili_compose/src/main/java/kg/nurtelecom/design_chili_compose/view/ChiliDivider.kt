package kg.nurtelecom.design_chili_compose.view

import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ChiliDivider(modifier: Modifier = Modifier) {
    Divider(color = MaterialTheme.colors.secondaryVariant, thickness = 1.dp, modifier = modifier)
}