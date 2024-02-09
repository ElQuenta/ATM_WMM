package pizzaConPiña;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana() {
        //Suggestions you should use setter
        name = "Pizza Hawaiana";
        dough = "Masa regular";
        sauce = "Salsa marinada";

        //Agregando los aderezos
        this.addTopping("Mozarella");
        this.addTopping("Piña");
    }
}
