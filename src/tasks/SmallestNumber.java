package tasks;

public class SmallestNumber {
    public static void main(String[] args) {
        int a = -10;
        int b = 20;
        int c = 55;

        // use logical operators to compare values
        // use 'else if' to test all conditons

        if (a < b && a < c) {
            System.out.println(a + ": a is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + ": b is the smallest number");
        } else {
            System.out.println(c + ": c is the smallest number");
        }
    }
}
