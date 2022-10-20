package kg.nurtelecom.composedesignchili

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kg.nurtelecom.design_chili_compose.view.BaseCellView
import kg.nurtelecom.design_chili_compose.view.BaseProfileView
import kg.nurtelecom.design_chili_compose.view.theme.ComposeDesignChiliTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDesignChiliTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primary
                ) {
                    Column() {
                        BaseProfileView(title = "Женя Самохина", subtitle = "Супер")
                        BaseCellView(title = "Показать отчеты") {

                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDesignChiliTheme {
        Column() {
            BaseProfileView(title = "Женя Самохина", subtitle = "Супер")
            BaseCellView(title = "Показать отчеты") {

            }
        }
    }
}