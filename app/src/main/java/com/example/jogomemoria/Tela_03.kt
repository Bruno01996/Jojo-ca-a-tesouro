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
fun Tela_3(navController: NavHostController) {
    ActionScreen(
        instructionText = "Fica cada vez mais molhado quanto mais a gente seca. ",
        onAdvanceClick = { navController.navigate("Tela_Final") },
        onBackClick = { navController.popBackStack() }
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewTela_3() {
    JogoMemoriaTheme {
        Tela_3(navController = rememberNavController())
    }
}