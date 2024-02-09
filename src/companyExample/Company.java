package companyExample;

import java.util.LinkedList;

public class Company {
    private LinkedList<Employee> plantel;

    public Company(LinkedList<Employee> plantel) {
        this.plantel = plantel;
    }

    public void createSoftware() {
        for (Employee empleado : plantel) {
            empleado.work();
        }
        System.out.println("Se ah terminado el desarrollo de un programa");
        for (Employee empleado : plantel) {
            empleado.getPaid(empleado.getSalary());
        }
    }
}
