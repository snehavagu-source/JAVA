import java.sql.*;
import java.util.Scanner;

public class Jdbc_Dept_CRUD 
{

    public static void main(String[] args) 
    {

        try 
        {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studb","root","Dudi@2006");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n1. create 2.Insert  3.Read  4.Update  5.Delete  6.Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

		     case 1: Statement s = con.createStatement();

           		     String sql =
                                "CREATE TABLE IF NOT EXISTS Department (" +
                                "did INT PRIMARY KEY, " +
                                "dname VARCHAR(50), " +
                                "dlocation VARCHAR(50))";

                            s.executeUpdate(sql);
                            System.out.println("Table created");
                            break;               

		     case 2:
                        System.out.print("Enter dept id: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter dept name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter dept location: ");
                        String location = sc.nextLine();

                        PreparedStatement ps1 =
                                con.prepareStatement("INSERT INTO Department VALUES(?,?,?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, location);
                        ps1.executeUpdate();
                        System.out.println("Inserted");
                        break;

                    case 3:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM Department");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " + rs.getString(2)+" " + rs.getString(3));
                        }
                        break;

                    case 4:
                        System.out.print("Enter did to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new dname: ");
                        String uname = sc.nextLine();
			System.out.print("Enter new dlocation: ");
                        String ulocation = sc.nextLine();

                        PreparedStatement ps2 =
                                con.prepareStatement(
                                        "UPDATE Department SET dname=?, dlocation=? WHERE did=?");
                        ps2.setString(1, uname);
                        ps2.setString(2, ulocation);
                        ps2.setInt(3, uid);
                        ps2.executeUpdate();
                        System.out.println("Updated");
                        break;

                    case 5:
                        System.out.print("Enter did to delete: ");
                        int did = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter dname to delete: ");
			String d_name = sc.nextLine();
			System.out.print("Enter dloc to delete: ");
			String dloc = sc.nextLine();
                        PreparedStatement ps3 =
                                con.prepareStatement(
                                        "DELETE FROM Department WHERE did=? AND dname=? AND dlocation=?");
                        ps3.setInt(1, did);
			ps3.setString(2, d_name);
                        ps3.setString(3, dloc);
                        ps3.executeUpdate();
                        System.out.println("Deleted");
                        break;
                }

            } while (choice != 6);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
