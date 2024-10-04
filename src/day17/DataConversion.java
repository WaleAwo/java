package day17;

public class DataConversion {
    public static void main(String[] args) {
        String intValue = "13";
        String doubleValue = "54.57";
        String booleanValue = "false";
        int intVal = 10;

        int intConvert = Integer.parseInt(intValue); // convert to integer
        System.out.println(intConvert);

        double doubleConvert = Double.parseDouble(doubleValue); // convert to double
        System.out.println(doubleConvert);

        boolean boolConvert = Boolean.parseBoolean(booleanValue); // convert to boolean
        System.out.println(boolConvert);

        String value = String.valueOf(intVal);
        System.out.println(value);


    }
}
