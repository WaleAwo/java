package day16;

interface Shape {
    int length = 10; // final & static
    int width = 20;

    // static method - with implementation
    static void length() {
        // implementation here
    }

    // abstract method - no implementation
    void circle();

    // default method - with implementation. 'default' keyword required
    default void square() {
        // implementation here
    }
}

public class UsingInterface implements Shape { // 'implements' keyword
    public static void main(String[] args) {
        UsingInterface iObj = new UsingInterface();
        iObj.circle();
        iObj.square();

        Shape iObj2 = new UsingInterface(); // use the interface as a type
        iObj2.circle();

        Shape.length(); // static variable
    }

    // implement abstract method - must use 'public' keyword
    public void circle() {
        System.out.println("From abstract method");
    }


}
