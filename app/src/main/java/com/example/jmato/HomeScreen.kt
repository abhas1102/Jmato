package com.example.jmato

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {

}
@Composable
fun TopBar() {
    Row() {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Location icon")
        Column() {
            Text(text = "Home")
            Text(text = "Bhagwat nagar, Bhootnath road")
        }
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "language icon" )
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "profile icon")

    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTopBar() {
    TopBar()
}