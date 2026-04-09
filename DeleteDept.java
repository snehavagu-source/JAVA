import java.sql.*;
import java.util.Scanner;

public class DeleteDept {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studb",
                    "root",
                    "Dudi@2006"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter did to delete: ");
            int did = sc.nextInt();

            PreparedStatement ps =
                con.prepareStatement(
                    "DELETE FROM Department WHERE did=?");

            ps.setInt(1, did);
            ps.executeUpdate();

            System.out.println("Deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
