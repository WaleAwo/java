package tasks;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object

        System.out.print("Enter number: ");
        int number = input.nextInt(); // use the correct scanner method to store the value
        System.out.println("The number you entered is: " + number);
        
        System.out.print("Enter a word: ");
        String word = input.next(); // use the correct scanner method to store the value
        System.out.println("The word is: " + word);
    }
}
