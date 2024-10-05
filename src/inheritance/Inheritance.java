package inheritance;

class Parent {
    int parentClassVariable = 100;

    void parentClassMethod() {
        System.out.println(parentClassVariable);
    }
}

// 'extends' inheritance keyword
class ChildOne extends Parent {
}

class ChildTwo extends Parent {
}

public class Inheritance {
    public static void main(String[] args) {
        ChildOne cldOne = new ChildOne();
        ChildTwo cldTwo = new ChildTwo();

        cldOne.parentClassMethod();
        cldTwo.parentClassMethod();

    }
}
