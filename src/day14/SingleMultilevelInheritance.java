package day14;

class A {
    int clasAVariable = 100;

    void classAMethod() {
        System.out.println(clasAVariable);
    }
}

class B extends A { // 'extends' inheritance keyword
    int classBVariable = 200;

    void classBMethod() {
        System.out.println(classBVariable);
    }
}

class C extends B {
    int classCVariable = 300;

    void classCMethod() {
        System.out.println(classCVariable);
    }
}

public class SingleMultilevelInheritance {
    public static void main(String[] args) {
        B classBObj = new B();
        C classCObj = new C();

        // access parent class variable and methods

        // SINGLE Inheritance
        System.out.println(classBObj.clasAVariable);
        classBObj.classAMethod();

        // MULTILEVEL Inheritance
        System.out.println(classCObj.clasAVariable);
        classCObj.classAMethod();
    }
}
