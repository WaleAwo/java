package day16;

public class MultipleInterfaceChild implements MultipleInterface1, MultipleInterface2 {
    public static void main(String[] args) {
        MultipleInterfaceChild intChild = new MultipleInterfaceChild();

        // using multiple interfaces
        intChild.absMethod();
        intChild.absMethod2();
    }

    @Override
    public void absMethod() {
        System.out.println("Implement interface 1" + x);
    }

    @Override
    public void absMethod2() {
        System.out.println("Implements interface 2" + y);
    }
}
