package tasks;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int number = 3;

        // if number has no remainder = even
        // if number has a remainder - odd
        
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
