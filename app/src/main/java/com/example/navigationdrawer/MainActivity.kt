package com.example.navigationdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationdrawer.ui.theme.Hogar
import com.example.navigationdrawer.ui.theme.Ropa
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mostrarContenido()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun mostrarContenido() {

    // Variable que recuerda en qué estado se encuentra el menú (abierto o cerrado)
    val estadoMenu = rememberDrawerState(initialValue = DrawerValue.Closed)

    // Corutina de tipo remember (es un hilo de ejecución) para mostrar u ocultar
    val accionMovimiento = rememberCoroutineScope()

    // El índice del elemento del menú que está seleccionado
    var elementoActual by remember() {
        mutableStateOf(0)
    }

    // NavController
    val controladorNavegacion = rememberNavController()

    NavHost(navController = controladorNavegacion, startDestination = "hogar") {
        composable("hogar") {
            Hogar()
        }
        composable("electronica") {
            Electronica()
        }
        composable("ropa") {
            Ropa()
        }
        composable("cocina") {
            Cocina()
        }
        composable("juguetes") {
            Juguetes()
        }
        composable("decoracion") {
            Decoracion()
        }
    }

    ModalNavigationDrawer(
        drawerState = estadoMenu,
        drawerContent = {
            ModalDrawerSheet {

                ListItem(
                    headlineText = { Text(
                                        text = "Categorías",
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(16.dp)
                                            .background(Color(0, 51, 153)) , // Color azul oscuro
                                        color = Color.White,
                                        textAlign = TextAlign.Left,
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        letterSpacing = 1.sp
                    ) },

                    leadingContent = {
                        IconButton(onClick = {
                            accionMovimiento.launch { estadoMenu.close() }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
                Divider()

                NavigationDrawerItem(
                    label = { Text(text = "Hogar",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 0),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 0
                        controladorNavegacion.navigate("hogar")
                    }
                )

                NavigationDrawerItem(
                    label = { Text(text = "Electrónica",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 1),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 1
                        controladorNavegacion.navigate("electronica")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Ropa",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 2),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 2
                        controladorNavegacion.navigate("ropa")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Cocina",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 3),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 3
                        controladorNavegacion.navigate("cocina")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Juguetes",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 4),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 4
                        controladorNavegacion.navigate("juguetes")
                    }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Decoración",
                                   fontWeight = FontWeight.Bold)
                            },
                    selected = (elementoActual == 5),
                    onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 5
                        controladorNavegacion.navigate("decoracion")
                    }
                )
            }
        },
    ) {
        Scaffold(
            // Barra superior de navegación
            topBar = {
                TopAppBar(
                    title = { Text(
                        text="IKEA Shop",
                        color= Color.Yellow,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .background(Color(0,51,153))
                            .fillMaxWidth(),
                        fontFamily = FontFamily.Serif,
                        letterSpacing = 1.sp,
                        fontSize = 28.sp
                    ) },
                    navigationIcon = {
                        IconButton(onClick = {
                            accionMovimiento.launch { estadoMenu.open() }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
            }
        ) { innerPadding ->
            Column( // CONTENIDO PRINCIPAL
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if(elementoActual == 0) {
                    Hogar()
                } else if(elementoActual == 1){
                    Electronica()
                } else if(elementoActual == 2){
                    Ropa()
                } else if(elementoActual == 3){
                    Cocina()
                } else if(elementoActual == 4){
                    Juguetes()
                }else if(elementoActual == 5){
                    Decoracion()
                }
            }
        }
    }
}



