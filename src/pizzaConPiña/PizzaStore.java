package pizzaConPiña;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public PizzaStore() {

    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = pizzaFactory.createPizza(type);


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
