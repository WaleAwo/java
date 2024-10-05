package classobjects;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp1 = new Employee(); // creating class objects

        // object assignment
        emp1.employeeID = 1;
        emp1.fullname = "Sarah Lee";
        emp1.jobTitle = "Trainer";
        emp1.salary = 40000f;
        emp1.hasPension = true;

        emp1.displayEmployeeDetails();
    }
}
