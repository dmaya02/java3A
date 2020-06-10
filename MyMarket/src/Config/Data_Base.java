
package Config;
import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author German
 */
public class Data_Base {
    
    Connection conn;
    
    public Data_Base(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://Localost/mymarket",
                    "root",
                    ""
            );
                System.out.println("::: Connection successfully :::");
        } catch (Exception e) {
            //Error messages
            System.out.println("::: Connection Database error :::");
        }
}
    public Connection getConnection() {
        return conn;
    } 
}
