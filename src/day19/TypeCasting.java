package day19;

public class TypeCasting {
    public static void main(String[] args) {
        // upcasting - lower data type to higher data type

        int intUpCast = 100;
        long longUpCast = intUpCast; // automatic upcasting

        // downcasting - higher data type to lower data type
        long longDownCast = 1000;
        int intDownCast = (int) longDownCast; // downcast
    }
}
