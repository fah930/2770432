// Fahad Arif - 2770432;
package Week5;
import java.util.Scanner;

public class largestin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers to check which is largest: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Check if all numbers are equal
        if (x == y && y == z) {
            System.out.println("All numbers are equal.");
        }
        // Check if x is the largest
        else if (x >= y && x >= z) {
            System.out.println("x is the largest.");
        }
        // Check if y is the largest
        else if (y >= x && y >= z) {
            System.out.println("y is the largest.");
        }
        // If above conditions are false, z must be the largest
        else {
            System.out.println("z is the largest.");
        }
    }
}

