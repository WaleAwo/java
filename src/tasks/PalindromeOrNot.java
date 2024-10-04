package tasks;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String word = "madam";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println("Is the word a palindrome? " + word.equals(reversedWord));
        System.out.println("Initial word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
