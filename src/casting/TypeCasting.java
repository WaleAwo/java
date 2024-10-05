package casting;

public class TypeCasting {
    public static void main(String[] args) {

        // upcasting - lower data type to higher data type - automatic upcasting
        int intUpCast = 100;
        long longUpCast = intUpCast;

        // downcasting - higher data type to lower data type - manual downcasting
        long longDownCast = 1000;
        int intDownCast = (int) longDownCast;
    }
}
