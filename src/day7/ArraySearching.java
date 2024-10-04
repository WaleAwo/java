package day7;

public class ArraySearching {
    public static void main(String[] args) {
        // Find an element in an Array (linear search)

        int[] numbers = {400, 100, 200, 300};
        int elementToFind = 3000;

        boolean elementFound = false;

        for (int number : numbers) {
            if (number == elementToFind) {
                System.out.println("The number exist");
                elementFound = true;
                break;
            }
        }
        if (!elementFound) {
            System.out.println("The number doesn't exist");
        }

        // Count specific element in an Array

        int[] digits = {12, 23, 66, 32, 12, 100};
        int digitToFind = 121;
        int digitCount = 0;

        for (int digit : digits) {
            if (digit == digitToFind) {
                digitCount++;
            }
        }
        System.out.println("The digit " + digitToFind + " appears " + digitCount + " times");
    }
}
