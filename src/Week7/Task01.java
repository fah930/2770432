// Fahad Arif - 2770432
package Week7;

import java.util.Scanner;

class Employee {
    private String name;
    private int salary;
    private int experience;
    Employee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name: ");
        name = scanner.nextLine();
        System.out.print("What your salary per annum: ");
        salary = scanner.nextInt();
        System.out.print("How many years of experience: ");
        experience = scanner.nextInt();

    }
    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;

    }
    void displayDetails(){
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);

    }
}

public class Task01 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.displayDetails();
        Employee e2 = new Employee();
        e2.displayDetails();
    }
}
