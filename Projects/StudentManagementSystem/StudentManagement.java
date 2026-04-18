
import java.io.*;
import java.util.*;

// Student class (OOP concept)
class Student {

    int id;
    String name;
    int marks;

    // constructor to initialize student
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // method to convert object to string (for saving in file)
    public String toString() {
        return id + "," + name + "," + marks;
    }
}

public class StudentManagement {

    static final String FILE_NAME = "students.txt";

    // method to add student
    static void addStudent() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // create student object
            Student s = new Student(id, name, marks);

            // write to file
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(s.toString() + "\n"); // append data
            fw.close();

            System.out.println("Student added successfully");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    // method to view students
    static void viewStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;
            System.out.println("\n--- Student Records ---");

            // read file line by line
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                // display formatted output
                System.out.println("ID: " + data[0]
                        + " Name: " + data[1]
                        + " Marks: " + data[2]);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
