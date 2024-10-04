package day18;

import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // put the potentially erroneous code in the try block
        try {
            int number = input.nextInt();
            System.out.println(100 / number);
        } catch (Exception e) {
            System.out.println("Invalid number");
            System.out.println(e.getMessage()); // print exception error message
        } finally {
            System.out.println("This code will always execute");
        }

        System.out.println("Completed...");
        System.out.println("Exit.");
    }
}
