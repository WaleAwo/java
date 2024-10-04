package day15;

class Parent {
    void show() {
        System.out.println("This is a parent method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.show(); // method overriding
    }
}