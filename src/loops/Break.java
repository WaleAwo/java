package loops;

public class Break {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                break; // exit loop
            }
            System.out.println(i);
        }
    }
}