package exceptions;

public class CheckedExceptions {

    // 'throws' keyword to handle checked exceptions
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started...");
        System.out.println("Program in progress...");

        Thread.sleep(5000);

        System.out.println("Program finished...");
        System.out.println("Program exited...");
    }
}
