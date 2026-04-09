import java.sql.*;
import java.util.*;

class JDBCOperations
{
    Connection con = null;
    int res = 0;

    // Constructor → establish connection
    JDBCOperations()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studdb",
                "root",
                "Dudi@2006"
            );
            System.out.println(" Connection Established!");
        }
        catch(Exception e)
        {
            System.out.println(" Exception: " + e);
        }
    }

    // CREATE TABLE
    int CreateTableInDB(String query)
    {
        try
        {
            Statement st = con.createStatement();
            res = st.executeUpdate(query); // returns 0
        }
        catch(SQLException se)
        {
            System.out.println("Exception: " + se);
        }
        return res;
    }

    // INSERT
    int insertDataToDB(String query)
    {
        try
        {
            Statement st = con.createStatement();
            res = st.executeUpdate(query); // returns rows affected
        }
        catch(SQLException se)
        {
            System.out.println("Exception: " + se);
        }
        return res;
    }

    // UPDATE
    int updateDataInDB(String query)
    {
        try
        {
            Statement st = con.createStatement();
            res = st.executeUpdate(query);
        }
        catch(SQLException se)
        {
            System.out.println("Exception: " + se);
        }
        return res;
    }

    // DELETE
    int deleteDataFromDB(String query)
    {
        try
        {
            Statement st = con.createStatement();
            res = st.executeUpdate(query);
        }
        catch(SQLException se)
        {
            System.out.println("Exception: " + se);
        }
        return res;
    }

    // READ (SELECT)
    void displayData(String query)
    {
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\n--- Student Data ---");
            while(rs.next())
            {
                System.out.println(
                    rs.getInt("sid") + "  " +
                    rs.getString("sname") + "  " +
                    rs.getString("course")
                );
            }
        }
        catch(SQLException se)
        {
            System.out.println("Exception: " + se);
        }
    }
}