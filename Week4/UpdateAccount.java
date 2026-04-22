
import java.sql.*;
import java.util.*;

public class UpdateAccount {

    public static void main(String[] args) {

        try {
            // 1. Connect to database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "Shoib123"
            );

            Scanner sc = new Scanner(System.in);

            // 2. Take input
            System.out.print("Enter Account No: ");
            int accNo = sc.nextInt();

            System.out.print("Enter New Balance: ");
            double balance = sc.nextDouble();

            // 3. SQL Query
            String query = "UPDATE account SET balance=? WHERE accNo=?";

            // 4. Prepare statement
            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, balance);
            ps.setInt(2, accNo);

            // 5. Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Account updated successfully");
            } else {
                System.out.println("Account not found");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
