
import java.sql.*;
import java.util.*;

public class DeleteAccount {

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
            System.out.print("Enter Account No to delete: ");
            int accNo = sc.nextInt();

            // 3. SQL query
            String query = "DELETE FROM account WHERE accNo=?";

            // 4. Prepare statement
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, accNo);

            // 5. Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Account deleted successfully");
            } else {
                System.out.println("Account not found");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
