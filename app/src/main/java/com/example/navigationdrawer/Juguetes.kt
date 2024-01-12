package com.example.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Juguetes() {
    LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
        //TITULO
        item {
            Text(
                text = "JUGUETES",
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color(255,215,0))
                    .fillMaxWidth(),
                fontFamily = FontFamily.Serif,
                letterSpacing = 3.sp
            )
        }

        //DADO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Dados: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Son pequeños objetos utilizados en juegos de azar o estrategia. " +
                               "Pueden tener diferentes números o símbolos en sus caras.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.dados),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "3,49 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

        //DAMAS
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Damas: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Es un clásico juego de mesa con reglas simples pero tácticas" +
                               " desafiantes. Juego de estrategia que se juega en un tablero" +
                                " cuadriculado. ",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.damas),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "14,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //BALÓN
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Balón:  ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        //.background(Color.Red)
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Juguete clásico y versátil utilizado en varios juegos y deportes." +
                               " Puede ser de diferentes tamaños y materiales.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.balon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "4,00 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //CARRO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Carro: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Diseñado para proporcionar diversión imaginativa y fomentar el " +
                               "juego simbólico. Puede variar en tamaño, estilo y materiales de " +
                               "fabricación.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.carro),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "8,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //ROBOT
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Robot: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Diseñado para ofrecer entretenimiento y estimular la creatividad." +
                               " Puede tener funciones como movimiento, luces y sonidos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.robot),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "16,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //JIRAFA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Jirafa: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        //.background(Color.Red)
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Juguete de plástico con forma de este animal de cuello largo." +
                                " Ideal para niños pequeños, proporciona suavidad y diversión.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.jirafa),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "10,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //PIANO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Piano: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Con teclas de colores, es una introducción divertida a la música " +
                                "y la coordinación mano-ojo.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.piano),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "24,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TAMBOR
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Tambor: ",
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=8.dp)
                )
                Row(
                    modifier = Modifier
                        .height(75.dp)
                        .width(250.dp)
                ) {
                    Text(
                        text = "Diseñado con colores brillantes y materiales seguros, es una " +
                                "forma divertida de introducir a los niños en el mundo de la" +
                                " música y el ritmo.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tambor),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "18,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

    }
}
