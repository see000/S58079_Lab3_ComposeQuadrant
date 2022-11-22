package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.compose.ui.graphics.Color



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeFrameWithCard ()
                }
            }
        }
    }
}

@Composable
fun ComposeFrameWithCard (){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(Modifier.weight(1f)) {
            ComposeCard(
                title = stringResource(id = R.string.first_title),
                body = stringResource(id = R.string.first_body),
                bkgColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposeCard(
                stringResource(id = R.string.second_title),
                stringResource(id = R.string.second_body),
                Color.Yellow,
                modifier = Modifier.weight(1f)
            )

        }
        Row(Modifier.weight(1f)) {
            ComposeCard(
                stringResource(id = R.string.third_title),
                stringResource(id = R.string.third_body),
                Color.Cyan,
                modifier = Modifier.weight(1f)

            )
            ComposeCard(
                stringResource(id = R.string.forth_title),
                stringResource(id = R.string.forth_body),
                Color.LightGray,
                modifier = Modifier.weight(1f)

            )

        }

    }
}

@Composable
fun ComposeCard(title: String, body: String, bkgColor: Color, modifier: Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(bkgColor)
            .fillMaxSize()
            .padding(all = 16.dp)


    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposeFrameWithCard()
    }
}