package companyExample;

public class Designer implements Employee{
    public Designer(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    private int salary;
    private String name;

    @Override
    public void work() {
        System.out.println("El Diseñador "+name+" diseña la interfaz del progrma");
    }

    @Override
    public void getPaid(int salary) {
        System.out.println("Se le Paga al Diseñador "+name+" "+salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }

}
