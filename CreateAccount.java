import java.sql.*;

public class CreateAccount {
    public static void main(String[] args) {
        try {
           

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankingportal",
                    "root",
                    "Dudi@2006"
            );

            Statement st = con.createStatement();
            String sql =
                "CREATE TABLE IF NOT EXISTS users (" +
                "acc_no INT AUTO_INCREMENT PRIMARY KEY, " +
                "user_name VARCHAR(50), " +
                "password varchar(50), " +
                "aadhar_no BIGINT, " +
                "mobile_no BIGINT, " +
                "acc_type VARCHAR(20))";
                

            st.executeUpdate(sql);
            System.out.println("user Account Table created");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
