package operators;

public class Relational {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a >= b: " + (a >= b));   // false
        System.out.println("a <= b: " + (a <= b));   // true
    }
}
