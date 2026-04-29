
import java.util.*;

public class StudentManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== STUDENT MANAGER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int ch = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (ch) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Student Added ");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    for (String s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    if (students.contains(search)) {
                        System.out.println("Student Found ");
                    } else {
                        System.out.println("Student Not Found ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}
