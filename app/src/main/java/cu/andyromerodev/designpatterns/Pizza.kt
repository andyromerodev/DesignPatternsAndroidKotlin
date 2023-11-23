package cu.andyromerodev.designpatterns

/**
 * Represents a pizza with various components.
 */
class Pizza {
    var dough: String = ""
    var sauce: String = ""
    var cheese: String = ""
    private var toppings: MutableList<String> = mutableListOf()

    fun addTopping(topping: String) {
        toppings.add(topping)
    }

    /**
     * Provides a string representation of the pizza and its ingredients.
     */
    override fun toString(): String {
        return "Pizza(dough='$dough', sauce='$sauce', cheese='$cheese', toppings='${toppings.joinToString()}')"
    }
}