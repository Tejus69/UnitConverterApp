package com.UnitConverterr.myapplication

import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.UnitConverterr.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MyApplication()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}


@Composable
fun MyApplication() {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value="" , onValueChange={ })

        Spacer(modifier = Modifier.height(16.dp))
       Row{
//           val context = LocalContext.current
//   Button(onClick ={ Toast.makeText(context,"Thanks for clicking!",Toast.LENGTH_LONG).show()} ){
//        Text("Click me !")
//   }

           Box {
               Button(onClick = { }) {
                   Text("Select")
                   Icon(Icons.Default.ArrowDropDown, contentDescription = " ")
               }

               // DropDown Menu
               DropdownMenu(expanded = true, onDismissRequest = { }) {
                   DropdownMenuItem(text = {Text("Centimeter")} , onClick ={ })

                   DropdownMenuItem(text = {Text("meter")} , onClick ={ })

                   DropdownMenuItem(text = {Text("Milimeter")} , onClick ={ })
                   DropdownMenuItem(text = {Text(
                   "Feet")} , onClick ={ })
               }
           }
           Spacer(modifier = Modifier.width(16.dp))
           Box{
               Button(onClick = { }) {
                   Text("Select")
                   Icon(Icons.Default.ArrowDropDown, contentDescription = " ")
               }
               // DropDown Menu
               DropdownMenu(expanded = true, onDismissRequest = { }) {
                   DropdownMenuItem(text = {Text("Centimeter")} , onClick ={ })

                   DropdownMenuItem(text = {Text("meter")} , onClick ={ })

                   DropdownMenuItem(text = {Text("Milimeter")} , onClick ={ })
                   DropdownMenuItem(text = {Text(
                       "Feet")} , onClick ={ })
               }
           }
       }
Spacer(modifier = Modifier.height(16.dp))
  Text("Result:")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}

@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
        MyApplication()
    }
}