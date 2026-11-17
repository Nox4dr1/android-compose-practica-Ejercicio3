package com.example.ejer3compose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejer3compose.ui.theme.Ejer3ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejer3ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaCuadrantes()
                }
            }
        }
    }
}


@Composable
fun TarjetaInfo(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun PantallaCuadrantes(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            TarjetaInfo(
                titulo = stringResource(R.string.titulo_text),
                descripcion = stringResource(R.string.desc_text),
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TarjetaInfo(
                titulo = stringResource(R.string.titulo_image),
                descripcion = stringResource(R.string.desc_image),
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            TarjetaInfo(
                titulo = stringResource(R.string.titulo_row),
                descripcion = stringResource(R.string.desc_row),
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TarjetaInfo(
                titulo = stringResource(R.string.titulo_column),
                descripcion = stringResource(R.string.desc_column),
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CuadrantesPreview() {
    Ejer3ComposeTheme {
        PantallaCuadrantes()
    }
}