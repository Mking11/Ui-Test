package com.jemla.mad.ui_test.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jemla.mad.ui_test.R

@Composable
fun FilterComponent() {
    Row(
        modifier = Modifier
            .border(width = 0.4.dp, color = Color(0xFFD9D9D9), shape = RoundedCornerShape(8.dp))
            .height(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Spacer(modifier = Modifier.width(22.dp))
        Icon(
            painter = painterResource(id = R.drawable.sliders),
            contentDescription = "sliders",
            modifier = Modifier.size(14.dp),
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = "필터", color = Color.White)
        Spacer(modifier = Modifier.width(22.dp))
    }
}

@Preview
@Composable
fun PreviewFilterComponent() {
    FilterComponent()
}