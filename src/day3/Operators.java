package day3;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational/Comparison
        System.out.println("Greater than: " + (a > b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Less than or equal to: " + (a <= b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Equal to: " + (a == b));

        // Logical
        boolean btrue = true;
        boolean bfalse = false;

        System.out.println("AND (true): " + (btrue && btrue));
        System.out.println("AND (false): " + (btrue && bfalse));
        System.out.println("OR (true): " + (btrue || bfalse));
        System.out.println("OR (false): " + (bfalse || bfalse));
        System.out.println("NOT: " + (!bfalse));
    }
}
