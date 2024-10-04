package day16;

// 'abstract' keyword
abstract class Sounds {

    // abstract method - no implementation
    abstract void makeSound();

    // normal method - with implementation
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

    void makeSound() {
        System.out.println("Bang!");
    }

}
