package com.jemla.mad.ui_test.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jemla.mad.ui_test.R
import com.jemla.mad.ui_test.ui.theme.subtitleColor
import com.jemla.mad.ui_test.ui.theme.titleColor

@Composable
fun ConnectingComponent() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

        Icon(
            painter = painterResource(id = R.drawable.rectangle_2143),
            contentDescription = "rectanlge", tint = Color(0xFF565656),
            modifier = Modifier.padding(top = 11.dp, bottom = 14.dp)
        )

        Row(
            modifier = Modifier

                .fillMaxWidth()
                .padding(horizontal = 35.dp)
                .height(110.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.group_68__1_),
                contentDescription = "icon",
                modifier = Modifier.size(50.dp),
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 15.dp)
            ) {
                Text(
                    text = "Nickname",
                    color = titleColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(text = "Connecting", color = subtitleColor, fontSize = 13.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.frame_66__1_),
                contentDescription = "icon",
                modifier = Modifier.size(52.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.frame_66__2_),
                contentDescription = "icon",
                modifier = Modifier.size(52.dp)
            )

        }
    }

}

@Preview
@Composable
fun PreviewConnectingComponent() {
    ConnectingComponent()
}