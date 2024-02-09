package pizzaConPiña;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE_PIZZA -> {
                return new CheesePizza();
            }
            case PEPPERONI_PIZZA -> {
                return new PepperoniPizza();
            }
            case PIZZA_HAWAIANA -> {
                return new PizzaHawaiana();
            }
            case PIZZA_FUGAZZETA -> {
                return new PizzaFugazzeta();
            }
        }
        return new Pizza();
    }

}
