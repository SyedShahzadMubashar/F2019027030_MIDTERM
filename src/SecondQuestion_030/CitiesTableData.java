
package SecondQuestion_030;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author CN Solution
 */
public class CitiesTableData {
    Connection conn;
    public static void main(String args[]) {
       
        try {
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/shahzad";
            String userName = "postgres";
            String password = "shahzadyyt38";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from citiesdata.citiestable1"; 
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               System.out.println(rs.getString("city_id"));
               System.out.println(rs.getString("city_name"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
             
        }
    }
}
                     

    
                   




        
                      
