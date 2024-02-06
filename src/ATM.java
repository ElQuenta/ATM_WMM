import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ATM {
    private final Scanner scan = new Scanner(System.in);
    private Set<Persona> usuarios;
    private Set<Integer> pins= new HashSet<>();
    private Persona usuario;

    public ATM(Set<Persona> usuarios){
        this.usuarios=usuarios;
        for(Persona u: usuarios){
            pins.add(u.getPin());
        }
    }
    public void inicioDeSesion(){
        int intentos = 1;
        boolean inisioSesion = false;
        while (!inisioSesion) {
            System.out.println("Ingrese el pin");
            int pin = scan.nextInt();
            if (pins.contains(pin)) {
                inisioSesion=true;
                for (Persona u:usuarios) {
                    if (pin == u.getPin()){
                        usuario = u;
                    }
                }
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
        menu();
    }

    private void menu() {
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
                    depositarSaldo(scan.nextInt());
                    opcion = 4;
                    break;
                case 3: // Retirar Saldo
                    System.out.println("Que monto desea Ingresar");
                    retirarSaldo();
                    opcion = 4;
                    break;
            }
        }
        System.out.println("Gracias por tu preferencia");
        inicioDeSesion();
    }

    private void depositarSaldo(int monto) {
        usuario.actualizarSaldo(monto);
        System.out.println("Se ha ingresado " + monto);
    }

    private  void retirarSaldo() {
        int opcion = 0;
        int monto = 0;
        while (opcion != 7) {
            System.out.println("Seleccione un monto a retirar\n1.- 10\n2.- 20\n3.- 50\n4.- 100\n5.- 200\n6.- 500\n7.- cancelar retiro");
            opcion = scan.nextInt();
            opcion = switch (opcion) {
                case 1 -> {//
                    monto = 10;
                    yield 7;
                }
                case 2 -> { //
                    monto = 20;
                    yield 7;
                }
                case 3 -> { //
                    monto = 50;
                    yield 7;
                }
                case 4 -> { //
                    monto = 100;
                    yield 7;
                }
                case 5 -> { //
                    monto = 200;
                    yield 7;
                }
                case 6 -> { //
                    monto = 500;
                    yield 7;
                }
                default -> opcion;
            };
            if (monto>0 && usuario.getSaldo() - monto >=0){
                usuario.actualizarSaldo(-monto);
                System.out.println("Retiro Exitoso");
            }else if (monto>0 && usuario.getSaldo()-monto<0){
                System.out.println("Saldo insuficiente");
            }
        }
    }
}
