package day14;

class Parent {
    int parentClassVariable = 100;

    void parentClassMethod() {
        System.out.println(parentClassVariable);
    }
}

class ChildOne extends Parent {
    int childOneVariable = 110;
}

class ChildTwo extends Parent {
    int childTwoVariable = 120;
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        ChildOne cldOne = new ChildOne();
        ChildTwo cldTwo = new ChildTwo();

        cldOne.parentClassMethod();
        cldTwo.parentClassMethod();

    }
}
