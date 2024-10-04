package day15;

class C {
    String colour = "White";

    void eat() {
        System.out.println("Eating...");
    }
}

class D extends C {
    String colour = "Blue";

    void displayColour() {
        System.out.println(super.colour); // use parent variable
    }

    void eat() {
        super.eat();
    }
}

public class UsingSuper {
    public static void main(String[] args) {
        D childOne = new D();

        childOne.displayColour();
    }
}
