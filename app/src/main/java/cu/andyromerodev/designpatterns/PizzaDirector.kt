package cu.andyromerodev.designpatterns

/**
 * The director class that abstracts the complex construction of a pizza.
 */
class PizzaDirector(private val builder: PizzaBuilder) {

    /**
     * Constructs a standard Margherita pizza.
     */
    fun constructMargheritaPizza(): Pizza {
        builder.setDough("Thin Crust")
        builder.setSauce("Tomato")
        builder.setCheese("Mozzarella")
        return builder.build()
    }

    /**
     * Constructs a standard Pepperoni pizza.
     */
    fun constructPepperoniPizza(): Pizza {
        builder.setDough("Hand Tossed")
        builder.setSauce("Tomato")
        builder.setCheese("Mozzarella")
        builder.addTopping("Pepperoni")
        return builder.build()
    }
}