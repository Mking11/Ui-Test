package com.jemla.mad.ui_test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jemla.mad.ui_test.components.ButtonComponent
import com.jemla.mad.ui_test.components.ChipComponent
import com.jemla.mad.ui_test.components.ConnectingComponent
import com.jemla.mad.ui_test.components.FilterComponent
import com.jemla.mad.ui_test.components.PlayButton
import com.jemla.mad.ui_test.ui.theme.baseBackGround
import com.jemla.mad.ui_test.ui.theme.baseDarkGreen
import com.jemla.mad.ui_test.ui.theme.baseGreen
import com.jemla.mad.ui_test.ui.theme.homeSubtitleColor
import com.jemla.mad.ui_test.ui.theme.titleColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    val state =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Expanded)
    ModalBottomSheetLayout(
        modifier = Modifier.padding(bottom = paddingValues.calculateBottomPadding()),
        sheetContent = { ConnectingComponent() },
        sheetState = state,
        sheetShape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp), sheetBackgroundColor = baseDarkGreen
    ) {
        LazyColumn(
            modifier = Modifier
                .background(color = baseBackGround)
                .fillMaxSize()
                .padding(horizontal = 19.dp)

        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ChipComponent(text = "광고 +1") {

                    }

                    ChipComponent(text = "175") {

                    }
                }
            }

            item {
                Text(
                    text = "우리 대화 할까요?",
                    fontSize = 29.sp,
                    fontWeight = FontWeight.Bold,
                    color = titleColor,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                )
            }
            item {
                Text(
                    text = "아래의 버튼을 눌러 사람들과 대화를 시작하세요. 당신의 이야기를 들어줄거에요.",
                    fontSize = 15.sp,
                    color = homeSubtitleColor,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
            }

            item {
                Spacer(modifier = Modifier.height(22.dp))
            }

            item {
                ButtonComponent(
                    title = "자유대화",
                    subtitle = "당신의 목소리를 들려주세요.",
                    leadingIcon = R.drawable.mic,
                    backgroundColor = baseGreen
                ) {

                }
            }

            item {
                Spacer(modifier = Modifier.height(12.dp))
            }

            item {
                ButtonComponent(
                    title = "목소리 소개팅",
                    subtitle = "매칭이 끝날 때까지 한 사람에게 집중하세요.",
                    leadingIcon = R.drawable.heart,
                    backgroundColor = baseDarkGreen
                ) {

                }
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 23.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "자유대화 피드", fontWeight = FontWeight.SemiBold, color = Color.White)
                    FilterComponent()
                }
            }

            item {
                PlayButton(
                    playing = false,
                    title = "랜덤 닉네임",
                    subtitle = "1 분 전",
                    buttonText = "메시지 보내기",
                    onPlay = { /*TODO*/ }) {

                }


            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
            }

            item {
                PlayButton(
                    playing = true,
                    title = "날카로운 오징어",
                    subtitle = "1 분 전",
                    buttonText = "메시지 보내기",
                    onPlay = { /*TODO*/ }) {

                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(PaddingValues())
}