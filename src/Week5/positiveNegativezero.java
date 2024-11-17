// Fahad Arif - 2770432
package Week5;
import java.util.Scanner;
public class positiveNegativezero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is positive or negative and zero");
        int A= scanner.nextInt();

        if (A>0) {
            System.out.println("The number is positive");
        }

        else if (A<0){
            System.out.println ("The number is negative");
        }

        else {
            System.out.println ("The number is zero");
        }
    }
}

