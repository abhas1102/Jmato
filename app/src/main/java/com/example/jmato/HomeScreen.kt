package com.example.jmato

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {

}
@Composable
fun TopBar() {
    Row(horizontalArrangement = Arrangement.SpaceAround) {
        Image(painter = painterResource(id = R.drawable.ic_location), contentDescription = "Location icon",
        modifier = Modifier.size(width = 40.dp, height = 40.dp))
        Column() {
            Text(text = "Home")
            Text(text = "Bhagwat nagar, Bhootnath road")
        }
        Image(painter = painterResource(id = R.drawable.ic_language), contentDescription = "language icon", Modifier.size(height = 60.dp, width = 60.dp) )
        Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "profile icon", Modifier.size(height = 60.dp, width = 60.dp))

    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTopBar() {
    TopBar()
}