package constructors;

public class Student {
    int studentID;
    String fullname;
    char grade;

    // parametrized constructor
    Student(int ID, String studentName, char studentGrade) {
        studentID = ID;
        fullname = studentName;
        grade = studentGrade;
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Fullname: " + fullname);
        System.out.println("Grade: " + grade);
    }
}
