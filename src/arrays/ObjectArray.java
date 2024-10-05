package arrays;

public class ObjectArray {
    public static void main(String[] args) {

        // dynamic array size declaration
        Object[] objectArray = {100, 10.5, 'A', "Hello", true};

        for (Object item : objectArray) {
            System.out.println(item);
        }
    }
}
