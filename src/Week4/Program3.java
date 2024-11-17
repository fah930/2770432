package Week4;
import java.util.Scanner;
public class Program3 {
    static int square(int num) {

        return num * num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to square: ");
        int i = scanner.nextInt();
        square(i);
        System.out.println("Square is: " + square(i));
    }
}
