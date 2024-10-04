package day3;

public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        
        // Assignment
        System.out.println("Addition: " + (a += 5));
        System.out.println("Subtraction: " + (a -= 5));
        System.out.println("Multiplication: " + (a *= 5));
        System.out.println("Division: " + (a /= 2));
        System.out.println("Remainder: " + (a %= 5));
    }
}
