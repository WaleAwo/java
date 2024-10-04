package tasks;

public class SwappingVariables {
    public static void main(String[] args) {

        // Example 1
        int a = 10;
        int b = 20;

        System.out.println("Before swap (a): " + a);
        System.out.println("Before swap (b): " + b);

        a = a + b; // a now holds the sum of a and b
        b = a - b; // b is now (a + b) - b, which is the original value of a
        a = a - b; // a is now (a + b) - a, which is the original value of b

        System.out.println("After swap (a): " + a);
        System.out.println("After swap (b): " + b);

        // Example 2
        int x = 50;
        int y = 100;

        System.out.println("Before swap (x): " + x);
        System.out.println("Before swap (y): " + y);

        // Swap without a third variable using XOR
        x = x ^ y; // Step 1: x becomes x ^ y
        y = x ^ y; // Step 2: y becomes x ^ y (original x)
        x = x ^ y; // Step 3: x becomes x ^ y (original y)

        System.out.println("After swap (x): " + x);
        System.out.println("After swap (y): " + y);
    }
}
