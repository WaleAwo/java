package datatypes;

public class DataTypes {
    public static void main(String[] args) {

        int myInt = 100;
        long myLong = 10000565675670L;

        float myFloat = 10.00f;
        double myDouble = 20.098;

        char myChar = 'A';

        boolean myBoolean = true;

        final int MY_FINAL_VALUE = 100;  // constant value

        String myString = "John"; // reference type

        System.out.println("int value: " + myInt);
        System.out.println("long value: " + myLong);
        System.out.println("float value: " + myFloat);
        System.out.println("double value: " + myDouble);
        System.out.println("char value: " + myChar);
        System.out.println("boolean value: " + myBoolean);
        System.out.println("string value: " + myString);
        System.out.println("constant value " + MY_FINAL_VALUE);
    }
}
