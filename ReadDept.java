import java.sql.*;

public class ReadDept {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studb",
                    "root",
                    "Dudi@2006"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Department");

            System.out.println("DID  DNAME  DLOCATION");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3)
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
