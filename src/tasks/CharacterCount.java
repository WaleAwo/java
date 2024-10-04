package tasks;

public class CharacterCount {
    public static void main(String[] args) {
        String word = "welcome";
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') { // get each letter of the word
                counter++;
            }
        }
        System.out.println("Counter count for 'e': " + counter);
    }
}
