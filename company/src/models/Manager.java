package models;
import abstracts.Employee;

public class Manager extends Employee {

    public Manager(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}