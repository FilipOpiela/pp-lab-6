package abstracts;
import interfaces.Employable;

public abstract class Employee implements Employable {
 private String name;
 private double salary;
 private int id;

 public Employee(String name, double salary, int id) {
     this.name = name;
     this.salary = salary;
     this.id = id;
 }

 @Override
 public void work() {
     System.out.println(name + " is working.");
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }
}
