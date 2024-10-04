package tasks;

public class PrintOddNumbersOnly {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 10) {
            if (counter % 2 != 0) {  // Check if the number is odd
                System.out.println(counter);
            }
            counter++;
        }
    }
}

