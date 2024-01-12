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
fun Decoracion() {
    LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
        //TITULO
        item {
            Text(
                text = "DECORACIÓN",
                color = Color.White,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color(64,64,64))
                    .fillMaxWidth(),
                fontFamily = FontFamily.Serif,
                letterSpacing = 3.sp
            )
        }

        //COJIN
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Cojín: ",
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
                        text = "Son elementos decorativos versátiles que añaden confort y estilo" +
                               " a cualquier espacio. Disponibles en una variedad de colores" +
                               " y diseños.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.cojin),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "9,90 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

        //CUADRO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Cuadro: ",
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
                        text = "Piezas de decoración que agregan personalidad y estilo a las" +
                               " paredes. Disponibles en una variedad de tamaños y diseños.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.cuadro),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "26,55 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //FLORES
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Flores:  ",
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
                        text = "Son elementos decorativos que aportan frescura y color a " +
                               "cualquier entorno. Ya sea en arreglos florales o plantas en" +
                               " macetas.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.flores),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "11,54 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //JARRON
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Jarrón: ",
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
                        text = "El jarrón es un accesorio de decoración utilizado para exhibir " +
                                "arreglos florales o simplemente como elemento decorativo en " +
                                "sí mismo. ",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.jarron),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "23,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //LAMPARA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Lámpara: ",
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
                        text = "La lámpara es un elemento esencial en la decoración, proporcionando " +
                                "iluminación y estilo a cualquier ambiente.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.lampara),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "37,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //RELOJ
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Reloj: ",
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
                        text = "Puede ser tanto una pieza moderna y minimalista como un elemento " +
                                "clásico y decorativo, aportando personalidad a cualquier espacio.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.reloj),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "12,97 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //RETRATO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Retrato: ",
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
                        text = "El retrato es una pieza de decoración que captura momentos " +
                               "especiales y añade un toque personal a los espacios.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.retrato),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "9,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //TAPIZ
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Tapiz: ",
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
                        text = "Puede ser una obra de arte textil, con patrones y diseños " +
                               "variados, que aporta calidez y estilo a cualquier espacio.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.tapiz),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "20,50 €",
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