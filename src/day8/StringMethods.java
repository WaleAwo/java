package day8;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cars";
        String wordLowercase = "cars";
        String wordWithSpaces = "  Bike  ";
        String splitWord = "abc@test.com";
        String replaceWord = "I love testing!";

        // get length
        System.out.println("Letter count: " + word.length());

        // trim word
        System.out.println("Trimmed word: " + wordWithSpaces.trim());

        // get character at index
        System.out.println("The character is: " + word.charAt(2));

        // string contains another string - case sensitive
        System.out.println("Is string present: " + word.contains("Bike"));

        // compare strings
        System.out.println("Are the words the same: " + word.equals(wordLowercase)); // case-sensitive
        System.out.println("Are the words the same: " + word.equalsIgnoreCase(wordLowercase)); // case-insensitive

        // replace values/words
        System.out.println("The new word is: " + word.replace('r', 'x'));
        System.out.println("The new word is: " + replaceWord.replace("testing", "dancing"));

        // get substring of a string
        System.out.println("The substring is: " + word.substring(0, 3));

        // convert to uppercase
        System.out.println("Uppercase: " + wordLowercase.toUpperCase());

        // convert to lowercase
        System.out.println("Lowercase: " + word.toLowerCase());

        // split string with delimiter
        String[] splitWordArray = splitWord.split("@");
        System.out.println("Split word: " + Arrays.toString(splitWordArray));
    }
}
