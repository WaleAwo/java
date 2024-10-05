package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 10;

        // If/Else
        if (age < 12) {
            System.out.println("You are too young");
        } else {
            System.out.println("You are old enough");
        }

        // If/Else-If
        int grade = 21;
        if (grade >= 0 && grade <= 20) {
            System.out.println("Great");
        } else if (grade >= 21 && grade <= 30) {
            System.out.println("Wow");
        } else if (grade >= 31) {
            System.out.println("Amazing");
        }

        // Switch/Case
        int weekNumber = 2;
        switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown value");
        }
    }
}
