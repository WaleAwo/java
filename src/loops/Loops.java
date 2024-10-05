package loops;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Do-While");
        int token = 10;
        do {
            System.out.println(token);
            token--;
        } while (token >= 0);
        System.out.println("");

        System.out.println("While");
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("");
        

        System.out.println("For");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
