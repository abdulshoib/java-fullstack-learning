package Basics;

class Employee {

    int empNum;
    String empName;
    double empSalary;

    Employee(int empNum, String empName, double empSalary) {
        this.empNum = empNum;
        this.empName = empName;
        this.empSalary = empSalary;

    }

    Employee() {

    }

    void display() {
        System.out.println("Employee Number=" + empNum);
        System.err.println("Employee Name=" + empName);
        System.out.println("Employee salary=" + empSalary);
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "tony", 600.0);
        e1.display();

    }

}
