package day13;

public class UsingStatic {

    // static variables and methods
    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {

        // static method can access static methods and variables
        System.out.println(staticVariable);
        staticMethod();
    }

    // non-static method can access static methods and variables
    void method() {
        System.out.println(staticVariable);
        staticMethod();
    }
}
