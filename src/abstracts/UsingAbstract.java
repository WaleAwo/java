package abstracts;

abstract class Sounds {

    // abstract method with no implementation
    abstract void makeSound();

    void beepSound() {
        System.out.println("Beep!");
    }
}

public class UsingAbstract extends Sounds {
    public static void main(String[] args) {
        UsingAbstract absOne = new UsingAbstract();

        absOne.makeSound();
        absOne.beepSound();
    }

    // implement inherited abstract method
    void makeSound() {
        System.out.println("Bang!");
    }
}
