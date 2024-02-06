import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scan = new Scanner(System.in);
    static int saldo = 1000;
    static Set<Integer> pins = new HashSet<Integer>();


    public static void main(String[] args) {
        pins.add(1234);
        inicioDeSesion();
    }

    private static void inicioDeSesion(){
        int intentos = 1;
        while (true) {
            System.out.println("Ingrese el pin");
            if (pins.contains(scan.nextInt())) {
                menu();
                System.out.println("Gracias por tu preferencia");
            } else if(intentos<3){
                System.out.println("Intente de nuevo");
                intentos++;
            } else {
                System.out.println("Muchos Intentos Fallidos su siguiente intento es en 1 minuto");
                intentos=1;
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void menu() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Seleccione una opcion\n1.- Saldo\n2.- Depositar\n3.- Retirar\n4.- Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: // Ver Saldo
                    System.out.println("usted tiene " + saldo);
                    inicioDeSesion();
                    break;
                case 2: // Depositar Saldo
                    System.out.println("Que monto desea Ingresar");
                    depositarSaldo(scan.nextInt());
                    break;
                case 3: // Retirar Saldo
                    System.out.println("Que monto desea Ingresar");
                    retirarSaldo();
                    break;
            }
        }
    }

    private static void depositarSaldo(int monto) {
        saldo += monto;
        System.out.println("Se ha ingresado " + monto);
        inicioDeSesion();
    }

    private static void retirarSaldo() {
        int opcion = 0;
        int monto = 0;
        while (opcion != 7) {
            System.out.println("Seleccione un monto a retirar\n1.- 10\n2.- 20\n3.- 50\n4.- 100\n5.- 200\n6.- 500\n7.- cancelar retiro");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1://
                    monto = 10;
                    opcion = 7;
                    break;
                case 2: //
                    monto = 20;
                    opcion = 7;
                    break;
                case 3: //
                    monto = 50;
                    opcion = 7;
                    break;
                case 4: //
                    monto = 100;
                    opcion = 7;
                    break;
                case 5: //
                    monto = 200;
                    opcion = 7;
                    break;
                case 6: //
                    monto = 500;
                    opcion = 7;
                    break;
            }
            if (monto>0 && saldo - monto >=0){
                saldo-=monto;
                System.out.println("Retiro Exitoso");
            }else if (monto>0 && saldo-monto<0){
                System.out.println("Saldo insuficiente");
            }
        }
        inicioDeSesion();
    }

}