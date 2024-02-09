package atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acceso {
    private ATM atm = new ATM(this);
    private final Scanner scan = new Scanner(System.in);
    private List<Persona> usuarios;
    private Persona usuarioActual;

    public Acceso(List<Persona> usuarios) {
        this.usuarios = usuarios;
    }

    public void inicioDeSesion() {

        int intentos = 1;
        boolean inisioSesion = false;
        while (!inisioSesion) {
            System.out.println("Ingrese el pin");
            int pin = scan.nextInt();
            if (verificarPin(pin)) {
                inisioSesion = true;

            } else if (intentos < 3) {
                System.out.println("Intente de nuevo");
                intentos++;
            } else {
                System.out.println("Muchos Intentos Fallidos su siguiente intento es en 1 minuto");
                intentos = 1;
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        atm.menu(usuarioActual);
    }

    private boolean verificarPin(int pin) {
        for (Persona p : usuarios) {
            if (p.getPin() == pin) {
                usuarioActual = p;
                return true;
            }
        }
        return false;
    }
}
