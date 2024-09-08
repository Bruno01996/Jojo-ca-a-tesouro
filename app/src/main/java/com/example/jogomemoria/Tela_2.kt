
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
fun Tela_2(navController: NavHostController) {
    ActionScreen(
        instructionText = "É feito de água, mas se for colocado dentro da água morrerá. ",
        onAdvanceClick = { navController.navigate("Tela_3") },
        onBackClick = { navController.popBackStack() }
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewTela_2() {
    JogoMemoriaTheme {
        Tela_2(navController = rememberNavController())
    }
}