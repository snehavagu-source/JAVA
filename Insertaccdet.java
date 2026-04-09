import java.math.BigInteger;
import java.sql.*;
import java.util.Scanner;

public class Insertaccdet {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankingportal",
                    "root",
                    "Dudi@2006"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter username: ");
            String name = sc.nextLine();

            System.out.print("Enter your password : ");
            String password= sc.nextLine();
    

            System.out.print("Enter your aadhaar_no: ");
            long  aadhar= sc.nextLong();
            sc.nextLine();

            System.out.print("Enter mobile_no: ");
            long  mobile= sc.nextLong();
            sc.nextLine();

            System.out.print("Enter acc_type: ");
            String  type= sc.nextLine();



 


            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users (user_name,password,aadhar_no,mobile_no,acc_type) VALUES (?,?,?,?,?)",
                Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, name);
            ps.setString(2, password);
            ps.setLong(3, aadhar);
            ps.setLong(4, mobile);
            ps.setString(5, type);

             ps.executeUpdate();

              ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int accNo = rs.getInt(1);
                System.out.println("Account created successfully!");
                System.out.println("Your Account Number is: " + accNo);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
