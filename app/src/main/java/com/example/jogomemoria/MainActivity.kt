package com.example.jogomemoria

import Tela_1
import Tela_2
import Tela_3
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jogomemoria.ui.theme.JogoMemoriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JogoMemoriaTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "Tela_1",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("Tela_1") { Tela_1(navController) }
                        composable("Tela_2") { Tela_2(navController) }
                        composable("Tela_3") { Tela_3(navController) }
                    }
                }
            }
        }
    }
}

