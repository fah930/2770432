package Week4;
import java.util.Scanner;
public class AvgofNumbers {
    static double avgMethod(double num1, double num2, double num3) {
        double avg = (num1+num2+num3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        avgMethod(number1, number2, number3);
        System.out.println("The average of three numbers is " + avgMethod(number1, number2, number3));
    }
}
