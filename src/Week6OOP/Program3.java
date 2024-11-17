// Fahad Arif - 2770432
package Week6OOP;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $ " + price);
    }
}
public class Program3 {
    public static void main(String[] args) {

        Book book = new Book();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter the authors' name: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        book.setDetails(title, author, price);
        book.displayDetails();

    }
}
