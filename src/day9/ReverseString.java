package day9;

public class ReverseString {
    public static void main(String[] args) {

        // Example 1
        String word = "welcome";
        String reverseWord = "";

        // start from the last index
        // count down to 0
        // concat letter to variable

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        System.out.println("Reversed word: " + reverseWord);

        // Example 2
        StringBuffer sBuffWord = new StringBuffer("welcome");
        System.out.println("Reversed word (StringBuffer): " + sBuffWord.reverse());

        // Example 3
        StringBuilder sBuildWord = new StringBuilder("welcome");
        System.out.println("Reversed word (StringBuilder): " + sBuildWord.reverse());
    }
}