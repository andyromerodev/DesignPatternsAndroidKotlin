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
import cu.andyromerodev.designpatterns.builderPattern.ItalianPizzaBuilder
import cu.andyromerodev.designpatterns.builderPattern.PizzaDirector
import cu.andyromerodev.designpatterns.ui.theme.DesignPatternsTheme

/**
 * Main activity that demonstrates the use of the Builder pattern to construct different types of pizza.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup for the pizza construction using the Builder pattern
        val builder = ItalianPizzaBuilder()
        val director = PizzaDirector(builder)

        // Constructing pizzas using the director
        val margheritaPizza = director.constructMargheritaPizza()
        val pepperoniPizza = director.constructPepperoniPizza()

        // Logging the constructed pizzas
        Log.d("TAG-PIZZA", margheritaPizza.toString())
        Log.d("TAG-PIZZA", pepperoniPizza.toString())

        // Setting the content view with Compose UI elements
        setContent {
            DesignPatternsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Displaying the constructed pizzas in the UI
                    ShowPizzas(margheritaPizza.toString(), pepperoniPizza.toString())
                }
            }
        }
    }
}

/**
 * A composable function that displays a list of pizzas in the UI.
 * @param pizzas Vararg parameter that takes a list of pizza descriptions.
 * @param modifier Modifier to customize the UI element.
 */
@Composable
fun ShowPizzas(vararg pizzas: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // Iterating over each pizza string to create a text element for it
        pizzas.forEach { pizza ->
            Text(text = "Hello $pizza!")
        }
    }
}