package Week4;

class Numbers {
    int num1, num2;

    public Numbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class Swapping {
    // Method to swap num1 and num2 within the same Numbers object
    static void swap(Numbers n) {
        int temp = n.num1;
        n.num1 = n.num2;
        n.num2 = temp;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers(5, 10);

        System.out.println("Before swapping, num1: " + n.num1 + ", num2: " + n.num2);

        swap(n);

        System.out.println("After swapping, num1: " + n.num1 + ", num2: " + n.num2);
    }
}
