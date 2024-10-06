package enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class UsingEnums {
    public static void main(String[] args) {
        Level levelChoice = Level.HIGH;
        System.out.println("Level is: " + levelChoice);
    }
}
