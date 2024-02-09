package pizzaConPiña;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda de Pizzas UPB");
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaType.PIZZA_FUGAZZETA);
    }
}
