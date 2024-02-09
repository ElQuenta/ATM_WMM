package atm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ATM {
    private final Scanner scan = new Scanner(System.in);
    private Acceso acceso;

    public ATM(Acceso acceso) {
        this.acceso = acceso;
    }


    public void menu(Persona usuario) {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Seleccione una opcion\n1.- Saldo\n2.- Depositar\n3.- Retirar\n4.- Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: // Ver Saldo
                    System.out.println("usted tiene " + usuario.getSaldo());
                    opcion = 4;
                    break;
                case 2: // Depositar Saldo
                    System.out.println("Que monto desea Ingresar");
                    depositarSaldo(scan.nextInt(), usuario);
                    opcion = 4;
                    break;
                case 3: // Retirar Saldo
                    System.out.println("Que monto desea Ingresar");
                    retirarSaldo(usuario);
                    opcion = 4;
                    break;
            }
        }
        System.out.println("Gracias por tu preferencia");
        acceso.inicioDeSesion();
    }

    private void depositarSaldo(int monto, Persona usuario) {
        usuario.actualizarSaldo(monto);
        System.out.println("Se ha ingresado " + monto);
    }

    private void retirarSaldo(Persona usuario) {
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("Seleccione un monto a retirar\n1.- 10\n2.- 20\n3.- 50\n4.- 100\n5.- 200\n6.- 500\n7.- cancelar retiro");
            opcion = scan.nextInt();
            opcion = switch (opcion) {
                case 1 -> {//
                    sacarDinero(10, usuario);
                    yield 7;
                }
                case 2 -> { //
                    sacarDinero(20, usuario);
                    yield 7;
                }
                case 3 -> { //
                    sacarDinero(50, usuario);
                    yield 7;
                }
                case 4 -> { //
                    sacarDinero(100, usuario);
                    yield 7;
                }
                case 5 -> { //
                    sacarDinero(200, usuario);
                    yield 7;
                }
                case 6 -> { //
                    sacarDinero(500, usuario);
                    yield 7;
                }
                default -> 7;
            };
        }
    }

    private void sacarDinero(int monto, Persona usuario) {
        if (usuario.getSaldo() - monto >= 0) {
            usuario.actualizarSaldo(-monto);
            System.out.println("Se Retiro el monto de " + monto + " de forma exitosa");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
