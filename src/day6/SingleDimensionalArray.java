package day6;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Example 1
        int[] studentIds = new int[3]; // fixed array size declaration

        // assignment
        studentIds[0] = 10;
        studentIds[1] = 23;
        studentIds[2] = 12;

        // Example 2
        int[] teacherIds = {12, 43, 45, 17}; // dynamic array size declaration + assignment

        // find array size (number of rows)
        System.out.println("Number of student Ids: " + studentIds.length);
        System.out.println("Number of teacher Ids: " + teacherIds.length);

        // get single array value
        System.out.println("Student ID 1: " + studentIds[0]);
        System.out.println("Teacher ID 1: " + teacherIds[0]);

        // get all array values
        for (int student : studentIds) {
            System.out.println("Student ID: " + student);
        }
    }
}
