package strings;

public class StringComparison {
    public static void main(String[] args) {
        String stackWord = "welcome";
        String stackWord2 = "welcome";

        System.out.println("Stack comparison");
        System.out.println(stackWord == stackWord);
        System.out.println(stackWord.equals(stackWord2));
        System.out.println("");

        String heapWord = new String("welcome");
        String heapWord2 = new String("welcome");

        System.out.println("Heap comparison");
        System.out.println(heapWord == heapWord2); // this won't work as you're comparing objects not values
        System.out.println(heapWord.equals(heapWord2)); // compares value in memory address

        System.out.println(stackWord == heapWord); // this won't work as you're comparing objects not values
        System.out.println(stackWord.equals(heapWord2)); // compares value in memory address
    }
}
