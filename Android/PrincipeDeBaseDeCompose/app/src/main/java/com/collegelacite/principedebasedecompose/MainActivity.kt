package com.collegelacite.principedebasedecompose

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.collegelacite.principedebasedecompose.R.drawable.bg_compose_background
import com.collegelacite.principedebasedecompose.ui.theme.PrincipeDeBaseDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrincipeDeBaseDeComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        GreetingImage(modifier = Modifier.padding(innerPadding))
                        TitleText(message = stringResource(R.string.jetpack_compose_tutorial))
                        IntroText(message = stringResource(R.string.intro_text))
                        DescritionText(message = stringResource(R.string.description_Text))
                    }

                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image= painterResource(bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Composable
fun TitleText(message: String, modifier: Modifier=Modifier){
    Box(modifier.padding(16.dp)) {
        Text(text = message, textAlign = TextAlign.Justify, modifier = Modifier)
    }
}

@Composable
fun IntroText(message: String, modifier: Modifier=Modifier){
    Box(modifier.padding(16.dp)) {
        Text(text = message, textAlign = TextAlign.Justify, modifier = Modifier)
    }
}

@Composable
fun DescritionText(message: String,modifier: Modifier=Modifier){
    Box(modifier.padding(16.dp)) {
        Text(text = message, textAlign = TextAlign.Justify, modifier = Modifier)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrincipeDeBaseDeComposeTheme {
        Column {
            GreetingImage()
            TitleText(message = stringResource(R.string.jetpack_compose_tutorial))
            IntroText(message = stringResource(R.string.intro_text))
            DescritionText(message = stringResource(R.string.description_Text))
        }

    }
}