import java.sql.*;

public class BankConnection {

    public static void main(String[] args) {

        try {
            // 1. Load connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankdb",
                "root",
                "your_password" // change this
            );

            // 2. Check connection
            if (con != null) {
                System.out.println("Database Connected Successfully");
            }

            // 3. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
