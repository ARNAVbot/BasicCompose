package com.arnav.mvvmcomposewithmitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.*

class MainActivity : AppCompatActivity() {
    @ExperimentalUnitApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContent {
//            Column {
//                Column(modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp)
//                    .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Text(
//                        text = "Item 1",
//                        modifier = Modifier.align(Alignment.CenterHorizontally)
//                    )
//                    Text(
//                        text = "Item 2",
//                        modifier = Modifier.align(Alignment.CenterHorizontally)
//                    )
//                }
//
//                Spacer(modifier = Modifier.padding(20.dp))
//                Row(modifier = Modifier
//                    .width(200.dp)
//                    .height(200.dp)
//                    .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    horizontalArrangement = Arrangement.Center
//                ) {
//                    Text(
//                        text = "Item 1",
//                        modifier = Modifier.align(Alignment.CenterVertically)
//                    )
//                    Text(
//                        text = "Item 2",
//                        modifier = Modifier.align(Alignment.CenterVertically)
//                    )
//                }
//            }
//
//        }

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize() // fills the entire height and width of the container
                    .background(color = Color(0xFFF2F2F2))
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "content description",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy Meal",
                            style = TextStyle(
                                fontSize = 26.sp)
                        )
                        Text(
                            text = "$5.99",
                            style = TextStyle(
                                color = Color(0xFF85bb65),
                                fontSize = 17.sp),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "ORDER NOW")
                    }
                }
            }
        }
    }
}