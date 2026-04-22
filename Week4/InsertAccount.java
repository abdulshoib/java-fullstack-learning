
import java.sql.*;
import java.util.*;

public class InsertAccount {

    public static void main(String[] args) {

        try {
            // 1. Connect to database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "Shoib123" // change this
            );

            Scanner sc = new Scanner(System.in);

            // 2. Take input
            System.out.print("Enter Account No: ");
            int accNo = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            // 3. SQL Query (Parameterized)
            String query = "INSERT INTO account VALUES (?, ?, ?)";

            // 4. Prepare statement
            PreparedStatement ps = con.prepareStatement(query);

            // 5. Set values
            ps.setInt(1, accNo);
            ps.setString(2, name);
            ps.setDouble(3, balance);

            // 6. Execute
            ps.executeUpdate();

            System.out.println("Data inserted successfully");

            // 7. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
