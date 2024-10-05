package methods;

public class MethodOverloading {
    int x = 10, y = 20;

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add(2, 4);
        methodOverloading.add(23.10, 4);
    }

    void add() {
        System.out.println(x + y);
    }

    void add(int numberOne, int numberTwo) { // different number of parameters
        System.out.println(numberOne + numberTwo);
    }

    void add(int numberOne, double numberTwo) { // different data types
        System.out.println(numberOne + numberTwo);
    }

    void add(double numberOne, int numberTwo) { // different order of data types
        System.out.println(numberOne + numberTwo);
    }
}