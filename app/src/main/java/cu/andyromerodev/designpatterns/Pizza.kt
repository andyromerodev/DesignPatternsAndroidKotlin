package cu.andyromerodev.designpatterns

class Pizza {
    var dough: String = ""
    var sauce: String = ""
    var cheese: String = ""
    private var toppings: MutableList<String> = mutableListOf()

    fun addTopping(topping: String) {
        toppings.add(topping)
    }

    override fun toString(): String {
        return "Pizza(dough='$dough', sauce='$sauce', cheese='$cheese', toppings='${toppings.joinToString()}')"
    }
}