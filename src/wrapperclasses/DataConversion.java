package wrapperclasses;

public class DataConversion {
    public static void main(String[] args) {
        String intValue = "13";
        String doubleValue = "54.57";
        String booleanValue = "false";
        int intVal = 10;

        // convert primitive types to objects using their respective wrapper class
        // also used ffor conversion

        int intConvert = Integer.parseInt(intValue); // convert to integer
        System.out.println(intConvert);

        double doubleConvert = Double.parseDouble(doubleValue); // convert to double
        System.out.println(doubleConvert);

        boolean boolConvert = Boolean.parseBoolean(booleanValue); // convert to boolean
        System.out.println(boolConvert);

        String value = String.valueOf(intVal); // convert to String
        System.out.println(value);
    }
}
