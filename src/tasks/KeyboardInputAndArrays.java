package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInputAndArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[5];

        // loop the array length
        // add input to array

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Enter a number (" + i + ") : ");
            numberArray[i] = input.nextInt();
        }

        System.out.println("Print array");
        System.out.println(Arrays.toString(numberArray));
    }
}
