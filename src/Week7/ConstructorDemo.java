package Week7;
import java.util.Scanner;
class Student{
    String name;
    int age;
    Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give it a name: ");
        name = scanner.nextLine();
        System.out.print("What is it's age: ");
        age = scanner.nextInt();


    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("The name of the object is " + s1.name);
        System.out.println("The age of the object is " + s1.age);
        Student s2 = new Student("Amy", 18);
        System.out.println("The name of the object is " + s2.name);
        System.out.println("The age of the object is " + s2.age);
    }
}
