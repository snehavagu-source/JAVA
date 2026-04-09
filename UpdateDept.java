import java.sql.*;
import java.util.Scanner;

public class UpdateDept {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studb",
                    "root",
                    "Dudi@2006"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter did to update: ");
            int did = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new dname: ");
            String name = sc.nextLine();

            System.out.print("Enter new dlocation: ");
            String location = sc.nextLine();

            PreparedStatement ps =
                con.prepareStatement(
                    "UPDATE Department SET dname=?, dlocation=? WHERE did=?");

            ps.setString(1, name);
            ps.setString(2, location);
            ps.setInt(3, did);

            ps.executeUpdate();
            System.out.println("Updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
