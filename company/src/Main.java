
import java.util.ArrayList;
import java.util.List;
import abstracts.Employee;
import models.*;

public class Main {
    public static void main(String[] args) {

    	Worker worker1 = new Worker("Jan", 2500, 1, "2022-01-01", "Developer");
        Worker worker2 = new Worker("Grzegorz", 2200, 4, "2022-02-01", "Designer");
        Worker worker3 = new Worker("Aneta", 2000, 3, "2022-03-01", "Engineer");
        Worker worker4 = new Worker("Jerzy", 2300, 4, "2022-04-01", "Manager");
        Worker worker5 = new Worker("Michal", 3000, 5, "2022-05-01", "Senior Developer");
          
        Manager manager1 = new Manager("Andrzej", 5000, 6, "2022-05-01", "Senior Manager");
        Manager manager2 = new Manager("Daniel", 4000, 7, "2022-07-01", "Product Manager");
        
        List<Employee> employees = new ArrayList<>();

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
        
        System.out.println("\n\n");
       
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager1.getName() + " has code: " + manager1.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());

        System.out.println(worker4.getName() + " equals worker2: " + worker4.equals(worker2));
        System.out.println(worker4.getName() + " equals manager1: " + worker4.equals(manager1));
        
        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        
        List<Employee> employeesWithDuplicates = new ArrayList<>();
        
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();

            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            }

            if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }

            for (Employee otherEmployee : employees) {
                if (employee != otherEmployee && employee.equals(otherEmployee)) {
                    employeesWithDuplicates.add(employee);
                }
            }
        }

        System.out.println("\n\n");
        
        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all Managers: " + totalManagerSalary);
        System.out.println("Total salary of all Workers: " + totalWorkerSalary);

        System.out.println("Instances with duplicates:");
        for (Employee emp : employeesWithDuplicates) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.hashCode() + ")");
        }
    }
}