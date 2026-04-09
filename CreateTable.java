import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        try {
           

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studb",
                    "root",
                    "Dudi@2006"
            );

            Statement st = con.createStatement();
            String sql =
                "CREATE TABLE IF NOT EXISTS Department (" +
                "did INT PRIMARY KEY, " +
                "dname VARCHAR(50), " +
                "dlocation VARCHAR(50))";

            st.executeUpdate(sql);
            System.out.println("Table created");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
