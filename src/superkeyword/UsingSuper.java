package superkeyword;

class Parent {
    String colour = "White";

    void eat() {
        System.out.println("Eating...");
    }
}

class Child extends Parent {

    // uses parent variable
    void displayColour() {
        System.out.println(super.colour);
    }

    // uses parent method
    void eat() {
        super.eat();
    }
}

public class UsingSuper {
    public static void main(String[] args) {
        Child childOne = new Child();

        childOne.displayColour();
        childOne.eat();
    }
}
