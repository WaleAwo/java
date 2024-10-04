package day5;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                continue; // skip number and continue loop
            }
            System.out.println(i);
        }

        for (int j = 0; j <= 10; j++) {

            if (j == 3 || j == 5 || j == 9) {
                continue; // skip numbers and continue loop
            }
            System.out.println(j);
        }
    }
}
