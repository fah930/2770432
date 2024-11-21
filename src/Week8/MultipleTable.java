// Fahad Arif - 2770432
package Week8;
import java.util.Scanner;
public class MultipleTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int number = sc.nextInt();

        int i = 1;

        System.out.println("Multiplication Table of " + number + " upto 12:");
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 12);
    }
}
