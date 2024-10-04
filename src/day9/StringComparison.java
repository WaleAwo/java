package day9;

public class StringComparison {
    public static void main(String[] args) {
        String stackWord = "welcome";
        String stackWord2 = "welcome";

        System.out.println(stackWord == stackWord);
        System.out.println(stackWord.equals(stackWord2));

        String heapWord = "welcome";
        String heapWord2 = "welcome";

        System.out.println(heapWord == heapWord2); // compares objects
        System.out.println(heapWord.equals(heapWord2)); // compares value in memory address

        System.out.println(stackWord == heapWord); // compares objects
        System.out.println(stackWord.equals(heapWord2)); // compares value in memory address
    }
}
