import atm.Acceso;
import atm.Persona;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona[] usuarios = {
                new Persona(1000,1234),
                new Persona(1200, 1452)
        };
        Acceso atm = new Acceso(Arrays.stream(usuarios).toList());
        atm.inicioDeSesion();
    }
}