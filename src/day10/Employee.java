package day10;

public class Employee {

    // variables
    int employeeID;
    String fullname;
    String jobTitle;
    float salary;
    boolean hasPension;

    // methods
    void displayEmployeeDetails() {
        System.out.println("Employee Id: " + employeeID);
        System.out.println("Fullname: " + fullname);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Has a company pension?: " + hasPension);
    }
}
