// Fahad Arif - 2770432
package Week5;
import java.util.Scanner;
public class Lecturecomparisionoperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your body temperature? In Celsius: ");
        int bodytem=scanner.nextInt();

        if (bodytem >= 37){
            System.out.println("you have fever, go to doctor");
        }

        else {
            System.out.println("your temp is OK");
        }

    }
}

