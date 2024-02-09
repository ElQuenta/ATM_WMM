package atm;
public class Persona {
    private int saldo;
    private final int pin;

    public Persona(int saldo, int pin){
        this.pin = pin;
        this.saldo = saldo;
    }

    public void actualizarSaldo(int monto){
        saldo+=monto;
    }

    public int getPin() {
        return pin;
    }

    public int getSaldo() {
        return saldo;
    }
}
