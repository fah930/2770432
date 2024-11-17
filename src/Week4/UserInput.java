package Week4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

// Read an integer from the user
System.out.print("Enter an integer: ");
int number = scanner.nextInt();

// Read a string from the user
System.out.print("Enter a string: ");
String text = scanner.next(); // next() reads a single word

System.out.println("You entered number: " + number);
System.out.println("You entered string: " + text);

}

        }
