package companyExample;

public class Tester implements Employee{
    private int salary;
    private String name;

    public Tester(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("El tester "+name+" prueba el codigo y lo envia a Producción");
    }

    @Override
    public void getPaid(int salary) {
        System.out.println("Se le Paga al Tester "+name+" "+salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }

}
