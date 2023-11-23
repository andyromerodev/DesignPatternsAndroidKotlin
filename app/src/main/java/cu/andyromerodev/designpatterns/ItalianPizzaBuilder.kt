package cu.andyromerodev.designpatterns

/**
 * Concrete builder for Italian-style pizza that implements the PizzaBuilder interface.
 */

class ItalianPizzaBuilder : PizzaBuilder {
    private var pizza = Pizza()

    override fun setDough(dough: String) {
        pizza.dough = dough
    }

    override fun setSauce(sauce: String) {
        pizza.sauce = sauce
    }

    override fun setCheese(cheese: String) {
        pizza.cheese = cheese
    }

    override fun addTopping(topping: String) {
        pizza.addTopping(topping)
    }

    /**
     * Finalizes the building process and returns the completed Pizza object.
     * Resets the builder to be ready for creating another pizza.
     */
    override fun build(): Pizza {
        val builtPizza = pizza
        pizza = Pizza() // Reset for the next build
        return builtPizza
    }
}