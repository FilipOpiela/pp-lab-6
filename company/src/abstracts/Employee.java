package abstracts;
import interfaces.Employable;

public abstract class Employee implements Employable {
 private String name;
 private double salary;
 private int id;
 private String hireDate;
 private String position;

 public Employee(String name, double salary, int id, String hireDate, String position) {
     this.name = name;
     this.salary = salary;
     this.id = id;
     this.hireDate = hireDate;
     this.position = position;
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

 public String getHireDate() {
     return hireDate;
 }

 public String getPosition() {
     return position;
 }

 @Override
 public int hashCode() {
     return id;
 }
}