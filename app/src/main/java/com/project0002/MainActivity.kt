package com.project0002

//import android.graphics.Color
//import android.graphics.fonts.Font
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.project0002.ui.theme.Project0002Theme
//
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalAutofill
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LifecycleCoroutineScope
import com.project0002.ui.theme.Purple200
import com.project0002.ui.theme.Purple700
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project0002Theme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    MyAnimation()
                }
            }
        }
    }
}

@Composable
fun MyAnimation() {


    var editable by remember { mutableStateOf(true)}
    var editable2 by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        AnimatedVisibility(visible = editable ,
        enter =   fadeIn(
             animationSpec = tween(5000)
        ) + expandHorizontally(
            animationSpec = tween(5000)
        ),
            exit =  fadeOut(
                animationSpec = tween(5000)
            )
            ) {
            Image(painter = painterResource(id = R.drawable.girl),
                contentDescription ="",
                modifier = Modifier.clip(CircleShape)
            )
        }
        AnimatedVisibility(visible = editable2 ,
            enter =   fadeIn(
                animationSpec = tween(5000)
            ) + expandHorizontally(
                animationSpec = tween(5000)
            ),
            exit =  fadeOut(
                animationSpec = tween(5000)
            )
        ) {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription ="",
                modifier = Modifier.clip(CircleShape)
            )
        }
        Button(onClick = {
            if (editable) {editable2=!editable2}
            if(editable2){editable=!editable}
        }) {
            Text(text = "Switch")
        }
    }

//   Card(
//       modifier = Modifier.fillMaxSize(0.8f),
//       shape = RoundedCornerShape(10.dp)
//   ) {
//       Box(
//           modifier = Modifier
//               .fillMaxSize()
//               .background(color),
//           contentAlignment = Alignment.Center,
//
//           ) {
//
//       }
//   }



}

