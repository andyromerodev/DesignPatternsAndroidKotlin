package cu.andyromerodev.designpatterns

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

    override fun build(): Pizza {
        val builtPizza = pizza
        pizza = Pizza()
        return builtPizza
    }
}