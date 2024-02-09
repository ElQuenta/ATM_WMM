package companyExample;

import java.util.Random;

public class Programmer implements Employee{

    private int salary;
    private String name;
    private String[] messages = {"Programando el Frontend","Programando el Backend","Elimiandndo el HardCodeo"};
    private Random rnd = new Random();

    @Override
    public void work() {
        System.out.println("El programador "+name+" envida un nuevo commit a se Testeado");
        System.out.println(code());
    }

    public Programmer(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void getPaid(int salary) {
        System.out.println("Se le Paga al Programador "+name+" "+salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }

    private String code(){
        return messages[rnd.nextInt(messages.length)];
    }

}
