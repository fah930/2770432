package Week7;

import java.util.Scanner;

class employee{
    String name;
    int ID;
    String address;
    int cellular;
    int salary;
    int TA;

    employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your personal details :");
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your ID : ");
        ID = sc.nextInt();
        System.out.println("Enter your address : ");
        address = sc.nextLine();
        System.out.println("Enter your phone number : ");
        cellular = sc.nextInt();
        System.out.println("Enter your monthly salary : ");
        salary = sc.nextInt();
        System.out.println("Enter your Travel Allowance if any : ");
        TA = sc.nextInt();
    }
    public employee(int ID, String name, String address, int cellular, int salary, int TA){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.cellular = cellular;
        this.salary = salary;
        this.TA = TA;
    }
    public void display(){
        System.out.println("Your Name : " + name);
        System.out.println("Your ID : " + ID);
        System.out.println("Your Address : " + address);
        System.out.println("Your Mobile Number : " + cellular);
        System.out.println("TA : " + TA);
        System.out.println("Salary : " + salary);

    }
}

public class Program8 {
    public static void main(String[] args) {

    }
}
