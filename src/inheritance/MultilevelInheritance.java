package inheritance;

class A {
    int clasAVariable = 100;

    void classAMethod() {
        System.out.println(clasAVariable);
    }
}

class B extends A {
}

class C extends B {
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        B classBObj = new B();
        C classCObj = new C();

        System.out.println(classBObj.clasAVariable);
        classBObj.classAMethod();

        System.out.println(classCObj.clasAVariable);
        classCObj.classAMethod();
    }
}
