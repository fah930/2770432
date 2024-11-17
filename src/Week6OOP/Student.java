// Fahad Arif - 2770432
package Week6OOP;
import java.util.Scanner;

public class Student {
    // Data members
    private String name;
    private int age;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter student's age: ");
        age = scanner.nextInt();
    }

    public void display() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.read();

        student.display();

        //System.out.println("Student name: "+student.name);
        //System.out.println("Student age: "+student.age);
    }
}