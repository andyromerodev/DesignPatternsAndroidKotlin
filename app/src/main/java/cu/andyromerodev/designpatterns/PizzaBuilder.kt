package cu.andyromerodev.designpatterns


/**
 * The PizzaBuilder interface declares the methods used to stepwise build a pizza object.
 */
interface PizzaBuilder {
    fun setDough(dough: String)
    fun setSauce(sauce: String)
    fun setCheese(cheese: String)
    fun addTopping(topping: String)
    fun build(): Pizza
}