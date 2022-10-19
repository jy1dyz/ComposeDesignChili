package kg.nurtelecom.design_chili_compose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kg.nurtelecom.design_chili_compose.R
import kg.nurtelecom.design_chili_compose.view.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BaseCellView(title: String, onClick: () -> Unit) {
    Card(onClick = {
        onClick()
    },
        backgroundColor = Color.White,
        modifier = Modifier
            .size(600.dp, 50.dp)
            .padding(4.dp),
        elevation = 0.dp,
        shape = Shapes.large
    ) {
        Row(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text(text = title)
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_chevron_right_24),
                contentDescription = "Image",
                alignment = Alignment.CenterEnd,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }

}