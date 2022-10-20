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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.nurtelecom.design_chili_compose.R
import kg.nurtelecom.design_chili_compose.view.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BaseProfileView(title: String, subtitle: String) {
    Card(
        onClick = {},
        backgroundColor = Color.White,
        modifier = Modifier
            .wrapContentSize()
            .padding(8.dp),
        elevation = 0.dp,
        shape = Shapes.large
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_account_circle_24),
                contentDescription = "Image",
                modifier = Modifier.align(Alignment.CenterVertically)
            )

            Column(modifier = Modifier.align(Alignment.CenterVertically)) {
                Text(
                    text = title,
                    modifier = Modifier
                        .padding(start = 16.dp),
                    fontSize = 16.sp,
                    color = colorResource(id = com.design.chili.R.color.black_5),
                    fontFamily = FontFamily(
                        Font(com.design.chili.R.font.roboto_regular)
                    ),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = subtitle,
                    modifier = Modifier
                        .padding(start = 16.dp),
                    fontSize = 14.sp,
                    color = colorResource(id = com.design.chili.R.color.gray_1),
                    fontFamily = FontFamily(
                        Font(com.design.chili.R.font.roboto_regular)
                    ),
                    fontWeight = FontWeight.Thin
                )
            }

        }
    }
}