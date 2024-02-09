package pizzaConPiña;

public class PizzaFugazzeta extends Pizza {
    public PizzaFugazzeta() {
        //Suggestions you should use setter
        name = "Pizza fugazzeta";
        dough = "Masa regular";
        sauce = "Salsa marinada";

        //Agregando los aderezos
        this.addTopping("Cebolla blanca");
        this.addTopping("Champiniones");
    }
}
