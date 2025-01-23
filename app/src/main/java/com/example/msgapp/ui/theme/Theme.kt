//package com.example.msgapp.ui.theme
//
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.lightColorScheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.graphics.Color
//
//private val LightColors = lightColorScheme(
//    primary = Color(0xFF6200EE),
//    onPrimary = Color.White,
//    secondary = Color(0xFF03DAC5),
//    onSecondary = Color.Black,
//    surface = Color(0xFFF5F5F5),
//    onSurface = Color.Black,
//    background = Color(0xFFF5F5F5),
//    onBackground = Color.Black
//)
//
//@Composable
//fun MsgAppTheme(
//    darkTheme: Boolean = false, // Você pode implementar controle de tema dinâmico
//    content: @Composable () -> Unit
//) {
//    MaterialTheme(
//        colorScheme = LightColors,
//        typography = Typography,
//        content = content
//    )
//}

package com.example.msgapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF4CAF50), // Verde principal
    onPrimary = Color.White,
    secondary = Color(0xFF81C784), // Verde claro
    onSecondary = Color.Black,
    surface = Color(0xFFC8E6C9), // Fundo verde claro
    onSurface = Color.Black,
    background = Color(0xFFA5D6A7), // Verde suave para fundo
    onBackground = Color.Black
)

@Composable
fun MsgAppTheme(
    //darkTheme: Boolean = false, // Você pode implementar controle de tema dinâmico
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}

