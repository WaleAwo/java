package day3;

public class Ternary {
    public static void main(String[] args) {
        // variable = expression ? result1 : result2;
        // the result is based on the expression

        // Example 1
        int a = 200, b = 100;
        int result = (a > b) ? a : b;
        System.out.println(result);

        // Example 2
        int person_age = 30;
        String answer = (person_age < 18) ? "Not eligible" : "Eligible";
        System.out.println(answer);
    }
}
