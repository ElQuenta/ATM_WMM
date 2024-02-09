package pizzaConPiña;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        //Suggestions you should use setter
        name = "Pizza de queso";
        dough = "Masa regular";
        sauce = "Salsa marinada";

        //Agregando los aderezos
        this.addTopping("Mozarella");
        this.addTopping("Parmesana");
    }
}
