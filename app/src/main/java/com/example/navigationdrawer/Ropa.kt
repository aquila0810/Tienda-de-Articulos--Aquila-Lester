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
fun Ropa() {
    LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
        //TITULO
        item {
            Text(
                text = "ROPA",
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color(255,64,129))
                    .fillMaxWidth(),
                fontFamily = FontFamily.Serif,
                letterSpacing = 3.sp
            )
        }

        //BUFANDA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Bufanda: ",
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
                        text = "Se utiliza para abrigar el cuello y parte superior del cuerpo." +
                               "Puede estar hecha de diversos materiales, como lana, algodón o" +
                               " sintéticos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.bufanda),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "10,11 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }

        //CAMISETA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Camiseta: ",
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
                        text = "Caracterizada por ser de manga corta o larga y cubrir la parte" +
                               " superior del cuerpo. Suele estar confeccionada en " +
                               "algodón u otros materiales cómodos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.camiseta),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "8,00 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //CHAQUETA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Chaqueta:  ",
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
                        text = "Diseñada para cubrir la parte superior del cuerpo, extendiéndose " +
                               "generalmente hasta la cintura. Suele estar hecho en cuero y lana " +
                               "hasta materiales sintéticos.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.chaqueta),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "49,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //CORBATA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Corbata: ",
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
                        text = "Accesorio de moda diseñado para ser usado alrededor del cuello." +
                               "Vienen en una variedad de colores, patrones y materiales, " +
                               "como seda o poliéster.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.corbata),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "10,98 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //FALDA
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Falda: ",
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
                        text = "Cubre la parte inferior del cuerpo y se lleva en la cintura o " +
                                "las caderas. Es una prenda versátil que puede tener diversas " +
                                "longitudes.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.falda),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "22,49 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //PANTALON
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Pantalón: ",
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
                        text = "Cubre las piernas y se sujeta en la cintura.  Están confeccionados" +
                               " en diferentes tejidos, como algodón, denim, lino o materiales" +
                               " más formales",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.pantalon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "23,37 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //VESTIDO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Vestido: ",
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
                        text = "Cubre el torso y desciende en una única pieza para cubrir las " +
                               "piernas. Pueden tener diferentes cortes(largos, cortos, cóctel " +
                               "o vestidos casuales.",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.vestido),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "34,99 €",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 15.dp),
                    textAlign = TextAlign.End
                )
            }
        }

        item { Divider() }
        //ZAPATO
        item {
            Row (
                Modifier
                    .fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){

                Text(
                    text = "Zapato: ",
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
                        text = "Diseñado para proteger y proporcionar comodidad a los pies. " +
                               "Pueden variar en estilos y funciones, desde calzado deportivo " +
                               "hasta zapatos formales. ",
                        modifier = Modifier.padding(1.dp),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.zapato),
                    contentDescription = null,
                    modifier = Modifier
                        .size(75.dp)
                )
            }
            Row {
                Text(
                    text = "17,81 €",
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