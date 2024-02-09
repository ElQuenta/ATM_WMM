package companyExample;

public class Manager implements Employee {
    public Manager(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    private int salary;
    private String name;

    @Override
    public void work() {
        System.out.println("El administrador " + name + " lidera el proyecto");
    }

    @Override
    public void getPaid(int salary) {
        System.out.println("El administrador "+name+" obtiene su paga equibalente a " + salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
