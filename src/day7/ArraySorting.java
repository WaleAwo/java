package day7;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        // Sort elements in an Array

        int[] numbers = {2, 72, 33, 398, 21};

        System.out.println("Before sorting numbers...");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting numbers...");
        System.out.println(Arrays.toString(numbers));

        String[] names = {"James", "Bradley", "Zack", "Lee", "Amy"};

        System.out.println("Before sorting strings...");
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("After sorting strings...");
        System.out.println(Arrays.toString(names));
    }
}
