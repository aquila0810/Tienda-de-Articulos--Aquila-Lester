package com.example.navigationdrawer.ui.theme

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
import com.example.navigationdrawer.R

@Preview
@Composable
fun Hogar() {
    LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
        //TITULO
        item {
            Text(
                text = "HOGAR",
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color(122,166,109))
                    .fillMaxWidth(),
                fontFamily = FontFamily.Serif,
                letterSpacing = 3.sp
            )
        }

        //ESCOBA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Escoba: ",
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
                        text = "Escoba es un utensilio utilizado para barrer y limpiar superficies," +
                                " generalmente compuesto por cerdas fijadas a un mango.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.escoba),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "9,93 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

        //ESPEJO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Espejo: ",
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
                        text = "Espejo es una superficie pulida que refleja la luz para producir " +
                                "una imagen reflejada, generalmente utilizada para verse a sí mismo.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.espejo2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "19,79 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //OLLA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Olla:  ",
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
                        text = "Olla es un recipiente de cocina, por lo general con asas, " +
                                "utilizado para cocinar alimentos,como sopas, guisos o hervir agua.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.olla),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "48,45 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //PLANTA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Planta: ",
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
                        text = "Plantas son organismos vivos" +
                                " que se cultivan en macetas o jardines dentro de la casa, " +
                                "agregando belleza y oxígeno al entorno.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.planta),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "74,50 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //SARTEN
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Sartén: ",
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
                        text = "Sartén es un utensilio de cocina, usado para freír y saltear, generalmente en " +
                                "aceite o mantequilla o cualquier otra grasa o manteca. ",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.sarten),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "40,80 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TAPETE
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Tapete: ",
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
                        text = "Tapete es un artículo textil, generalmente rectangular o cuadrado,"+
                                " diseñado para cubrir y decorar pisos u otras superficies.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.alfombra),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "65,69 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TOALLA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Toalla: ",
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
                        text = "Toalla es un tejido absorbente utilizado para secar el cuerpo o " +
                                "las manos después de bañarse o lavarse.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.toalla),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "4,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //VAJILLA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Vajilla: ",
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
                        text = "Vajilla se refiere al conjunto de platos, tazas, cubiertos y " +
                                "otros utensilios de mesa utilizados para servir y comer alimentos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.vajilla),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "19,99 €",
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