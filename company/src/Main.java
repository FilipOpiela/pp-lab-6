
import models.*;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Jan", 2500, 1);
        Worker worker2 = new Worker("Grzegorz", 2200, 2);
        Worker worker3 = new Worker("Aneta", 2000, 3);
        Worker worker4 = new Worker("Jerzy", 2300, 4);

        Manager manager = new Manager("", 5000, 5);

        System.out.println("Worker " +  worker1.getName() +  " salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker " +  worker2.getName() +  " salary: "+ worker2.getSalary());
        worker2.work();

        System.out.println("Worker " +  worker3.getName() +  " salary: "+ worker3.getSalary());
        worker3.work();

        System.out.println("Worker " +  worker4.getName() +  " salary: "+ worker4.getSalary());
        worker4.work();

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}
