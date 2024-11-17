package Week5;
import java.util.Scanner;
public class vowelsSWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an english alphabet: ");
        char vowel = sc.next().charAt(0);
        switch (vowel) {
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
        }
    }
}
