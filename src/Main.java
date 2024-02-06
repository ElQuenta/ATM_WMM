import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Persona hugo = new Persona(1000,1234);
        Persona paco = new Persona(2500,1857);
        Persona luis = new Persona(1325,4397);
        Set<Persona> usuarios = new HashSet();
        usuarios.add(hugo);
        usuarios.add(paco);
        usuarios.add(luis);
        ATM atm = new ATM(usuarios);
        atm.inicioDeSesion();
    }



}