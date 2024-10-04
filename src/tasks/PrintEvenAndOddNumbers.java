package tasks;

public class PrintEvenAndOddNumbers {
    public static void main(String[] args) {
        int counter = 0;

        // use while to loop through numbers
        // if number has no remainder = even
        // if number has a remainder - odd
        
        while (counter <= 25) {
            if (counter % 2 == 0) {
                System.out.println(counter + " - even");
            } else {
                System.out.println(counter + " - odd");
            }
            counter++;
        }
    }
}
