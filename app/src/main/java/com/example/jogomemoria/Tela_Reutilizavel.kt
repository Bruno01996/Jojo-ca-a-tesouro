package com.example.jogomemoria.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ActionScreen(
    instructionText: String,
    onAdvanceClick: () -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        //Mensagem / Charada
        Text(
            text = instructionText,
            fontSize = 24.sp,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(8.dp)
                .padding(bottom = 64.dp)
        )

        // Botões na base da tela
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = onBackClick,
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 8.dp)
            ) {
                Text(text = "Voltar")
            }
            Button(
                onClick = onAdvanceClick,
                modifier = Modifier
                    .weight(0.5f)
                    .padding(start = 8.dp)
            ) {
                Text(text = "Proxima charada")
            }
        }
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun PreviewActionScreen() {
    ActionScreen(
        instructionText = "Texto de instrução grande e centralizado.",
        onAdvanceClick = { /* Simular avanço */ },
        onBackClick = { /* Simular retorno */ },
        modifier = Modifier.fillMaxWidth()
    )
}