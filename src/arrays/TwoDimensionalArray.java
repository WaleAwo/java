package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // fixed array size declaration - rows x columns (2x2)
        int[][] studentIds = new int[2][2];

        // assignment
        studentIds[0][0] = 12;
        studentIds[0][1] = 13;
        studentIds[1][0] = 15;
        studentIds[1][1] = 16;

        // dynamic array size declaration
        int[][] teacherIds = {{12, 43}, {45, 17}};

        // array size
        System.out.println("Number of student rows: " + studentIds.length);
        System.out.println("Number of student colunms: " + studentIds[0].length);

        // get array value
        System.out.println("Student ID 0x0: " + studentIds[0][0]);

        // get all array values
        for (int[] stdRow : studentIds) { // get all values from the first row
            for (int student : stdRow) { // print values from the array
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
