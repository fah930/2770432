// Fahad Arif - 2770432
package Week6OOP;
import java.util.Scanner;
class Square{
    private double length;
    void setLength() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Length of Square: ");
        length =keyboard.nextDouble();
        System.out.println("Length of Sq. is: "+length);
    }

    void area() {
        System.out.println("the area of a square now is: "+length*length);
    }

    void perimeter() {
        System.out.println("the perimeter of a square now is:"+4*length);
    }
}
public class Task2 {

    public static void main(String[] args) {
        Square mysquare= new Square();
        mysquare.setLength();
        mysquare.area();
        mysquare.perimeter();
    }
}
