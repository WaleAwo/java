package tasks;

public class LargestNumber {
    public static void main(String[] args) {
        int a = -10;
        int b = 20;
        int c = 55;

        // use logical operators to compare values
        // use 'else if' to test all conditons

        if (a > b && a > c) {
            System.out.println(a + ": a is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + ": b is the largest number");
        } else {
            System.out.println(c + ": c is the largest number");
        }
    }
}
