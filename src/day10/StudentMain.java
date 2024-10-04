package day10;

public class StudentMain {
    public static void main(String[] args) {
        Student stud1 = new Student();

        stud1.studentID = 100;
        stud1.fullname = "Mark Bishop";
        stud1.grade = 'A';

        stud1.displayStudentDetails();
    }
}
