package com.jemla.mad.ui_test.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jemla.mad.ui_test.R
import com.jemla.mad.ui_test.ui.theme.subtitleColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomNavigation(

) {

        androidx.compose.material.BottomNavigation(
            backgroundColor = Color(0xFF080E0E),
            modifier = Modifier.height(80.dp)
        ) {
            BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                Icon(
                    painter = painterResource(id = R.drawable.frame_10),
                    contentDescription = "",
                    tint = subtitleColor
                )
            })
            BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {

                Image(
                    painter = painterResource(id = R.drawable.frame_9),
                    contentDescription = ""
                )
            })
            BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                Icon(
                    painter = painterResource(id = R.drawable.frame_7),
                    contentDescription = "",
                    tint = subtitleColor
                )
            })
        }



}


@Preview
@Composable
fun PreviewBottomNavigation() {
    BottomNavigation()
}