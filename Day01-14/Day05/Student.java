import java.util.Scanner;

public class Student {

    int id;
    String name; 
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    // Method to check result
    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has PASSED");
        } else {
            System.out.println(name + " has FAILED");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            students[i] = new Student(id, name, marks);
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        // Check results
        System.out.println("\n--- Results ---");
        for (Student s : students) {
            s.checkResult();
        }

        sc.close();
    }
}
