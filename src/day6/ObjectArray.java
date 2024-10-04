package day6;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] objectArray = {100, 10.5, 'A', "Hello", true};

        for (Object item : objectArray) {
            System.out.println(item);
        }
    }
}
