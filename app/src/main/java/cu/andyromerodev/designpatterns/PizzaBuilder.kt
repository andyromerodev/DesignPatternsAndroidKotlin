package cu.andyromerodev.designpatterns

interface PizzaBuilder {
    fun setDough(dough: String)
    fun setSauce(sauce: String)
    fun setCheese(cheese: String)
    fun addTopping(topping: String)
    fun build(): Pizza
}