package cu.andyromerodev.designpatterns

class PizzaDirector(private val builder: PizzaBuilder) {
    fun constructMargheritaPizza(): Pizza {
        builder.setDough("Thin Crust")
        builder.setSauce("Tomato")
        builder.setCheese("Mozzarella")
        return builder.build()
    }

    fun constructPepperoniPizza(): Pizza {
        builder.setDough("Hand Tossed")
        builder.setSauce("Tomato")
        builder.setCheese("Mozzarella")
        builder.addTopping("Pepperoni")
        return builder.build()
    }
}