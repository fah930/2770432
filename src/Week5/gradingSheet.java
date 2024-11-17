// Fahad Arif - 2770432
package Week5;
import java.util.Scanner;
public class gradingSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks you obtained out of 100: ");
        int marks = sc.nextInt();

        if ((marks <= 100) && (marks >= 90)){
            System.out.println("Your grade is A");
        }
        else if ((marks <= 90) && (marks >= 80)){
            System.out.println("Your grade is B");
        }
        else if ((marks <= 80) && (marks >= 70)){
            System.out.println("Your grade is C");
        }
        else if ((marks <= 70) && (marks >= 60)){
            System.out.println("Your grade is D");
        }
        else if ((marks <= 60) && (marks >= 0)){
            System.out.println("Your grade is F");
        }
        else {
            System.out.println("Entered a wrong value");
        }
    }
}
