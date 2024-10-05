package arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        // fixed array size declaration
        int[] studentIds = new int[3];

        studentIds[0] = 10;
        studentIds[1] = 23;
        studentIds[2] = 12;

        // dynamic array size declaration
        int[] teacherIds = {12, 43, 45, 17};

        // array size
        System.out.println("Number of student Ids: " + studentIds.length);
        System.out.println("Number of teacher Ids: " + teacherIds.length);

        // get array value
        System.out.println("Student ID 1: " + studentIds[0]);
        System.out.println("Teacher ID 1: " + teacherIds[0]);

        // get all array values
        System.out.println("*** All Student IDs ***");
        for (int student : studentIds) {
            System.out.println("Student ID: " + student);
        }
    }
}
