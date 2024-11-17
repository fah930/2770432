package Week7;
// Fahad Arif - 2770432

import java.util.Scanner;

class Area {
     int length;
     int width;
     Area() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextInt();
        System.out.print("Enter the width: ");
        width = scanner.nextInt();


    }
    public Area(int length, int width) {

        this.length = length;
        this.width = width;

    }
    public int returnArea() {
        return length * width;
    }

    void displayDetails(){
        System.out.println("Area of the rectangle is: " + returnArea());


    }
}

public class Task02 {
    public static void main(String[] args) {
        Area area = new Area();
        area.displayDetails();
    }
}


