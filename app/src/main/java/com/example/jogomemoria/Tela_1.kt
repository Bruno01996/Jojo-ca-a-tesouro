
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jogomemoria.ui.components.ActionScreen
import com.example.jogomemoria.ui.theme.JogoMemoriaTheme

@Composable
fun Tela_1(navController: NavHostController) {
    ActionScreen(
        instructionText = "O que é o que é, quanto mais tira mais grande fica, quanto mais bota menor ele será.",
        onAdvanceClick = { navController.navigate("Tela_2") },
        onBackClick = { navController.popBackStack() }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTela1() {
    JogoMemoriaTheme {
        Tela_1(navController = rememberNavController())
    }
}


