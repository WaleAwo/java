package interfaces;

interface Shape {
    int length = 10;

    // method with no implementation
    void circle();

    // method with implementation using the 'default' keyword
    default void square() {
        // implementation here
    }
}

// 'implements' keyword
public class UsingInterface implements Shape {
    public static void main(String[] args) {

        UsingInterface iObj = new UsingInterface();
        iObj.circle();

        Shape iObj2 = new UsingInterface(); // use the interface as a type
        iObj2.circle();

    }

    // implemented abstract method must use the 'public' keyword
    public void circle() {
        System.out.println("From abstract method");
    }
}
