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
fun Cocina() {
    LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
        //TITULO
        item {
            Text(
                text = "COCINA",
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color(255, 99, 71))
                    .fillMaxWidth(),
                fontFamily = FontFamily.Serif,
                letterSpacing = 3.sp
            )
        }

        //BATIDORA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Batidora: ",
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
                        text = "La batidora es un electrodoméstico esencial en la cocina, " +
                               "diseñada para mezclar y batir ingredientes con eficiencia.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.batidora),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "83,30 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

        //CUCHILLO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Cuchillo: ",
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
                        text = "Utilizado para cortar, rebanar y picar alimentos con precisión." +
                               " Disponible en diversas formas y tamaños,",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.cuchillo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "18,83 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //CUCHARON
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Cucharón:  ",
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
                        text = "Es una herramienta práctica para servir sopas, guisos " +
                               "y otros platillos líquidos.Facilitan el manejo y la transferencia " +
                               "de alimentos de la olla al plato",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.cucharon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "2,90 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //HORNO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Horno: ",
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
                        text = "Esencial en la cocina, utilizado para cocinar y hornear una" +
                               " amplia variedad de alimentos. Desde panes y pasteles hasta " +
                               "asados y gratinados.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.horno),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "29,90 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TABLA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Tabla: ",
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
                        text = "La tabla de cortar es un accesorio imprescindible en la cocina," +
                               " proporcionando una superficie segura y resistente para cortar " +
                               "y preparar alimentos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tabla),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "12,95 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TAZA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Tazón: ",
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
                        text = "Disponible en diferentes tamaños y materiales, desde cerámica " +
                               "hasta acero inoxidable.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tazon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "5,11 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TENEDOR
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Tenedor: ",
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
                        text = "Diseñado para pinchar y sostener alimentos durante el proceso de " +
                               "corte y degustación. ",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tenedor),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "12,48 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TIJERAS
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Tijeras: ",
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
                        text = "Las tijeras de cocina son una herramienta práctica para cortar " +
                               "hierbas, carne, aves y otros alimentos con precisión.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tijeras),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "7,98 €",
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