package day11;

public class Greetings {

    // no parameters + no return value
    void simpleGreeting() {
        System.out.println("Hello");
    }

    // parameters + no return value
    void nameGreeting(String name) {
        System.out.println("Hello " + name);
    }

    // no parameters + return value
    String returnGreeting() {
        return "Hello, how are you?";
    }
    
    // parameters + return value
    String returnNameGreeting(String firstname, String lastname) {
        return "Hello " + firstname + " " + lastname;
    }
}
