package methods;

class Parent {
    void show() {
        System.out.println("This is the parent method");
    }
}

class Child extends Parent {
    void show() {

        System.out.println("This is the child method"); // override parent implementation
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.show();
    }
}