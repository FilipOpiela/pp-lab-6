
import java.util.ArrayList;
import java.util.List;
import abstracts.Employee;
import models.*;

public class Main {
    public static void main(String[] args) {

    	Worker worker1 = new Worker("Jan", 2500, 1, "2022-01-01", "Developer");
        Worker worker2 = new Worker("Grzegorz", 2200, 2, "2022-02-01", "Designer");
        Worker worker3 = new Worker("Aneta", 2000, 3, "2022-03-01", "Engineer");
        Worker worker4 = new Worker("Jerzy", 2300, 4, "2022-04-01", "Manager");

        Manager manager = new Manager("Andrzej", 5000, 5, "2022-05-01", "Senior Manager");

        List<Employee> employees = new ArrayList<>();

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
        
        System.out.println("\n\n");
       
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker4.getName() + " equals worker2: " + worker4.equals(worker2));
        System.out.println(worker4.getName() + " equals manager: " + worker4.equals(manager));
    }
}