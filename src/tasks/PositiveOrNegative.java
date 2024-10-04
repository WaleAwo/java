package tasks;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int number = 0;

        // use logical operators to compare values
        // use 'else if' to test all conditons

        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else if (number > 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println("the number is zero");
        }
    }
}
