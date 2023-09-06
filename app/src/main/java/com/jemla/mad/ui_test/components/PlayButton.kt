package com.jemla.mad.ui_test.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.jemla.mad.ui_test.ui.theme.highlightColor
import com.jemla.mad.ui_test.ui.theme.paddingSmall
import com.jemla.mad.ui_test.ui.theme.subtitleColor
import com.jemla.mad.ui_test.ui.theme.titleColor
import com.jemla.mad.ui_test.ui.theme.topColor

@Composable
fun PlayButton(
    modifier: Modifier = Modifier,
    playing: Boolean,
    title: String,
    subtitle: String,
    buttonText: String,
    onPlay: () -> Unit,
    onFavorite: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(108.dp)
            .background(color = topColor, shape = RoundedCornerShape(10.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = if (playing) R.drawable.pause else R.drawable.play),
            contentDescription = "leading icon",
            modifier = Modifier
                .padding(start = paddingSmall)
                .size(64.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp)
        ) {


            Row(
                modifier = Modifier.fillMaxWidth().height(40.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = title,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = titleColor
                    )
                    Text(text = subtitle, fontSize = 12.sp, color = subtitleColor)
                }

                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = "traling icon",
                    modifier = Modifier
                        .size(28.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))


            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 22.dp)
                    .height(35.dp),
                colors = ButtonDefaults.buttonColors(containerColor = highlightColor)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.microphone),
                    contentDescription = "mic"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "메시지 보내기", fontSize = 14.sp)
            }

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
fun PreviewPlayButton() {
    Column(modifier = Modifier.fillMaxWidth()) {
        PlayButton(
            playing = false,
            title = "랜덤 닉네임",
            subtitle = "1 분 전",
            buttonText = "메시지 보내기",
            onPlay = { /*TODO*/ }) {

        }

        PlayButton(
            playing = true,
            title = "랜덤 닉네임",
            subtitle = "1 분 전",
            buttonText = "메시지 보내기",
            onPlay = { /*TODO*/ }) {

        }
    }
}