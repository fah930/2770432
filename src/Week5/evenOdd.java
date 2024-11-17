// Fahad Arif - 2770432
package Week5;
import java.util.Scanner;
    public class evenOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to check if its even or odd");
            int n= scanner.nextInt();

            if (n%2==0) {
                System.out.println("It is an even number");

            }
            else {
                System.out.println ("It is an odd number");
            }
    }
}

