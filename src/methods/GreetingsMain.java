package methods;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings greet = new Greetings();

        // no parameters + no return value
        greet.simpleGreeting();

        // no parameters + return value
        String output = greet.returnGreeting();
        System.out.println(output);

        // parameters + no return value
        greet.nameGreeting("Joe");

        // parameters + return value
        String fullOutput = greet.returnNameGreeting("Michael", "Moore");
        System.out.println(fullOutput);
    }
}
