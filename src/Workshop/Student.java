package Workshop;

import java.util.Scanner;
class Student {

    private static String name;
    private static int age;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}
    class Main {
        public static void main(String[] args) {
            Student student = new Student();
            student.read();
            student.display();

            //System.out.println("Student name: "+student.name);
           // System.out.println("Student age: "+student.age);

        }

    }
