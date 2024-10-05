package finalkeyword;

// cannot extend class
final class A {

    // cannot change value
    final int value = 100;

    // cannot override method
    void simpleMethod() {
        System.out.println("Hello");
    }
}
