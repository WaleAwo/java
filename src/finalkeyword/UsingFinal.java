package finalkeyword;

// cannot extend a class with the final keyword
final class A {

}

class finalMethod{

    // cannot override method with the final keyword
    final void simpleMethod() {
        System.out.println("Hello");
    }
}
