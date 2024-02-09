package pizzaConPiña;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";

        //Agregando los aderezos
        this.addTopping("Pepperoni en rodajas");
        this.addTopping("Cebollas en rodajas");
        this.addTopping("Gran queso parmesano");
    }
}