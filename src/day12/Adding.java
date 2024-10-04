package day12;

public class Adding {
    int x = 10, y = 20;

    // Method Overloading
    void add() {
        System.out.println(x + y);
    }

    void add(int x, int y) { // different number of parameters
        System.out.println(x + y);
    }

    void add(int x, double y) { // different data types
        System.out.println(x + y);
    }

    void add(double x, int y) { // different order of data types
        System.out.println(x + y);
    }
}