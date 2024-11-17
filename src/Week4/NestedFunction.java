package Week4;

public class NestedFunction {
    static int addition(int x, int y) {return x + y;}
    static double multiplication(int a, int b) {return a * b;}
    static int nested(int x, int y) {return addition(x, y) * 2;}
    public static void main(String[] args) {
        System.out.println("The addition results: " + addition(5, 7));
        System.out.println("The addition results: " + multiplication(5, 2));
        System.out.println("The nested multiplication results: " + nested(5, 3));
    }
}
