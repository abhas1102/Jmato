package com.example.jmato

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jmato.ui.theme.Shapes

@Composable
fun HomeScreen() {
    Column(Modifier.padding(10.dp)) {
        TopBar()
        SearchBar()
        FilterList()
        ZomatoGold()
    }

}
@Composable
fun TopBar() {
    Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.ic_location), contentDescription = "Location icon",
        modifier = Modifier.size(width = 30.dp, height = 30.dp))
        Column() {
            Text(text = "Home")
            Text(text = "Bhagwat nagar, Bhootnath road..")
        }
        Image(painter = painterResource(id = R.drawable.ic_language), contentDescription = "language icon", Modifier.size(height = 30.dp, width = 30.dp) )
        Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "profile icon", Modifier.size(height = 30.dp, width = 30.dp))

    }
}

@Composable
fun SearchBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(10.dp)
            .background(color = Color.White)
            .border(width = 0.6.dp, color = Color.Gray, shape = RoundedCornerShape(10.dp)),
    horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        
        Image(painter = painterResource(id = R.drawable.ic_search), contentDescription = "search icon",
        modifier = Modifier.padding(10.dp))
        Text(text = "Search Biryani", modifier = Modifier.padding(10.dp))
        Spacer(Modifier.fillMaxWidth(0.8f))
        Divider(color = Color.Gray, modifier = Modifier
            .fillMaxHeight()
            .width(2.dp))
        Image(painter = painterResource(id = R.drawable.ic_mic), contentDescription = "mic icon",
            Modifier
                .width(30.dp)
                .height(30.dp))
    }
}

@Composable
fun ZomatoGold() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp), shape = RoundedCornerShape(20.dp), backgroundColor = Color.Black,
    elevation = 8.dp) {

        Row(horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically) {
            Column {
                Text(text = "Introducing", color = Color.White)
                Text(text = "Zomato Gold",color = Color.White,fontSize = 26.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif)
                Text(text = "You are invited to Join now", Modifier.padding(top = 10.dp),color = Color.White)
            }
            Image(painter = painterResource(id = R.drawable.zomatogoldnew), contentDescription = "Zomato gold icon", modifier = Modifier.size(100.dp)
            )

        }


    }
}
@Composable
fun FilterList() {
    Row(Modifier.horizontalScroll(rememberScrollState()).padding(20.dp)) {
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.ic_filter) , contentDescription = "filter icon",Modifier.size(20.dp))
                Text(text = "Sort",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
                Image(painter = painterResource(id = R.drawable.ic_down) , contentDescription = "downward icon" )
            }

        }

        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Pure Veg",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Fast Delivery",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Great Offers",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Rating 4.0+",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "New Arrivals",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Pure Veg",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
        Surface(shape = RoundedCornerShape(5.dp), color = Color.White, elevation = 10.dp, modifier = Modifier.padding(start = 10.dp)) {
            Text(text = "Pure Veg",Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTopBar() {
    Column(Modifier.padding(10.dp)) {
        TopBar()
        SearchBar()
        FilterList()
        ZomatoGold()
    }

}