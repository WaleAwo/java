package classobjects;

public class Student {

    int studentID;
    String fullname;
    char grade;
    String school = "Mayhigh"; // common variable

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Fullname: " + fullname);
        System.out.println("Grade: " + grade);
        System.out.println("School Name: " + school);
    }
}
