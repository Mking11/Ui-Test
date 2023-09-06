package com.jemla.mad.ui_test.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
import com.jemla.mad.ui_test.ui.theme.baseDarkGreen
import com.jemla.mad.ui_test.ui.theme.baseGreen
import com.jemla.mad.ui_test.ui.theme.paddingSmall
import com.jemla.mad.ui_test.ui.theme.subtitleColor
import com.jemla.mad.ui_test.ui.theme.titleColor

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    leadingIcon: Int,
    textColor: Color = Color.White,
    backgroundColor: Color,
    onClick: () -> Unit
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(66.dp)
            .background(color = backgroundColor, shape = RoundedCornerShape(10.dp))
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(id = leadingIcon),
            contentDescription = "leading icon",
            modifier = Modifier
                .padding(start = paddingSmall)
                .size(42.dp)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp)
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = titleColor
            )
            Text(text = subtitle, fontSize = 12.sp, color = subtitleColor)
        }

        Image(
            painter = painterResource(id = R.drawable.caretright),
            contentDescription = "traling icon",
            modifier = Modifier
                .padding(end = paddingSmall)
                .size(26.dp)
        )
    }


}

@Preview
@Composable
fun PreviewButtonComponent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        ButtonComponent(
            title = "자유대화",
            subtitle = "당신의 목소리를 들려주세요.",
            leadingIcon = R.drawable.heart,
            backgroundColor = baseDarkGreen
        ) {

        }

        ButtonComponent(
            title = "자유대화",
            subtitle = "당신의 목소리를 들려주세요.",
            leadingIcon = R.drawable.mic,
            backgroundColor = baseGreen
        ) {

        }


    }
}