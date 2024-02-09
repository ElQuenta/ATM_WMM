package pizzaConPiña;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    //Nombre de la pizza
    protected String name;
    //La masa de la pizza
    protected String dough;
    //La salsa de la pizza
    protected String sauce;
    //Lista de aderezos o ingredientes
    protected List<String> toppings = new ArrayList<String>();

    //Constructor
    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparando la pizza: " + name);
    }


    public void bake() {
        System.out.println("Horneando " + name);
    }

    public void cut() {
        System.out.println("Cortando: " + name);
    }

    public void box() {
        System.out.println("Empaquetando: " + name);
    }

    public String toString() {
        // Codigo para mostrar el nombre de la pizza y sus ingredientes
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

    public void addTopping(String newTopping) {
        System.out.println("Agregando el aderezo: " + newTopping);
        toppings.add(newTopping);
    }

}
