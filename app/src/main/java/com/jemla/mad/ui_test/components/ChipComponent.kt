package com.jemla.mad.ui_test.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jemla.mad.ui_test.R
import com.jemla.mad.ui_test.ui.theme.titleColor
import com.jemla.mad.ui_test.ui.theme.topColor

@Composable
fun ChipComponent(
    text: String,
    icon: Int = R.drawable.image_174,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .height(22.dp)
            .background(color = topColor, shape = RoundedCornerShape(100)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = titleColor)
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = icon),
            contentDescription = "ad icon",
            modifier = Modifier.size(
                16.dp
            )
        )
        Spacer(modifier = Modifier.width(8.dp))
    }
}

@Preview
@Composable
fun PreviewChipComponent() {
    ChipComponent(text = "175") {

    }
}