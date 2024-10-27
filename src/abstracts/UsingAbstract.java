package abstracts;

abstract class Sounds {

    // method without implementation (abstract)
    abstract void makeSound();

    // method with implementation (concrete)
    void beepSound() {
        System.out.println("Beep!");
    }
}

// use 'extends' keyword
public class UsingAbstract extends Sounds {
    public static void main(String[] args) {
        UsingAbstract absOne = new UsingAbstract();

        absOne.makeSound();
        absOne.beepSound();
    }

    // abstract method implemented
    void makeSound() {
        System.out.println("Bang!");
    }
}
