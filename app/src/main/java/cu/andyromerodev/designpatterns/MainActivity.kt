package cu.andyromerodev.designpatterns

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cu.andyromerodev.designpatterns.ui.theme.DesignPatternsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val builder = ItalianPizzaBuilder()
        val director = PizzaDirector(builder)

        val margheritaPizza = director.constructMargheritaPizza()
        Log.d("TAG-PIZZA", margheritaPizza.toString())

        val pepperoniPizza = director.constructPepperoniPizza()
        Log.d("TAG-PIZZA", pepperoniPizza.toString())

        setContent {
            DesignPatternsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowPizzas(margheritaPizza.toString(), pepperoniPizza.toString())
                }
            }
        }
    }
}

@Composable
fun ShowPizzas(vararg pizzas: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        pizzas.forEach { pizza ->
            Text(text = "Hello $pizza!")
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesignPatternsTheme {
        Greeting("Android")
    }
}