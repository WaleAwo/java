package day5;

public class Iterations {
    public static void main(String[] args) {
        // While
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // Do-While
        int token = 10;
        do {
            System.out.println(token);
            token--;
        } while (token >= 0);

        // For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
